package com.Runner_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra {
	public static WebDriver driver;
	
	private void browser() {
		WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			

	}
	private void url() {
		driver.get("https://www.myntra.com/kids?f=Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false");
	//	driver.get("https://www.flipkart.com/clothing-and-accessories/topwear/tshirt/men-tshirt/pr?sid=clo,ash,ank,edy&otracker=categorytree&otracker=nmenu_sub_Men_0_T-Shirts");

	}
	
	public static void main(String[] args) {
		
		Myntra MY = new Myntra();
		MY.browser();
		MY.url();
		
		MY.test2();
	}

	private void test2() {

		List<WebElement> lists =driver.findElements(By.xpath("//h4[@class='product-product']"));
	
		System.out.println("Total t shirts "+lists.size());
	
		for(int i=0;i<lists.size();i++) {
			
		System.out.println(lists.get(i).getText() );
		}
		}
	
} 
