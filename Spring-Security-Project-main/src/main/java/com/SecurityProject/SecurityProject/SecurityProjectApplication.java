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

	@Bean
	CommandLineRunner run(UserService userService){
		return args -> {

			userService.saveRole(new Role(null, "STUDENT"));
			userService.saveRole(new Role(null, "ALUMNI"));
			userService.saveRole(new Role(null, "STAFF"));
			userService.saveRole(new Role(null, "ADMIN"));

			userService.saveUser(new SchoolUser(null, "Jon Doe", "Jon", "4321",new ArrayList<>()));
			userService.saveUser(new SchoolUser(null, "Jane Dane", "Jane", "jane21",new ArrayList<>()));
			userService.saveUser(new SchoolUser(null, "Fisher Rey", "Rey", "fish",new ArrayList<>()));
			userService.saveUser(new SchoolUser(null, "Dreamer Gal", "Dreamer", "dream",new ArrayList<>()));

			userService.addRoleToUser("Jon", "STUDENT");
			userService.addRoleToUser("Jane", "ADMIN");
			userService.addRoleToUser("Jane", "STAFF");
			userService.addRoleToUser("Rey", "STAFF");
			userService.addRoleToUser("Dreamer", "STUDENT");
			userService.addRoleToUser("Jon", "ALUMNI");


		};
	}

}
