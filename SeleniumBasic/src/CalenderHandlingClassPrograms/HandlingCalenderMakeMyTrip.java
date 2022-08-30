package CalenderHandlingClassPrograms;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import utilities.SeleniumUtility;

public class HandlingCalenderMakeMyTrip{

		public static void main(String[] args) throws InterruptedException {
			String driverPath = System.getProperty("user.dir") + "\\Executable\\chromedriver.exe";
			//step1: set driver executable path by using System.setProperty(String key,String value)
			System.setProperty("webdriver.chrome.driver", driverPath);
			//step2: create an instance of Chrome Browser
			WebDriver driver = new ChromeDriver();
			//maximize browser
			driver.manage().window().maximize();
			//implicit wait
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://www.makemytrip.com/");
			
			//close login popup
		//	driver.findElement(By.cssSelector("li[data-cy='account']")).click();
			//identify departure date and click on it
			//Thread.sleep(2000);
			driver.findElement(By.cssSelector("label[for='departure']")).click();
			//select any date from next month
			driver.findElement(By.cssSelector("div.DayPicker-Months>*:last-child>.DayPicker-Body>div:nth-of-type(2)>*:nth-child(2)>div>p")).click();
			driver.close();
		}

	}



