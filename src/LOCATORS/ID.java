package LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ID {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//identify email and pass data
		WebElement email= driver.findElement(By.id("email"));
		//identify password and pass data
		driver.findElement(By.id("pass")).sendKeys("afdg@123");
		WebElement login= driver.findElement(By.name("login"));
		login.click();
		Thread.sleep(1000);
		email.sendKeys("mrv@gmail.com");
		
	}
		
	}


