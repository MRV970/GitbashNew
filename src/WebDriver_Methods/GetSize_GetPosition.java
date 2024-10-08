package WebDriver_Methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetSize_GetPosition {
	public static void main(String[] args) {
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login.php/");
	String title=	driver.getTitle();
		System.out.println(title);
		if(title.contains("Facebook")) {
			Dimension size=driver.manage().window().getSize();
			System.out.println("size-> "+size);
			System.out.println("height-> "+size.height);
			System.out.println("width-> "+size.width);
			Point position=driver.manage().window().getPosition();
			System.out.println("position-> "+position);
			System.out.println("position-> "+position.x);
			System.out.println("position-> "+position.y);
			
		}
		else {
			System.out.println("test case failed");
		}
		driver.quit();
	}

}
