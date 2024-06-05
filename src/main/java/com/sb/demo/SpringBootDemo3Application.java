package com.sb.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/sb-demo")
public class SpringBootDemo3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemo3Application.class, args);
	}
	
	@GetMapping
	public String demoMethod() {
		return "Hello Welcome EC2 Instance Jenkins Slave demo dated on : June - 05, 2024 - 02:54 pm !";
	}

}
