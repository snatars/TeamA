package locator;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio_check_button {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\qtree\\chromedriver_win32\\chromedriver.exe" );
		ChromeDriver cd1 = new ChromeDriver();
		cd1.get("https://courses.letskodeit.com/practice");
		Thread.sleep(3000);
		//cd1.findElementById("bmwradio").click();
		//cd1.findElementById("benzradio").click();
		
		List<WebElement> we = cd1.findElementsByXPath("//*[@name='cars' and @type='radio']");
		for (WebElement wb : we)
		{
			wb.click();
			Thread.sleep(3000);
		}
	}

}
