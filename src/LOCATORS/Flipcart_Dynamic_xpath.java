package LOCATORS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Flipcart_Dynamic_xpath {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("");
		Thread.sleep(2000);
		//identify all links
		List<WebElement> Links=driver.findElements(By.xpath("//div[@class='KzDlHZ']/../.."));
		for(WebElement link :Links) {
			System.out.println(link.getText());
		}
		Thread.sleep(1000);
		driver.quit();
	}

}
