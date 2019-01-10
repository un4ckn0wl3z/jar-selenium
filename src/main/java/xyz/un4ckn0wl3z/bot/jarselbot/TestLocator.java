package xyz.un4ckn0wl3z.bot.jarselbot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLocator {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\notisquadz\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://www.facebook.com/";
		String tagName = "";
		driver.get(baseUrl);
		tagName = driver.findElement(By.id("email")).getTagName();
		System.out.println("Tag Name is :" + tagName);
		
		WebElement inputEmail = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		WebElement inputPassword = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		
		inputEmail.sendKeys("slickerth@gmail.com");
		inputPassword.sendKeys("dsadsadsadsasp");
		
		driver.findElement(By.xpath("//*[@id=\"u_0_r\"]")).click();
		
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		System.out.println(driver.getTitle());
		
		
		driver.navigate().to("https://www.facebook.com/login");
		
		driver.close();

		System.exit(0);

	}

}
