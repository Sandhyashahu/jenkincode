package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.PublicKey;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

public class BaseTest  {
	
	
	static WebDriver driver;
    LoginPage lp;
    @Test(priority = 1)
	
	@BeforeSuite
	public void iniBrowser() throws IOException
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raje\\Desktop\\New folder\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");

    	ChromeDriver driver =new ChromeDriver();
	   
         ChromeOptions cp=new ChromeOptions();
		   
	       cp.addArguments("--disable-notifications");
	       cp.addArguments("--start-maximized");


			 String path = System.getProperty("user.dir") + "//config.properties";
			FileInputStream fis = new FileInputStream(path);
		   Properties prop  = new Properties();
			prop.load(fis);

	       driver.get(prop.getProperty("testsiteurl"));
	       //String path1 =prop.getProperty("username1");
           	lp=new LoginPage(driver);

	 
	}
	     // @BeforeClass
	       
	       // public void CreateObject() throws IOException
	      // {
	    	   
	        //	lp=new LoginPage(driver);
	     //  }
	    	  
	    	  
	}
    
	     








	   		