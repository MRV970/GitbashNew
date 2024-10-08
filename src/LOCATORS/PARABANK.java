package LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PARABANK {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		//fn
		driver.findElement(By.cssSelector("input[id='customer.firstName']")).sendKeys("midde");
		//ln
		driver.findElement(By.cssSelector("input[name='customer.lastName']")).sendKeys("msvtr");
		//address
		driver.findElement(By.cssSelector("input[id='customer.address.street']")).sendKeys("hyd");
		//city
		driver.findElement(By.cssSelector("input[name='customer.address.city']")).sendKeys("hyd");
		//state
		driver.findElement(By.cssSelector("input[id='customer.address.state']")).sendKeys("ap");
		//zipcode
		driver.findElement(By.cssSelector("input[name='customer.address.zipCode']")).sendKeys("asasdfh");
		//ph.no
		driver.findElement(By.cssSelector("input[id='customer.phoneNumber']")).sendKeys("2445465");
		//ssn
		driver.findElement(By.cssSelector("input[name='customer.ssn']")).sendKeys("32ere4d");
		//username
		driver.findElement(By.cssSelector("input[id='customer.username']")).sendKeys("msvtr");
		//pwd
		driver.findElement(By.cssSelector("input[id='customer.password']")).sendKeys("fdfd14343");
		//cpwd
		driver.findElement(By.cssSelector("input[name='repeatedPassword']")).sendKeys("fdfd14343");
		//register
		driver.findElement(By.cssSelector("input[value='Register']")).click();
		System.out.println("successfully registered");
		Thread.sleep(2000);
		driver.quit();
	}

}
