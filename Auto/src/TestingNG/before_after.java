package TestingNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class before_after {

/*	ChromeDriver cd;
	@BeforeTest
	public void BT(){
		System.out.println("Before Test : Visiting");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\qtree\\chromedriver_win32\\chromedriver.exe");
		cd=new ChromeDriver();
		cd.get("http://www.google.com");
	}
	
	@AfterTest
	public void AT(){
		System.out.println("After Test : Quitting");
		cd.quit();
	}
	
	@BeforeClass
	public void BC(){
		System.out.println("Before class : Maximising");
		cd.manage().window().maximize();
	}
	
	@AfterClass
	public void AC(){
		System.out.println("After Class : getting URL");
		cd.getCurrentUrl();
	}
	
	@BeforeMethod
	public void BM(){
		System.out.println("Before Method : Refreshing");
		cd.navigate().refresh();
	}
	
	@AfterMethod
	public void AM(){
		System.out.println("After Method : Refreshing");
		cd.navigate().refresh();
	}
	
	@Test(priority=0)
	public void Tc1(){
		System.out.println("TC1 : getting Title");
		cd.getTitle();
	}
	
	@Test(priority=1)
	public void Tc2(){
		System.out.println("TC2 : click Gmail");
		cd.findElementByLinkText("Gmail").click();;
	}*/
}
