package testSuite.ticktick;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import page.ticktick.*;
import session.Session;
import util.GetPropertiesTickTick;

public class TestBase {
	MainPage mainPage= new MainPage();
	LoginSection loginSection = new LoginSection();

	InboxSection inboxSection=new InboxSection();
	TaskSection taskSection=new TaskSection();
	AddTaskSection addTaskSection=new AddTaskSection();
	MenuTask menuTask=new MenuTask();

	ModalDeleteSection modalDeleteSection=new ModalDeleteSection();


	@BeforeEach
	public void openBrowser(){
		// todo create property file
		Session.getInstance().getBrowser().get(GetPropertiesTickTick.getInstance().getHost());
	}

	@AfterEach
	public void closeBrowser(){
		Session.getInstance().closeSession();
	}

}
