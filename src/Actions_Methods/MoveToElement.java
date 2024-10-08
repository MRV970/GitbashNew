package Actions_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/tricentis");
		Thread.sleep(3000);
		WebElement computers=driver.findElement(By.xpath("//a[contains(text(),'Computers')][1]"));
		//step1
		Actions act=new Actions(driver);
		//step2
		act.moveToElement(computers).perform();
		//notebook
		Thread.sleep(2000);
		driver.findElement(By.xpath(""));
		
		
	}
	

}
