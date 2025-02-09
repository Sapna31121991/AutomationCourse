package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base {
	public void webElementCommands() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messageField = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		messageField.sendKeys("sapna");
		WebElement messageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		messageButton.click();
	//	messageField.clear();
		WebElement yourMessage=driver.findElement(By.xpath("//div[@id=\'message-one\']"));
		String message1=yourMessage.getText();
		System.out.println(message1);
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		System.out.println(showMessageButton.getCssValue("background-color"));
		System.out.println(showMessageButton.getSize());
		System.out.println(showMessageButton.getTagName());
	}

	public static void main(String[] args) {
		WebElementCommands element = new WebElementCommands();
		element.initializeBrowser();
		element.webElementCommands();
		element.driverCloseAndQuit();
		
	}

}
