package LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LinkText_PartialLinktext {
	public static void main(String[] args) {
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
	 	driver.get("https://demowebshop.tricentis.com/register");
	 	//register page
	 	driver.findElement(By.linkText("Register")).click();
	 	driver.getTitle();
	 	
		if(driver.getTitle().contains("Register")) {
			System.out.println("navigated successfully");
			//choose female
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
			System.out.println("register page not displayed");
		}
		driver.navigate().back();
		//login page
		driver.findElement(By.linkText("Log in"));
		
		
	}

}
