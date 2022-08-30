import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartBasicValidatonChrome {
	public static void main(String[] args) {
		//get the current directory using user.dir and path set them into driverpath
		String driverPath=System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
		//set driverpath
		System.setProperty("webdriver.chrome.driver",driverPath);
		//create instance of chromedriver class from webdriver interface
		WebDriver w=new ChromeDriver();
		w.get("https://www.flipkart.com/");
		//get actualUrl using getCurrentUrl method of chromeDriver()
		String ActualUrl=w.getCurrentUrl();
		String ExpectedUrl="https://www.flipkart.com/";
		if(ActualUrl.equals(ExpectedUrl))
		{
			System.out.println("Url validation passed.....");
		}
		else
		{
			System.out.println("Url Validation Failed.....");
		}
		//now we validate title of flipkart site
		//get the current url's title using getTitle method
		String ActualTitle=w.getTitle();
		//get the expected title from flipakrt's pagesource title copy title and store it in expected Title
		String ExpectedTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		System.out.println("Actual Title is: "+ActualTitle);
		System.out.println("Expetced Title is: "+ExpectedTitle);
		if(ActualTitle.contains(ExpectedTitle))
		{
			System.out.println("Flipkart Title validation Passed...");
		}
		else
		{
			System.out.println("Flipkart Title validation failed....");
		}
		System.out.println("Length of pageSource of flipksrt site is : "+w.getPageSource().length());
		w.close();
		
	}

}
