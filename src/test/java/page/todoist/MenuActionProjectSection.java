package page.todoist;

import control.Button;
import org.openqa.selenium.By;

public class MenuActionProjectSection {

	public Button deleteAction=new Button(By.xpath("//div[text()='Eliminar proyecto' ]"));
	public Button editAction=new Button(By.xpath("//div[text()='Editar proyecto' ]"));



}
