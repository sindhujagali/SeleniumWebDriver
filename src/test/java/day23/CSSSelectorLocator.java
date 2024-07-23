package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorLocator {

	public static void main(String[] args) {

//ctrl+shift+o ==>To import all packages
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		
//1)tag id  syntax:- tag#id		
		
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
	    //tag is optional(input)	
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");

//2)tag Class  syntax:- tag.classname
		
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Mac");
		//tag is optional(input)	
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("Mac");
				
//3)tag attribute  syntax:- tag[attribute='value']
		
		//driver.findElement(By.cssSelector("input[placeholder=\"Search store\"]")).sendKeys("ÏPHONE");
		//OR instead of \ use value in single quote
		//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("ÏPHONE");
		//tag is optional(input)
		//driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("ÏPHONE");
		
//4)tag class attribute  syntax:- tag.classname[attribute='value']		
		
		//driver.findElement(By.cssSelector("input.search-box-text[name=\"q\"]")).sendKeys("T-shirts");
		//OR instead of \ use value in single quote
		//driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("T-shirts");
		//tag is optional(input)
		driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("T-shirts");
	}

}
