package xpath_adavance.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensJavaWebDriver {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nagaraj\\eclipse-workspace\\manoj_project\\ProjectClassAssignment\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html#Java_For_WebDriver");
		Thread.sleep(500);
		WebElement course=driver.findElement(By.xpath("//li//child::a//child::span[contains(@class,'toc_number toc_depth_3')]"));
			String printcourse=course.getText();
			System.out.println(printcourse);
		}
	}


