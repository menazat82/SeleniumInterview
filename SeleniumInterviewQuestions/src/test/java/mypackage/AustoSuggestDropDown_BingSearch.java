package mypackage;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AustoSuggestDropDown_BingSearch {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
          
			
		driver.get("https://bing.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("sb_form_q")).sendKeys("selenium");
		
		List <WebElement> list=driver.findElements(By.xpath("//li[@class='sa_sg']//span"));

		//System.out.println("number of items on Auto SUggestion Box: "+list.size());
		
		for (WebElement listitem:list) {
		 
			if (listitem.getText().equals("selenium")) {
				
				listitem.click();
				break;
			}
			
			
		}
		
	}

}
