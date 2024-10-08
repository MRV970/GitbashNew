package LOCATORS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Static_Dynamic {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/");
		Thread.sleep(2000);
		//identify all products
		List<WebElement> products =driver.findElements(By.xpath("//a[@class='hrefch']/../../h5"));
		for(WebElement product:products) {
			System.out.println(product.getText());
		}
		driver.quit();
		
	}

}
