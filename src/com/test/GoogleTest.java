package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		String url="https://www.google.com";
		System.setProperty("webdriver.chrome.driver", "/Users/bishal.pandey/eclipse-workspace/TESTNG/chromedriver");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void googleTitleTest()
	{
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google","title is matched");
	}
	
	@Test
	public void googleLogoTest()
	{
		boolean a=driver.findElement(By.id("hplogo")).isDisplayed();
		System.out.println(a);
		Assert.assertTrue(a);
	}
	
	@Test
	public void gmailLogoTest()
	{
		boolean b=driver.findElement(By.linkText("Gmail")).isDisplayed();
		System.out.println(b);
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
}
