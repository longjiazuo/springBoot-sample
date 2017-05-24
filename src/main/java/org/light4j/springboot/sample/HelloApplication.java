package org.light4j.springboot.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  //①
public class HelloApplication {
	public static void main(String[] args) {//②
		SpringApplication.run(HelloApplication.class, args);
	}
}
