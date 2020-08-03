package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach=context.getBean("myCricketCoach",Coach.class);
		//Coach theFootballCoach=context.getBean("myFootballCoach",FootballCoach.class);
		System.out.println(theCoach.getDailyWorkOut());
		System.out.println(theCoach.getDailyFortune());
		//System.out.println(theFootballCoach.getDailyWorkOut());
		//System.out.println(theFootballCoach.getDailyFortune());
		context.close();

	}

}
