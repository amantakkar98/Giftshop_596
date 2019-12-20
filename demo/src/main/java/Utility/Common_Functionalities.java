package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Common_Functionalities {
			
			public static WebDriver driver;
			public static String driverPath;
			public static String propFilePath;
			public static FileInputStream fis;
			public static Properties prop;
			public static Actions action;
			public static Select select;
			
			public Common_Functionalities(WebDriver driver) {
				Common_Functionalities.driver=driver;
			}
			
			public By getLocator(String locatorName, String LocatorValue) {
				By by=null;
				
				switch(locatorName.toLowerCase()) {
				case "id":
					by = By.id(LocatorValue);
					break;
				case "name":
					by = By.name(LocatorValue);
					break;
				case "linktext":
					by = By.linkText(LocatorValue);
					break;
				case "partiallinktext":
					by = By.partialLinkText(LocatorValue);
					break;
				case "xpath":
					by = By.xpath(LocatorValue);
					break;
				case "classname":
					by = By.className(LocatorValue);
					break;
				case "cssselector":
					by = By.cssSelector(LocatorValue);
					break;
				case "tagname":
					by = By.tagName(LocatorValue);
					break;
				default:
					System.out.println("Please send correct locator name");
				}
				return by;
			}
		
		
			public void sendData(String eleaddress) {

				String[] locArr = eleaddress.split("####");
				//System.out.println("value of driver-"+driver);
				driver.findElement(getLocator(locArr[0], locArr[1])).sendKeys(locArr[2]);
			}
			
			public void sendClickBtn(String elePath) {

				String[] locArr = elePath.split("####");
				driver.findElement(getLocator(locArr[0], locArr[1])).click();
			}

			public String getData(String elePath) {

				String[] locArr = elePath.split("####");
				return driver.findElement(getLocator(locArr[0], locArr[1])).getText();
			}
			
			public void actionPerform(String elePath) {
				action = new Actions(driver);
				String[] locArr = elePath.split("####");
				action.moveToElement(driver.findElement(getLocator(locArr[0], locArr[1]))).perform();
			}
			
			public void selectData(String elePath) {
				String[] locArr = elePath.split("####");
				select = new Select(driver.findElement(getLocator(locArr[0], locArr[1])));
				select.selectByVisibleText(locArr[2]);
			}
			
			public void selectElm(String slcElm, int index) {
				String[] locArr = slcElm.split("####");
//				select = new Select((WebElement)driver.findElements(getLocator(locArr[0], locArr[1])));
				driver.findElements(getLocator(locArr[0], locArr[1])).get(index).click();

//				driver.findElements(String slcElm).index
				select.selectByVisibleText(locArr[2]);
			}

			
			public void send_data(String eleName, int index) {

				String[] locArr = eleName.split("####");
				//System.out.println("value of driver-"+driver);
				driver.findElements(getLocator(locArr[0], locArr[1])).get(index).sendKeys(locArr[2]);
//				select.selectByVisibleText(locArr[2]);

			}

			
			public static Properties setPropertyFilePath(String propFileName) throws IOException {
				//Read Data form config.properties file
				propFilePath = System.getProperty("user.dir")+"\\src\\main\\java\\Test_Data\\"+propFileName;
				//To read the data from file
				fis = new FileInputStream(propFilePath);
				//Creating the object of properties file to access the methods of that class
				prop = new Properties();
				//To load the properties file
				prop.load(fis);
				return prop;
			}

}
