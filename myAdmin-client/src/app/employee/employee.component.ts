import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }
  rows = [
    {
      "dateOfBirth": "2019-06-26T18:31:18.491Z",
      "department": "string1",
      "empId": 1,
      "firstName": "string",
      "gender": "string",
      "lastName": "string"
    },{
      "dateOfBirth": "2019-06-26T18:31:18.491Z",
      "department": "string2",
      "empId": 2,
      "firstName": "string",
      "gender": "string",
      "lastName": "string"
    },{
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
}
