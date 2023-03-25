package base;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.handler.codec.http.Cookie;

public class projectSpecificMethods {
	public static ChromeDriver driver;
	public static Actions builder;
	public static WebDriverWait wait;
	public static JavascriptExecutor js;
	@BeforeMethod
	public void launchApp() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("−−incognito");
		driver = new ChromeDriver(options);
		builder = new Actions(driver);
		js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com/");

	}
	
	@AfterMethod
	public void closeBrowser() {
		
	}
	
	public void timeWait() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(5000);

	}
	
	public void closeAllBrowser() {
		driver.quit();
	}
}
