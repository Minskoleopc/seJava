package sectionOne;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		// Create an instance of WebDriver
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Data-Table/index.html");
		List <WebElement> tables = driver.findElements(By.xpath("//div[table]"));
		System.out.println(tables.size());
		
		List <WebElement> totalRows = driver.findElements(By.xpath("//*[@id=\"t01\"]/tbody/tr"));
		System.out.println(totalRows.size());
		
		
		List <WebElement> totalColums = driver.findElements(By.xpath("//*[@id=\"t01\"]/tbody/tr[2]/td"));
		System.out.println(totalColums.size());
		
		//*[@id="t01"]/tbody/tr[4]/td[3]
		
		int sum = 0;
		for(int i = 2 ; i <= totalRows.size() ; i++) {
			String value = driver.findElement(By.xpath("//*[@id=\"t01\"]/tbody/tr["+i+"]/td[3]")).getText();
			System.out.println(value);
			sum = sum + Integer.parseInt(value);
		}
		System.out.println(sum);
		
		boolean found = false;
		
		for(int i = 2 ; i <= totalRows.size() ; i++) {
			String value = driver.findElement(By.xpath("//*[@id=\"t01\"]/tbody/tr["+i+"]/td[1]")).getText();
			if(value.equals("John")) {
				System.out.println("found");
				found = true;
				break;
			}
			
		}
		if(!found) {
			System.out.println("John not found in list");
		}
		
		
		
	}

}
