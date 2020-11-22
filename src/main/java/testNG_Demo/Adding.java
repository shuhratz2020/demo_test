package testNG_Demo;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Adding {
//	public static void main(String[] args) {
//		
//		launching_website();
//		subtraction();
//	}	
	@Test
	static void subtraction() {
		int x=5;
		int y=3;
		int z=0;
		z=x-y;
		Assert.assertEquals(2,2, "Check 5-3 is equals to 2");
		}
			
		public static void launching_website() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.automationpractice.com/");
		WebElement e = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/span/strong"));
		String phoneNumber = e.getText();
		if (phoneNumber.equals("0123-456-789")) {
			System.out.println("Website launching passed");
		} else {
			System.out.println("Website launching failed");
		}
	  }
	}   

