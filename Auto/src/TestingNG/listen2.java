package TestingNG;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(TestingNG.Listening.class)
public class listen2 {
	
	@Test
	public void tc1(){
		System.out.println("tc1");
	}

}
