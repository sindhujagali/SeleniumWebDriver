package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector_Practise1 {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver=new ChromeDriver();
		driver.get("https://utuweb-portal-v2-dev.azurewebsites.net/#/login");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("#userName")).sendKeys("admin");//using tag#id
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("Password1234!");//using tag[attribute='value']
		driver.findElement(By.cssSelector("button[type='submit']")).click();//using tag[attribute='value']
		System.out.println("User Logged in Successfully");			

	}

}
