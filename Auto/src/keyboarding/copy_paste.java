package keyboarding;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class copy_paste {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\DELL\\\\qtree\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver cd= new ChromeDriver();
		cd.get("http://www.mycontactform.com");
		Actions a = new Actions(cd);
		WebElement we = cd.findElementById("user");
		a.click(we).sendKeys("hi").build().perform();
		
		a.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		a.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		a.sendKeys(Keys.TAB).build().perform();
		a.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
		
		
	}

	
}
