package xyz.un4ckn0wl3z.bot.jarselbot.keyboardandmouse;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class TestMouseOver {
	
	public static void main(String[] args) {
		
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\notisquadz\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "http://demo.guru99.com/test/newtours/";
		driver.get(baseUrl);
		
		WebElement linkHome = driver.findElement(By.linkText("Home"));
		WebElement tdHome = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[1]"));
		
		Actions builder = new Actions(driver);
		Action mouseOverHome = builder.moveToElement(linkHome).build();
		
		String bgColor = tdHome.getCssValue("background-color");
		System.out.println("Before hover :" + bgColor);
		
		mouseOverHome.perform();
		
		bgColor = tdHome.getCssValue("background-color");
		System.out.println("After hover :" + bgColor);
		
		driver.close();
		
		
		
		

	}

}
