package com.page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	public static  WebDriver driver;
	
	@FindBy(id="username")
	 private static WebElement email;
	
	@FindBy(id="password")
	 private static WebElement password;
	
	@FindBy(id="login")
	 private static WebElement signbtn;
	
	public Login_page(WebDriver driver) {
		
		
		this.driver =driver;
		
	PageFactory.initElements(driver, this);
	}
	public static WebElement getemail() {
		return email;
		
	}
	
	public static WebElement getPassword() {
		return password ;
		
	}
	public static WebElement signbtn() {
		return signbtn ;
		
	}
	
}
