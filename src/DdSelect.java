import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DdSelect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("file:///C:/Users/Krypton/Desktop/dd.html");
	     driver.manage().window().maximize();
         WebElement dd = driver.findElement(By.id("s1"));
         Select s = new Select (dd);
         s.selectByIndex(3);
         Thread.sleep(2000);
         s.selectByValue("2");
         Thread.sleep(2000);
         s.selectByVisibleText("Manual");
         
	}

}
