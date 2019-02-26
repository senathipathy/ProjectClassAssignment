package custamizing_xpath.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartSearchPage {
	static WebDriver driver;	
	
	public static void flipkartMenu(String menu,String submenu,String content) throws InterruptedException
	{
		String Locator= "//div[@id='container']/div/div[2]/div/ul/li[#]";
	    Locator =Locator.replace("#", menu);
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath(Locator))).perform();
		Thread.sleep(1000);
		String subLocator="//div[@id='container']/div/div[2]/div/ul/li[#]/ul/li/ul/li[$]/ul/li[%]";
        subLocator=subLocator.replace("#", menu);
        subLocator=subLocator.replace("$", submenu);
        subLocator=subLocator.replace("%", content);
		driver.findElement(By.xpath(subLocator)).click();
   /*  	Thread.sleep(1000);
		String contentLocator="//div[@id='container']/div/div[2]/div/ul/li[#]/ul/li/ul/li[$]/ul/li[%]";
		contentLocator=contentLocator.replace("#",menu);
		contentLocator=contentLocator.replace("$",submenu);
		contentLocator=contentLocator.replace("%",content);
		driver.findElement(By.xpath(contentLocator)).click();*/
	}
	public static void main(String[] args) throws InterruptedException
	{	
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nagaraj\\eclipse-workspace\\manoj_project\\ProjectClassAssignment\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.flipkart.com");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@class='_2AkmmA _29YdH8']")).click();
	    flipkartMenu("5","4","5");
		}

}