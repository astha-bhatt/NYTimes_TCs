package AppHooks;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.ny.BrowserInstance.BrowserHandle;
import com.ny.Util.ReadFromProperty;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ApplicationHooks {

	private BrowserHandle browserHandle;
	private WebDriver driver;
	private ReadFromProperty readFromProperty;
	Properties prop;
	
	@Before(order = 0)
	public void getDriver() throws IOException
	{
		readFromProperty = new ReadFromProperty();
		prop = readFromProperty.property();
	}
	
	@Before(order = 1)
	public void launchBrowser() throws IOException
	{
		String browserName = prop.getProperty("browser");
		browserHandle = new BrowserHandle();
		driver = browserHandle.settingBrowser(browserName);	
	}
	
	@After(order = 0)
	public void quitBrowser()
	{
		driver.quit();
	}

}
