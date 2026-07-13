package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


}

//http://localhost:8081/register?fullname=JohnDoe&mothername=Mary&fathername=Robert&problem=None&age=25&date=07-07-2026&time=04:42&password=secret123&confirmpassword=secret123
//http://localhost:8081/register?fullname=JohnDoe&mothername=Mary&fathername=Robert&problem=None&age=25&date=07-07-2026&time=04:45+AM&password=secret123&confirmpassword=secret123
//http://localhost:8081/register?fullname=JohnDoe&mothername=Mary&fathername=Robert&problem=None&age=25&date=07-07-2026&time=04:45%20AM&password=secret123&confirmpassword=secret123