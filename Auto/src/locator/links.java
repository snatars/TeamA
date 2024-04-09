package locator;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class links {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\DELL\\\\qtree\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		cd.get("http://google.com");
		List<WebElement> We = cd.findElementsByTagName("a");
		for(WebElement w : We)
		{
			System.out.println(w.getAttribute("href"));
		}
	}

}
