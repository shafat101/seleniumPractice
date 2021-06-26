package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediff {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\browserAccess\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.rediff.com");
	    driver.findElement(By.cssSelector("a[class*='signin']")).click();
	    driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("Username");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password23");
	    driver.findElement(By.cssSelector("input[name*='proceed']")).click();
		

	}

}
