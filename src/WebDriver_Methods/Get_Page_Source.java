package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Get_Page_Source {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		//fetch source
		String src= driver.getPageSource();
		System.out.println(src);
		driver.quit();
	}

}
