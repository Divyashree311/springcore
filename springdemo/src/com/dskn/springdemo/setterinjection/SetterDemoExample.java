package com.dskn.springdemo.setterinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dskn.springdemo.Coach;

public class SetterDemoExample {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		
		CricketCoach coach = applicationContext.getBean("myCricketCoach", CricketCoach.class);
		
		System.out.println(coach.getDailyWorkOut());
		System.out.println(coach.getFortune());
		
		//literal value
		System.out.println(coach.getEmail());
		System.out.println(coach.getTeam());
		
		applicationContext.close();
	}

}
