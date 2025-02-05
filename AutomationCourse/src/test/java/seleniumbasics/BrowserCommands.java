package seleniumbasics;

public class BrowserCommands extends Base {
	public void browserCommands() {
		String url = driver.getCurrentUrl();//to get url of currently working page
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);
		String handleId = driver.getWindowHandle();// to get unique id for web page
		System.out.println(handleId);
		String pageSource = driver.getPageSource();// to get source code of the page
		System.out.println(pageSource);
	}

	public static void main(String[] args) {

		BrowserCommands browser = new BrowserCommands();
		browser.initializeBrowser();
		browser.browserCommands();
		browser.driverCloseAndQuit();
	}
}
