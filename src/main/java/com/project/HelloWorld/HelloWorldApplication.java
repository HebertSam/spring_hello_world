package com.project.HelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class HelloWorldApplication{
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

	@RequestMapping("/")
	public String hello() {
		System.out.println("hello!!");
		return "index";
	}
	@RequestMapping("/random")
	public String random(){
		return "random";
	}
}
