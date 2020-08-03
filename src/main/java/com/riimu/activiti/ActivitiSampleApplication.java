package com.riimu.activiti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class ActivitiSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActivitiSampleApplication.class, args);
	}

}
