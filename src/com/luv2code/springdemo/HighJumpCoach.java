package com.luv2code.springdemo;

public class HighJumpCoach implements Coach {

	private HappyFourtuneService happyFourtuneService;
	
	public HighJumpCoach(HappyFourtuneService happyFourtuneService) {
		super();
		this.happyFourtuneService = happyFourtuneService;
	}



	@Override
	public String getDaliyWorkout() {
		return "Play skip rope for 20 every morning";
	}

 
	@Override
	public String getYourFourtuen() {
		// TODO Auto-generated method stub
		return happyFourtuneService.getFourtune(); 
	}
}
