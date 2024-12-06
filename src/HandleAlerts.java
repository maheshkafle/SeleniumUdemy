import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandleAlerts 
{

	public static void main(String[] args) 
	{
		String name = "Mahesh";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kaflemah\\Personal\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		//Maximize the window
		driver.manage().window().maximize();
		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.cssSelector("#alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText()); 
		Assert.assertEquals(driver.switchTo().alert().getText(), "Hello "+name+", share this practice page and share your knowledge");
		driver.switchTo().alert().accept();
		
		//Code to handle cancel button click in confirmation or alert dialog
		driver.findElement(By.cssSelector("#confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText()); 
		driver.switchTo().alert().dismiss();
	}

}
