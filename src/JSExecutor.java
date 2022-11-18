import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutor {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://www.ebay.ca/");
	     driver.manage().window().maximize();
	     driver.findElement(By.cssSelector("input#gh-ac")).sendKeys("iphones");
	     driver.findElement(By.cssSelector("input[value='Search']")).click();
	     JavascriptExecutor js = (JavascriptExecutor) driver;
	     js.executeScript("window.scrollBy(0,2000)");
	     
	     
	}

}
