package mypackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckDropDownSorted {

	public static void main(String[] args) {
  

	       WebDriverManager.chromedriver().setup();
	        WebDriver driver=new ChromeDriver();
	        
	        driver.get("https://www.twoplugs.com");
		
	     	driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='Live Posting']")).click();
		
		
	    Select drpselect=new Select(driver.findElement(By.name("category_id"))); 

	    ArrayList originalOrder=new ArrayList(); 
	    ArrayList ToBeSortedList=new ArrayList();
	    
	  List<WebElement> options=  drpselect.getOptions();	     
	      
	      for(WebElement option:options) {
 	    	
	    	  originalOrder.add(option.getText());
	    	 ToBeSortedList.add(option.getText());
	    	  
	      }
	      
	      System.out.println("before sorting ToBeSortedList: "+ToBeSortedList);

	      Collections.sort(ToBeSortedList);
	      System.out.println("before sorting originalOrder: "+originalOrder);

	      System.out.println("after sorting ToBeSortedList : "+ToBeSortedList);

	      if(originalOrder.equals(ToBeSortedList)) {
	    	  System.out.println("dropdown sorted..");
	    	  
	      }
	      else {
	    	  System.out.println("Not sorted");
	      }
	
	}

	
}
