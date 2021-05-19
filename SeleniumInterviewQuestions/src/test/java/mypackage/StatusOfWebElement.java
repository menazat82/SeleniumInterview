package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StatusOfWebElement {

	public static void main(String[] args) {
  
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Documents\\chromedriver_win32-2\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		
		WebElement searchStore = driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
		
		System.out.println("Display status: "+searchStore.isDisplayed());
		System.out.println("Enable  status: "+searchStore.isEnabled());
 
		
		WebElement male= driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female= driver.findElement(By.xpath("//input[@id='gender-female']"));

		
	       System.out.println("***********************");

		       System.out.println("male is selected: "+male.isSelected());
		       System.out.println("female is seleccted: "+female.isSelected());
 
		       System.out.println("***********************");
		       
		       male.click();
		       System.out.println("male is selected: "+male.isSelected());
		       System.out.println("female is seleccted: "+female.isSelected());
		   
		       System.out.println("***********************");

		       female.click();
		       System.out.println("male is selected: "+male.isSelected());
		       System.out.println("female is seleccted: "+female.isSelected());
		     
		       System.out.println("***********************");

	}

}
