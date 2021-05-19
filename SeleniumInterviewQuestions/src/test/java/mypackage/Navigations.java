package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Documents\\chromedriver_win32-2\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://snapdeal.com");
        driver.navigate().to("https://amazon.com");		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

}
