package com.dskn.springdemo;

public class HappyFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		return "wish you a good luck";
	}

}
