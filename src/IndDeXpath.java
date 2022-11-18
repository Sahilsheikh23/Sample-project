import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndDeXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("http://demowebshop.tricentis.com/");
	     driver.manage().window().maximize();
	     driver.findElement(By.xpath("//a[.='Build your own computer']/../../..//input")).click();

	}

}
