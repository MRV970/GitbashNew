package LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class VISIBLE_TEXT {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.xpath("//a[(text()='Log in')]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[3]")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
