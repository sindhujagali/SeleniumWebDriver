package day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

/* Test Case:--
1)Launch Browser(Chrome browser)
2)Open URL https://www.amazon.in/ OR https://utu-tax-test.azurewebsites.net/dufry
3)Get Title 
3)Validate title should be "UTU Dufry Vouchers" OR 
"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"
*/



public class FirstTestCase {

	public static void main(String[] args) {
		
		//Launch browser:--		
		  //ChromeDriver driver=new ChromeDriver();//This also correct
		//WebDriver driver=new ChromeDriver();
			WebDriver driver= new EdgeDriver();
	//Open URL:--       
		   driver.get("https://www.amazon.in/");
		
	//Get Title:--	   
		   System.out.println(driver.getTitle());
		   
	//Validate Title:---  
		   String act_title=driver.getTitle();
		   if(act_title.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"))
		   {
			   System.out.println("Test Passed");
		   }
		   else
		   {
			   System.out.println("Test Failed");
		   }

	//Close Browser:--
		   //Getting Websocket warning. can ignore for now
			 //driver.close();
			driver.quit(); //can use quit also
		
	
		
	}

}
