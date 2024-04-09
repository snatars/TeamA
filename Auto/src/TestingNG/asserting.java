package TestingNG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class asserting {
	@Test
	public void hrd()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\DELL\\\\qtree\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver cd1= new ChromeDriver();
		cd1.get("http://www.google.com");
		
		Assert.assertEquals(cd1.getTitle(), "yahoo");
		Assert.assertNotEquals(cd1.getTitle(), "yahoo");
		WebElement wb = cd1.findElementByLinkText("Gmail");
		Assert.assertTrue(wb.isDisplayed());
		Assert.assertFalse(wb.isSelected());
		wb.click();
	}
	
	@Test
	public void soft()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\DELL\\\\qtree\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver cd1= new ChromeDriver();
		cd1.get("http://www.google.com");
		SoftAssert s = new SoftAssert();
		System.out.println(cd1.getTitle());
		s.assertEquals(cd1.getTitle(), "yahoo");
		//s.assertNotEquals(cd1.getTitle(),"Google");
		WebElement we = cd1.findElementByLinkText("Gmail");
		//s.assertTrue(we.isDisplayed());
		//s.assertFalse(we.isSelected());
		we.click();
		cd1.quit();
		s.assertAll();
		
		
	}

}
