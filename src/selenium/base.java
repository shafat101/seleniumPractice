package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\newtrials\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String[] strArray = {"Cucumber","Beetroot","Potato","Pumpkin"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise");
		
		Thread.sleep(3000);
		
		

	}

}
