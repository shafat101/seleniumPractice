package selenium;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class formFill_Assignment {
	
	private static WebDriver driver = null;
	
	public static void formFill_Assignmentfun() {
		
		
		 Random rand = new Random();
	        Integer rand_int1 = rand.nextInt(88888888);
	        
	        String random_ = randomStringGen.getAlphaNumericString(7); 
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\browserAccess\\chromedriver.exe");
	   driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.id("firstName")).sendKeys(random_+"firsttname");
		driver.findElement(By.id("lastName")).sendKeys(random_+"lastname");
		driver.findElement(By.id("userEmail")).sendKeys(random_+"@"+random_+".com");
		//driver.findElement(By.id("dateOfBirthInput")).sendKeys("01 01 2000");
		
		driver.findElement(By.cssSelector("label[for='gender-radio-1']")).click();
		driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']")).click();
		
		driver.findElement(By.id("userNumber")).sendKeys("99"+rand_int1);
		driver.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys("Aldus PageMaker including versions of Lorem Ipsum");

		
		WebElement stt  = driver.findElement(By.cssSelector("input[id='react-select-3-input']"));
		stt.sendKeys("Uttar Pradesh");
		stt.sendKeys(Keys.ENTER);
		WebElement ctt  = driver.findElement(By.cssSelector("input[id='react-select-4-input']"));       
		ctt.sendKeys("Agra");
		ctt.sendKeys(Keys.ENTER);
		driver.findElement(By.id("submit")).click();
		
		driver.close();
	}
}
