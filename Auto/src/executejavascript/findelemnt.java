package executejavascript;

import org.openqa.selenium.chrome.ChromeDriver;

public class findelemnt {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\DELL\\\\qtree\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver cd= new ChromeDriver();
		cd.get("http://www.mycontactform.com");
		
		cd.executeScript("document.getElementById('user').value='Dhivyakarthi123'");
		cd.executeScript("document.getElementById('pass').value='12345'");
		cd.executeScript("document.getElementsByName('btnSubmit')[0].click()");
	}

}
