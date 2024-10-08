package LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class X_PATH {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		//email
		driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("mrv@gmail.com");
		
		//pwd
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("sdgdg2324");
		//login
		driver.findElement(By.xpath("//button[contains(@name,'login')]")).click();
		System.out.println("login successful");
		Thread.sleep(2000);
		driver.quit();
	}

}
