package Page_objects;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import Utility.Common_Functionalities;

public class Single_ProdPage extends Common_Functionalities{


	public static Properties prop;
	public Single_ProdPage(WebDriver driver)  {
		super(driver);
	}
		
		
		public void ClickAddCartButton() throws IOException {
			prop = setPropertyFilePath("TestData.properties");
//			System.out.println("hye");
			sendClickBtn(prop.getProperty("add_To_Cart_button"));
			 
		}
		
		public void ClickAddToCartButton_2() throws IOException {
//			System.out.println("hye2");
			prop = setPropertyFilePath("TestData.properties");
//			System.out.println("hye3");
			sendClickBtn(prop.getProperty("add_To_Cart_button_2"));
			 
		}
		 
}


