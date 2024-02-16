package com.selenium.assignment;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //System.setProperty("webdriver.chrome.driver","/Users/shubham/Documents/softwares/chrome-driver/chromedriver");
  	  
  	  WebDriverManager.chromedriver().setup();
  	  
  	  
  	  ChromeOptions chromeOptions = new ChromeOptions(); 
  	  chromeOptions.addArguments("--headless");
    	WebDriver driver = new ChromeDriver(chromeOptions);
	  
	  System.out.println("Scripted Executing");
	  
	  //1. Open the browser and get to the url
	  driver.get("https://www.facebook.com/");
	  
	  //enable wait of 3 seconds 
	  driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	  
	  driver.findElement(By.id("email")).sendKeys("patil_y7@yahoo.com");
      driver.findElement(By.id("pass")).sendKeys("pa$$word123");
      
      //Thread.sleep(1000);
      System.out.println("Scripted executed successfully"); 
      //Thread.sleep(1000);
      
    }
}
