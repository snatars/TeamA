package cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;



public class create_delete2 {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\qtree\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		cd.get("http://google.com");
		Set<Cookie> c = cd.manage().getCookies();
		System.out.println("cookie size "+c.size());
		for(Cookie x : c)
		{
			System.out.println(x.getName());
			System.out.println(x.getPath());
			System.out.println(x.getValue());
		}
		cd.manage().deleteAllCookies();
		Set<Cookie> c1 = cd.manage().getCookies();
		System.out.println("cookie size "+c1.size());
		}
}
