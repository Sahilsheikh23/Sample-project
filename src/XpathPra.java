import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPra {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("http://demowebshop.tricentis.com/");
	     driver.manage().window().maximize();
//         driver.findElement(By.xpath("//a[text()='Register']")).click();
//	     driver.findElement(By.xpath("//a[.='Register']")).click();
	     driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
	     driver.findElement(By.xpath("//input[contains(@id,'gender-male')]")).click();
	     driver.findElement(By.xpath("//input[contains(@id,'FirstName')]")).sendKeys("ABC");
	     driver.findElement(By.xpath("//input[contains(@id,'LastName')]")).sendKeys("DEF");
	     driver.findElement(By.xpath("//input[contains(@id,'Email')]")).sendKeys("ABC@DEF.com");
	     driver.findElement(By.xpath("//input[contains(@id,'Password')]")).sendKeys("1234567");
	     driver.findElement(By.xpath("//input[contains(@id,'ConfirmPassword')]")).sendKeys("1234567");
	     driver.findElement(By.xpath("//input[contains(@id,'register-button')]")).click();
	}

}
