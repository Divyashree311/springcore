package com.dskn.springdemo.beanscope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dskn.springdemo.Coach;

public class BeanScopeDemoApp {
	public static void main(String[] args) {
		
		//load spring container file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//Retrieve bean from Spring container
		Coach coach = context.getBean("myCoach", Coach.class);
		Coach coach2 = context.getBean("myCoach", Coach.class);

		System.out.println(coach.hashCode());
		System.out.println(coach2.hashCode());
		
		System.out.println("memory location of coach" + coach);
		System.out.println("memory location of coach1" + coach);

		System.out.println(coach == coach2);
		
	context.close();
		
	}

}
