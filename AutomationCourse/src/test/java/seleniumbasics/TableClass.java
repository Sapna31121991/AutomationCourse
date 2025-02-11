package seleniumbasics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableClass extends Base {
	
public void tableHand()
{
	driver.navigate().to("https://money.rediff.com/indices/nse");
	//List<WebElement> headings=driver.findElements(By.xpath("//table[@id='dtBasicExample']//thead//th"));
	//List<String> expectedHeadings=new ArrayList<String>();
	
	WebElement showMore=driver.findElement(By.xpath("//a[@id='showMoreLess']"));
	showMore.click();
	
	//to fetch table data
	WebElement tableField=driver.findElement(By.xpath("//table[@id='dataTable']"));
	System.out.println(tableField.getText());
	
	//to fetch purticular row data
	WebElement tableRow=driver.findElement(By.xpath("//table[@id='dataTable']//tbody//tr[2]"));
	System.out.println(tableRow.getText());
}
	public static void main(String[] args) {
		TableClass table=new TableClass();
		table.initializeBrowser();
		table.tableHand();
		//table.driverCloseAndQuit();
	}

}
