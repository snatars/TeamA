package locator;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class explicit_wait {
	
	@Test
	public void Test1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\DELL\\\\qtree\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		cd.get("http://google.com");
		WebDriverWait wb = new WebDriverWait(cd,5);
		wb.until(ExpectedConditions.titleIs("Google"));
		wb.until(ExpectedConditions.titleContains("Goo"));
		wb.until(ExpectedConditions.alertIsPresent());
		cd.quit();
		
	}

}
