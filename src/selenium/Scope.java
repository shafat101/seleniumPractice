package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Scope {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\browserAccess\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());

		//limiting scope
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println("Footer : "+footerdriver.findElements(By.tagName("a")).size());
		
		//limting scope 1
		WebElement columnDriver= footerdriver.findElement(By.xpath("//div/table/tbody/tr/td[1]/ul"));
		System.out.println("Footer Block : "+columnDriver.findElements(By.tagName("a")).size());
		
		
		//check if each link is working
		for(int i =1;i < columnDriver.findElements(By.tagName("a")).size();i++) {
			
			String clickonLinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
		    columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickonLinkTab);
		    Thread.sleep(3000);
		}   
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();
		
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		}
	}


