import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathFbAssign {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://www.facebook.com/");
	     driver.manage().window().maximize();
	     driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("abcd");
	     driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("efgh");
	     driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("sdf.ssdf@gmail.com");
	     driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("123456"); 
	     Thread.sleep(2000);
	     WebElement ddMonth = driver.findElement(By.name("birthday_month"));
	     Select s = new Select (ddMonth);
	     s.selectByIndex(3);
	     Thread.sleep(2000);
	     WebElement ddDay = driver.findElement(By.name("birthday_day"));
	      s = new Select (ddDay);
	     s.selectByValue("23");
	     Thread.sleep(2000);
	     WebElement ddYear = driver.findElement(By.id("year"));
	       s = new Select (ddYear);
	     s.selectByIndex(2);
	     driver.findElement(By.xpath("//label[contains(text(), 'Male')]")).click();
	     driver.findElement(By.xpath("//button[@id=\"u_9_s_u7\"]")).click();
	     
	     
	     
	     

	}

}
