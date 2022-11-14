package testSuite.todoins;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import page.todoist.*;
import session.Session;
import util.GetpropertiesTodoins;

public class TestBase {

	MainPage mainTodoins =new MainPage();
	LoginSection loginSection=new LoginSection();

	MenuSection menu=new MenuSection();

	ProjectSection projectSection=new ProjectSection();

	BodyProjectSection bodyProjectSection= new BodyProjectSection();
	AddProjectSection addProjectView=new AddProjectSection();
	MenuProjectSection menuProject=new MenuProjectSection();
	MenuActionProjectSection actions=new MenuActionProjectSection();
	DeleteProjectForm DeleteDialog= new DeleteProjectForm();

	EditProjectForm editProject=new EditProjectForm();

	BodyTaskSection bodytask=new BodyTaskSection();
	MenuActionTaskSection menuActionTask=new MenuActionTaskSection();
	EditTaskSection editTaskAction=new EditTaskSection();
	DeleteTaskDialog deleteDialog=new DeleteTaskDialog();


	@BeforeEach
	public void openBrowser(){
		// todo create property file
		Session.getInstance().getBrowser().get(GetpropertiesTodoins.getInstance().getHost());
	}

	@AfterEach
	public void closeBrowser(){
		Session.getInstance().closeSession();
	}

}
