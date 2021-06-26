package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {

	public static void main(String[] args) {
		String serName = "HellO";
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\browserAccess\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		a.moveToElement(move).build().perform();
		a.moveToElement(driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")))
		.click().keyDown(Keys.SHIFT).sendKeys(serName).doubleClick().build().perform();
		

	}

}
