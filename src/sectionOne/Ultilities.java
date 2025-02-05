package sectionOne;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Ultilities {
	// find element with retrive
	public static WebElement findElementwithRetry(WebDriver driver, String locator ,int retries ) throws InterruptedException {
			for(int i = 0 ; i < retries ; i++) {
				try {
					return driver.findElement(By.cssSelector(locator));
				}
				catch(Exception e) {
					Thread.sleep(2);	
				}
				;
			}
			throw new RuntimeException("Element not found");
	}
	
	
    // element to be clickable
	
	public static WebElement waitForElementTobeClickable(WebDriver driver,String locator,Duration time) {
		WebDriverWait wait = new WebDriverWait(driver,time);
		return wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(locator)));
		
	}
	// element to be visible
	public static WebElement waitForElementTobeVisible(WebDriver driver,String locator) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locator)));
		
	}
	
	// wait for element to be visible and enter text 
	
	public static void enterText(WebDriver driver , String locator , String text) {		
		 WebElement ele  =  waitForElementTobeVisible(driver,locator);
		 ele.clear();
		 ele.sendKeys(text);
	
	}
	
	// wait for element to be visible and get text
	
	public static String getText(WebDriver driver , String locator , String text) {		
		 WebElement ele  =  waitForElementTobeVisible(driver,locator);
		 return ele.getText();
	
	}
	
	
	
	

	
	
	
	
	
	
	
	

}
