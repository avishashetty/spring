package com.example.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringDemoController {
	@GetMapping("/")
	 public String sayHello() {
       return "Welcome to DevOps Capstone!";
   }

}
