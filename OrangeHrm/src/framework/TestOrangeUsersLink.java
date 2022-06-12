package framework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class TestOrangeUsersLink extends BaseTest{
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		Flib flib = new Flib();
		String Validusername = flib.readPropertyFileData(PROP_PATH, "username");
		String validPassword = flib.readPropertyFileData(PROP_PATH, "password");
		
		LoginPage lp = new LoginPage(driver);
		lp.orangeHrmInvalidLogin(Validusername, validPassword);
		
		HomePage hp = new HomePage(driver);
		hp.getAdminLink();
	}

}
