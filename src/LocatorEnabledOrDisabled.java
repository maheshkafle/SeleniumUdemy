import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LocatorEnabledOrDisabled 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kaflemah\\Personal\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//Maximize the window
		driver.manage().window().maximize();
		
		//isEnabled doesn't work properly so use getAttribute
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) 
		{
			System.out.println("Hello opacity decreased and div is disabled");
			Assert.assertTrue(true);
		}
		
		else 
		{
			System.out.println("Hello opacity increased and div is enabled");
			Assert.assertTrue(false);
		}
		
		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) 
		{
			System.out.println("Hello opacity increased and div is enabled");
			Assert.assertTrue(true);
		}
		
		else 
		{
			System.out.println("Hello opacity decreased and div is disabled");
			Assert.assertTrue(false);
		}
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		//dropdown with select tag
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@value='MAA'][1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@value='JLR'][normalize-space()='Jabalpur (JLR)'])[2]")).click();
	}
}
