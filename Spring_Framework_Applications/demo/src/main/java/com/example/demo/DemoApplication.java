package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getId() + " >Starting DemoApplication.main method");
		SpringApplication.run(DemoApplication.class, args);
		System.out.println(Thread.currentThread().getId() + " >Exiting DemoApplication.main method");
	}

}
