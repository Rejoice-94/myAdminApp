/**
 * @author Rejoice
 *
 */
package com.myAdmin.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyAdminApplication.class, args);
		System.out.println("<<<< My Admin Server Is Up And Running >>>>");
	}

}
