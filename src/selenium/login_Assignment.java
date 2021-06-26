package selenium;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_Assignment {

	public static void login_Assignmentfun() {
		 
        Random rand = new Random();
        int rand_int1 = rand.nextInt(10000);
        
        String random_ = randomStringGen.getAlphaNumericString(7); 
        
        
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\browserAccess\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://s2.demo.opensourcecms.com/orangehrm/symfony/web/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("opensourcecms");
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("opensourcecms");
		driver.findElement(By.cssSelector("[name='Submit']")).click();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);	
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();    
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);	
		driver.findElement(By.id("btnAdd")).click();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);	
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("bob"+random_);
		driver.findElement(By.id("systemUser_userName")).sendKeys("mike"+random_);
		driver.findElement(By.id("systemUser_password")).sendKeys(random_+"pass123$"+rand_int1);
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(random_+"pass123$"+rand_int1);
	}

}
