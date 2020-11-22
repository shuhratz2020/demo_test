package co.edureka;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class cssEbayLocators {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.ebay.com");
		driver.manage().window().maximize();
	  JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(By.cssSelector("#gh-ac") ).sendKeys("OnePlus6T");
		driver.findElement(By.cssSelector("#gh-btn") ).click();
		js.executeScript("window.scrollBy(0,800)");
	}
}
