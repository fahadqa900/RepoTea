package Yellow.Color;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Test1
{
	WebDriver driver;
	@FindBy(id="email")WebElement username;
	@FindBy(id="pass")WebElement password;
	@FindBy(how=How.XPATH,using="//button[@type='submit']")WebElement login;
	
	public Test1(WebDriver driver)
	{
	 this.driver=driver;
	}
	public void getLogin2(String uname,String pwd)
	{
		username.sendKeys(uname);
		password.sendKeys(pwd);
		login.click();
		System.out.println("Test1");
	}
}
