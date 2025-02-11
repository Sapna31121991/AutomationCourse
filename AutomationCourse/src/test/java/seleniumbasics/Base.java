package seleniumbasics;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Base {
	public WebDriver driver;// WebDriver=interface ,driver=object

	public void initializeBrowser() {
		//driver = new ChromeDriver();// ChromeDriver=Chrome class
		driver=new FirefoxDriver();
		// driver=new EdgeDriver();
		driver.get("https://selenium.qabible.in/");// to get site url
		driver.manage().window().maximize();// maximize window

	}

	public void driverCloseAndQuit() {
		// driver.close();
		driver.quit();
	}

	public static void main(String[] args) {
		Base base = new Base();
		base.initializeBrowser();
		base.driverCloseAndQuit();
	}
}
