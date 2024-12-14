import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestFrames {

	public static void main(String[] args) 
	{
		String name = "Mahesh";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kaflemah\\Personal\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		//Maximize the window
		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		Actions a = new Actions(driver);
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		 
		//This code is used to exit out of frame and perform action on element outside of frames
		driver.switchTo().defaultContent();

	}

}
