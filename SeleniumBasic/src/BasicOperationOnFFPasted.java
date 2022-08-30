

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicOperationOnFFPasted {

	public static void main(String[] args) {
	String A1 = System.getProperty("user.dir")+"\\Executable\\geckodriver.exe";
	System.setProperty("webdriver.gecko.driver", A1);
	WebDriver A2 = new FirefoxDriver();
	A2.get("https://www.google.com/");
	

	String ExpectedURL = "https://www.google.com/";
	String ActualURL = A2.getCurrentUrl();
	System.out.println("URL Validation :"+ExpectedURL.equals(ActualURL));
	String ExpectedTitle = "Google";
	String ActualTitle = A2.getTitle();
	System.out.println("Title Validation :"+ExpectedTitle.equals(ActualTitle));
	String PageSourceLength = A2.getPageSource();
	System.out.println("Page Source Length :"+PageSourceLength.length());
	//A2.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		A2.close();
	}

}
