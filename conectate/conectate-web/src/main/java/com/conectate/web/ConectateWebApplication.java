package com.conectate.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication


@ComponentScan(basePackages = {  "com.conectate.web","com.conectate.web.auth","com.conectate.service"})
@EnableAutoConfiguration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = { "com.conectate.data.repository" })
@EntityScan(basePackages = { "com.conectate.data.entity" })
public class ConectateWebApplication implements CommandLineRunner{

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	public static void main(String[] args) {
		SpringApplication.run(ConectateWebApplication.class, args);
	}

	 
	   protected SpringApplicationBuilder configure(final SpringApplicationBuilder applicationBuilder) {
	      return applicationBuilder.sources(ConectateWebApplication.class);
	   }
	   
	@Override
	public void run(String... args) throws Exception {
		String password = "admin";
		
		for(int i = 0 ; i<4 ; i++) {
			
			String passwordBcrypt = passwordEncoder.encode(password);
			System.out.println(passwordBcrypt);
			
		}
		
	}

	
	
}
