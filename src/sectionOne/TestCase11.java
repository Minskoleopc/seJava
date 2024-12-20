package sectionOne;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class TestCase11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

	       // Create an instance of WebDriver
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	       
		
//	       
//	       List <WebElement> dropdpwns = driver.findElements(By.tagName("select"));
//	       // [drp1 , drp2 , drp3]
//	       for(WebElement dropdown:dropdpwns) {
//	    	   Select select = new Select(dropdown);
//	    	   select.selectByIndex(1);
//	       }
	       
	       // click all checkboxes
	       
	       List <WebElement> checkboxes = driver.findElements(By.cssSelector("input[type=\"checkbox\"]"));
	       for(WebElement checkbox:checkboxes) {
	    	   //checkbox.click();
	    	   if(!checkbox.isSelected()) {
	    		   checkbox.click();
	    	   }
	       }
	       
	       // click all radio buttons and verify selection
	       
	       List <WebElement> radioButtons = driver.findElements(By.cssSelector("#radio-buttons > input[type='radio']"));
	       for(WebElement radioButton:radioButtons) {
	    	   radioButton.click();
	    	   if(radioButton.isSelected()) {
	    		   System.out.println("Test case pass");
	    	   }
	       }
	       
	       
	       
	       
	       Thread.sleep(5000);
		
	       
	       
		

	}

}
