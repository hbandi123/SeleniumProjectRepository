package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditPasswordPOM {
	private WebDriver driver; 
	
	public EditPasswordPOM(WebDriver driver) {
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
	
	//For Password	Update
//	
//	@FindBy(xpath="//a[text()='Change your password']']")
//	private WebElement PasswordlinkX;
	
	@FindBy(linkText="Change your password")
	private WebElement Passwordlink;
	
	@FindBy(id="input-password")
	private WebElement passwordu;
	
	@FindBy(id="input-confirm")
	private WebElement CNFpassword;
		
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement Continue;
	
	public void clickContinue() {
		this.Continue.click(); 
	}
	
	
	public void sendPassWordCNF(String CNFpassword) {
//		this.CNFpasswordF.clear();
		this.CNFpassword.sendKeys(CNFpassword);
	}
	
	
	public void sendPasswordU(String passwordu) {
//		this.passwordu.clear();
		this.passwordu.sendKeys(passwordu);
	}
	public void clickPasswordlink() {
		this.Passwordlink.click(); 
	}
		
//	public void clickPasswordlinkX() {
//		this.PasswordlinkX.click(); 
//	}
//		
	
	
	//For Password Update


	
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



