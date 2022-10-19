package StepDefinitionActiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ActiTimeCreateTask {
	WebDriver w;
	@Given("^user is already on login page og actiTime app$")
	    public void user_is_already_on_login_page_og_actitime_app() throws Throwable {
		 WebDriverManager.chromedriver().setup();
		 w=new ChromeDriver();
		 w.manage().window().maximize();
		 w.get("https://demo.actitime.com/login.do");
	    }

	    @When("^user enter (.+) and (.+) and click on login$")
	    public void user_enter_and_and_click_on_login(String uname, String pwd) throws Throwable {
	    	w.findElement(By.xpath("//input[@name='username']")).sendKeys(uname,Keys.TAB);
	    	w.switchTo().activeElement().sendKeys(pwd,Keys.ENTER);

	    }
	    @Then("^user should be on home page with (.+)$")
	    public void user_should_be_on_home_page_with(String title) throws InterruptedException 
	    {
	    	Thread.sleep(2000);
	       String actualTitle=w.getTitle();
	       Assert.assertEquals(actualTitle, title);
	       System.out.println("Home Page Title validation passed....");
	    }

	    @When("^user click on task and select create task$")
	    public void user_click_on_task_and_select_create_task() throws Throwable {
	       w.findElement(By.xpath("//a[@class='content tasks']")).click();
	       w.findElement(By.xpath("//div[@class='title ellipsis']")).click();
	       w.findElement(By.xpath("//div[@class='item createNewTasks']")).click();
	       
	    }

	   

	    @Then("^User could add task as (.+) and  click on Create task button$")
	    public void user_could_add_task_as_and_click_on_create_task_button(String task) throws Throwable {
	    //	w.findElement(By.cssSelector("tbody>tr:nth-of-type(1)>td[class='nameCell first']>input")).clear();
	    	//w.findElement(By.cssSelector("tbody>tr:nth-of-type(1)>td[class='nameCell first']>input")).sendKeys(task);
	    	Thread.sleep(2000);
	    	w.findElement(By.xpath("//div[@class='commitButtonPlaceHolder']/div/div[@class='components_button_label']")).click();
	    	//w.findElement(By.xpath("//div[text()='Create Tasks']")).click();
	    System.out.println("task created is: "+task);
	    }

	    @Then("^close browser$")
	    public void close_browser() throws Throwable {
	       w.close();
	    }


}
