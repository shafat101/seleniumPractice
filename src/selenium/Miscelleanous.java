package selenium;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;





public class Miscelleanous {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\newtrials\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
//		driver.manage().deleteCookieNamed("SID");
//		driver.manage().deleteCookieNamed("NID");
		driver.get("http://yahoo.com");
		Thread.sleep(3000);
	//	driver.manage().deleteCookieNamed("NID");
		
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      //FileHandler.copy(src, new File("E://screenshot123.png"));
        FileUtils.copyFile(src,new File("E://screenshotyahoo.png"));
        
	}

}
