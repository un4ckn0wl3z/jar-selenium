package xyz.un4ckn0wl3z.bot.jarselbot.forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\notisquadz\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String baseUrl = "http://demo.guru99.com/test/newtours/register.php";
		driver.get(baseUrl);
		
		Select drpdConutry = new Select(driver.findElement(By.name("country")));
		
		
		drpdConutry.selectByVisibleText("THAILAND");
		
		
		driver.navigate().to("http://output.jsbin.com/osebed/2");
		
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		
		fruits.selectByVisibleText("Banana");
		fruits.selectByIndex(1);

		
		
		
	
		
		
	}

}
