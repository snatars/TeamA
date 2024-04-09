package locator;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tag {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\qtree\\chromedriver_win32\\chromedriver.exe" );
		ChromeDriver cd1 = new ChromeDriver();
		cd1.get("http://www.facebook.com");
		
		List<WebElement> WE =  cd1.findElementsByTagName("img");
		System.out.println(WE.size());
		List<WebElement> We1 = cd1.findElementsByTagName("a");
		System.out.println(We1.size());
		List<WebElement> We2 = cd1.findElementsByTagName("input");
		System.out.println(We2.size());
		List<WebElement> We3 = cd1.findElementsByTagName("div");
		System.out.println(We3.size());
		
		
	}

}
