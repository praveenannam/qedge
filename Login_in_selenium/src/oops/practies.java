package oops;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class practies {
 public static void main(String[] args) throws InterruptedException {
//	WebDriver driver =new FirefoxDriver();
//	driver.manage().window().maximize();
//	driver.get("https://www.gmail.com");
//	driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys("vdivya1255@gmail.com");
//	driver.findElement(By.xpath(".//*[@id='next']")).click();
//	Thread.sleep(30000);
//	driver.findElement(By.xpath("//input[@id='Passwd']")).sendKeys("ilovedad123");
//	Thread.sleep(30);
//	driver.findElement(By.xpath(".//*[@id='signIn']")).click();
//	
//	Thread.sleep(30);
//	driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
//	
//	
//	//driver.close();
//	Thread.sleep(30);
//	driver.findElement(By.xpath(".//*[@id='gb_71']")).click();
//	Thread.sleep(30);
	 
	 
	 
	 
	 String URl="https://gmail.google.com";
	 String ActualTitle="Gmail";
	
	 WebDriver driver=new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 driver.get(URl);
	 String expTitle= driver.getTitle();
	 System.out.println(driver.getTitle());
	 
	 
	 
	 if (expTitle.equals(ActualTitle)) {
		 System.out.println(" Title pass");
		
	}
		 else {
			
			 System.out.println("Title fail ");
		}
	 
	 
	 
	 driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys("vdivya1255@gmail.com");
	 
	  System.out.println("Mail is pass");
		driver.findElement(By.xpath(".//*[@id='next']")).click();
		Thread.sleep(30000);
		driver.findElement(By.xpath("//input[@id='Passwd']")).sendKeys("ilovedad123");
		System.out.println(" pwd is pass");
		Thread.sleep(30);
		driver.findElement(By.xpath(".//*[@id='signIn']")).click();
		
		System.out.println("Login is pass");
		Thread.sleep(30);
		driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
		
		
		//driver.close();
		Thread.sleep(30);
		driver.findElement(By.xpath(".//*[@id='gb_71']")).click();
		
		System.out.println("Logout is pass");
		Thread.sleep(30);
	 
}
}







