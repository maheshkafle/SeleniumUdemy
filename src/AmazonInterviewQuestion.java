import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AmazonInterviewQuestion 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kaflemah\\Personal\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/seleniumPractise");
		//Maximize the window
		driver.manage().window().maximize();
		
		String[] itemsNeeded = {"Brocolli","Cucumber","Beetroot", "Brinjal"};
		addItems(driver, itemsNeeded);
		
		driver.findElement(By.cssSelector(".cart-icon")).click();
		driver.findElement(By.xpath("//button[contains(text(), 'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		//Explicit wait
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText()); 
		driver.findElement(By.xpath("//button[contains(text(), 'Place Order')]")).click();
		
	}
	
	public static void addItems(WebDriver driver, String[] itemsNeeded)
	{
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		//Here we convert itemsNeeded List to ArrayList as search in ArrayList is very easy using .contains method which List doesn't support
        List itemsNeededArrayList = Arrays.asList(itemsNeeded);
        int j = 0;
		for(int i=0; i<products.size(); i++) 
		{	
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			
			
			//Search for products from ArrayList and click on that particular product and once it clicks the final item then break the program
			if(itemsNeededArrayList.contains(formattedName))
			{
				//Tip: always use reliable locator not text() regex as text might change after some action.
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				j++;
				
				//Note: This code is written to exit from program once all neededItems gets added to cart
				//Remember: .length is used for Array(e.g itemsNeeded) and .size() method is used to find length of ArrayList(e.g itemsNeededArrayList)
				if(j==itemsNeeded.length) 
				{
					break;
				}
				
			}
		}
	}

}
