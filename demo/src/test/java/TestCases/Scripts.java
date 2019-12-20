package TestCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Scripts {
	WebDriver driver;

	@BeforeSuite
	public void luanchApp()
	{
		String driverPath = System.getProperty("user.dir") + ("\\src\\main\\java\\Browser_Drivers\\chromedriver.exe");

		System.setProperty("webdriver.chrome.driver", driverPath);

		driver = new ChromeDriver();

		driver.get("http://172.16.10.77/giftshop/index.php");

		driver.manage().window().maximize();

	}

	@Test
	public void scripts() 
	{
		//Home Page
		driver.findElement(By.xpath("//div[@class='products']//form//div//img[1]")).click();

		driver.findElement(By.xpath("//h3[text()='Crystal']//preceding::img[1]")).click();

		driver.findElement(By.xpath("//div[starts-with(@class,'star_4')]")).click();

		driver.findElement(By.xpath("//img[@src='css/images/addtocart.png']")).click();

		driver.findElement(By.xpath("//img[@src='css/images/del.png']")).click();

		Alert alt = driver.switchTo().alert();
		alt.accept();

		driver.findElement(By.xpath("//img[@src='css/images/ec.gif']")).click();

		Alert alt1 = driver.switchTo().alert();
		alt.dismiss();

		driver.findElements(By.xpath("//input[@type='checkbox']")).get(0).click();

		driver.findElements(By.xpath("//input[@type='text']")).get(0).sendKeys("Aman");

		driver.findElement(By.xpath("//textarea[contains(@name,'address')]")).sendKeys("14/80,Ganga Road,Jalandhar");

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("aman987@gmail.com");

		driver.findElements(By.xpath("//input[@type='text']")).get(1).sendKeys("9870654321");

		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}
}
