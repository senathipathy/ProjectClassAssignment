package custamizing_xpath.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartMobileSearch {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nagaraj\\eclipse-workspace\\manoj_project\\ProjectClassAssignment\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.flipkart.com");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@class='_2AkmmA _29YdH8']")).click();
		driver.findElement(By.xpath("//div[@id='container']//input[@type='text']")).sendKeys("mobile");
		driver.findElement(By.xpath("//button[contains(@class,'vh79eN')]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//div[contains(@class,'bhgxx2 col-12-12')]//div/a[contains(@class,'_31qSD5')])[1]")).click();
	}

}
