package TestingNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class selenium_test_real {
	ChromeDriver cd;
	@Test(priority=0,description="visiting",groups="Title")
	public void visit()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\DELL\\\\qtree\\\\chromedriver_win32\\\\chromedriver.exe");
		cd= new ChromeDriver();
		cd.get("http://www.google.com");
		
	}
	
	@Test(priority=1,description="maximising",groups="Title")
	public void max()
	{
		cd.manage().window().maximize();
	}
	
	@Test(priority=2,description="refresing",invocationCount=3,groups="Title")
	public void refresh()
	{
		cd.navigate().refresh();
	}
	
	@Test(priority=3,description="getting title",dependsOnGroups="Title")
	public void get()
	{
		System.out.println(cd.getTitle());
	}
	
	@Test(priority=4,description="closing",timeOut=3000)
	public void close() throws InterruptedException
	{
		
		Thread.sleep(2000);
		cd.quit();
		
	}

}
