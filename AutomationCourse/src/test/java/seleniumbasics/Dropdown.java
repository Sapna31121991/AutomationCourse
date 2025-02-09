package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown extends Base{
	public void handlingDropdown()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropDown_1=driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
		Select select=new Select(dropDown_1);
		select.selectByIndex(2);
		WebElement dropDown_2=driver.findElement(By.xpath("//select[@id='dropdowm-menu-2']"));
		Select select2=new Select(dropDown_2);
		select2.selectByVisibleText("TestNG");
		
		WebElement dropDown_3=driver.findElement(By.xpath("//select[@id='dropdowm-menu-3']"));
		Select select3=new Select(dropDown_3);
		select3.selectByValue("javascript");
	}

	public static void main(String[] args) {
		Dropdown drop=new Dropdown();
		
		drop.initializeBrowser();
		drop.handlingDropdown();
	//	drop.driverCloseAndQuit();
		

	}

}
