package com.dskn.springdemo;

public class MyApplication {
	public static void main(String[] args) {
		/*
		 * We can create TrackCoach/BaseBall coach but still it's not
		 * loosely coupled. It's hard coded, creating object using new is 
		 * tight coupling. Object should be created by spring container and it should provide
		 * us object and we directly use it.
		 */
		Coach coach = new TrackCoach();
		System.out.println(coach.getDailyWorkOut());
	}

}
