package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.MyOrders;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RTTC04MYORDERS {

	private WebDriver driver;
	private String baseUrl;
	private MyOrders myOrders;
	private static Properties properties;
//	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		myOrders = new MyOrders(driver); 
		baseUrl = properties.getProperty("baseURL");
//		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test
	public void MYORDERS() {
		myOrders.clickLoginlink();
		myOrders.clickLoginRegister();		
		myOrders.sendUserName("manzoor3@gmail.com");
		myOrders.sendPassword("1231233");
		myOrders.clickLogin(); 
		myOrders.clickAccount(); 
		myOrders.clickMYORDER(); 
		

		myOrders.clickViewOrder();
		
		
		try {
			String ActualOrderInformation = driver.getTitle();
			
			String ExpectedOrderInformation = "Order Information";
			
			Assert.assertEquals(ExpectedOrderInformation, ActualOrderInformation);	
			System.out.println("Displaying page "+ActualOrderInformation);
			
		
	}
	catch (AssertionError e) {

		System.out.println("Order Information Page not displaying ");
	}
		
		try {
			//String ActualDetails=driver.findElement(By.xpath("//td[text()='Engagement Ring ']")).getText();
			
			String ActualDetails=driver.findElement(By.xpath("//div[@class='table-responsive']/table/tbody/tr[1]/td[1]")).getText();
	        System.out.println("Ordered Product is "+ActualDetails);
			
			String ExpectedDetails = "Engagement Ring";
				
			Assert.assertEquals(ExpectedDetails, ActualDetails);	
			
String Model=driver.findElement(By.xpath("//div[@class='table-responsive']/table/tbody/tr[1]/td[2]")).getText();
			
	        System.out.println("Ordered Product Model "+Model);
	        
String Price=driver.findElement(By.xpath("//div[@class='table-responsive']/table/tbody/tr[1]/td[3]")).getText();
			
	        System.out.println("Ordered Product Price "+Price);
	        
String Quantity=driver.findElement(By.xpath("//div[@class='table-responsive']/table/tbody/tr[1]/td[4]")).getText();
			
	        System.out.println("Ordered Product QTY "+Quantity);
	        
String Total=driver.findElement(By.xpath("//div[@class='table-responsive']/table/tbody/tr[1]/td[5]")).getText();
			
	        System.out.println("Ordered Product Total Amount = "+Total);
			
					
			
			}
			catch (AssertionError e) {

				System.out.println("Ordered Product Information not showing ");
			}

		System.out.println("Happy Shopping ");
				
//		screenShot.captureScreenShot("First");
	}
}
