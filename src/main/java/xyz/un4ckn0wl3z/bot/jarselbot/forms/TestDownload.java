package xyz.un4ckn0wl3z.bot.jarselbot.forms;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDownload {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\notisquadz\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String baseUrl = "http://demo.guru99.com/test/yahoo.html";
		driver.get(baseUrl);
		
		WebElement downloadBtn = driver.findElement(By.id("messenger-download"));
		String srcLocation = downloadBtn.getAttribute("href");
		String fileName = srcLocation.substring( srcLocation.lastIndexOf('/')+1, srcLocation.length() );
		
		try {
			FileUtils.copyURLToFile(
					  new URL(srcLocation), 
					  new File("./download/"+fileName));
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
		
		driver.close();

		
		
	}

}
