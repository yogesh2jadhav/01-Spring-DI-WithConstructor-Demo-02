package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringDIwithConstructor {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext CPXApplicationContext = new ClassPathXmlApplicationContext("applicationContext-DIwithConstructor.xml");
		Coach highJumpCoach = CPXApplicationContext.getBean("myCoach", Coach.class);
		
		System.out.println(highJumpCoach.getDaliyWorkout());
		System.out.println(highJumpCoach.getYourFourtuen());

	}

}
