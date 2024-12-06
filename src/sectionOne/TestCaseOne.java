package sectionOne;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");

        // Locators
        
        // By id
        // ctrl + shift + O
         WebElement formInput =  driver.findElement(By.id("contact_form"));
         if(formInput.isDisplayed()) {
        	 System.out.println("Test case pass..");
         }
         else {
        	 System.out.println("Test case fail");
         }
        // By name 
         
         WebElement headerElementByName = driver.findElement(By.name("contactme"));
         String txt = headerElementByName.getText();    
         if(txt.equals("CONTACT US")) {
        	 System.out.println("Test case pass 2");
         }
         else {
        	 System.out.println("Test case Fail");
         }
        // By className
         
         WebElement headerElementByClassName = driver.findElement(By.className("section_header"));
         String txt2 = headerElementByClassName.getText();    
         if(txt2.equals("CONTACT US")) {
        	 System.out.println("Test case pass 3");
         }
         else {
        	 System.out.println("Test case Fail");
         }
         
      
        // By TagName 
     
         WebElement textareaEle =  driver.findElement(By.tagName("textarea"));
         if(textareaEle.isDisplayed()) {
        	 System.out.println("Test case pass 4");
         }
         else {
        	 System.out.println("Test case fail");
         }
         
        // By Css selector
         
         WebElement textareaEle2 =  driver.findElement(By.cssSelector("#contact_form > textarea"));
         if(textareaEle2.isDisplayed()) {
        	 System.out.println("Test case pass 5");
         }
         else {
        	 System.out.println("Test case fail");
         }
         
        // By Xpath 
         WebElement textareaEle3 =  driver.findElement(By.xpath("//*[@id=\"contact_form\"]/textarea"));
         if(textareaEle3.isDisplayed()) {
        	 System.out.println("Test case pass 6");
         }
         else {
        	 System.out.println("Test case fail");
         }
        
        // By linkText 
        
        // By partialText
         
         driver.quit();
        
	}

}
