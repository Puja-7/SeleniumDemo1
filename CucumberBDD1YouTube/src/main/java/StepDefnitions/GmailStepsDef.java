package StepDefnitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailStepsDef {
	WebDriver w;
	@Given("^user is on login page$")
    public void user_is_on_login_page() throws Throwable {
	WebDriverManager.firefoxdriver().setup();
	w=new FirefoxDriver();
	w.manage().window().maximize();
		w.get("https://www.gmail.com");
		//w.findElement(By.xpath("/html/body/header/div/div/div/a[2]")).click();
    }

    @Then("^user enter (.+) and (.+)$")
    public void user_enter_and(String username, String password) throws Throwable {
       w.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys(username);
       w.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")).click();
       w.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[1]/div/form/span/div[1]/div[1]/div/div/div/div/div[1]/div/div[1]/input")).sendKeys(password);
    }

    @Then("^click on login button$")
    public void click_on_login_button() throws Throwable {
        w.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")).click();
    }

    @Then("^Close browser$")
    public void close_browser() throws Throwable {
        w.close();
    }

}
