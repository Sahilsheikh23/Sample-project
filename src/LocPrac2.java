import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocPrac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("http://demowebshop.tricentis.com/");
	     driver.manage().window().maximize();
//	     driver.findElement(By.linkText("Register")).click();
//	     driver.findElement(By.name("Gender")).click();
//	     driver.findElement(By.name("FirstName")).sendKeys("sahil");
//	     driver.findElement(By.name("LastName")).sendKeys("sheikh");
//	     driver.findElement(By.name("Email")).sendKeys("sahilsheikh1234.raj@gmail.com");
//	     driver.findElement(By.name("Password")).sendKeys("sahilsheikh1234");
//	     driver.findElement(By.name("ConfirmPassword")).sendKeys("sahilsheikh1234");
//	     driver.findElement(By.name("register-button")).click();
//	     driver.findElement(By.className("search-box-text")).sendKeys("abcd");
//	     driver.findElement(By.className("search-box-button")).click();
     driver.findElement(By.partialLinkText("Shoes")).click();
//        driver.findElement(By.partialLinkText("Log")).click();
//         driver.findElement(By.className("email")).sendKeys("abc@def.com");
//         driver.findElement(By.className("password")).sendKeys("abcdef");
//         driver.findElement(By.name("RememberMe")).click();
//         driver.findElement(By.className("button-1")).click();
//         
         
	}

}
