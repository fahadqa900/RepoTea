package Yellow.Color;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser 
{
	WebDriver driver;
	
	public WebDriver getBrowser(String Url,String browser)
	{
		if(browser.contains("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions option=new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(option);
		}
	driver.get(Url);	
	return driver;		
	}
		
	}