package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	//decleration
	@FindBy(id = "menu_admin_viewAdminModule") private WebElement adminLink;
	@FindBy(xpath = "//a[.='Admin']/following::a[.='Users']") private WebElement usersLink;
	
	
	// intialization
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	//utilization
	
	public WebElement getAdminLink() {
		return adminLink;
	}


	public WebElement getUsersLink() {
		return usersLink;
	}
	
	//home page admin link operation
	
	public void usersLink()
	{
		usersLink.click();
	}

}
