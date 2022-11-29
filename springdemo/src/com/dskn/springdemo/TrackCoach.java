package com.dskn.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;

	public TrackCoach() {
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "Run hard 5k";
	}

	@Override
	public String getFortune() {
		return "Track coach: " + fortuneService.getFortune();
	}
	
	//add init-method
	public void startUp() {
		System.out.println("Inside Track coach start up");
	}
	
	//add destroy method
	public void cleanUp() {
		System.out.println("Inside Track coach clean up");
	}

}
