package sectionOne;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestCase_16_Actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		// Create an instance of WebDriver
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Actions/index.html#");
		Actions actions  = new Actions(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		// Testcase one drag and drop 
		
//		WebElement draggable = driver.findElement(By.id("draggable"));
//		WebElement droppable = driver.findElement(By.id("droppable"));
//		//WebElement para = driver.findElement(By.cssSelector("#droppable > p"));
//		WebElement para  = droppable.findElement(By.tagName("p"));
//		System.out.println(para.getText());
//		actions.dragAndDrop(draggable, droppable).perform();
//		System.out.println(para.getText());
//		if(para.getText().equals("Dropped!")) {
//			System.out.println("Test case pass");
//		}
//		else {
//			System.out.println("Testcase fail");
//		}
//			
//		
		
		// Test case 2
//		
		WebElement hoverE = driver.findElement(By.cssSelector("#div-hover > div.dropdown.hover > button"));
		actions.moveToElement(hoverE).perform();		
		WebElement linkE = driver.findElement(By.cssSelector("#div-hover > div.dropdown.hover > div > a"));
		System.out.println(linkE.isDisplayed());
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#div-hover > div.dropdown.hover > div > a\"")));
		wait.until(ExpectedConditions.elementToBeClickable(linkE));
		
		linkE.click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		
		
		
//		
		
		
		// double click 
//		WebElement dbClickELment = driver.findElement(By.id("double-click"));
//		System.out.println(dbClickELment.getCssValue("color"));
//		actions.doubleClick(dbClickELment).perform();
//		System.out.println(dbClickELment.getCssValue("color"));
		
		// click and hold operation
		
		WebElement clickAndHold = driver.findElement(By.id("click-box"));
		System.out.println(clickAndHold.getText());	 
		actions.clickAndHold(clickAndHold).perform();
		System.out.println(clickAndHold.getText());	
		
		// Well done! keep holding that click now.....
		WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait2.until(ExpectedConditions.textToBePresentInElementLocated((By.id("click-box")), "Well done! keep holding that click now....."));
		
		if(clickAndHold.getText().equals("Well done! keep holding that click now.....")) {
			System.out.println("Test case pass ");
		}
		else {
			System.out.println("Test case fail");
		}
		
		
		

	}

}
