package Asserttest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase1 {

	WebDriver driver;
	@BeforeClass
	public void stup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Saiful Chowdhury\\OneDrive\\Desktop\\Automation\\chromedriver.exe");

		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
	}
		@Test 
		public void logintest() {
		  WebElement element=driver.findElement(By.id("user-name")); 
		  WebElement pass=driver.findElement(By.id("password"));
		 
		  
		  Assert.assertTrue(element.isDisplayed()); element.sendKeys("standard_user");
		  
		    Assert.assertTrue(pass.isDisplayed()); pass.sendKeys("secret_sauce");
		  
		  
		  
		  
			/*
			 * Assert.assertFalse(element.isDisplayed()); element.sendKeys("standard_user");
			 * 
			 * Assert.assertFalse(pass.isDisplayed()); pass.sendKeys("secret_sauce");
			 */
		  
		  
		  driver.findElement(By.id("login-button")).click();
		  
		  String ExpTitle="Swag Labs";
		
		  Assert.assertEquals(ExpTitle, driver.getTitle()); 
		   System.out.println(driver.getTitle());
		 
		}
		@Test
	 public void teardown() {
			
			 driver.close();
		}
			
		}
			 
		 
		  
		  
		
	
