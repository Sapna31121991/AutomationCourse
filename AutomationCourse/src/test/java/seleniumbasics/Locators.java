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

		//USing xpath access methods --> //tagname[@attribute=’value’]//axesMethodName::tagname[@attribute=’value’]
		//Using Parent,when you need to find the parent container of a specific element.
		driver.findElement(By.xpath("//div[contains(text(),'Single Input Field')]//parent::div[@class='card']"));
		//Using Child,when you know the parent but need a direct child element.
		driver.findElement(By.xpath("//div[@class='card']//child::button[(@id='button-one')]"));
		
		//Using following,When looking for an element that appears after the current element in the HTML.
		driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']"));
		
		//Using preceding,When you need to find an element before the current one.
		driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class='card']"));
		
		//Using ancestor, we can see all the ancestors above the current one
		//Used when When searching for a common parent container of an element.
		driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div"));
		
		
		
	}

	public static void main(String[] args) {
		Locators locator = new Locators();
		locator.initializeBrowser();
		locator.locators();
		locator.driverCloseAndQuit();

	}

}
