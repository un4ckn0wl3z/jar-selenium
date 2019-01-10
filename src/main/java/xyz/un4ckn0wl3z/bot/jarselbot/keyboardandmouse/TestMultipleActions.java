package xyz.un4ckn0wl3z.bot.jarselbot.keyboardandmouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;

public class TestMultipleActions {
	
	
	public static void main(String[] args) {
		
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\notisquadz\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "https://www.facebook.com/";
		driver.get(baseUrl);
		
		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		
		Actions builder = new Actions(driver);
		Action seriesAcion = builder.moveToElement(email)
				.click()
				.keyDown(email,Keys.SHIFT)
				.sendKeys(email,"hello")
				.keyUp(email,Keys.SHIFT)
				.doubleClick(email)
				.contextClick()
				.build();

		seriesAcion.perform();
		
		
		
	}

}
