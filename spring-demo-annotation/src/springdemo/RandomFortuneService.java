package springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] data= {"Nishant","Badaya"};
	
	private Random myRandom=new Random();
	
	@Override
	public String getFortune() {
		int index=myRandom.nextInt(data.length);
		
		String getFortune=data[index];
		
		return getFortune; 
	}

}
