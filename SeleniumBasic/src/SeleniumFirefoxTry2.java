import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirefoxTry2 {
	public static void main(String[] args) {
		/**Added New content for Git Hub*/
		System.setProperty("webdriver.gecko.driver","D:\\JavaProgramsEcllipseNew\\SeleniumBasic\\Executable\\geckodriver.exe");
		FirefoxDriver f=new FirefoxDriver();
		f.get("https://www.Google.com");
		//f.manage().window().maximize();
		f.close();
		
	}

}
