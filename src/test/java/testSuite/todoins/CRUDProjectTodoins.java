package testSuite.todoins;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;
import util.GetpropertiesTodoins;

import java.util.Date;

public class CRUDProjectTodoins extends TestBase{

	String mailTodoinst= GetpropertiesTodoins.getInstance().getMail();
	String passTodoinst=GetpropertiesTodoins.getInstance().getPwd();
	String nameProject="test"+new Date().getTime();
	String nameUpdate="update"+new Date().getTime();


	@Test
	public void CRUDProjectTodoins() throws InterruptedException {

		//Login to page https://todoist.com/
		mainTodoins.login.click();
		loginSection.loginTodoins(mailTodoinst,passTodoinst);
		Assertions.assertTrue(menu.home.isControlDisplayed(),"ERROR! the login was failed");

		// New Project is created
		projectSection.buttonProjectSection.click();
		bodyProjectSection.addNewProject.click();
		addProjectView.nameProject.setText(nameProject);
		addProjectView.addButton.click();

		Assertions.assertTrue(projectSection.isProjectDisplayedInList(nameProject),"ERROR! the project is not created");

		//Update project
		menuProject.actionsproject.click();
		actions.editAction.click();
		editProject.editInput.cleanSetText(nameUpdate);
		editProject.saveEdit.click();
		Assertions.assertTrue(projectSection.isProjectDisplayedInList(nameUpdate),"ERROR! the project is not updated");

		// Delete the project recently created
		projectSection.ClickOnProjectCreated(nameUpdate);
		menuProject.actionsproject.click();
		actions.deleteAction.click();
		DeleteDialog.deleteForm.click();
		DeleteDialog.deleteButton.click();
		Assertions.assertFalse(projectSection.isProjectDisplayedInList(nameUpdate),"ERROR! The project was not deleted");

	}


}
