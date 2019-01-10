package xyz.un4ckn0wl3z.bot.jarselbot.forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestForms {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\notisquadz\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String baseUrl = "http://demo.guru99.com/test/login.html";

		driver.get(baseUrl);
		
		
		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		WebElement password = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
		
		email.sendKeys("abcd@gmail.com");
		password.sendKeys("abcdefghjkl");
		
		
		driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
		
		
		driver.navigate().back();
		
		
		WebElement emailClear = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		WebElement passwordClear = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));

		
		
		emailClear.clear();
		passwordClear.clear();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
