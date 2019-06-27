import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { EmployeeService } from '../employee.service';

export class Employee {
  dateOfBirth: string;
  department: string;
  empId: string;
  firstName: string;
  gender: string;
  lastName: string;
}

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {

  errorMessage: string = "";
  employee = new Employee();
  employeeList: any = [];
  constructor(private fb: FormBuilder, private empService: EmployeeService) {
    this.createRegnForm();
  }
  statusView = {
    "msg": "",
    "type": ""
  }
  ngOnInit() {
    this.loadEmployees()
  }
  empRegistrationForm: FormGroup;
  rows = [
    {
      "dateOfBirth": "2019-06-26T18:31:18.491Z",
      "department": "string1",
      "empId": 1,
      "firstName": "string",
      "gender": "string",
      "lastName": "string"
    }, {
      "dateOfBirth": "2019-06-26T18:31:18.491Z",
      "department": "string2",
      "empId": 2,
      "firstName": "string",
      "gender": "string",
      "lastName": "string"
    }, {
      "dateOfBirth": "2019-06-26T18:31:18.491Z",
      "department": "string3",
      "empId": 3,
      "firstName": "string",
      "gender": "string",
      "lastName": "string"
    }
  ]
  columns = [
    { prop: 'name' },
    { name: 'Gender' },
    { name: 'Company' }
  ];
  resetForm() {
    this.empRegistrationForm.reset()
    this.statusView.msg = ""
    this.statusView.type = ""
  }
  //========= Handler for register employee form ========//
  registerEmployee() {
    console.log("empRegistrationForm : ", this.empRegistrationForm)
    if (this.empRegistrationForm.valid) {
      this.employee.firstName = this.empRegistrationForm.get("firstName").value
      this.employee.lastName = this.empRegistrationForm.get("lastName").value
      this.employee.dateOfBirth = this.empRegistrationForm.get("dateOfBirth").value
      this.employee.department = this.empRegistrationForm.get("department").value
      this.employee.gender = this.empRegistrationForm.get("gender").value
      //========= Call Register Employee Service ========//
      this.empService.registerEmployee(this.employee)
        .subscribe(emp => {
          console.log("Add Employee Response...", emp)
          this.statusView.msg = "Successfully Registered !!"
          this.statusView.type = "success"
          this.loadEmployees()
          setTimeout(() => {
            this.resetForm();
          }, 3000);
        },
          error => {
            this.errorMessage = <any>error
            this.statusView.msg = "Error, Please try again after sometime !!"
            this.statusView.type = "error"
          });
    } else {
      alert("invalid form")
      this.statusView.msg = "Please fill up all the details !!"
      this.statusView.type = "error"
    }
  }
  //========= Method to fetch all registered employee ========//
  loadEmployees() {
    this.empService.getAllEmployees()
      .subscribe(empList => {
        this.employeeList = [];
        console.log("GET all Employee Response...", empList);
        this.employeeList = empList;
      },
        error => this.errorMessage = <any>error);
  }
  //========= Method to create employee registration form  ========//
  createRegnForm() {
    this.empRegistrationForm = this.fb.group({
      firstName: ['', Validators.required],
      lastName: ['', Validators.required],
      gender: ['', Validators.required],
      dateOfBirth: ['', Validators.required],
      department: ['', Validators.required]
    });
  }
}
