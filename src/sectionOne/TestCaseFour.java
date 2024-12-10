package sectionOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        // Create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        //driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
        
        // click()
//        
//        driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).sendKeys("chinmay");
//        driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)")).sendKeys("deshpande");
//        driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).sendKeys("chinmay010@gmail.com");
//        driver.findElement(By.cssSelector("#contact_form > textarea")).sendKeys("I am learning js");
//        //driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)")).click();
//        
//        
//        // submit() --- form
//        driver.findElement(By.id("contact_form")).submit();
        
        
        driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
        
        
        // isDisplayed() // boolean
        boolean headerE = driver.findElement(By.cssSelector("#main-header > h1")).isDisplayed();
        if(headerE) {
        	System.out.println("Testcase pass");
        }
        else {
        	System.out.println("Testcase fail");
        }
       
        
        // isEnabled() // boolean
        
        boolean CabbageE = driver.findElement(By.cssSelector("#radio-buttons-selected-disabled > input[type=radio]:nth-child(3)")).isEnabled();
        
        if(CabbageE) {
        	System.out.println("test case fail...");
        }
        else {
        	System.out.println("test case pass...2");
        }
        
        
  
        // isSelected() // boolean

        boolean PumpkinE = driver.findElement(By.cssSelector("#radio-buttons-selected-disabled > input[type=radio]:nth-child(5)")).isSelected();
        if(PumpkinE) {
        	System.out.println("Test case pass ----3");
        }
        else {
        	System.out.println("Test case fail");
        }
     
		// clear() , sendKeys() , getAttribute() , getText() , click() , submit() , isEnabled() , isDisabled()
        // isSelected()
		
	}

}
