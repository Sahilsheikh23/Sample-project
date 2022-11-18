import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("http://demowebshop.tricentis.com/");
	     driver.manage().window().maximize();
	     driver.findElement(By.xpath("//a[@class='ico-register']")).click();
	     driver.findElement(By.xpath("(//input[@type=\"radio\"])[1]")).click();
	     driver.findElement(By.xpath("//input[@id=\"FirstName\"]")).sendKeys("ABC");
	     driver.findElement(By.xpath("//input[@id=\"LastName\"]")).sendKeys("DEF");
	     driver.findElement(By.xpath("//input[@name=\"Email\"]")).sendKeys("ABC@DEF.com");
	     driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("1234567");
	     driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("1234567");
	     JavascriptExecutor js = (JavascriptExecutor) driver;
	     js.executeScript("window.scrollBy(0,400)");
         driver.findElement(By.xpath("(//input[@type=\"submit\"])[2]")).click();
	     
	}

}
