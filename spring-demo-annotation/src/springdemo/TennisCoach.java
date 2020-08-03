package springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneservice;
	
	public TennisCoach() {
		
	}
	
	@PostConstruct
	public void doMyStartStuff()
	{
		System.out.println("PostConstruct");
	}
	@PreDestroy
	public void doMyCleanStuff()
	{
		System.out.print("PreDestroy");
	}
	
	
	/*
	TennisCoach(FortuneService fortuneservice)
	{
		this.fortuneservice=fortuneservice;
	}*/
	
	@Override
	public String getDailyWorkout() { 
		// TODO Auto-generated method stub
		return "Smash The Tennis Ball";
	}


	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneservice.getFortune();
	}


}
