package sectionOne;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
		 // Set the path to the ChromeDriver executable
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

       // Create an instance of WebDriver
       WebDriver driver = new ChromeDriver();
       driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
       WebElement ele = driver.findElement(By.cssSelector("h2[name=\"contactme\"]"));
       String fonts = ele.getCssValue("font-size");
       System.out.println(fonts);
       
  
       
       //getTagName()
       String tgName = ele.getTagName();
       System.out.println(tgName);
       
       int a = 10;
       
       // getSize()
       Dimension size = ele.getSize();
       int x = size.getHeight();
       int y = size.getWidth();
       System.out.println(x);
       System.out.println(y);
       
       Point co =ele.getLocation();
       System.out.println();
       System.out.println(co.x);
       System.out.println(co.y);
       
       
	}

}
