package HW_locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class link {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\DELL\\\\qtree\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		cd.get("http://www.yahoo.com");
		List<WebElement> we = cd.findElementsByTagName("a");
		System.out.println(we.size());
		cd.quit();
		
		
		ChromeDriver cd1 = new ChromeDriver();
		cd1.get("http://www.seleniumeasy.com");
		cd1.findElementByLinkText("Maven").click();
		List<WebElement> we1 = cd1.findElementsByTagName("img");
		System.out.println(we1.size());
		cd1.quit();
		
		ChromeDriver cd2 = new ChromeDriver();
		cd2.get("http://www.mycontactform.com");
		cd2.findElementByLinkText("Help").click();
		cd2.quit();
		
	}

}
