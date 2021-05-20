package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCheckBox {

	public static void main(String[] args) {


	       WebDriverManager.chromedriver().setup();
	        WebDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://itera-qa.azurewebsites.net/home/automation");
	        
	      //  driver.findElement(By.xpath("//input[@id='monday']")).click();
	        
	        
	        List<WebElement> checkBox=  driver.findElements(By.xpath("//input[@class='form-check-input' and contains(@id,'day')]"));
	        
	      //  System.out.println("Total Number of Check Boxes: "+ checkBox.size());
	        
	        for(WebElement eachBox:checkBox) {
	        
	        	String CheckBoxName=eachBox.getAttribute("id");
	            
	        	if(CheckBoxName.equals("monday")||CheckBoxName.equals("wednesday")) {
	        		
	        		eachBox.click();
	        		
	        	}
	        
	        }
	        	
                   
	        {
	        }
	        
	        
	}

}
