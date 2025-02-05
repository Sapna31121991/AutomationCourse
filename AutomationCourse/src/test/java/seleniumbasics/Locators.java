package seleniumbasics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//import seleniumBasics.Locators;
public class Locators extends Base {
	public void locators() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		//locate element using id
		WebElement messageField = driver.findElement(By.id("id=\"single-input-field\""));//WebElement=interface
		//locate using class
		WebElement messageField1 = driver.findElement(By.className("class=\"form-control\""));//By=class
		//locate using tag name
		WebElement showMessageBox = driver.findElement(By.tagName("type=\"button\""));
		//locate using name
		WebElement headTag = driver.findElement(By.name("name=\"viewport\""));
		//locate using link name
		WebElement linkName = driver.findElement(By.linkText("Checkbox Demo"));
		//locate using partial link name
		WebElement linkNamePartial = driver.findElement(By.partialLinkText("Checkbox "));
		//locate using css selector
		WebElement cssLocator = driver.findElement(By.cssSelector("button[id='button-one']"));
		
		
		
		WebElement button=driver.findElement(By.xpath("//button[@id='button-one']"));
		WebElement input=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		WebElement input1=driver.findElement(By.xpath("//input[@id='value-a']"));
		
		driver.findElement(By.xpath("//input[contains(@id,'-a')]"));
		driver.findElement(By.xpath("//button[text()='Show Message']"));//for lengthy text locating using  xpath
		driver.findElement(By.xpath("//button[starts-with(text(),'Show')]"));//for partial text locating using xpath
	}
	public static void main(String[] args) {
		Locators locator = new Locators();
		locator.initializeBrowser();
		locator.locators();
		locator.driverCloseAndQuit();
		
	}

}
