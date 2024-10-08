package LOCATORS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ALL_lINKS {
	public static void main(String[] args) {
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//identifying all links
		List<WebElement> allLinks=driver.findElements(By.xpath("//a"));
		System.out.println(allLinks.size());
		for(WebElement link:allLinks) {           //for(int i=0;i<allLinks.size();i++){
			                                        //  System.out.println(allLinks.get(i).getText());
			
			System.out.println(link.getText());
		}
		driver.quit();
		
	}

}
