package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	// decleration
	@FindBy(id = "txtUsername") private WebElement username;
	@FindBy(id = "txtPassword") private WebElement password;
	@FindBy(id = "btnLogin") private WebElement loginBtn;
	
	
	// initalisation
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	// utilisation
	
	public WebElement getUsername() {
		return username;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	// valid login
	
	public void orangeHrmValidLogin(String validUsername, String validPassword)
	{
		username.sendKeys(validUsername);
		password.sendKeys(validPassword);
		loginBtn.click();
	}
	
	// invalid login
	
	public void orangeHrmInvalidLogin(String invalidUsername, String invalidPassword) throws InterruptedException
	{
		username.sendKeys(invalidUsername);
		password.sendKeys(invalidPassword);
		Thread.sleep(100);
		loginBtn.click();
		
	}
	

}
