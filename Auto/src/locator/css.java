package locator;

import org.openqa.selenium.chrome.ChromeDriver;

public class css {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\qtree\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		cd.get("http://www.mycontactform.com");
		
		//css
	//	cd.findElementByCssSelector("input#user").sendKeys("hi");
	//	cd.findElementByCssSelector("input.txt_log").sendKeys("anya");
	//	cd.findElementByCssSelector("input[name=user]").sendKeys("hi");
	//	cd.findElementByCssSelector("input.txt_log[name=user]").sendKeys("Aarush");
	//	cd.findElementByCssSelector("input[type^='te']").sendKeys("hi");
	//	cd.findElementByCssSelector("input[type$='xt']").sendKeys("param");
	//	cd.findElementByCssSelector("input[type*='ex']").sendKeys("family");
	//	cd.findElementByCssSelector("#user").sendKeys("hi");
	//	cd.findElementByXPath("//*[@id=\"user\"]").sendKeys("sangee");
	//	cd.findElementByXPath("/html/body/div[3]/div[2]/div[1]/form/fieldset/div[1]/input").sendKeys("sangee");
		cd.findElementByXPath("//*[@id='user']").sendKeys("hi");
		cd.findElementByXPath("//input[@type='text']").sendKeys("family");
		
	}

}
