package selenium;

import java.util.Timer;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo {

	public static void main(String[] args) {
	//	 C:\Users\SHAFAT BASHIR\Chand\selenium\browserAccess.chromedriver.exe
		 
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\browserAccess\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("userName");
		driver.findElement(By.name("pw")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"Login\"]")).click(); 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
		
		
	}

}
