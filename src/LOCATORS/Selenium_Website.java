package LOCATORS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium_Website {
	public static void main(String[] args) {
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		//identify all links
		List<WebElement> link=driver.findElements(By.xpath("//a[starts-with(text(),'4.19')]"));
		System.out.println(link.size());
		for(int i=0;i<link.size();i++) {
			System.out.println(link.get(i).getText());
			
		}
		driver.quit();
	}

}
