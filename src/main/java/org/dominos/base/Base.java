package org.dominos.base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Base {
	
	public static WebDriver Driver ;
	
	public static void maxi(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	public static void click(WebElement clk) {
		clk.click();
	}
	
	public static void sendkeys(WebElement sndkys,String TextToBeEntered) {
		sndkys.sendKeys(TextToBeEntered);
		
	}
	public static void Url(WebDriver driver,String webSite) {
		driver.get(webSite);
		
	}
	public static void scroolto(WebDriver driver,WebElement element)
	{
		Actions ac= new Actions(driver);
		ac.moveToElement(element).build().perform();
	}
	public static void jsclick(WebElement element,WebDriver driver) {
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
		
	}
}