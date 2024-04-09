package Sel_Intro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class dimension {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\qtree\\chromedriver_win32\\chromedriver.exe" );
		ChromeDriver cd1 = new ChromeDriver();
		cd1.get("http://www.google.com");
		/*Dimension d=new Dimension(300,400);
		cd1.manage().window().setSize(d);
		Point p = new Point(400,400);
		cd1.manage().window().setPosition(p);
		cd1.quit();*/
		
		cd1.executeScript("document.body.style.zoom='200%'");
		Thread.sleep(3000);
		cd1.executeScript("document.body.style.zoom='100%'");
		TimeUnit.SECONDS.sleep(3);
		cd1.executeScript("document.body.style.zoom='20%'");
	}
}
