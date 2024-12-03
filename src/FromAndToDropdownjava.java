import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FromAndToDropdownjava 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// 1. Running in Chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kaflemah\\Personal\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//Maximize the window
		driver.manage().window().maximize();
		//dropdown with select tag
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@value='MAA'][1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@value='JLR'][normalize-space()='Jabalpur (JLR)'])[2]")).click();
	}
}
