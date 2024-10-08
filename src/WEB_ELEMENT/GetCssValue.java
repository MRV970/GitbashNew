package WEB_ELEMENT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class GetCssValue {
public static void main(String[] args) {
	WebDriver driver =new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	//login button
	WebElement login =driver.findElement(By.name("login"));
	String color=login.getCssValue("color");
	System.out.println(color);
	System.out.println(login.getCssValue("font"));
	System.out.println(login.getCssValue("fontfamily"));
WebElement CA=driver.findElement(By.id("u_0_0_Zz"));
String color1=CA.getCssValue("color");
driver.quit();
}
}
