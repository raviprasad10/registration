package stepdefinition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefinitions {
	
	public static WebDriver driver;
	
	@Before(order=1)
	public void setup_step_env() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Softwares\\chromedriver.exe");
	}
	
	@Given("^user is on Welcome Page$")
	public void user_is_on_Welcome_Page() throws Throwable {
	    driver=new ChromeDriver();
	    driver.get("http://localhost:8088/registration/");
	    Thread.sleep(2000);
	    
	}

	@When("^user clicks on register$")
	public void user_clicks_on_register() throws Throwable {
		driver.findElement(By.name("register")).click();
	  
	}

	@Then("^register page is opened$")
	public void register_page_is_opened() throws Throwable {
		Thread.sleep(2000);
	    driver.findElement(By.id("firstName")).sendKeys("Ravi");
	    driver.findElement(By.id("lastName")).sendKeys("Prasad");
	    driver.findElement(By.id("email")).sendKeys("ravivk322@gmail.com");
	    driver.findElement(By.id("contactNumber")).sendKeys("8121101096");
	    driver.findElement(By.id("address")).sendKeys("1-10/11");
	    driver.findElement(By.id("city")).sendKeys("Hyderabad");
	    
	    WebElement mySelectElement = driver.findElement(By.id("state"));
	    mySelectElement.click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("Tamilnadu")).click();
	    


	    
	}

	@When("^user enters all the details and submit$")
	public void user_enters_all_the_details_and_submit() throws Throwable {
		 driver.findElement(By.name("commit")).click();
	 
	}
	@Then("^alertbox shows the message$")
	public void alertbox_shows_the_message() throws Throwable {
	  Alert alert=driver.switchTo().alert();
	 
	System.out.println(alert.getText());
	
	    assertEquals(alert.getText(),"Details validated");
	   Thread.sleep(2000);
	   if(alert.getText().equals("Details validated")) 
	   alert.dismiss();
	 
	   else if(alert.getText().equals("wrong email pattern")) 
		   driver.get("http://localhost:8088/registration/register");
	}
	
	

	@Then("^project details page is seen$")
	public void project_details_page_is_seen() throws Throwable {
		
		WebElement element1 = driver.findElement(By.id("projectDetails"));
		String message = element1.getText();
		System.out.println(message);
		assertEquals("Project Details", message);}
	
	
	@When("^user gives the proper values$")
	public void user_gives_the_proper_values() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.id("projectName")).sendKeys("Hello");
	    driver.findElement(By.id("clientName")).sendKeys("Prasad");
	    driver.findElement(By.id("teamSize")).sendKeys("5");
	    
	    
	}

	@When("^clicks on submit$")
	public void clicks_on_submit() throws Throwable {
	    
		driver.findElement(By.name("submit")).click();
	}

	@Then("^registration successfull message should be displayed$")
	public void registration_successfull_message_should_be_displayed() throws Throwable {
		WebElement element = driver.findElement(By.id("successful"));
		String message1 = element.getText();
		assertEquals("Registration Successfull", message1);
	  Thread.sleep(3000);
	  driver.close();
	}

}
