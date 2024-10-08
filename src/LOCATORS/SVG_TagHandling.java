package LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SVG_TagHandling {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/6");
		Thread.sleep(50000);
		//identify compare button and click
		driver.findElement(By.xpath
	("//*[name()='svg'and@class='MuiSvgIcon-root MuiSvgIcon-colorPrimary MuiSvgIcon-fontSizeMedium css-2c7buj']"));
		
	}

}
