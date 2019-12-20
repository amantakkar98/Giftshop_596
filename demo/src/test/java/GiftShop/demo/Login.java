package GiftShop.demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args)
 {
		String driverPath=System.getProperty("user.dir")+("\\src\\test\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver",driverPath);
	  	
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://172.16.10.77/giftshop/index.php");
		
		driver.manage().window().maximize();
 
		driver.findElement(By.xpath("//h3[text()='Hello Kitty Angel']//preceding::img[1]")).click();

		driver.findElement(By.xpath("//h3[text()='Gift Wrapping Available']//preceding::img[1]")).click();

//		driver.findElement(By.partialLinkText("signup.php")).click();
		
		
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("tester");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("tester123");

		driver.findElement(By.xpath("//button[@name='submit']")).click();
		
		driver.findElement(By.xpath("//button[@name='submit']//following::img[1]")).click();

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("aman987");
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("aman987@gmail.com");

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("aman596");

		driver.findElement(By.xpath("//input[@name='confirmpassword']")).sendKeys("aman596");
		
		driver.findElement(By.xpath("//button[@name='submit']")).click();
		
		driver.findElement(By.xpath("//a[contains(@href,'Login')]")).click();

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("aman987");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("aman596");

		driver.findElement(By.xpath("//button[@name='submit']")).click();
		
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
		
		driver.findElement(By.xpath("//textarea[contains(@name,'address')]")).sendKeys("14/80,Ganga Road,Jalanndhar");
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("aman987@gmail.com");
		
		driver.findElements(By.xpath("//input[@type='text']")).get(1).sendKeys("9870654321");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
 }
}