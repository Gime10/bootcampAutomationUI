package testSuite.ticktick;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;
import testSuite.ticktick.TestBase;

import java.util.Date;

import static java.lang.Thread.*;
import static util.GetPropertiesTickTick.*;

public class CRUDTask extends  TestBase {


		@Test
		public void verifyCRUDTask() throws InterruptedException {
			String taskName="MOJIX";
			String taskNameUpdated="-UPDATED";
			// login
			String mail= getInstance().getMail();
			String password= getInstance().getPwd();
			mainPage.signUpFreeButton.click();
			loginSection.login(mail,password);
			Assertions.assertTrue(inboxSection.inboxTitle.isControlDisplayed(),"ERROR! the login was failed");

			// Create task
			taskSection.list.hover();
			taskSection.menuList.click();
			addTaskSection.taskName.setText(taskName);
			addTaskSection.saveButton.click();
			Thread.sleep(4000);
			Assertions.assertTrue(taskSection.isTaskDisplayedInList(taskName),"ERROR! the task was not created");

           // edit Task
			taskSection.hoverOnTask(taskName);
			menuTask.taskMenuButton.click();
			menuTask.taskEditButton.click();
			menuTask.taskNewName.setText(taskNameUpdated);
			menuTask.taskSaveButton.click();
			Thread.sleep(4000);
			Assertions.assertTrue(taskSection.isTaskDisplayedInList(taskName+taskNameUpdated),"ERROR! the task was not updated");


			//Delete Task
			taskSection.hoverOnTask(taskName+taskNameUpdated);
			menuTask.taskMenuButton.click();
			menuTask.taskDeleteButton.click();

			modalDeleteSection.modalDelete.switchModal();
			modalDeleteSection.taskPopupDeleteButton.click();
			Thread.sleep(4000);
			//menuTask.taskPopupDeleteButton.click();

			/*
			projectSection.clickOnProject(projectCreated);
			projectSection.menuProjectSection.menuIconButton.click();
			projectSection.menuProjectSection.editButton.click();
			projectSection.editProjectTxtBox.cleanSetText(projectUpdated);
			projectSection.saveButton.click();
			Assertions.assertTrue(projectSection.isProjectDisplayedInList(projectUpdated),"ERROR! the project was not updated");

			projectSection.clickOnProject(projectUpdated);
			projectSection.menuProjectSection.menuIconButton.click();
			projectSection.menuProjectSection.deleteButton.click();
			Session.getInstance().acceptAlert();
			projectSection.getProject(projectUpdated).waitControlIsNotInThePage();
			Assertions.assertFalse(projectSection.isProjectDisplayedInList(projectUpdated),"ERROR! the project was not deleted");
*/
		}

	}
