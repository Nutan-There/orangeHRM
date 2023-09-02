package OrangeHRM.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class StudentRegistrationForm {
	WebDriver driver;

	@FindBy(xpath = "//input[@id='firstName']")

	@CacheLookup

	WebElement firstName;

	@FindBy(xpath = "//input[@id='lastName']")

	@CacheLookup

	WebElement lastName;

	@FindBy(xpath = "//input[@id='userEmail']")

	@CacheLookup

	WebElement usermail;

	@FindBy(xpath = "//input[@id='gender-radio-2']")

	@CacheLookup

	WebElement gender;

	@FindBy(xpath = "//input[@id='userNumber']")

	@CacheLookup

	WebElement number;

	@FindBy(xpath = "//input[@id='dateOfBirthInput']")

	@CacheLookup

	WebElement Dob;

	@FindBy(xpath = "//input[@id='subjectsContainer']")

	@CacheLookup

	WebElement Sub;

	@FindBy(xpath = "//input[@id='subjectsContainer']")

	@CacheLookup

	WebElement Sub1;

	@FindBy(xpath = "//*[@id=\"currentAddress\"]")

	@CacheLookup

	WebElement Address;
	
	@FindBy(xpath = "//*[@id=\"stateCity-wrapper\"]/div[1]")
	
	WebElement Statecity;
	
	@FindBy(xpath ="//*[@id=\"submit\"]")
	
	WebElement Submit;

}
