import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicOperationOnBrowser {
	public static void main(String[] args) {
		String driverPath=System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver chrome=new ChromeDriver();
		chrome.get("https:\\www.google.com");
		
		//expected page url
		String expectedurl="https://www.google.com/";
		String actualurl=chrome.getCurrentUrl();
		System.out.println("Actual url is: "+actualurl);
		System.out.println("Expected url is: "+expectedurl);
		if(actualurl.contains(expectedurl))
		{
			System.out.println("Url Validation Passed");
		}
		else
		{
			System.out.println("url validation failed");
		}
		
		String ActualTitle=chrome.getTitle();
		String expectedTitle="Google";
		if(ActualTitle.equals(expectedTitle))
		{
			System.out.println("Title validaion passed");
		}
		else
		{
			System.out.println("test validation failed");
		}
		String pageSource=chrome.getPageSource();
		System.out.println("Length of pageSource is : "+pageSource.length());
		chrome.close();
	}

}
