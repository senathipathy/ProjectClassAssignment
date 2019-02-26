package custamizing_xpath.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LifeTimeMenuCustamization {
	static WebDriver driver;
	public static void lifeTimeMenu(String menu,String submenu) 
	{
		String locator="//ul[@id=\"primaryNav\"]/li[#]/a";
		locator=locator.replace("#",menu);
		driver.findElement(By.xpath(locator)).click();
		String sublocator="//ul[@id=\"primaryNav\"]/li[#]/div[2]/ul/li[$]/a";
		sublocator=sublocator.replace("#",menu);
	    sublocator=sublocator.replace("$",submenu);
	    driver.findElement(By.xpath(sublocator)).click();
	}
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nagaraj\\eclipse-workspace\\manoj_project\\ProjectClassAssignment\\Drivers\\chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.get("https://www.lifetime.life/");
		    Thread.sleep(1000);
		    lifeTimeMenu("3","5");
	}

}
