import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathIndeDe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("http://amazon.com/");
	     driver.manage().window().maximize();
	     driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphones");
	     driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//div[@id='titleSection']/../../../..//div[@class='a-box-group']//input[@id='add-to-cart-button']")).click();
	     
	}

}
