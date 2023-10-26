package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyCommandLineRunner implements CommandLineRunner{
	@Autowired
	Counter injectedCounter;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getId() + " >Starting MyCommandLineRunner.run method");
		
		//Counter localCounter = new Counter();
		//localCounter.count(10, 700);
		//localCounter.count(15, 500);
		
		injectedCounter.count(10, 700);
		injectedCounter.count(15, 500);
		
		System.out.println(Thread.currentThread().getId() + " >Exiting MyCommandLineRunner.run method");
	}

}
