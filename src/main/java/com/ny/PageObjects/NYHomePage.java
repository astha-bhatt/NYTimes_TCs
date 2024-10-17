package com.ny.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ny.Util.PageUtil;
import com.ny.CoreFunctions.CoreFunctions;

public class NYHomePage extends CoreFunctions {
	WebDriver driver;	   
    public NYHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public static WebElement searchIcon()
	{
		return PageUtil.findBy(By.xpath("//button[@aria-controls='search-input']"));
	}
    
    public static WebElement enterText()
	{
		return PageUtil.findBy(By.xpath("//div[@id='search-input']//input[@data-testid='search-input']"));
	}
    
    public static WebElement go()
	{
		return PageUtil.findBy(By.xpath("//div[@id='search-input']//button[@data-testid='search-submit']"));
	}
    
    public static WebElement continueIcon()
	{
		return PageUtil.findBy(By.xpath("//div[@id='complianceOverlay']//button[contains(text(),'Continue')]"));
	}
    
    public static WebElement loginIcon()
   	{
   		return PageUtil.findBy(By.xpath("//span[text()='Log in']"));
   	}
    
    public static WebElement searchResult() {
		return PageUtil.findBy(By.xpath("//input[@id='searchTextField']"));
    	
    }
    
    public static WebElement gamesIcon () {
		return PageUtil.findBy(By.xpath("(//li[@data-navid= 'Games' and @data-testid ='nav-item-Games'])[2]"));   	
    }
    
    public static WebElement gamesSection () {
    	return PageUtil.findBy(By.xpath("//h3[@class = 'hub-promo-card__title']"));
    }
    
    public static WebElement todaysPaper () {
    	return PageUtil.findBy(By.xpath("//a[text()='Today’s Paper']"));
    }
    
    public static WebElement todaysPaperSection () {
    	return PageUtil.findBy(By.xpath("//h1[text()='Today’s Paper']"));
    }
}
