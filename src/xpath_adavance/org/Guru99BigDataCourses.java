package xpath_adavance.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99BigDataCourses {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nagaraj\\eclipse-workspace\\manoj_project\\ProjectClassAssignment\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.guru99.com/");
		List <WebElement> course=driver.findElements(By.xpath("//section//div[contains(@class,'moduletable')]//child::ul//child::li[contains(@class,'fa fa-chevron-circle-right')]//child::a"));
		for (int i=69;i<=course.size();i++) {
			if(i==78)
			break;
	        String print=course.get(i).getText();
	        System.out.println(print);
		}
	}


}
