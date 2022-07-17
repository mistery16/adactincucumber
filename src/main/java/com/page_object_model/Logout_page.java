package com.page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_page {
public static WebDriver driver;
	@FindBy(xpath="//*[text()='Logout']")
	private static WebElement logout;
	
	public Logout_page(WebDriver driver2) {

		this.driver =driver2;
		PageFactory.initElements(driver, this);
		
	}
	public static WebElement Logout() {
		return logout;
		
	}
}
