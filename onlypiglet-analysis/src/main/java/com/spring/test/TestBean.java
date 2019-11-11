package com.spring.test;

import com.spring.config.AutoConfig;
import com.spring.entity.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestBean {


	public static void main(String[] args) {

		AnnotationConfigApplicationContext ac =  new AnnotationConfigApplicationContext(AutoConfig.class);

		User user = ac.getBean(User.class);

		System.out.println(user);
	}


}
