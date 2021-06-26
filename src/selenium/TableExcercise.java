package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TableExcercise {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\newtrials\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ksrtc.in/oprs-web/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).click();
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("beng");
		//driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		
	//	System.out.println(driver.findElement(By.xpath("//input[@id='fromPlaceName']")).getText());
		
		//javaScript Dom can extract hidden Elements
		//bcz selenium can not identify hidden elements - (Ajax implementation)
		//investigate properties of an object if it have any hidden text
		
		//javascript executer is provided by selenium to execute all the javascript objects 
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		String script = "return document.getElementById(\"fromPlaceName\").value;";
		String text = "";
		
		
		while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT")) {
			driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
			Thread.sleep(2000);
			text = (String) js.executeScript(script);
			
		}
		System.out.println(text);
		
	}

}
