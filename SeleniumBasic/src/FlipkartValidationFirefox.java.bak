import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipkartValidationFirefox {
public static void main(String[] args) {
	String driverPath=System.getProperty("user.dir")+"\\Executable\\\\geckodriver.exe";
	System.setProperty("webdriver.gecko.driver",driverPath);
	WebDriver w=new FirefoxDriver();
	w.get("https://www.flipkart.com/");
	String ActualUrl=w.getCurrentUrl();
	String ExpectedUrl="https://www.flipkart.com/";
	if(ActualUrl.equals(ExpectedUrl))
	{
		System.out.println("Url validation passed........");
	}
	else
	{
		System.out.println("Url validation failed......");
	}
	String ActualTitle=w.getTitle();
	String ExpectedTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books &amp; More. Best Offers!";
	System.out.println("Actual Title is: "+ActualTitle);
	System.out.println("Expected title is: "+ExpectedTitle);
	if(ActualTitle.equals(ExpectedTitle))
	{
		System.out.println("Title validation pass....");
	}
	else
	{
		System.out.println("Title validation failed...");
	}
	System.out.println("Page Source length is: "+w.getPageSource().length());
	w.close();
}
}
