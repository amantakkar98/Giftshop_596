package Page_objects;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import Utility.Common_Functionalities;

public class Rating_ProdPage extends Common_Functionalities{
	public static Properties prop;
	public Rating_ProdPage(WebDriver driver)  {
		super(driver);
	}
		
		
		public void Click_Rating_Button() throws IOException {
			
			prop = setPropertyFilePath("TestData.properties");
			sendClickBtn(prop.getProperty("rating_btn"));
			 
		}
}
