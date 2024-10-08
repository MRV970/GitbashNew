package BrowserLaunching;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;
public class Facebook {
	public static void main(String[] args) {
		WebDriver driver =new EdgeDriver();
		driver.get("https://www.facebook.com/");
		//fetch Title
		 String title=driver.getTitle();
		System.out.println(title);
		//fetch url
		String url=driver.getCurrentUrl();
		System.out.println(url);
		if(title.contains("Facebook")&& url.contains("facebook")) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case fail");
		}
	}

}
