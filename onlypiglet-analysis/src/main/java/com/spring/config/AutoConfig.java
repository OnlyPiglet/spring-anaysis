package com.spring.config;


import com.spring.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AutoConfig {


	@Bean
	public User User(){

		return new User();
	}

}
