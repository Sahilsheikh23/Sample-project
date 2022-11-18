import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocPrac {

	public static void main(String[] args) {
		
     System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("http://demowebshop.tricentis.com/");
     driver.manage().window().maximize();
     driver.findElement(By.linkText("Register")).click();
     driver.findElement(By.id("gender-male")).click();
     driver.findElement(By.id("FirstName")).sendKeys("sahil");
     driver.findElement(By.id("LastName")).sendKeys("sheikh");
     driver.findElement(By.id("Email")).sendKeys("sahilsheikh.raj@gmail.com");
     driver.findElement(By.id("Password")).sendKeys("sahilsheikh");
     driver.findElement(By.id("ConfirmPassword")).sendKeys("sahilsheikh");
     driver.findElement(By.id("register-button")).click();
     
     
    
     
	}

}
