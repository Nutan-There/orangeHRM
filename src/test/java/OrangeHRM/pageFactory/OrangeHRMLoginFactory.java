package OrangeHRM.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMLoginFactory {
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"userName\"]")
	
	@CacheLookup
	WebElement usernamefields;
	
	@FindBy(xpath = "//*[@id=\"password\"]")
	
	@CacheLookup
	WebElement passwordfields;
	
	@FindBy(xpath = "//*[@id=\"login\"]")
	
	@CacheLookup
	WebElement logbtn;
	
	public OrangeHRMLoginFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void uname(String key) {
		usernamefields.sendKeys(key);
		
	}
	public void pass(String key) {
		passwordfields.sendKeys(key);
	}
	public void clickbtn() {
		logbtn.click();
	}

}
