package xyz.un4ckn0wl3z.bot.jarselbot.forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCheckBox {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\notisquadz\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String baseUrl = "http://demo.guru99.com/test/radio.html";
		driver.get(baseUrl);
		
		WebElement checkBox1 = driver.findElement(By.id("vfb-6-0"));
		
		for(int i=0;i<2;i++) {
			checkBox1.click();
			System.out.println(checkBox1.isSelected());
		}
		
		
		
		

	}

}
