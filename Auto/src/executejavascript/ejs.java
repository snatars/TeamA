package executejavascript;

import org.openqa.selenium.chrome.ChromeDriver;

public class ejs {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\DELL\\\\qtree\\\\chromedriver_win32\\\\chromedriver.exe");
	ChromeDriver cd= new ChromeDriver();
	cd.get("http://www.seleniumeasy.com");
	System.out.println(cd.executeScript("return document.title"));
	System.out.println(cd.executeScript("return document.URL"));
	//page up and down
	cd.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	Thread.sleep(3000);
	cd.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	Thread.sleep(3000);
	cd.executeScript("window.scrollBy(0,1000)");
	Thread.sleep(3000);
	cd.executeScript("window.scrollBy(0,-1000)");
	
}
}
