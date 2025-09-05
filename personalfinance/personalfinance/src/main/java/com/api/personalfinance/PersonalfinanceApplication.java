package com.api.personalfinance;

import com.api.personalfinance.Config.EnvLoader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PersonalfinanceApplication {

	static {
		EnvLoader.loader();
	}

	public static void main(String[] args) {

		SpringApplication.run(PersonalfinanceApplication.class, args);
	}

}
