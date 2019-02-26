package custamizing_xpath.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NationalTrainEnquiry {
	static WebDriver driver;
	 public static void trainSearch(String source)
	 {
		 List <WebElement> row=driver.findElements(By.tagName("tr"));
		   for(int i=0;i<row.size();i++)
		   {
			   WebElement rows=row.get(i);
			List<WebElement> data=rows.findElements(By.tagName("td"));
			for(int j=0;j<data.size();j++)
			{
		    WebElement datas=data.get(j);
			if(datas.getText().equals(source)) 
			{
			System.out.println(data.get(1).getText());	  			  }
			}
	/*		if(datas.getText().equals(destination))
			{
		    System.out.println(data.get(1).getText());	
			}*/
			
		   }  
		
	}
	public static void main(String[] args) throws AWTException, InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nagaraj\\eclipse-workspace\\manoj_project\\ProjectClassAssignment\\Drivers\\chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.get("https://enquiry.indianrail.gov.in/ntes/index.html#tabs-3");
		    Thread.sleep(1000);
		    driver.findElement(By.id("ui-id-3")).click();
		    driver.findElement(By.id("station1")).sendKeys("CHENNAI CENTRAL");
		    Robot r=new Robot();
		    r.keyPress(KeyEvent.VK_DOWN);
		    r.keyRelease(KeyEvent.VK_DOWN);
		    r.keyPress(KeyEvent.VK_ENTER);
		    r.keyRelease(KeyEvent.VK_ENTER);
		    Thread.sleep(1000);
		    driver.findElement(By.id("station2")).sendKeys("COIMBATORE JN");
		    Thread.sleep(1000);
		    r.keyPress(KeyEvent.VK_DOWN);
		    r.keyRelease(KeyEvent.VK_DOWN);
		    r.keyPress(KeyEvent.VK_ENTER);
		    r.keyRelease(KeyEvent.VK_ENTER);
		    trainSearch("10:10");
		  
	}

}
