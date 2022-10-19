package StepDefinitionActiTime;
//2. Enter the url as https://demo.actitime.com/login.do
//3. Verify login page
//3. Username as admin
//4.password as manager

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class ActitmeStepDefinitions {
	WebDriver w;
	@Given("^User is on Actitime login page$")
	    public void user_is_on_actitime_login_page() throws Throwable {
		 WebDriverManager.chromedriver().setup();
		 w=new ChromeDriver();
		 w.manage().window().maximize();
		 w.get("https://demo.actitime.com/login.do");
		 
	    }

    @When("^title of page is actiTIME Login$")
    public void title_of_LoginPage() {
        String LoginTitle=w.getTitle();
        System.out.println("actaul Login page title is:"+LoginTitle);
        System.out.println("expected is: "+"actiTIME - Login");
        Assert.assertEquals("actiTIME - Login",LoginTitle);
    }



//    @When("^user enters valid uname as \"([^\"]*)\" and password as \"([^\"]*)\" and click on login$")
//	    public void user_enters_valid_uname_and_password(String uname,String pwd) {
//	    	w.findElement(By.xpath("//input[@name='username']")).sendKeys(uname,Keys.TAB);
//	    	w.switchTo().activeElement().sendKeys(pwd,Keys.ENTER);
//	    	
//	    }
    
    @When("^user enters (.+) and (.+) and click on login$")
    public void username_password_login(String uname,String pwd)
    {
    	w.findElement(By.xpath("//input[@name='username']")).sendKeys(uname,Keys.TAB);
    	w.switchTo().activeElement().sendKeys(pwd,Keys.ENTER);
    }
//
//	    @Then("^user should be on homePage title should be same as expected$")
//	    public void user_should_be_on_homepage() throws Throwable {
//	    	Thread.sleep(1000);
//	    	w.getTitle();
//	    	System.out.println("home page title is: "+w.getTitle());
//	    	System.out.println("expected title is: "+"actiTIME -  Enter Time-Track");
//	    	//Assert.assertEquals("actiTIME - Enter Time-Track",w.getTitle());
//	    }
	    @Then("^user should be on homePage title should be (.+)$")
	    public void user_should_be_on_homepage(String homeTitle) throws InterruptedException {
	    	Thread.sleep(1000);
	    	w.getTitle();
	    	System.out.println("home page title is: "+w.getTitle());
	    	System.out.println("expected title is: "+"actiTIME -  Enter Time-Track");
	    	Assert.assertEquals(homeTitle,w.getTitle());
	    }
	    @And("^close the browser$")
	    public void closeBrowser()
	    {
	    	w.close();
	    }

	
}
