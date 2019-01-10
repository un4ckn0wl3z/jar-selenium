package xyz.un4ckn0wl3z.bot.jarselbot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSwitchFrame {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\notisquadz\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		String baseUrl = "http://demo.guru99.com/selenium/deprecated.html";
		driver.get(baseUrl);
		
		driver.switchTo().frame("classFrame");
		
		driver.findElement(By.linkText("Deprecated")).click();
		
		
		
		
	}

}
