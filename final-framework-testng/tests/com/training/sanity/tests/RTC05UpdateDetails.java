package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import com.training.generics.ScreenShot;
import com.training.pom.EditDetailPOM;
//import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RTC05UpdateDetails {

	private WebDriver driver;
	private String baseUrl;
	private EditDetailPOM editDetailPOM;
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
		editDetailPOM = new EditDetailPOM(driver); 
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
	public void UpdateDetails() throws InterruptedException {
		editDetailPOM.clickLoginlink();
		editDetailPOM.clickLoginRegister();		
		editDetailPOM.sendUserName("manzoor3@gmail.com");
		editDetailPOM.sendPassword("123456");
		editDetailPOM.clickLogin(); 
		//Customer Information Edit/Update
		
		editDetailPOM.clickEDITLINK();
		editDetailPOM.sendFirstName("manzoor4");
		editDetailPOM.sendLastName("Mehadi3");
		editDetailPOM.sendEmail("manzoor3@gmail.com");
		editDetailPOM.sendTelephone("999999993");
		editDetailPOM.clickContinue();
		Thread.sleep(1000);
				
		try {
		String ActualAlert = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
			System.out.println("Actual Alert Displayed "  + ActualAlert);
			
		String ExpectedAlert = "Success: Your account has been successfully updated.";
			
			Assert.assertEquals(ExpectedAlert, ActualAlert);	
			System.out.println("Alert Message Displayed as Expected " +  ActualAlert);
			
		
	}
	catch (AssertionError e) {

		System.out.println("Erorr in Account Updation");
	}
	}}
		
		
		
	