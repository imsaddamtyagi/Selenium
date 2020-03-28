package SeleniumInterview;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	
		driver.get("http://demo.guru99.com/test/drag_drop.html");
        
		WebElement source = driver.findElement(By.xpath("//*[@id='credit2']/a"));		
		WebElement destination =driver.findElement(By.xpath("//*[@id='bank']/li"));
		
		//Using Action class for drag and drop.		
        Actions act=new Actions(driver);					
        act.dragAndDrop(source, destination).build().perform();		
	      }	
	
          }
