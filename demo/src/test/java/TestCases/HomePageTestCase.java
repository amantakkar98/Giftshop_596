package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import Page_objects.HomePage;

public class HomePageTestCase extends BaseTestNgPage {
	HomePage hp = new HomePage(driver);

	@Test(priority=0)
	public void choose_Product_FromHome() throws IOException, InterruptedException {
//		System.out.println("HP Driver-"+hp);
		hp.Click_Add_Product();
	
	}
}
