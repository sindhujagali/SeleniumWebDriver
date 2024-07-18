package day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

/* Test Case:--
1)Launch Browser(Chrome browser)
2)Open URL https://demo.nopcommerce.com/
3)Get Title 
3)Validate title should be "nopCommerce demo store"
4)Close Browser

 */
public class SecondTestCase {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		System.out.println(driver.getTitle());
		
		String act_title =driver.getTitle();
		
		if(act_title.equals("nopCommerce demo store"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		driver.close();

	}

}
