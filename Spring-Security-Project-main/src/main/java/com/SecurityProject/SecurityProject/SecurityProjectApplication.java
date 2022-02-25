package com.SecurityProject.SecurityProject;

import com.SecurityProject.SecurityProject.models.Role;
import com.SecurityProject.SecurityProject.models.SchoolUser;
import com.SecurityProject.SecurityProject.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class SecurityProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityProjectApplication.class, args);
	}

	@Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}

//	@Bean
//	CommandLineRunner run(UserService userService){
//		return args -> {
//
//
//			userService.addRoleToUser("Sarah", "STUDENT");
//			userService.addRoleToUser("Jane", "ADMIN");
//			userService.addRoleToUser("Fisher", "STAFF");
//			userService.addRoleToUser("Don", "STAFF");
//			userService.addRoleToUser("Chi", "STUDENT");
//			userService.addRoleToUser("Angel", "ALUMNI");
//
//
//		};
//	}


}
