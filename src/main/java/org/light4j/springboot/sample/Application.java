package org.light4j.springboot.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  //①
public class Application {
	public static void main(String[] args) {//②
		SpringApplication.run(Application.class, args);
	}
}
