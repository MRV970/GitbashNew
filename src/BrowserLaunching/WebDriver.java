package BrowserLaunching;
import java.util.Scanner;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
public class WebDriver {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the browser type");
		String url=sc.next();
		if(url.equals("chrome")) {
			new ChromeDriver();
		}
		else if(url.equals("edge")) {
			new EdgeDriver();
		}
		else if(url.equals("Firefox")) {
			new FirefoxDriver();
		}
		else if(url.equals("Safari")) {
			new SafariDriver();
		}
		else {
			new InternetExplorerDriver();
		}
		
		
	}

}
