package Page_objects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Utility.Common_Functionalities;

public class Login_page extends Common_Functionalities{
	public Login_page(WebDriver driver) {
		super(driver);
	}
	
	
	public void Chk_Sign_in_With_inValid_Credentials() throws IOException {
		prop = setPropertyFilePath("testData.properties");
		String ele_username = prop.getProperty("signin_invalid_Username");
		sendData(ele_username);
		String ele_email = prop.getProperty("signin_invalid_Email");
		sendData(ele_email);
		String ele_password = prop.getProperty("signin_invalid_Password");
		sendData(ele_password);
		String ele_confirm_password = prop.getProperty("signin_invalid_Confirm_Password");
		sendData(ele_password);
		String ele_ClickBtn = prop.getProperty("SigninClickButton");
		sendClickBtn(ele_ClickBtn);
		
	}

	public void Chk_Login_With_Valid_Credentials() throws IOException {
		prop = setPropertyFilePath("testData.properties");
		String ele_username = prop.getProperty("login_valid_Username");
		sendData(ele_username);
		String ele_password = prop.getProperty("login_valid_Password");
		sendData(ele_password);
		String ele_ClickBtn = prop.getProperty("loginClickButton");
		sendClickBtn(ele_ClickBtn);
		
	}
	
	public void Chk_Login_With_Invalid_Credentials() throws IOException {
		prop = setPropertyFilePath("testData.properties");
		String ele_username = prop.getProperty("login_invalid_Username");
		sendData(ele_username);
		String ele_password = prop.getProperty("login_invalid_Password");
		sendData(ele_password);
		String ele_ClickBtn = prop.getProperty("loginClickButton");
		sendClickBtn(ele_ClickBtn);
		
	}
	
	public void Chk_Sign_in_With_Valid_Credentials() throws IOException {
		System.out.println("3");
		prop = setPropertyFilePath("testData.properties");
		String ele_username = prop.getProperty("Signin_valid_Username");
		sendData(ele_username);
		String ele_email = prop.getProperty("Signin_valid_Email");
		sendData(ele_email);
		String ele_password = prop.getProperty("Signin_valid_Password");
		sendData(ele_password);
		String ele_confirm_password = prop.getProperty("Signin_valid_Confirm_Password");
		sendData(ele_confirm_password);
		String ele_ClickBtn = prop.getProperty("Sign_in_button");
		sendClickBtn(ele_ClickBtn);
		
	}
	
}

