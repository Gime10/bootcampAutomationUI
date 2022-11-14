package testSuite.todoins;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import page.todoist.ProjectSection;
import util.GetpropertiesTodoins;

import java.util.Date;

public class CRUDTaskTodoins extends TestBase {

	String mailTodoinst= GetpropertiesTodoins.getInstance().getMail();
	String passTodoinst=GetpropertiesTodoins.getInstance().getPwd();

	String nameProject="test";
	String nameTask="Test tarea";
	String nameUpdate=" Updated";
	@Test
	public void CRUDTaskTodoins() throws InterruptedException {

		//Login to page https://todoist.com/
		mainTodoins.login.click();
		loginSection.loginTodoins(mailTodoinst, passTodoinst);
		Assertions.assertTrue(menu.home.isControlDisplayed(), "ERROR! the login was failed");

		// New Project is created
		projectSection.buttonProjectSection.click();
		bodyProjectSection.addNewProject.click();
		addProjectView.nameProject.setText(nameProject);
		//addProjectView.nameProject.waitControlIsNotInThePage();
		addProjectView.addButton.click();

		Assertions.assertTrue(projectSection.isProjectDisplayedInList(nameProject), "ERROR! the project is not created");

		//New Task is created
		projectSection.ClickOnProjectCreated(nameProject);
		bodytask.addTaskAction.click();
		bodytask.NameTask.setText(nameTask);
		Thread.sleep(2000);
		bodytask.buttonAddTask.click();
		Assertions.assertTrue(bodytask.IsTaskInList(nameTask), "ERROR! the task was not created");

		//Update task name
        bodytask.taskhover.hover();
		menuActionTask.menuActionIcon.click();
		menuActionTask.editTask.click();
		editTaskAction.editName.setText(nameUpdate);
		Thread.sleep(2000);
		editTaskAction.saveEditTask.click();
		Assertions.assertTrue(bodytask.IsTaskInList(nameTask+nameUpdate), "ERROR! the task was not updated");

		//Delete task
		bodytask.taskhover.hover();
		menuActionTask.menuActionIcon.click();
		menuActionTask.deleteTask.click();
		deleteDialog.deleteTask.click();
		deleteDialog.deleteButton.click();
		Assertions.assertFalse(bodytask.IsTaskInList(nameTask+nameUpdate), "ERROR! the task was not deleted");

	}
	}
