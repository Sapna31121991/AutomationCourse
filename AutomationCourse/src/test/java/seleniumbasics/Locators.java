package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
	public void locators() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		// locate element using id
		WebElement messageField = driver.findElement(By.id("id=\"single-input-field\""));// WebElement=interface
		// locate using class
		WebElement messageField1 = driver.findElement(By.className("class=\"form-control\""));// By=class
		// locate using tag name
		WebElement showMessageBox = driver.findElement(By.tagName("type=\"button\""));
		// locate using name
		WebElement headTag = driver.findElement(By.name("name=\"viewport\""));
		// locate using link name
		WebElement linkName = driver.findElement(By.linkText("Checkbox Demo"));
		// locate using partial link name
		WebElement linkNamePartial = driver.findElement(By.partialLinkText("Checkbox "));
		// locate using css selector
		WebElement cssLocator = driver.findElement(By.cssSelector("button[id='button-one']"));
		
		//WebElement loc=driver.findElement(By.className("input[id='value-a']"));example1)
		//WebElement text=driver.findElement(By.xpath("//input[@id='value-b']"));exmple xpath1
		
		WebElement button = driver.findElement(By.xpath("//button[@id='button-one']"));
		WebElement input = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		WebElement input1 = driver.findElement(By.xpath("//input[@id='value-a']"));

		driver.findElement(By.xpath("//input[contains(@id,'-a')]"));//
		driver.findElement(By.xpath("//button[text()='Show Message']"));// for lengthy text locating using xpath
		driver.findElement(By.xpath("//button[starts-with(text(),'Show')]"));// for partial text locating using xpath
		
		driver.findElement(By.xpath("//button[@type='button'and @id='button-one']"));//locate using AND
		driver.findElement(By.xpath("//button[@id='button-one'or id='button-one-electronics']"));//locate using OR
		driver.findElement(By.xpath("//div[contains(text(),'Single Input Field')]//parent::div[@class='card']"));//using parent node
		driver.findElement(By.xpath("//div[@class='card']//child::button[(@id='button-one')]"));//using child node
		driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']"));//following
		driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class='card']"));//preceding
		driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div"));//ancestor
		
		
		
	}

	public static void main(String[] args) {
		Locators locator = new Locators();
		locator.initializeBrowser();
		locator.locators();
		locator.driverCloseAndQuit();

	}

}
