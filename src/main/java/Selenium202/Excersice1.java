package Selenium202;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Excersice1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("selenium essentials");
		element.submit();
		driver.get("https://accounts.google.com/");
		List<WebElement> Textbox =driver.findElements(By.xpath("//script[@type='text/javascript']"));
		System.out.println("Overall textboxes:"+Textbox.size());
	}
	}