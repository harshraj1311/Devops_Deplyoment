package com.nagarro.training.devops_deploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsDeployApplication {
	@GetMapping ("/message")
	public String message(){
		return "Jenkins Devops Assignment";
	}
	public static void main(String[] args) {
		SpringApplication.run(DevopsDeployApplication.class, args);
	}

}
