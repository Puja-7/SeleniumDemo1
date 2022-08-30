//Perform following operations on the application
//
//1. Open any browser
//2. Enter the url as https://demo.actitime.com/login.do
//3. Verify login page
//3. Username as admin
//4. password as manager
//5. click on Login button 
//6. close the brows

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeLocator {
public static void main(String[] args) {
	String foxdriver=System.getProperty("user.dir")+"\\Executable\\geckodriver.exe";
	System.setProperty("webdriver.gecko.driver",foxdriver);
	WebDriver w=new FirefoxDriver();
	//String driver=System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
	//System.setProperty("webdriver.chrome.driver",driver);
	//WebDriver w=new ChromeDriver();
	w.get("https://demo.actitime.com/login.do");
	w.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	String currentLoginUrl=w.getCurrentUrl();
	String expectedLoginurl="https://demo.actitime.com/login.do";
	if(currentLoginUrl.equals(expectedLoginurl))
	{
		System.out.println("Login url validation passed...");
	}
	else
	{
		System.out.println("login url validation failed..");
	}
	//for username 
	WebElement username=w.findElement(By.className("textField"));
	username.clear();
	username.sendKeys("admin");
	//webElement for password
	WebElement pwd=w.findElement(By.name("pwd"));
	pwd.clear();
	pwd.sendKeys("manager");
	//for login button
	WebElement loginBtn=w.findElement(By.id("loginButton"));
	loginBtn.click();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String currentHomeUrl=w.getCurrentUrl();
	System.out.println("Home Page url: "+currentHomeUrl);
	
	String expectedHomeUrl="https://demo.actitime.com/user/submit_tt.do";
	System.out.println("expected home page url is: "+expectedHomeUrl);
	
	if(w.getCurrentUrl().equals(expectedHomeUrl))
	{
		System.out.println("Home url validation passed/.......");
	}
	else
	{
		System.out.println("Home url validation failed.......");
	}	
	w.close();
	
}
}
