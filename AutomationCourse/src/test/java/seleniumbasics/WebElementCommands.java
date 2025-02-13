 package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base {
	public void webElementCommands() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messageField = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		
		// Enter the text "sapnaa" in the input field
		messageField.sendKeys("sapna");
		
		WebElement messageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		//Click on the "Show Message" button
		messageButton.click();
	//	messageField.clear();// To Clear the input field 
		
		WebElement yourMessage=driver.findElement(By.xpath("//div[@id=\'message-one\']"));
		String message1=yourMessage.getText();
		System.out.println(message1);// Retrieve and print the displayed message
		
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		System.out.println(showMessageButton.getCssValue("background-color"));// Get and print the background color of the button
		
		System.out.println(showMessageButton.getSize());// Get and print the size (width & height) of the button
		
		System.out.println(showMessageButton.getTagName());// Get and print the tag name of the button element
	
		
	}

	public static void main(String[] args) {
		WebElementCommands element = new WebElementCommands();
		element.initializeBrowser();
		element.webElementCommands();
		element.driverCloseAndQuit();
		
	}

}
