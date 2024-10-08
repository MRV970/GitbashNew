package WEB_ELEMENT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Clear_Emails {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//email
		Thread.sleep(2000);
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("abc@gmail.com");
		Thread.sleep(2000);
		email.clear();
		email.sendKeys("def@gmail.com");
		Thread.sleep(2000);
		email.clear();
		email.sendKeys("mrv@gmail.com");
		Thread.sleep(2000);
		driver.quit();
		
	}

}
