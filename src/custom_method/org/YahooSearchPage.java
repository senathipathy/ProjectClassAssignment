package custom_method.org;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooSearchPage {
	static WebDriver driver;
	
    public static void search(String value){
    	List <WebElement> course=driver.findElements(By.xpath("//div[contains(@class,'compPagination')]//a"));
		for (int i=0;i<=course.size();i++) {
			if(i==5) {
				break;
			}
		    String out=course.get(i).getText();
		    if(out.equals(value)) {
		    course.get(i).click();
		    }
				        
		}
    }
	public static void main (String[] args){
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nagaraj\\eclipse-workspace\\manoj_project\\ProjectClassAssignment\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://in.yahoo.com/");
		driver.findElement(By.id("uh-search-box")).sendKeys("dicipline");
	    driver.findElement(By.id("uh-search-button")).click();
	    search("Next");
	}
	}


