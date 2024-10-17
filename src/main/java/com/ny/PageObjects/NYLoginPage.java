package com.ny.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ny.CoreFunctions.CoreFunctions;
import com.ny.Util.PageUtil;

public class NYLoginPage extends CoreFunctions {
	
	WebDriver driver;	   
    public NYLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public static WebElement email()
   	{
   		return PageUtil.findBy(By.xpath("//input[@id='email']"));
   	}
    
    public static WebElement continueIcon()
   	{
   		return PageUtil.findBy(By.xpath("//button[@data-testid='submit-email']"));
   	}
    
    public static WebElement password()
   	{
   		return PageUtil.findBy(By.xpath("//input[@id='password']"));
   	}
    
    public static WebElement createAccount()
   	{
    	return PageUtil.findBy(By.xpath("//span[text() = 'Create Account']"));
   	}
    
    public static WebElement error()
   	{
   		return PageUtil.findBy(By.xpath("//div[@data-testid ='error-message']/span"));
   	}

}
