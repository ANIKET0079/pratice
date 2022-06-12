package framework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class TestOrangeHrmInvalidLogin extends BaseTest {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		Flib flib = new Flib();
		int rc = flib.getRowCount(EXCEL_PATH, "invaliddata");
		
		LoginPage lp = new LoginPage(driver);
		
		for(int i=1;i<=rc;i++)
		{
			String invalidUsername = flib.readExcelData(EXCEL_PATH, "invaliddata", i, 0);
			String invalidPassword = flib.readExcelData(EXCEL_PATH, "invaliddata", i, 1);
			
			lp.orangeHrmInvalidLogin(invalidUsername, invalidPassword);
			
		}
	}

}
