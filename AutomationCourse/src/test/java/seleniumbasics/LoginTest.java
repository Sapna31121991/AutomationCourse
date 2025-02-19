package seleniumbasics;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginTest extends TestNGBase {
	
	@Test
	public void verifyUserLoginWithValidUsernameAndValidPassword()
	{
		WebElement userName=driver.findElement(By.xpath("//input[@id='user-name']"));
		userName.sendKeys("standard_user");
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");
		WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
		login.click();
	}
	
	@Test
	public void verifyUserLoginWithValidUsernameAndInvalidPassword()
	{
		WebElement userName=driver.findElement(By.xpath("//input[@id='user-name']"));
		userName.sendKeys("standard_user");
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sace");
		WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
		login.click();
	}
	
	@Test
	public void verifyUserLoginWithInalidUsernameAndValidPassword()
	{
		WebElement userName=driver.findElement(By.xpath("//input[@id='user-name']"));
		userName.sendKeys("stanrd_user");
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");
		WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
		login.click();
	}
	
	@Test
	public void verifyUserLoginWithInalidUsernameAndInalidPassword()
	{
		WebElement userName=driver.findElement(By.xpath("//input[@id='user-name']"));
		userName.sendKeys("staard_user");
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secre_sauce");
		WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
		login.click();
	}

}
