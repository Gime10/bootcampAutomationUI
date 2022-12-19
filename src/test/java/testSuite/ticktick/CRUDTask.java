package testSuite.ticktick;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
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
			Thread.sleep(2000);
			addTaskSection.taskName.setText(taskName);
			addTaskSection.saveButton.click();
			Assertions.assertTrue(taskSection.isTaskDisplayedInList(taskName),"ERROR! the task was not created");

           // edit or update  Task
			taskSection.hoverOnTask(taskName);
			menuTask.taskMenuButton.click();
			menuTask.taskEditButton.click();
			menuTask.taskNewName.setText(taskNameUpdated);
			menuTask.taskSaveButton.click();
			Assertions.assertTrue(taskSection.isTaskDisplayedInList(taskName+taskNameUpdated),"ERROR! the task was not updated");


			//Delete Task
			taskSection.hoverOnTask(taskName+taskNameUpdated);
			menuTask.taskMenuButton.click();
			menuTask.taskDeleteButton.click();
			modalDeleteSection.modalDelete.switchModal();
			modalDeleteSection.taskPopupDeleteButton.click();
			Assertions.assertFalse(taskSection.isTaskDisplayedInList(taskName+taskNameUpdated),"ERROR! the task was not deleted");
		}

	}
