package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultipleDropDowns {

	public static void main(String[] args) {


		
	      WebDriverManager.chromedriver().setup();
	        WebDriver driver=new ChromeDriver();
	        
	        driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
	        
	        Select noOfEmpsdrp=new Select( driver.findElement(By.name("NoOfEmployees")));
	        noOfEmpsdrp.selectByVisibleText("16 - 20");
	        
	        Select industrydrp=new Select( driver.findElement(By.name("Industry")));
	        industrydrp.deselectByVisibleText("Travel");
	        
	        Select countydrp=new Select( driver.findElement(By.name("Country")));
	        countydrp.deselectByVisibleText("Aruba");
	
	
	}

}
