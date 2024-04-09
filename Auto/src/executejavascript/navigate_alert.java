package executejavascript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate_alert {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\DELL\\\\\\\\qtree\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		cd.get("http://www.google.com");
		
		cd.executeScript("alert('Time OUT')");
		Thread.sleep(3000);
		Alert al = cd.switchTo().alert();
	    al.accept();
	    
	    cd.findElementByLinkText("Images").click();
	    Thread.sleep(3000);
	    cd.navigate().forward();
	    Thread.sleep(3000);
	    cd.navigate().back();
	    
	    
		
	}

}
