package xyz.un4ckn0wl3z.bot.jarselbot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\notisquadz\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "http://demo.guru99.com/test/newtours/";
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = "";

		// launch Fire fox and direct it to the Base URL
		
		
		driver.get(baseUrl);
		// get the actual value of the title
		System.out.println("Base URL: "+baseUrl);
		actualTitle = driver.getTitle();
		/*
		 * compare the actual title of the page with the expected one and print
		 * the result as "Passed" or "Failed"
		 */
		System.out.println("actualTitle: "+actualTitle);
		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed");
		}
		// close Fire fox
		driver.close();
		
		System.exit(0);
    }
    
    
}
