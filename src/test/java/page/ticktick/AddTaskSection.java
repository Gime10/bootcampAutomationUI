package page.ticktick;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class AddTaskSection {

	public TextBox taskName=new TextBox(By.id("edit-project-name"));
	public Button  saveButton=new Button(By.xpath("//button[text()='Save']"));
}
