package locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drop_down {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\qtree\\chromedriver_win32\\chromedriver.exe" );
		ChromeDriver cd1 = new ChromeDriver();
		cd1.get("https://courses.letskodeit.com/practice");
		Thread.sleep(3000);
		
		WebElement we = cd1.findElementById("multiple-select-example");
		Select s = new Select(we);
		s.selectByIndex(0);
		s.selectByValue("orange");
		s.selectByVisibleText("Peach");
		s.deselectByIndex(0);
	}

}
