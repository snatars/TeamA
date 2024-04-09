package executejavascript;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class navigate_between_tabs {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\DELL\\\\qtree\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver cd= new ChromeDriver();
		cd.get("http://www.google.com");
		
		//max
		cd.manage().window().maximize();
		cd.executeScript("window.open('https://www.seleniumeasy.com','_blank')");
		
		
		//get contrl
		String parent = cd.getWindowHandle();
		Set<String> tabs=cd.getWindowHandles();
		
		Iterator<String> I = tabs.iterator(); 
		while(I.hasNext())
		{
			String child = I.next();
			if(!parent.equals(child))
			{
				cd.switchTo().window(child);
				Thread.sleep(3000);
				cd.findElementByLinkText("Maven").click();
				Thread.sleep(3000);
				cd.close();
				
			}
		}
		cd.switchTo().window(parent);
		cd.findElementByLinkText("Images").click();
		Thread.sleep(3000);
		cd.quit();
	}

}
