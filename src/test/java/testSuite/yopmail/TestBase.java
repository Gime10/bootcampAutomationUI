package testSuite.yopmail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import page.yopmail.*;
import session.Session;
import util.GetPropertiesYopmail;


public class TestBase {
	CreateMail pageYopmail = new CreateMail();
	InboxMenuSection imboxMenu = new InboxMenuSection();
	DataMessageSection dataMessage =new DataMessageSection();



	@BeforeEach
	public void openBrowser(){
		// todo create property file
		Session.getInstance().getBrowser().get(GetPropertiesYopmail.getInstance().getHost());
	}

	@AfterEach
	public void closeBrowser(){
		Session.getInstance().closeSession();
	}

}
