package page.todoist;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class AddProjectSection {

	public TextBox nameProject=new TextBox(By.id("edit_project_modal_field_name"));

	public Button addButton=new Button(By.xpath("//button[@class='ist_button ist_button_red' ]"));
}
