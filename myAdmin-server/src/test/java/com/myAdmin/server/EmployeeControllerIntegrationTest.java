package com.myAdmin.server;

import static org.junit.Assert.assertNotNull;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.myAdmin.server.MyAdminApplication;
import com.myAdmin.server.model.Employee;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MyAdminApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class EmployeeControllerIntegrationTest {
	@Autowired
	private TestRestTemplate restTemplate;
	
	@Value("${server.port}")
	private int port;
	

	private String getRootUrl() {
		System.out.println("PORT to test >>>>>>>>>."+ port);
		return "http://localhost:" + port;
	}

	@Test
	public void contextLoads() {

	}

	@Test
	public void testGetAllEmployees() {
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<String> entity = new HttpEntity<String>(null, headers);

		ResponseEntity<String> response = restTemplate.exchange(getRootUrl() + "/employees", HttpMethod.GET, entity,
				String.class);

		assertNotNull(response.getBody());
	}

	@Test
	public void testCreateEmployee() {
		Employee employee = new Employee();
		employee.setFirstName("puru");
		employee.setLastName("kumar");
		employee.setGender("Male");
		employee.setDateOfBirth(new Date());
		employee.setDepartment("Development");

		ResponseEntity<Employee> postResponse = restTemplate.postForEntity(getRootUrl() + "/employee", employee,
				Employee.class);
		assertNotNull(postResponse);
		assertNotNull(postResponse.getBody());
	}
}