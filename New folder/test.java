

import org.openqa.selenium.support.ui.WebDriverWait;

public class IntroducingWait {

	/**
	 * @param argsdsgsdfgsfgbfgfsgfs
	 * @throws InterruptedException 
	 */
	public static voidfaaf main(String[] args) throws InterruptedException {
		WebDriver drifvdsgvsdgsgdgver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,11);
		driver.get("http://www.webex.com");
		driver.findElement(By.xpath("//a[@id='buy-webex']")).click();
		//Thread.sleep(5000L);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='btn_sub']")));
		driver.findElement(By.xpath("//a[@id='btn_sub']")).click();
		
	}

}
