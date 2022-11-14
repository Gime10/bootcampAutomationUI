package page.todoist;

import control.Button;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;

public class BodyTaskSection {

	public Button addTaskAction=new Button(By.xpath("//button[@class='plus_add_button' ]"));
	public TextBox NameTask=new TextBox(By.xpath("//div[@class='public-DraftStyleDefault-block public-DraftStyleDefault-ltr' ]"));
	public Button  buttonAddTask=new Button(By.xpath("//span[@class='bbdb467b c6a2474f _48affbca _57850d52' and text()='Añadir tarea']"));

	public Label taskhover=new Label(By.xpath("//div[@class='task_list_item__content']"));
	public BodyTaskSection() {}

	public boolean IsTaskInList(String name){
		Label taskCreated=new Label(By.xpath("//div[text()='"+name+"' ]"));
		return taskCreated.isControlDisplayed();
	}
}


