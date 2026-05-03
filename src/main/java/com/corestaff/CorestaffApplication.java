package com.corestaff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class CorestaffApplication {

	public static void main(String[] args) {
		SpringApplication.run(CorestaffApplication.class, args);
	}

}
