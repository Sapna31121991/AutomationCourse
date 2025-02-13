package seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertClass extends Base{
	public void handlingAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement simpleAlert=driver.findElement(By.xpath("//button[@id='alertButton']"));
		simpleAlert.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}
	
	public void handlingConfirmedalert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement confirmAlert=driver.findElement(By.xpath("//button[@id='confirmButton']"));
		confirmAlert.click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}
	public void handlingPrompt()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement prompt=driver.findElement(By.xpath("//button[@id='promtButton']"));
		prompt.click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Hello");
		alert.accept();
	}

	public static void main(String[] args) {
		AlertClass alert=new AlertClass();
		alert.initializeBrowser();	
		alert.handlingAlert();
		//alert.handlingConfirmedalert();
		//alert.handlingPrompt();
	//	alert.driverCloseAndQuit();

	}

}
