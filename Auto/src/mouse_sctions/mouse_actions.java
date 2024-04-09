package mouse_sctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_actions {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\qtree\\chromedriver_win32\\chromedriver.exe" );
		ChromeDriver cd1 = new ChromeDriver();
		cd1.get("http://www.mycontactform.com");
		Thread.sleep(3000);
		Actions a = new Actions(cd1);
		WebElement we = cd1.findElementByName("btnSubmit");
		//a.click(we).build().perform();
	//a.doubleClick(we).build().perform();
		//a.contextClick(we).build().perform();
		//a.moveToElement(we).click(we).build().perform();
		a.clickAndHold(we).build().perform();
		Thread.sleep(3000);
		a.release(we).build().perform();
	}

}
