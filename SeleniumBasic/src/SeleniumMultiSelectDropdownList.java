import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumMultiSelectDropdownList {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".//Executable/chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("http://omayo.blogspot.com/");
		//identify multiselect DD
		WebElement multiselectdd=w.findElement(By.cssSelector("select#multiselect1"));
		//create= object of Select class
		Select multiSelect=new Select(multiselectdd);
		System.out.println("is given Dropdown multiselect?? "+multiSelect.isMultiple());
		List<WebElement> Alloptions=multiSelect.getOptions();
		System.out.println("total options are: "+Alloptions.size());
		System.out.print("all car options are:");
		for(int i=0;i<Alloptions.size();i++)
		{
			System.out.print(Alloptions.get(i).getText()+" ");
		}
		System.out.println();
		w.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//	System.out.println("default selected option is: "+multiSelect.getFirstSelectedOption());
		//select multiple options from multiselect dd
		multiSelect.selectByIndex(3);
		multiSelect.selectByValue("volvox");
		multiSelect.selectByVisibleText("Hyundai");
		
		List<WebElement> selectedCars=multiSelect.getAllSelectedOptions();
		System.out.println("selected cars count is: "+selectedCars.size());
		System.out.print("selected cars are: ");
		for(int i=0;i<selectedCars.size();i++)
		{
			System.out.print(selectedCars.get(i).getText()+" ");
		}
		System.out.println();
		multiSelect.deselectByValue("Hyundaix");
		System.out.print("final selected cars are: ");
		List<WebElement> finalcars=multiSelect.getAllSelectedOptions();
		for(int i=0;i<finalcars.size();i++)
		{
			System.out.print(finalcars.get(i).getText()+" ");
		}
		w.close();
	}

}
