package springdemo;

public class FootballCoach implements Coach {

	private FortuneService fortuneservice;
	private String email;
	private String team;
	public FootballCoach()
	{
		System.out.println("Inside No-Arg Constuctor");
	}
	
	
	//Our Setter Method
	public void setFortuneservice(FortuneService fortuneservice) {
		System.out.println("Inside Setter Method");
		this.fortuneservice = fortuneservice;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public void setTeam(String team) {
		this.team = team;
	}

	public String getEmail() {
		return email;
	}


	public String getTeam() {
		return team;
	}


	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Increse Your Dribbling Skills";
	}



	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Football is Best Ever Game";
	}

}
