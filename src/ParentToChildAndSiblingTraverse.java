import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentToChildAndSiblingTraverse 
{
	public static void main(String[] args)
	{
		//1. Running in Chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kaflemah\\Personal\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//Here we have Parent to child traverse at first and then sibling to sibling traverse after that
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
	}

}
