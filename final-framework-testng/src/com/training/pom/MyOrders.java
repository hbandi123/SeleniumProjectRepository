package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyOrders {
	private WebDriver driver; 
	
	public MyOrders(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="input-email")
	private WebElement userName; 
	
	@FindBy(id="input-password")
	private WebElement password;
	
		
	//@FindBy(xpath="//i[@class='fa fa-user-o']")
	 //private WebElement loginlinkk;
	
	@FindBy(xpath="//li[@class='tb_link dropdown tb_menu_system_account_account']")
	private WebElement loginlink;
	
	@FindBy(xpath="//span[text()='LOGIN / REGISTER']")
	private WebElement LoginRegister;
	
	
	@FindBy(xpath="//input[@value='Login']")
	 private WebElement login;
	
	@FindBy(xpath="//li[@class='tb_link dropdown tb_menu_system_account_account tb_selected']")
	 private WebElement Account;
	
	@FindBy(xpath="//span[text()='MY ORDERS']")
	 private WebElement MYORDER;
	
	@FindBy(xpath="//a[@class='btn btn-default tb_no_text']")
	 private WebElement ViewOrder;
	
	
	
	
	
		public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	
public void clickLogin() {
		this.login.click(); 
}
	public void clickLoginlink() {
		Actions act = new Actions(driver);
		act.moveToElement(this.loginlink).build().perform();
	}
	public void clickLoginRegister() {
		this.LoginRegister.click(); 
	}
	
	public void clickAccount() {
		Actions act = new Actions(driver);
		act.moveToElement(this.Account).build().perform();
	}
	public void clickMYORDER() {
		this.MYORDER.click(); 
	}
	public void clickViewOrder() {
		this.ViewOrder.click(); 
}

}



