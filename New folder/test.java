
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IntroducingWait {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,11);
		driver.get("http://www.webex.com");
		driver.findElement(By.xpath("//a[@id='buy-webex']")).click();
		//Thread.sleep(5000L);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='btn_sub']")));
		driver.findElement(By.xpath("//a[@id='btn_sub']")).click();
		
	}

}
