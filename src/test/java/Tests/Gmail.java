package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gmail {
	public static WebDriver driver;
	public static String url = "https://www.gmail.com/";
	
	public static void main(String args[]) throws InterruptedException {
		
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 Thread.sleep(2000);
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.get(url);
		 Thread.sleep(2000);
		 String act = driver.getTitle();
		 System.out.println("Actual title of home page is ======>"+ act);
		 driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("ssprakashrampalli@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("prakashsmart99");
			Thread.sleep(2000);
		
		
		
		
	}

}
