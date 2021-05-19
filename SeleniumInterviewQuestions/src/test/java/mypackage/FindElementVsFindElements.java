package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementVsFindElements {

	public static void main(String[] args) {
 
		WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
		
        
        driver.get("https://demo.nopcommerce.com/");
        
        //find Element()--> return single Web element
 /*       
        //1
        WebElement searchBox= driver.findElement(By.xpath("//input[@id='small-searchterms']"));
        searchBox.sendKeys("XYZ");
        
        //2
        
        WebElement elem= driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
        System.out.println(elem.getText());
        //3
        
       WebElement searchButton= driver.findElement(By.xpath("//button[normalize-space()='login']"));
   */
        
        // findElements--> Returns multiple web elements
        
        //1
/*       List<WebElement>links=driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
       System.out.println("number of elements captured: "+links.size());
      
       for(WebElement elem:links) {
    	   
    	   System.out.println(elem.getText());
       }
       
 */      
       //2
      List<WebElement>logo =driver.findElements(By.xpath("//img[@alt='nopCommerce demo store']")); 
       System.out.println("number of elements captured: "+logo.size());
       
       
       //3
       List<WebElement>element =driver.findElements(By.xpath("//img[@alt='edrf']")); 
       System.out.println("element size: "+element.size());
	}

}
