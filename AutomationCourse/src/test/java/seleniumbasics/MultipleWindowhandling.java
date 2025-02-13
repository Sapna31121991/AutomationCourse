package seleniumbasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleWindowhandling extends Base{
	public void handlingMultiplewindow()
	{
		driver.navigate().to("https://demo.guru99.com/popup.php");
		String firstWindowHandleid=driver.getWindowHandle();
		System.out.println(firstWindowHandleid);
		
		WebElement clickField=driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickField.click();
		
		Set<String> handliIds=driver.getWindowHandles();//multiple windows
		Iterator<String> values=handliIds.iterator();
		while(values.hasNext())
		{
			String currenId=values.next();//current window child id
			if(!currenId.equals(firstWindowHandleid))//!=not equal to
			{
				driver.switchTo().window(currenId);
				WebElement emilId=driver.findElement(By.xpath("//input[@name='emailid']"));
				emilId.sendKeys("sapna@gmail.com");
				WebElement submit=driver.findElement(By.xpath("//input[@value='Submit']"));
				submit.click();
			}
		}
	}

	public static void main(String[] args) {
		MultipleWindowhandling multiple=new MultipleWindowhandling();
		multiple.initializeBrowser();
		multiple.handlingMultiplewindow();
	//	multiple.driverCloseAndQuit();
	}

}

