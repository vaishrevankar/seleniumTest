package com.soumya.SeleniumTest;




import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
 
public class SimpleSelTest {
	WebDriver driver;
	
	@Test
	public void TestMethod() {
		 //Launch firefox browser 
		String location=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		options.addArguments("--disable-gpu");
		options.addArguments("--window-size=1020,768");
		options.addArguments("--no-sandbox");
		driver = new ChromeDriver(options);  
	    
	    //maximize the browser
	    driver.manage().window().maximize();
	    
	    //Implicit wait, wait for at least some time (10 sec) to identify an element, //if can't find the element with in 10 
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	 
	    //open the url or AUT 
	    driver.get("https://www.makemytrip.com/");
	    
	    driver.quit();
	}
}

