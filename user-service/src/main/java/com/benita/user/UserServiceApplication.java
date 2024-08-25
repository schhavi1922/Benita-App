package com.benita.user;

import com.benita.user.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.HashMap;

@EnableDiscoveryClient
@SpringBootApplication
public class UserServiceApplication {

	public static HashMap<String, User> userTokenMap = new HashMap<>();

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

}
