package mouse_sctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\DELL\\\\qtree\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver cd= new ChromeDriver();
		cd.get("https://jqueryui.com/droppable/");
		cd.switchTo().frame(0);
		Actions a = new Actions(cd);
		WebElement we1 = cd.findElementById("draggable");
		WebElement we2 = cd.findElementById("droppable");
		a.dragAndDrop(we1, we2).build().perform();
		
		}

}
