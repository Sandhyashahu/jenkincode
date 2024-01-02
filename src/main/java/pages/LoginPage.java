package pages;

import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.apache.hc.client5.http.auth.UsernamePasswordCredentials;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.common.annotations.VisibleForTesting;

import net.bytebuddy.dynamic.TypeResolutionStrategy.Passive;
import net.bytebuddy.implementation.bind.annotation.This;

public class LoginPage extends BaseClass   {
	
	
	
WebDriver driver;


	
	
	 @FindBy(xpath = "//input[@name='username']")
		private WebElement username;
	 
	 
	 @FindBy(xpath = "//input [@name='password']")
		private WebElement password;

		@FindBy(xpath = "//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
		private WebElement loginbutton;
		

	     @FindBy(xpath = "(//*[@id='welcome'])[1]")
	      private WebElement welcome;

	    @FindBy(linkText = "Logout")
	  private WebElement logoutlink;  
	    
	    
	    public LoginPage(WebDriver driver)throws IOException {
			this.driver = driver;
			PageFactory.initElements(driver, this);
			
		}


	
           public void loginToApp() {
        	   
        	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        	   
        	 // username.sendKeys("Admin");
	   
	       	username.sendKeys(prop.getProperty("username1"));

		password.sendKeys(prop.getProperty("password1"));
         loginbutton.click();
	}
	
  
 


}
