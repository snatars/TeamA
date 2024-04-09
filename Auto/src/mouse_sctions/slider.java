package mouse_sctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\DELL\\\\qtree\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver cd= new ChromeDriver();
		cd.get("https://jqueryui.com/slider/");
	    cd.switchTo().frame(0);
	    Actions a = new Actions(cd);
	    WebElement we = cd.findElementById("slider");
	    a.dragAndDropBy(we, 50, 0).build().perform();
		
		}

}
