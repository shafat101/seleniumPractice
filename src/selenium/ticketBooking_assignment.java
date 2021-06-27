package selenium;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ticketBooking_assignment {

	public static void ticket() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\browserAccess\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://spicejet.com");
	//Thread.sleep(5000L); 
	//surely a bad practice implict/explicit/Fluent Wait are better choices 
	driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);	
	driver.findElement(By.xpath("//div[@class='row1 adult-infant-child']/div[1]")).click();
	
	Select a = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
	a.selectByValue("2");
	Select c = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
	c.selectByValue("3");
	Select i = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
	i.selectByValue("1");
	
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	driver.findElement(By.xpath("//a[@value='BLR']")).click();
//	Thread.sleep(20L);
	driver.findElement(By.xpath("(//a[@value='DEL'])")).click(); // if error swithch it to [2] child as fistone might be the from destination
	driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();
	driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
    Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
    System.out.println(driver.findElement(By.cssSelector("input[name='ctl00$mainContent$view_date2']")).isEnabled());
    driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
    System.out.println(driver.findElement(By.cssSelector("input[name='ctl00$mainContent$view_date2']")).isEnabled());
    System.out.println(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"));
	if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
		System.out.println("Enabled");
	}
   
	driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	driver.close();
	
	
	
}
}