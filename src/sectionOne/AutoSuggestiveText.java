package sectionOne;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Auto - suggestive text
		
		// no suggestion found message
		// selecting the element from the drop down
		// updated text after selection
		// url updated according to selection
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		// Create an instance of WebDriver
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");
		driver.findElement(By.id("myInput")).sendKeys("a");
		List <WebElement> lst = driver.findElements(By.cssSelector("#myInputautocomplete-list > div"));
		//[]
		
		for(int i = 0 ; i < lst.size(); i++) {
			System.out.println(lst.get(i).getText());
			if(lst.get(i).getText().equals("Almond")) {
				lst.get(i).click();
				break;
			}
		}
		driver.findElement(By.id("submit-button")).click();
		String almondText = driver.getCurrentUrl();
		if(almondText.contains("Almond")) {
			System.out.println("test case pass ...");
		}
		else {
			System.out.println("test case fail....");
		}

	}

}
