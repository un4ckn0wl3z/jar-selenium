package xyz.un4ckn0wl3z.bot.jarselbot.forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRadio {
	
	public static void main(String[] args) {
		
		
	   	System.setProperty("webdriver.chrome.driver","C:\\Users\\notisquadz\\Desktop\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			
			String baseUrl = "http://demo.guru99.com/test/radio.html";
			driver.get(baseUrl);
			
			WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
			WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
			WebElement radio3 = driver.findElement(By.id("vfb-7-3"));
			
			radio1.click();
			radio2.click();
			radio3.click();
			
			
			
			
			
			
			
			
			
			
			
			
			
			

	}

}
