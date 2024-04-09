package locator;

import org.openqa.selenium.chrome.ChromeDriver;

public class locator_basic {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\qtree\\chromedriver_win32\\chromedriver.exe" );
	ChromeDriver cd1 = new ChromeDriver();
	cd1.get("https://www.mycontactform.com/");
	cd1.findElementById("user").sendKeys("Dhivyakarthi123");
	cd1.findElementByName("pass").sendKeys("12345");
	cd1.findElementByName("btnSubmit").click();
	}
}
