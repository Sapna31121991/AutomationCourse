
package seleniumbasics;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class HandlingCheckBox extends Base{
	public void handlingCheckBox()
	{
		// Locating a single checkbox using its XPath and clicking on it
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement checkBox1=driver.findElement(By.xpath("//input[@id='gridCheck']"));//to select a check box
		checkBox1.click();
		
		// Locating multiple checkboxes using a common class attribute
		List<WebElement> multipleCheckBox=driver.findElements(By.xpath("//input[@class='check-box-list']"));//mulitiple check box selection using List interface(Use findElements)
		for(int i=0; i<multipleCheckBox.size(); i++)
		{
                   multipleCheckBox.get(i).click();
		}
				
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));

		// Checking if the "Show Message" button is displayed on the page
        // isDisplayed() returns true if the element is visible, otherwise false
		System.out.println(showMessageButton.isDisplayed());
		
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement genderRadio=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		genderRadio.click();
		// Checking if the radio button is selected
        // isSelected() returns true if the element is selected, otherwise false
		System.out.println(genderRadio.isSelected());
		
		WebElement showValue=driver.findElement(By.xpath("//button[@id='button-one']"));
		// Checking if the "Show Value" button is enabled
        // isEnabled() returns true if the element is enabled, otherwise false
		System.out.println(showValue.isEnabled());
		
	}
	public static void main(String[] args) {
		HandlingCheckBox checkBox=new HandlingCheckBox();
		checkBox.initializeBrowser();
		checkBox.handlingCheckBox();
		//checkBox.driverCloseAndQuit();

	}
	

}
