package Exception;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class First {
	public static void main(String[] args) {
		
		WebDriver driver =new FirefoxDriver();
		driver.get("http://www.facebook.com");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		}
	}


