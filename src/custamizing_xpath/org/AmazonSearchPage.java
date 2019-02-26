package custamizing_xpath.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearchPage {
	static WebDriver driver;
	public static void SearchResult(String itemnumber) {
       String locator="result_$";
       locator=locator.replace("$",itemnumber);
       driver.findElement(By.id(locator)).click();
	}
	public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nagaraj\\eclipse-workspace\\manoj_project\\ProjectClassAssignment\\Drivers\\chromedriver.exe");
    driver=new ChromeDriver();
	driver.get("https://www.amazon.in/?ie=UTF8&tag=googinabkkenshoo-21&ascsubtag=_k_EAIaIQobChMI0KLkzaXX4AIVxKmWCh3--QiiEAAYASAAEgIWjfD_BwE_k_&gclid=EAIaIQobChMI0KLkzaXX4AIVxKmWCh3--QiiEAAYASAAEgIWjfD_BwE");
	WebElement pop=driver.findElement(By.id("twotabsearchtextbox"));
	pop.sendKeys("mobile");
	WebElement error=driver.findElement(By.xpath("(//input[contains(@type,'submit')])[1]"));
	error.click();
	Thread.sleep(1000);
	SearchResult("7");
	}
}
