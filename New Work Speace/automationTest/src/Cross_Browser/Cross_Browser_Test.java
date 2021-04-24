package Cross_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cross_Browser_Test {

	WebDriver driver;

	@Test 
	@Parameters("browser")
	public void CrossBrowserTest(String browserName){
		
		if(browserName.equalsIgnoreCase("chrome")) {
			
			driver = new ChromeDriver();
		}
		
		else if (browserName.equalsIgnoreCase("geckodriver"))
		{
			
		System.setProperty("webdriver.geckodriver.driver","C:\\Users\\Owner\\OneDrive\\Desktop\\Program Libraries Selenium\\geckodriver.exe");
	
		driver = new geckodriver();
		} 
		
	
	
	
	{

	
		
		
		
		
		
		
		
		
		
		
		
	}
}