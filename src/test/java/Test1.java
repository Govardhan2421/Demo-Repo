import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {
	
	 public static void main(String[] args) {
	       
	    	System.setProperty("webdriver.gecko.driver","C:\\Browsers\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();	    	
	        driver.get("http://www.demo.guru99.com/V4/");
	        driver.findElement(By.name("uid")).sendKeys("mngr280760");
	        driver.findElement(By.name("password")).sendKeys("jumEbYr");
	        driver.findElement(By.name("btnLogin")).click();   
	       //driver.close();
	       
	    }

}
