package TestCases;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Page_objects.Login_page;

public class LoginTestCase extends BaseTestNgPage{
	
	static String actualURL;
	static String actualPanelText;
	static Properties prop;
	static SoftAssert sa = new SoftAssert();
	
 	Login_page lp = new Login_page(driver);
	
	@Test(dependsOnMethods="Sign_in_with_valid_cred")
	public void verifyLogin() throws IOException {
		lp.Chk_Login_With_Valid_Credentials();
		
		String actual_error = driver.findElement(By.xpath("//div[contains(@id,'navigation')]//ul//li[3]//a")).getText();
		
		String exp_error= "Hii tester";
				
		sa.assertTrue(actual_error.contains("Hii tester"));
		
	}


	@Test(priority=2)
	public void verify_Login_with_invalid_credentials() throws IOException {
		lp.Chk_Login_With_Invalid_Credentials();
		
		String actual_error= driver.findElement(By.xpath("//h3[contains(text(),'invalid username and password')]")).getText();
 		
 		String exp_error="invalid username and password";
 		
 		sa.assertTrue(actual_error.contains("invalid username and password"));
	}
	
	@Test(dependsOnMethods="verify_Login_with_invalid_credentials")
	public void Sign_in_with_inValid_cred() throws IOException {
		lp.Chk_Sign_in_With_inValid_Credentials();
		String actual_error= driver.findElement(By.xpath("//h3[contains(text(),'Username already taken')]")).getText();
 		
 		String exp_error="Username already taken";
 		
 		sa.assertTrue(actual_error.contains("Username already taken"));
		
	}
	
	@Test(dependsOnMethods="Sign_in_with_inValid_cred")
	public void Sign_in_with_valid_cred() throws IOException {
		lp.Chk_Sign_in_With_Valid_Credentials();

	}	
}
