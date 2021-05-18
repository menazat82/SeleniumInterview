package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootstrapDropDown {

	public static void main(String[] args) {
	        WebDriverManager.chromedriver().setup();
	        WebDriver driver=new ChromeDriver();

		driver.get("https://hdfcbank.com/");
		
		driver.findElement(By.xpath("//span[normalize-space()='Loans']")).click();
		
	}

}
