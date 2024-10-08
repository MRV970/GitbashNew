package WebDriver_Methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Get_Window_Handle {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(1000);
		//fetch parent wid
		String pwid=driver.getWindowHandle();
		System.out.println(pwid);
		//click on open new window button
		driver.findElement(By.id("newWindowBtn")).click();
		Thread.sleep(1000);
		//fetch all wids
		Set<String>allwids=driver.getWindowHandles();
		System.out.println(allwids);
		driver.quit();
	}

}
