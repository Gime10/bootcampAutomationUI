package page.todoist;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class EditProjectForm {

	public TextBox editInput=new TextBox(By.id("edit_project_modal_field_name"));
	public Button  saveEdit=new Button(By.xpath("//button[@class='ist_button ist_button_red' ]"));
}
