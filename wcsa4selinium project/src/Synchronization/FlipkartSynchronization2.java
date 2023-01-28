package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSynchronization2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("hp laptop");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		driver.findElement(By.xpath("//div[@class='_3879cV']")).click();
		driver.findElement(By.xpath("(//div[.='Brand']")).click();
		driver.findElement(By.xpath("(//div[@class='_24_Dny'])")).click();
		driver.findElement(By.xpath("(//div[.='Operating System'])")).click();
		driver.findElement(By.xpath("(//div[.='Windows 10'])")).click();
		//String priceoflaptop = String.findElement(By.xpath("//a[@href='/hp-pavilion-core-i5-11th-gen-16-gb-512-gb-ssd-windows-10-home-2-graphics-14-dv0084tx-thin-light-laptop/p/itm3aa2cc39d6b9a?pid=COMGYZD7N5ZNGVHN&lid=LSTCOMGYZD7N5ZNGVHN9UUD4Q&marketplace=FLIPKART&q=hp+laptop&store=6bo%2Fb5g&srno=s_1_1&otracker=search&otracker1=search&fm=Search&iid=76bbf87a-4af7-4792-b19a-e7d927490467.COMGYZD7N5ZNGVHN.SEARCH&ppt=sp&ppn=sp&ssid=5bmzy29y280000001671275186733&qH=9d1edd3d0f6d1b3c']")).click();
		//System.out.println(priceoflaptop);
		driver.close();
		
		
		
		
	}

}
