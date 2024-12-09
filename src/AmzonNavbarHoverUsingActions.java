import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmzonNavbarHoverUsingActions 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kaflemah\\Personal\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.amazon.ae/");
		//Maximize the window
		driver.manage().window().maximize();
		
		Actions ac = new Actions(driver);
		WebElement ele1 = driver.findElement(By.cssSelector("#nav-link-accountList"));
		ac.moveToElement(ele1).build().perform();
		
		WebElement ele2 = driver.findElement(By.cssSelector("input[placeholder='Search Amazon.ae']"));
		ac.moveToElement(ele2).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		driver.close();
		
	}

}
