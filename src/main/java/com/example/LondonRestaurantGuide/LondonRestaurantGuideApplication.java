package com.example.LondonRestaurantGuide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication()
@RestController

public class LondonRestaurantGuideApplication {

	public static void main(String[] args) {
		SpringApplication.run(LondonRestaurantGuideApplication.class, args);
	}

}
