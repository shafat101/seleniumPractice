package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Cart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\newtrials\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String[] strArray = {"Cucumber","Beetroot","Potato","Pumpkin"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise");
		//Thread.sleep(3000);
		addItems(driver, strArray);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		//Thread.sleep(3000);
		  //explicit wait
		WebDriverWait w = new WebDriverWait(driver, 5);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
		
		Select country = new Select(driver.findElement(By.xpath("//div[@class='wrapperTwo']//div//select")));
		country.selectByValue("India");
		
		driver.findElement(By.xpath("//input[@class='chkAgree']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();
		
	}
	public static void addItems(WebDriver driver,String[] strArray) {
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		int size = 0;
		for(int i=0;i<products.size();i++) {
		String[] name =	products.get(i).getText().split("-");
		String formatedName = name[0].trim();
		if(size < strArray.length) {
		if(formatedName.contains(strArray[size])) {
		    System.out.println("Avilable");	
		    driver.findElements(By.xpath("//div[@class='product-action'] //button")).get(i).click();
		    size++;   
		}
		}else {
			break;
		}
		}
		}

}
