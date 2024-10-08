package BrowserLaunching;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
public class Titleofwebpage {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		
	System.out.println("enter the url");
		String url =sc.nextLine();
		
		WebDriver driver =new EdgeDriver();
		driver.get("https://www.facebook.com/");
         String title= driver.getTitle();
         System.out.println(title);
         String c_url=driver.getCurrentUrl();
         System.out.println(c_url);
		
		
	}

}
