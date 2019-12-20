package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import Page_objects.Single_ProdPage;

public class Single_Prod_TestCase extends BaseTestNgPage {
	
	Single_ProdPage spObj = new Single_ProdPage(driver);
	
	@Test(priority=1)
	public void addProdToCart() throws IOException {
		spObj.ClickAddCartButton();
	}	

	
}
