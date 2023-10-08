package Yellow.Color;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Test2 {

	public static void main(String[] args) 
	{
	Browser b1=new Browser();
    WebDriver driver=b1.getBrowser("https://www.facebook.com","Chrome");
   Test1 t1=PageFactory.initElements(driver,Test1.class);
	t1.getLogin2("test@gmail.com","124");
	}

}
