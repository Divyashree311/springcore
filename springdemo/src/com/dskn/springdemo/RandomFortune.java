package com.dskn.springdemo;

import java.util.Random;

public class RandomFortune implements FortuneService {


	String[] data = {
			"Hey, good luck",
			"All the very best",
			"Today is your day"
	};
	
	private Random random = new Random();

	
	@Override
	public String getFortune() {
		
		//pick random String from the array
		int index = random.nextInt(data.length);
		String getData = data[index];
		return getData;
	}
	
}
