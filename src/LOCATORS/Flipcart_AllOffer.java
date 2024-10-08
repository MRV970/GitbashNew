package LOCATORS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Flipcart_AllOffer {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("iphones");
		//click on search bar
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//fetching all offer prices
		List<WebElement> offers=driver.findElements(By.xpath("//div[@class='KzDlHZ']/../../div[2]/div[1]/div[1]/div[3]"));
		for(WebElement offer:offers) {
			System.out.println(offer.getText());
		}
		Thread.sleep(1000);
		driver.quit();
	}
	

}
