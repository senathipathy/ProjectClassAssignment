package xpath_adavance.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetfixLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nagaraj\\eclipse-workspace\\manoj_project\\ProjectClassAssignment\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.netflix.com/in/login");
		WebElement pop=driver.findElement(By.xpath("(//div//button)[2]"));
		pop.click();
		WebElement error=driver.findElement(By.xpath("(//form/div/div[contains(@class,'inputError')])[1]"));
		Boolean out=error.isDisplayed();
		System.out.println(out);
	}		
}
