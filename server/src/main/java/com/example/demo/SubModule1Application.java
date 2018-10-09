package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SubModule1Application {

	public static void main(String[] args) {
		SpringApplication.run(SubModule1Application.class, args);
		System.out.println("Test submodule code change1..!!");
		System.out.println("Test submodule code change2..!!");
		System.out.println("Test submodule code change3..!!");
	}
}
