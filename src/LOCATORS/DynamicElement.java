package LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DynamicElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/");
		Thread.sleep(2000);
		//fetch price of the  product
		WebElement price=driver.findElement(By.xpath("//a[text()='Iphone 6 32gb']/../../h5"));
		System.out.println(price.getText());
		//quit
		driver.quit();
	}

}
