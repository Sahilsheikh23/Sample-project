import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPrac {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("http://demowebshop.tricentis.com/");
	     driver.manage().window().maximize();
	     driver.findElement(By.xpath("//a[@class='ico-register']")).click();
	     driver.findElement(By.cssSelector("input#gender-male")).click();
	     driver.findElement(By.cssSelector("input#FirstName")).sendKeys("ABC");
	     driver.findElement(By.cssSelector("input[data-val-required='Last name is required.']")).sendKeys("DEF");
	     driver.findElement(By.cssSelector("input#Email")).sendKeys("ABC@DEF.com");
	     driver.findElement(By.cssSelector("input#Password")).sendKeys("1234567");
	     driver.findElement(By.cssSelector("input[name=\"ConfirmPassword\"]")).sendKeys("1234567");
	}

}
