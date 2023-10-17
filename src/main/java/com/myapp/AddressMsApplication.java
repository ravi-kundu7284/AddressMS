package com.myapp;

import com.myapp.util.Utill;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AddressMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddressMsApplication.class, args);
	}

	@Bean
	public Utill utill(){
		return  new Utill();
	}
}
