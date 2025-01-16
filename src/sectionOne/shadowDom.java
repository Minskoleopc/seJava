package sectionOne;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shadowDom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		// Create an instance of WebDriver
		WebDriver driver = new ChromeDriver();
		driver.get("https://dev.automationtesting.in/shadow-dom");
		WebElement host_one = driver.findElement(By.cssSelector("#shadow-root"));
		SearchContext root_one = host_one.getShadowRoot();
		String oneE = root_one.findElement(By.cssSelector("#shadow-element")).getText();
		System.out.println(oneE);
		
		WebElement host_two = root_one.findElement(By.cssSelector("inner-shadow-dom"));
		SearchContext root_two = host_two.getShadowRoot();
		String twoE = root_two.findElement(By.cssSelector("#nested-shadow-element")).getText();
		System.out.println(twoE);
		
		WebElement host_three = root_two.findElement(By.cssSelector("#nested-shadow-dom"));
		SearchContext root_three = host_three.getShadowRoot();
		String threeE = root_three.findElement(By.cssSelector("#multi-nested-shadow-root")).getText();
		System.out.println(threeE);
	}

}
