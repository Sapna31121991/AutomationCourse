package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base {
	public void webElementCommands()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messageField=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		messageField.sendKeys("sapna");
		WebElement messageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		messageButton.click();
	}

	public static void main(String[] args) {
		WebElementCommands element=new WebElementCommands();
		element.initializeBrowser();
		element.webElementCommands();
	//	element.driverCloseAndQuit();

	}

}
