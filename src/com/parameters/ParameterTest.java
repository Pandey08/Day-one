package com.parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParameterTest {

WebDriver driver;
	
	@Test(priority=1)
	@Parameters({"url"})
	public void setUp(String url)
	{
		
		System.setProperty("webdriver.chrome.driver", "/Users/bishal.pandey/eclipse-workspace/TESTNG/chromedriver");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	@Test(priority=2)
	@Parameters({"emailId","pasword"})
	public void gmailLogin(String emailId,String pasword)
	{
		driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys(emailId);
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pasword);
		
		
	}
	
}
