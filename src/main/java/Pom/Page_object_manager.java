package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.page_object_model.Book_hotel;
import com.page_object_model.Conformation;
import com.page_object_model.Login_page;
import com.page_object_model.Logout_page;
import com.page_object_model.Search_Hotel;



public class Page_object_manager {
	

	public  WebDriver driver;
	
	
	  
	  private Login_page lp;
      private Search_Hotel  dp;
	  private Conformation cf;
	  private Logout_page lo;
	  private Book_hotel bh;

public Page_object_manager(WebDriver driver2) {
	this.driver=driver2;
}

	  


public Login_page getInstanceLp() {
	lp =new Login_page(driver);
	return lp;
}
public Search_Hotel  getInstancedp() {
	dp =new Search_Hotel (driver);
	return dp;
}
public Conformation  getInstancecf() {
	cf =new Conformation (driver);
	return cf;
}
public Logout_page  getInstancelo() {
	lo =new Logout_page (driver);
	return lo;
}
public Book_hotel getInstancebh() {
	bh =new Book_hotel (driver);
	return bh;
}

}