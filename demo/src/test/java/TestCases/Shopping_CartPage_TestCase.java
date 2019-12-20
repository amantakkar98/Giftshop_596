package TestCases;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Page_objects.HomePage;
import Page_objects.Shopping_CartPage;

public class Shopping_CartPage_TestCase extends BaseTestNgPage {
	
	Shopping_CartPage sc_Obj = new Shopping_CartPage(driver);
	HomePage hp = new HomePage(driver);
	
	@Test(priority=3)
	public void click_Continue_Shop_Btn() throws IOException, InterruptedException {
		
		sc_Obj.Click_Continue_Shopping_Btn();
	}
	
	@Test(priority=4)
	public void add_More_Prod() throws IOException, InterruptedException {
		
		hp.Click_Add_More_Product();
	}
	
//	@Test(priority=7)
	
	@Test(priority=7,enabled=false)
	public void click_Cross_Btn() throws IOException, InterruptedException {
		
		sc_Obj.deleteProductFromCart();

		Alert alt = driver.switchTo().alert();
		alt.accept();
		
	}
	
//	@Test(priority=8)
	
	@Test(priority=8,enabled=false)
	public void click_empty_cart_Cross_Btn() throws IOException, InterruptedException
	{
		 sc_Obj.empty_cart();
		 
		 Alert alt = driver.switchTo().alert();
		 alt.dismiss(); 
	}
	
	@Test(priority=9)
	public void click_checkbox_Btn() throws IOException, InterruptedException
	{
		 sc_Obj.checkbox_COD();
	 
	}
	
	@Test(priority=10)
	public void fill_fields() throws IOException, InterruptedException
	{
		 sc_Obj.COD_Fields();
		
	}
	
}
