package OrangeHRM.StepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import OrangeHRM.pageFactory.OrangeHRMLoginFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
//import pageFactory.LoginFactory;

public class OrangeHRMLoginTest {
	WebDriver driver;
	OrangeHRMLoginFactory log;
	@Given("user is on the login page of orangeHRM")
	public void user_is_on_the_login_page_of_orange_hrm() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		
		driver.navigate().to("https://demoqa.com/login");
		driver.manage().window().maximize();
	    
	}
	@When("^user enter (.*) & (.*)$")
	public void user_enter_username_password(String username,String password) {
		log=new OrangeHRMLoginFactory(driver);
		log.uname("nthere");
		log.pass("Nutan@20");
	    
	}
	@And("user click on login button")
	public void user_click_on_login_button() {
		log.clickbtn();
	    
	}
	@Then("Login should be successful")
	public void login_should_be_successful() {
	   
	}




}
