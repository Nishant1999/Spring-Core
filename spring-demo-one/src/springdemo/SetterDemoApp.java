package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		FootballCoach thefootballCoach=context.getBean("myFootballCoach",FootballCoach.class);
		System.out.println(thefootballCoach.getDailyWorkOut());
		System.out.println(thefootballCoach.getDailyFortune());
		System.out.println(thefootballCoach.getEmail());
		System.out.println(thefootballCoach.getTeam());
		context.close();

	}

}
