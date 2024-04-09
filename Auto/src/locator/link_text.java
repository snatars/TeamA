package locator;

import org.openqa.selenium.chrome.ChromeDriver;

public class link_text {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\DELL\\\\qtree\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		cd.get("http://google.com");
		//cd.findElementByLinkText("Terms").click();
		cd.findElementByPartialLinkText("Term").click();
		
	}
}
