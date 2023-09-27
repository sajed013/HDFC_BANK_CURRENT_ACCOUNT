package com.cjc.hdfc.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HdfcBank01Application {

	public static void main(String[] args) {
		System.out.println("Saveing account ...");
		SpringApplication.run(HdfcBank01Application.class, args);
	}

}
