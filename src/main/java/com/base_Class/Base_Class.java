package com.base_Class;


import java.awt.Point;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



import org.openqa.selenium.io.FileHandler;

public class Base_Class {
	
public static WebDriver driver;
	
	
	public static WebDriver getBrowser(String type) {                           //1
 		
	if (type.equalsIgnoreCase("chrome")) {
			
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jarvis\\eclipse-workspace\\adaction\\drv\\chromedriver.exe");
			driver = new ChromeDriver();
			
			}
		else if (type.equalsIgnoreCase("edge")) { 
			

			System.setProperty("webdriver.edge.driver",
					System.getProperty("user.dir")+"adaction\\Drivers\\msedgedriver.exe");
			 driver = new EdgeDriver();
			
			
			}
		driver.manage().window().maximize();
		return driver;
		
		
	}
	public static void getUrl(String url) {                                    //2
		driver.get(url);
	}

	public static void clickonElement(WebElement element) {                   //3
		element.click();
		
	}
	
	public static void inputValueElement(WebElement element,String value) {     //4
		element.sendKeys(value);
	}
	
	public static void close(WebDriver driver) {
		driver.close();                                                      //5
	}
	public static void quit1(WebDriver driver) {
		driver.quit();                                                  //6
	}
	
	
//	private void dropdown1() {
//
//		
//	    Select s = new Select();
//		s.selectByVisibleText("New York");
//
//	}
	public static void clear(WebElement element) {
		
        element.clear();
	}
	public static void waitthe(WebDriver driver) throws InterruptedException  {
		driver.wait();

	}
	
	
	public static void scroll(String x,String y) {			//26
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(x,y);
	//	js.executeScript("window.scrollBy(0,250)");
	//	js.executeScript("arguments[0].scrollIntoView()", element);
	}
	public static void takescreenshot(String path) throws IOException {		//25
		TakesScreenshot ss =(TakesScreenshot) driver;
	      File source =ss.getScreenshotAs(OutputType.FILE);
	      File destination = new File("C:\\Users\\Jarvis\\eclipse-workspace\\adaction\\screenshot\\"+path+".png");
	      FileHandler.copy(source, destination);
	}
	public static void implicitytime(int sec,TimeUnit timeunit) {			//23
		driver.manage().timeouts().implicitlyWait(sec, timeunit);
	}
	
	
	
	public static void frame(String enterorexit, int frameindex) {   //12
		   if(enterorexit.equalsIgnoreCase("enter")) {
			   
			   driver.switchTo().frame(frameindex);   
		   }
		   else if (enterorexit.equalsIgnoreCase("exit")) {
			   driver.switchTo().defaultContent();
		   }  
		}
	
	
	
	
	public static void dropdown(WebElement element,String type,String value) {   //15
		Select s = new Select(element);
		if (type.equalsIgnoreCase("byindex")) {
		int data = Integer.parseInt(value);
		s.selectByIndex(data);
		}
		else if (type.equalsIgnoreCase("byvalue")) {
			s.selectByValue(value);
		}
		else if (type.equalsIgnoreCase("byvisibletext")) {
			s.selectByVisibleText(value);
		}
	}
	
	public static void actions(String method,WebElement element,WebElement element2) {	//31
		Actions act = new Actions(driver);
		if(method.equalsIgnoreCase("draganddrop")) {
			act.dragAndDrop(element, element2).build().perform();
		}
		else if (method.equalsIgnoreCase("moveelement")) {
			act.moveToElement(element).build().perform();
			act.click(element2).build().perform();	
		}
		else if (method.equalsIgnoreCase("clickandhold")) {
			act.clickAndHold(element).build().perform();
			act.moveToElement(element2).build().perform();
		}
		else if (method.equalsIgnoreCase("doubleclick")) {
			act.doubleClick().build().perform();
		}

		
	}
	
	
	
}
