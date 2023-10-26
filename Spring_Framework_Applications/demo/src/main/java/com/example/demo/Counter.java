package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;


@Configuration
public class Counter {
	@Async
	public void count(int amount, int wait) throws InterruptedException {
		System.out.printf("%d >Starting Counter.count method(amount:%d, wait:%d)\n", Thread.currentThread().getId(), amount, wait);
		
		for (int i = 1; i <= amount; i++) {
			System.out.printf("%d >%d of %d waiting %d\n", Thread.currentThread().getId(), i, amount, wait);
			Thread.currentThread();
			Thread.sleep(wait);
		}
		
		System.out.printf("%d >Exiting Counter.count method(amount:%d, wait:%d)\n", Thread.currentThread().getId(), amount, wait);
	}

}
