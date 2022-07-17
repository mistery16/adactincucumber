package com.page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
public static  WebDriver driver;
	
	@FindBy(id="location")
	 private static WebElement location;
	
	@FindBy(id="hotels")
	 private static WebElement hotel;
	
	
	@FindBy(id="room_type")
	private static WebElement room;
	
	@FindBy(id="datepick_out")
	private static WebElement date;
	@FindBy(id="adult_room")
	private static WebElement adult;
	
	@FindBy(id="Submit")
	private static WebElement search;
	
	public Search_Hotel(WebDriver driver2) {

		this.driver =driver2;
		PageFactory.initElements(driver, this);
	}


	public static WebElement Location() {
		return location;
		
	}

	public static WebElement Hotel() {
		return hotel;
		
	}
	public static WebElement Room() {
		return room;
		
	}
	public static WebElement checkout_Date() {
		return date;
		
	}
	public static WebElement Adult() {
		return adult;
	}
	public static WebElement Search() {
		return search;
	}
}
