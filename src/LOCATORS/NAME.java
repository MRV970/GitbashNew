package LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NAME {
	public static void main(String[] args) {
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.getTitle();
		if(driver.getTitle().contains("Register")) {
			System.out.println("navigation successful");
			//radio button
			driver.findElement(By.id("gender-female")).click();
			//fn
			driver.findElement(By.id("FirstName")).sendKeys("midde");
			//ln
			driver.findElement(By.id("LastName" )).sendKeys("mrv");
			//email
			driver.findElement(By.id("Email" )).sendKeys("mrv@gmail.com");
			//pwd
			driver.findElement(By.id("Password")).sendKeys("mrv@123");
			//cpwd
			driver.findElement(By.id("ConfirmPassword")).sendKeys("mrv@123");
			//reg btn
			driver.findElement(By.name("register-button")).click();
			
			
		}
		else {
			System.out.println("test case failed");
		}
		
	}

}
