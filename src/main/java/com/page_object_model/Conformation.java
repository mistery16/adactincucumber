package com.page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Conformation {
	public static  WebDriver driver;
	@FindBy(id="radiobutton_0")
	private static WebElement checkbox;
	@FindBy(id="continue")
	private static WebElement Continue;
	
	
	public Conformation(WebDriver driver2) {

		this.driver =driver2;
		PageFactory.initElements(driver, this);
	}
	public static WebElement Checkbox() {
		return checkbox;
		
	}
	public static WebElement continuee() {
		return Continue;
		
	}

}



