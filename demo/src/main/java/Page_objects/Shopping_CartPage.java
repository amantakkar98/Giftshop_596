package Page_objects;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utility.Common_Functionalities;

public class Shopping_CartPage extends Common_Functionalities {
	public static Properties prop;
	public Shopping_CartPage(WebDriver driver)  {
		super(driver);
		 
	}
	
	public void Click_Continue_Shopping_Btn() throws IOException, InterruptedException {
		 
		prop = setPropertyFilePath("TestData.properties");
		sendClickBtn(prop.getProperty("Continue_Shopping_btn"));
		
	}
	
	public void deleteProductFromCart() throws IOException {
		prop = setPropertyFilePath("TestData.properties");
		sendClickBtn(prop.getProperty("cross_btn"));
		 //driver.switchTo().alert();
		  
	}
	
	public void empty_cart() throws IOException, InterruptedException
	{
		
		prop = setPropertyFilePath("TestData.properties");
		sendClickBtn(prop.getProperty("empty_cart_cross_btn"));
	
	}

	public void checkbox_COD() throws IOException
	{
		prop = setPropertyFilePath("TestData.properties");
		selectElm(prop.getProperty("checkbox_Button"), 0);
		
		
	}
	
	public void COD_Fields() throws IOException
	{
		prop = setPropertyFilePath("TestData.properties");
		send_data(prop.getProperty("yourname"), 0);
		
		prop = setPropertyFilePath("TestData.properties");
//		System.out.println("gsligjsrilgjsrg");
		sendData(prop.getProperty("address"));
		
		prop = setPropertyFilePath("TestData.properties");
		sendData(prop.getProperty("email"));
		
		prop = setPropertyFilePath("TestData.properties");
		send_data(prop.getProperty("phone_no"), 1);
		
		prop = setPropertyFilePath("TestData.properties");
		sendClickBtn(prop.getProperty("place_order_btn"));
	
		
	}
	
}
