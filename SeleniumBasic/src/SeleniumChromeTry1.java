//first we have to setProperty as webdriver.chrome.driver and its path
//then create object of that ChromeDriver or firefoxDriver
//and using that reference variable use get method to redirect to given path like https://www.google.com
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumChromeTry1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\JavaProgramsEcllipseNew\\SeleniumBasic\\Executable\\chromedriver.exe");
		ChromeDriver cd=new ChromeDriver();
		
		cd.get("https://www.google.com");
		//d.get("")
//		cd.manage.window.maximize();
		cd.manage().window().maximize();
		
		//System.out.println("driver location : "+cd.location());
		cd.close();
	}

}
