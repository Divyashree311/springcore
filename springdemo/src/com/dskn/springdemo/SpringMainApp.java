package com.dskn.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMainApp {
	public static void main(String[] args) {
		
		//load the spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach coach = context.getBean("myCoach",Coach.class);
		System.out.println(coach.getDailyWorkOut());
		
		System.out.println(coach.getFortune());
//		System.out.println(coach.);
		context.close();	
		
	}

}
