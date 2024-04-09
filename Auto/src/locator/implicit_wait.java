package locator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class implicit_wait {
	
	@Test
	public void Test1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\DELL\\\\qtree\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		cd.get("http://google.com");
		cd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println(cd.getCurrentUrl());
		System.out.println(cd.getTitle());
		System.out.println(cd.findElementByLinkText("hi"));
		cd.quit();
	}

}
