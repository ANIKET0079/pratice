package framework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class TestOrangeHrmValidLogin extends BaseTest {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		Flib flib = new Flib();
		String userName = flib.readPropertyFileData(PROP_PATH, "username");
		String pass = flib.readPropertyFileData(PROP_PATH, "password");
		
		
		LoginPage lp = new LoginPage(driver);
		lp.orangeHrmValidLogin(userName, pass);
		
		
	}

}
