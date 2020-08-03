package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("beanLifeCycleApplicationContext.xml");
		Coach thecoach=context.getBean("myCricketCoach",Coach.class);
		
		System.out.println(thecoach.getDailyWorkOut());
		
		context.close(); 
	}

}
