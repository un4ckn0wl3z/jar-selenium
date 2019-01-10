package xyz.un4ckn0wl3z.bot.jarselbot;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestALertPresentCondition {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\notisquadz\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		WebDriverWait driverWait = new WebDriverWait(driver, 10);
		String baseUrl = "http://jsbin.com/usidix/1";
		driver.get(baseUrl);
		
		String alertMsg = "";
		
		driver.findElement(By.xpath("/html/body/input")).click();
		
		if(driverWait.until(ExpectedConditions.alertIsPresent()) != null) {
			
			alertMsg = driver.switchTo().alert().getText();
			
			System.out.println("Alert Message is :" + alertMsg);
			
			driver.switchTo().alert().accept();
		}
		
		

		
		try {
			WebElement txtUserName = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input"));

			if(txtUserName.isEnabled()) {
				driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("tutorial");
				
			}
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
		

		
		driver.quit();


	}

}
