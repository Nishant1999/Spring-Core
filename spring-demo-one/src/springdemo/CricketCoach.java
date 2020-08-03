package springdemo;

public class CricketCoach implements Coach {

	//define a private field for dependency
	private FortuneService fortuneservice;
	
	//define a constructor for dependency injection
	public CricketCoach(FortuneService fortuneservice) {
		this.fortuneservice=fortuneservice;
	}
	
	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "5 Helicopter Shots";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneservice.getFortune();
	}
	
	//Create A Init Method
	
	public void doMyStartStuff()
	{
		System.out.println("CricketCoach:Inside method doMyStartStuff");
	}
	
	//Create A Destroy Method
	
	public void doMyEndStuff()
	{
		System.out.println("CricketCoach:Inside method doMyEndStuff");
	}
	
	

}
