package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class gatTextVsgetAttributeValue {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Documents\\chromedriver_win32-2\\chromedriver.exe");		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://admin-demo.nopcommerce.com/login");

	WebElement 	demo=driver.findElement(By.xpath("//h1[normalize-space()='Admin area demo']"));
		/*
		
		WebElement EmailInputBox=driver.findElement(By.id("Email"));
		
		EmailInputBox.clear();
		EmailInputBox.sendKeys("admin123@yahoo.com");
*/
		
		
		//capturing text from input box
		
		
		
		System.out.println("result of getText() method: "+demo.getText());

		driver.close();
		
	}

}
