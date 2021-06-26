package selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableColumns {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\newtrials\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();;
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		
		
		List<WebElement> firstColumn = driver.findElements(By.cssSelector("tr td:nth-child(2)"));
		
		ArrayList<String> arrayList = new ArrayList<String>();
		for (WebElement wE : firstColumn) {
			arrayList.add(wE.getText());
			System.out.println(wE.getText());
		}
		System.out.println("***********************");
		ArrayList<String> copiedArrayList = new ArrayList<String>();
		for (String stringO : arrayList) {
			copiedArrayList.add(stringO);
			//System.out.println(stringO);
		}
		
		//sort
		Collections.sort(copiedArrayList);
		for (String sorted : copiedArrayList) {
			System.out.println(sorted);
		}
	}

}
