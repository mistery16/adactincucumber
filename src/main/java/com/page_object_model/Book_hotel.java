package com.page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_hotel {
	public static WebDriver driver;
	
	@FindBy(id="first_name")
	private static WebElement frstname;
	@FindBy(id="last_name")
	private static WebElement lstname;
	@FindBy(id="address")
	private static WebElement address;
	
	@FindBy(id="cc_num")
	private static WebElement cdno;
	
	@FindBy(id="cc_type")
	private static WebElement crdtype;
	
	@FindBy(id="cc_exp_month")
	private static WebElement sltmonth;
	
	@FindBy(id="cc_exp_year")
	private static WebElement sltyear;
	
	@FindBy(id="cc_cvv")
	private static WebElement cvv;
	
	@FindBy(id = "book_now")
	private static WebElement booknow;
	
	public Book_hotel (WebDriver driver2) {

		this.driver =driver2;
		PageFactory.initElements(driver, this);
		
	}
	public static WebElement FirstName() {
		return frstname;	
	}
	public static WebElement LastName() {
		return lstname;	
	}
	public static WebElement Address() {
		return address;	
	}
	public static WebElement Cardnumber() {
		return cdno;	
	}
	public static WebElement CardType() {
		return crdtype;	
	}
	public static WebElement Selectmonth() {
		return sltmonth;	
	}
	public static WebElement SelectYear() {
		return sltyear ;	
	}
	public static WebElement Cvv() {
		return cvv ;	
	}
	public static WebElement Booknow() {
		return booknow ;	
	}
}
