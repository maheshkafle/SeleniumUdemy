import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIntroduction 
{

	public static void main(String[] args) 
	{
		
		//Invoking browser
		//Chrome = ChromeDriver
		//Firefox = FirefoxDriver
		//Safari = SafariDriver
		
		//Step to invoke chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kaflemah\\Personal\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driverC = new ChromeDriver();
		driverC.close();
		
		//Step to invoke gecko browser driver
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\kaflemah\\Personal\\Drivers\\geckodriver-win64\\geckodriver.exe");
		WebDriver driverF = new FirefoxDriver();
		driverF.close();
		
		//Step to invoke Edge browser driver
		System.setProperty("webdriver.edge.driver", "C:\\Users\\kaflemah\\Personal\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driverE = new EdgeDriver();
		driverE.close();
		
		System.out.println("Invoked All browser driver!!");
	}

}
