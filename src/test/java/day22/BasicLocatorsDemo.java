package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BasicLocatorsDemo {

	public static void main(String[] args) {


		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		
//To maximize the window:--
		driver.manage().window().maximize();
		
		
//1)name locator:--
//sendkeys() method used to send some text 
		//driver.findElement(By.name("field-keywords")).sendKeys("Mac");
		
		
//2)id locator:---
//isDisplayed method will return true or false
//If logo is dipslayed will return true
		
		boolean logodisplaystatus =driver.findElement(By.id("nav-logo")).isDisplayed();
		System.out.println(logodisplaystatus);
//click() method:--		
		//driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		
//3) & 4) LinkText & PartialLinkText:-- only used for links
//<a> represents link with href (target page of particular link)
//Linktext is not attribute of element	
		
/*eg:- here Fresh is linktext
 <a href="/fresh?ref_=nav_cs_grocery" class="nav-a  " 
 data-ux-jq-mouseenter="true" id="nav-link-groceries" tabindex="0" 
 data-csa-c-type="link" data-csa-c-slot-id="nav-link-groceries"
  data-csa-c-content-id="nav_cs_grocery" data-csa-c-id="dsdany-6fzc89-prjeuu-92arbs">
  <span>Fresh</span>
 <span class="nav-icon nav-arrow" style="visibility: visible;"></span></a>
 */
		
//In Linktext need to pass complete linktext value
//In PartialLinkText no need to pass complete linktext value
		
	//	driver.findElement(By.linkText("Fresh")).click();
	//	driver.findElement(By.partialLinkText("Fr")).click();
		
//Don't prefer to use partialLinkText becoz it may match with some other links and it will be conflicts
		
		
//5)ClassName :--Group of web elements
		
		List <WebElement> menulist=driver.findElements(By.className("nav-sprite"));
		System.out.println("Total no of Menulists:"+menulist.size());
		
//6)TagName:- Group of web elements
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total no of links in page:"+links.size());
		
		List<WebElement> images=driver.findElements(By.tagName("img"));
		System.out.println("Total no of images in page:"+images.size());
		
		
	}

}
