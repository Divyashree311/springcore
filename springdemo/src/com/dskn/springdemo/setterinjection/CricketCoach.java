package com.dskn.springdemo.setterinjection;

import com.dskn.springdemo.Coach;
import com.dskn.springdemo.FortuneService;

public class CricketCoach implements Coach{
	
	private FortuneService fortuneService;
	
	private String email;
	
	private String team;
	
	public CricketCoach() {
		System.out.println("Inside cricket coach constructor");
	}

	@Override
	public String getDailyWorkOut() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside fortune setter method");
		this.fortuneService = fortuneService;
	}

	public void setEmail(String email) {
		System.out.println("Inside email setter method");
		this.email = email;
	}

	public void setTeam(String team) {
		System.out.println("Inside team setter method");
		this.team = team;
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}
	
	

}
