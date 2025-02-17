package seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends Base {
	public void FileUploadUsingSendKeys() {
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement chooseFile = driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		chooseFile.sendKeys(
				"C:\\Users\\PC\\git\\AutomationCourse\\AutomationCourse\\src\\test\\resources\\samplepdf.pdf");
		WebElement checkbox = driver.findElement(By.xpath("//input[@id='terms']"));
		checkbox.click();
		WebElement submit = driver.findElement(By.xpath("//button[@id='submitbutton']"));
		submit.click();

	}

	public void fileUploadUsingRobot() throws AWTException {
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement pdffileUpload = driver.findElement(By.xpath("//a[@id='pickfiles']"));
		pdffileUpload.click();
		StringSelection s = new StringSelection(
				"C:\\Users\\PC\\git\\AutomationCourse\\AutomationCourse\\src\\test\\resources\\samplepdf.pdf");
		// to get path for robot class,using Stringselection
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		// to take path from clipboard
		Robot robot = new Robot();
		robot.delay(2500);// delay method in Robot class,2500ms time is used to find files
		robot.keyPress(KeyEvent.VK_ENTER);// to work enter key
		
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);

		robot.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void main(String[] args) {
		FileUpload file = new FileUpload();
		file.initializeBrowser();
		// file.FileUploadUsingSendKeys();
		try {
			file.fileUploadUsingRobot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// file.driverCloseAndQuit();


	}

}
