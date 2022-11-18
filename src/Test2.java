import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-admin/install.php");
	     driver.manage().window().maximize();
	     driver.findElement(By.xpath("//input[contains(@name,'weblog_title')]")).sendKeys("ABC");
	     driver.findElement(By.xpath("//input[contains(@name,'user_name')]")).sendKeys("DEF");
	     driver.findElement(By.xpath("//input[contains(@id,'pass1')]")).sendKeys("DEF");
	     driver.findElement(By.xpath("//input[contains(@id,'admin_email')]")).sendKeys("ABC@DEF.COM");
	     driver.findElement(By.xpath("//input[contains(@id,'blog_public')]")).click();
	     driver.findElement(By.xpath("//input[contains(@id,'submit')]")).click();

	}

}
