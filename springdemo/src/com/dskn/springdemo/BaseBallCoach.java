package com.dskn.springdemo;

public class BaseBallCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseBallCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "Spend 30 minutes on batting";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}
	

}
