package Practice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		//First Selenium Program
		
		System.setProperty("webdriver.chrome.driver", "D:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		System.out.println("Success-First");
		//Thread.sleep(4);
		
		System.out.println(driver.getTitle());
		driver.close(); 
		
		//convert string into integer
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
