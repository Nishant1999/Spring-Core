package springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AnnotationJavaDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(SportsConfig.class);
		
		Coach theCoach=context.getBean("tennisCoach",Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
	
		
		context.close();


	}

}
