package WEB_ELEMENT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Submit_ {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//register link
		//WebElement regLink=driver.findElement(By.linkText("Register"));
		//regLink.submit();
		//facebook lpogin button
		driver.findElement(By.name("login")).submit();
		driver.quit();
	}

}
