package xpath_adavance.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LifeTimeLocation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nagaraj\\eclipse-workspace\\manoj_project\\ProjectClassAssignment\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.lifetime.life/");
		Thread.sleep(1000);
		WebElement pop=driver.findElement(By.xpath("//div[contains(@title,'Close')]"));
		pop.click();
	/*	List <WebElement> course=driver.findElements(By.xpath("//div//ul//li//a[contains(@class,'dropdown-item ')]"));
		for (WebElement x : course) {
			String printcourse=x.getText();
			System.out.println(printcourse);*/
		WebElement print=driver.findElement(By.xpath("(//div//ul//li//a[contains(@class,'dropdown-item ')])[2]"));
		String check=print.getText();
		System.out.println();
//		}
	}
}
