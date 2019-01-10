package xyz.un4ckn0wl3z.bot.jarselbot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWaits {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\notisquadz\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String baseUrl = "http://jsbin.com/usidix/1";
		driver.get(baseUrl);
		
		String alertMsg = "";
		
		driver.findElement(By.xpath("/html/body/input")).click();
		
		alertMsg = driver.switchTo().alert().getText();
		
		System.out.println("Alert Message is :" + alertMsg);
		
		driver.switchTo().alert().accept();
		
		driver.quit();
		

		
		
		
	}

}
