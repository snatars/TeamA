package keyboarding;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class enter_button {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\DELL\\\\qtree\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver cd= new ChromeDriver();
		cd.get("http://www.google.com");
		WebElement we = cd.findElementByName("q");
		Actions a = new Actions(cd);
		a.click(we).sendKeys("selenium").sendKeys(Keys.ENTER).build().perform();
	    cd.quit();
		
		}

}
