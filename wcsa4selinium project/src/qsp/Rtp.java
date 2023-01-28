package qsp;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium. firefox. FirefoxDriver;

public class Rtp 
{
public static void main(String[] args) throws InterruptedException
{
try (Scanner sc = new Scanner(System.in)) {
	System.out.println("Which Browser u want to open!!"); String browserValue = sc.next();
	
	if (browserValue.equalsIgnoreCase("chrome")) 
	{ 
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver(); driver.manage() .window().maximize();
	
	driver.get("https://www.instagram.com/");
	
	Thread.sleep (4000);
	
	driver.close();
	} else if (browserValue.equalsIgnoreCase ("Firefox")) 
	{ 
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}
} 
FirefoxDriver driver = new FirefoxDriver(); // launch the firefox browser

driver.manage () .window().maximize();

driver.get("https://www.instagram.com/");

Thread.sleep(4000); driver.close();
} 

}

