package WEB_ELEMENT;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SendKeys_ {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//email
		Thread.sleep(2000);
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("abc@gmail.com",Keys.TAB,"abc@123",Keys.TAB,Keys.TAB,Keys.ENTER);
		Thread.sleep(2000);
		driver.quit();
	}

}
