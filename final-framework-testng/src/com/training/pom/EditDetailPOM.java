package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditDetailPOM {
	private WebDriver driver; 
	
	public EditDetailPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="input-email")
	private WebElement userName; 
	
	@FindBy(id="input-password")
	private WebElement password;
	
		
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
	
	//For Edit customer
	
	@FindBy(xpath="//a[text()='Edit your account information']")
	private WebElement EDITLINK;
	
	@FindBy(id="input-firstname")
	private WebElement firstName;
	
	@FindBy(id="input-lastname")
	private WebElement lastName;
	
	@FindBy(id="input-email")
	private WebElement email;
	
	@FindBy(id="input-telephone")
	private WebElement telephone;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement Continue;
	
	public void clickContinue() {
		this.Continue.click(); 
	}
		
	
	
	public void sendTelephone(String telephone) {
		this.telephone.clear();
		this.telephone.sendKeys(telephone);
	}
	
	public void sendEmail(String email) {
		this.email.clear();
		this.email.sendKeys(email);
	}
	
	
	
	public void sendLastName(String lastName) {
		this.lastName.clear();
		this.lastName.sendKeys(lastName);
	}
	
	
	public void sendFirstName(String firstName) {
		this.firstName.clear();
		this.firstName.sendKeys(firstName);
	}
	public void clickEDITLINK() {
		this.EDITLINK.click(); 
	}
		
	
	
	//For Edit Customer


	
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



