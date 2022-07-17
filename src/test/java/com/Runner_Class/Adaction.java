package com.Runner_Class;

import java.awt.Dimension;
import java.io.IOException;

import org.junit.jupiter.params.shadow.com.univocity.parsers.common.processor.InputValueSwitch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.base_Class.Base_Class;

import Pom.Page_object_manager;

public class Adaction  extends Base_Class{
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException {

	driver = getBrowser("chrome");
	getUrl("https://adactinhotelapp.com/");
	System.out.println("browser & Url launch success");
	Page_object_manager pom =new Page_object_manager(driver);
	
	inputValueElement(pom.getInstanceLp().getemail(), "Manikandan161");
	inputValueElement(pom.getInstanceLp().getPassword(),"0463XW");
	Thread.sleep(2000);
	takescreenshot("login");
	clickonElement(pom.getInstanceLp().signbtn());
	System.out.println("Login Process Done");
	Thread.sleep(3000);
	
	
   dropdown(pom.getInstancedp().Location(), "byvisibletext", "New York");
   dropdown(pom.getInstancedp().Hotel(), "byvisibletext", "Hotel Hervey");
   dropdown(pom.getInstancedp().Room(), "byvalue", "Super Deluxe");
   clickonElement(pom.getInstancedp().checkout_Date());
   clear(pom.getInstancedp().checkout_Date());
   inputValueElement(pom.getInstancedp().checkout_Date(),"06/06/2022");
   dropdown(pom.getInstancedp().Adult(), "byindex","2");
   takescreenshot("dropdown");
   System.out.println("Hotels &Room Specification Done");
   clickonElement(pom.getInstancedp().Search());

  clickonElement(pom.getInstancecf().Checkbox());
  clickonElement(pom.getInstancecf().continuee());
  System.out.println("Booking Conformation");
  takescreenshot("booking");
  Thread.sleep(3000);
  
  //clickonElement(pom.getInstancebh().FirstName());
  inputValueElement(pom.getInstancebh().FirstName(), "Manikandan");
  inputValueElement(pom.getInstancebh().LastName(), "Balamurugan");
  inputValueElement(pom.getInstancebh().Address(), "505,james street,new york");
  inputValueElement(pom.getInstancebh().Cardnumber(), "12345678910111213");
  dropdown(pom.getInstancebh().CardType(), "byvalue", "VISA");
  dropdown(pom.getInstancebh().Selectmonth(), "byvalue", "8");
  dropdown(pom.getInstancebh().SelectYear(), "byvalue", "2022");
  inputValueElement(pom.getInstancebh().Cvv(), "161");
  clickonElement(pom.getInstancebh().Booknow());
  Thread.sleep(3000);
  clickonElement(pom.getInstancelo().Logout());
  System.out.println("Logout Process Done Succesfully");
  
  Thread.sleep(3000);
close(driver);
   
	}
	}

	
