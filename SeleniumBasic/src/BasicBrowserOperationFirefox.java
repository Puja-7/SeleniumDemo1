import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicBrowserOperationFirefox {
	public static void main(String[] args) {
		//using getProperty we get current directory and store it in path 
		String driverPath=System.getProperty("user.dir")+"\\Executable\\geckodriver.exe";	
		System.setProperty("webdriver.gecko.driver", driverPath);
		WebDriver w=new FirefoxDriver();
		w.get("https://www.Google.com/");
		String actualUrl=w.getCurrentUrl();
		String expectedUrl="https://www.google.com/";
		System.out.println("ActualUrl is: "+actualUrl);
		System.out.println("Expected url is : "+expectedUrl);
		if(actualUrl.contains(expectedUrl))
		{
			System.out.println("Firefox url validation Passed.....");
		}
		else
		{
			System.out.println("Url validation failed....");
		}
		String expectedTitle="Google";
		String actualTitle=w.getTitle();
		System.out.println("Expected title: "+expectedTitle);
		System.out.println("Actual title: "+actualTitle);
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("Title validation passed....");
		}
		else
		{
			System.out.println("Title validation failed....");
		}
		String pageSource=w.getPageSource();
		System.out.println("Length of pageSource is: "+pageSource.length());
		w.close();
	}

}
