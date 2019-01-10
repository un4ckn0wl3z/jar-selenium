package xyz.un4ckn0wl3z.bot.jarselbot.forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestUpload {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\notisquadz\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String baseUrl = "http://demo.guru99.com/test/upload/";
		driver.get(baseUrl);
		
		WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
		uploadElement.sendKeys("C:\\Users\\notisquadz\\Downloads\\nmap-7.70-setup.exe");
		
		driver.findElement(By.id("terms")).click();
		
		driver.findElement(By.name("send")).click();
		

	}

}
