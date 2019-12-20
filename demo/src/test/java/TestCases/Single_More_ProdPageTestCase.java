package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import Page_objects.Single_ProdPage;

public class Single_More_ProdPageTestCase extends BaseTestNgPage{
	Single_ProdPage spObj = new Single_ProdPage(driver);
	
	@Test(priority=6)
	public void addProdToCart2() throws IOException {
		spObj.ClickAddToCartButton_2();
	}
}
