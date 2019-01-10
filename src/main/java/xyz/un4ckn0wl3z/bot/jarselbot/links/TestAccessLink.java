package xyz.un4ckn0wl3z.bot.jarselbot.links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAccessLink {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\notisquadz\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://www.google.com/";
		driver.get(baseUrl);
		
		driver.findElement(By.linkText("Gmail")).click();
		
		System.out.println("page title is : "+ driver.getTitle());
		
		driver.quit();

		
		
		
	}

}
