package StepDefnitions;
//url="https://demo.vtiger.com/vtigercrm/index.php"
//uname="admin" pwd="Test@123"
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDefinition {

	WebDriver w;

	@Given("^user is already on login page$")
	public void user_is_already_on_login_page() {
		WebDriverManager.chromedriver().setup();
		w=new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://demo.vtiger.com/vtigercrm/index.php");
	  System.out.println("user in on login page");
	}
    
    @When("^title of login page is vtiger$")
    public void title_of_login_page_is_vtiger() throws Throwable {
     String LoginTitle=w.getTitle();
    	System.out.println("title of page is this..."+LoginTitle);
      Assert.assertEquals(LoginTitle,"vtiger","login title validation failed..");
    }

    @Then("^user enters username and password$")
    public void user_enters_username_and_password() throws Throwable {
    	WebElement uname=w.switchTo().activeElement();
    	uname.clear();
    	uname.sendKeys("admin",Keys.TAB);
    	WebElement pwd=w.switchTo().activeElement();
    	pwd.clear();
    	pwd.sendKeys("Test@123",Keys.ENTER);
    	
    	
    	System.out.println("user enters valid credentials...");
    }

    @Then("^user is on home page$")
    public void user_is_on_home_page() throws Throwable {
    	String HomeTitle=w.getTitle();
    	Assert.assertEquals("Приборная панель",HomeTitle,"home title validation failed..");
        System.out.println("user is on home page");
    }
    @Then("^close Browser$")
    public void closeBrowser()
    {
    	//Assert.assertEquals(false, true);
    	w.close();
    }

   
}
