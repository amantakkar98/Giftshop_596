package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import Page_objects.Rating_ProdPage;

public class Rating_PageTestCase extends BaseTestNgPage {
	Rating_ProdPage rp_Obj = new Rating_ProdPage(driver);

	@Test(priority=5,enabled=false)
	public void click_rating() throws IOException{

		rp_Obj.Click_Rating_Button();
	}

}
