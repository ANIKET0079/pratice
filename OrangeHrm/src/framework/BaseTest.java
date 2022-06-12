package framework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest implements IAutoConstant{

	static WebDriver driver;

	@SuppressWarnings("deprecation")
	public void setUp() throws EncryptedDocumentException, IOException
	{
		Flib flib = new Flib();
		String browserValue = flib.readPropertyFileData(PROP_PATH, "browser");
		String url = flib.readPropertyFileData(PROP_PATH, "url");

		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		}
		
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
		}
		
		else
		{
			System.out.println("Enter Correct Choice");
		}

	}
	
	public void tearDown()
	{
		driver.quit();
	}
}
