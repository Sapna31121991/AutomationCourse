package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass extends Base {
	public void mouseActions()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement rightClick=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		Actions actions=new Actions(driver);
		actions.contextClick(rightClick).build().perform();
		
	}
	public void mouseActions2()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		//to perform mousehover actions
		WebElement mouseHover=driver.findElement(By.xpath("//a[text()='Drag and Drop']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(mouseHover).build().perform();
		
	}

	public static void main(String[] args) {
		ActionsClass mouse=new ActionsClass();
		mouse.initializeBrowser();
		mouse.mouseActions();
		mouse.mouseActions2();
	//	mouse.driverCloseAndQuit();

	}

}
