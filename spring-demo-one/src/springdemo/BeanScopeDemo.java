package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("beanScopeApplicationContext.xml");
		Coach thecoach=context.getBean("myCricketCoach",Coach.class);
		
		Coach alphacoach=context.getBean("myCricketCoach",Coach.class);
		
		boolean b=(thecoach==alphacoach);
		
		System.out.println("Pointing to The Same Object"+" "+b);
		System.out.println("Memory Location For the Coach"+" "+thecoach);
		System.out.println("Memory Location For the AlphaCoach"+" "+alphacoach);
		

	}

}
