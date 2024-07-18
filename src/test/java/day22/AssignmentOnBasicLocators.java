package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/* TestCase:--
 * Open Application:- https://www.demoblaze.com/index.html
 * 1)Total no of links 
 * 2)total no of images
 * 3)Click on any product link using linktext/Parial LinkText
 */

public class AssignmentOnBasicLocators {

	public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.demoblaze.com/index.html");
        driver.manage().window().maximize();
        
 //1)Total no of links
        
        List <WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println("Total no of links in page:"+links.size());
        Thread.sleep(100);
        
//2)total no of images        
        List <WebElement> images=driver.findElements(By.tagName("img"));
        System.out.println("Total no of Images in page:"+images.size());
        Thread.sleep(100);
        
 //3)Click on any product link using linktext/Parial LinkText
        
        driver.findElement(By.partialLinkText("HTC")).click();
        

	}

}
