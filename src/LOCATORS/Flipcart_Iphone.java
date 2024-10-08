package LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Flipcart_Iphone {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get
		("https://www.flipkart.com/apple-iphone-15-black-128-gb/p/itm6ac6485515ae4?pid=MOBGTAGPTB3VS24W&lid=LSTMOBGTAGPTB3VS24WVZNSC6&marketplace=FLIPKART&q=iphone&store=tyy%2F4io&spotlightTagId=BestsellerId_tyy%2F4io&srno=s_1_1&otracker=search&otracker1=search&fm=Search&iid=5a977719-fabe-45c6-bda9-3e25c6dfe49a.MOBGTAGPTB3VS24W.SEARCH&ppt=sp&ppn=sp&ssid=ct2vozjglc0000001714207925118&qH=0b3f45b266a97d70");
		Thread.sleep(2000);
		//identify the current price of the product
		
		WebElement price=driver.findElement(By.xpath("//span[text()='Apple iPhone 15 (Black, 128 GB)']/../../../div[4]/div[1]/div[1]/div[1]"));
		System.out.println(price.getText());
		Thread.sleep(2000);
		driver.quit();
	}

}
