package springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class JavaDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(SportsConfig.class);
		
		SwimCoach theCoach=context.getBean("swimCoach",SwimCoach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(theCoach.getEmail());
		
		System.out.println(theCoach.getTeam());
		
	
		
		context.close();


	}

}
