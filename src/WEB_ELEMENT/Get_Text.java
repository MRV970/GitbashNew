package WEB_ELEMENT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Get_Text {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver =new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	
	Thread.sleep(2000);
	//register link
	//WebElement regLink=driver.findElement(By.linkText("Register"));
//	System.out.println(regLink.getText());//visible text
	//text field
	WebElement tf=driver.findElement(By.name("q"));
	System.out.println(tf.getText());
	Thread.sleep(1000);
	driver.quit();
	
}
}
