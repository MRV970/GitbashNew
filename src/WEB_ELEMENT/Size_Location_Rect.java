package WEB_ELEMENT;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Size_Location_Rect {
	public static void main(String[] args) {
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//loginlink
	//	WebElement login=driver.findElement(By.linkText("Log in"));
		WebElement login =driver.findElement(By.className("ico-login"));
		//size
	Dimension size= login.getSize();
	System.out.println(size);
	System.out.println(size.height);
	System.out.println(size.width);
	//location
	Point loc =login.getLocation();
	System.out.println(loc);
	System.out.println(loc.x);
	System.out.println(loc.y);
	//rect
	Rectangle rect= login.getRect();
	System.out.println(rect);
	System.out.println(rect.x);
	driver.quit();
	
	
	}

}
