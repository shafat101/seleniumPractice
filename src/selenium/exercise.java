package selenium;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class exercise {

	public static void main(String[] args) throws InterruptedException {
	//	WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\browserAccess\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup");
		driver.findElement(By.xpath("/html/body/div[1]/div/footer/ul/li[1]/a")).click();
		System.out.println(driver.getTitle());
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parent = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.switchTo().window(parent);

	}

}
