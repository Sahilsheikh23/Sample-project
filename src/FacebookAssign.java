import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAssign {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://www.facebook.com/");
	     driver.manage().window().maximize();
	     driver.findElement(By.cssSelector("a[data-testid=\"open-registration-form-button\"]")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.name("firstname")).sendKeys("Sahil");
	     driver.findElement(By.name("lastname")).sendKeys("Sheikh");
	     driver.findElement(By.name("reg_email__")).sendKeys("sahil.sheikh@gmail.com");
	     driver.findElement(By.name("websubmit")).click();
	     
	 
	     
	     
	}

}
