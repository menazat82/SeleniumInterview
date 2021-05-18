package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDown {

	public static void main(String[] args) {

       WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		// WebElement drpCountryElement =driver.findElement(By.id("input-country"));
		
		Select drpCountry=new Select (driver.findElement(By.id("input-country")));
		
		 drpCountry.selectByVisibleText("Denmark");
	   	drpCountry.selectByValue("10");
	 	drpCountry.selectByIndex(13);
		
	/*	
	List<WebElement>alloptions=	drpCountry.getOptions();
		
	for(WebElement option:alloptions) {
		
		if(option.getText().equals("Cuba")) {
			option.click();
			break;
		}
	}
		*/
	}

}
