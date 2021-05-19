package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {

/*		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Documents\\chromedriver_win32-2\\chromedriver.exe");
		
            WebDriver driver=new ChromeDriver();
 */          
            
            WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
            
            
          driver.get("https://frontend.nopcommerce.com/");
           
          System.out.println("name of the webpage is:  "+driver.getTitle());
         
          System.out.println("curent url of the webpage is:  "+driver.getCurrentUrl());

          System.out.println("page source of the webpage is:  "+driver.getPageSource());

            
            driver.close();
            
	}

}
