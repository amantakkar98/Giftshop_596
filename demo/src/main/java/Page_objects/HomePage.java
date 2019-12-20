package Page_objects;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import Utility.Common_Functionalities;

public class HomePage extends Common_Functionalities{

		public static Properties prop;
		public HomePage(WebDriver driver)  {
			super(driver);
			 
		}
		
//		public void clickAddUserBtn() throws IOException {
//			prop = setPropertyFilePath("testData.properties");
//			actionPerform(prop.getProperty("adminId"));
//			actionPerform(prop.getProperty("userManagementId"));
//			sendClickBtn(prop.getProperty("usersId"));
//			sendClickBtn(prop.getProperty("addUserBtnId"));
//		}
		
		public void Click_Add_Product() throws IOException, InterruptedException {
			 
			prop = setPropertyFilePath("TestData.properties");
			sendClickBtn(prop.getProperty("prodcut_name"));
			
		}
		
		public void Click_Add_More_Product() throws IOException, InterruptedException {
			 
			prop = setPropertyFilePath("TestData.properties");
			sendClickBtn(prop.getProperty("product_name"));
			
		}
		
}




