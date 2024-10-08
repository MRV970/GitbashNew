package WebDriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Close_Quit {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new EdgeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(1000);
		//click on open new window button
		driver.findElement(By.id("newWindowBtn"));
		Thread.sleep(2000);
		//close
		driver.close();
		//driver.quit();
		
	}

}
