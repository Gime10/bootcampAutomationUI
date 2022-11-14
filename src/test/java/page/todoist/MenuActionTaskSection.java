package page.todoist;

import control.Button;
import org.openqa.selenium.By;

public class MenuActionTaskSection {

	public Button menuActionIcon =new Button(By.xpath("//button[@data-action-hint='task-overflow-menu' and @aria-label='Más acciones de tarea']"));
	public Button editTask =new Button(By.xpath("//div[@class='icon_menu_item__content' and text()='Editar tarea']"));

	public Button deleteTask=new Button(By.xpath("//div[@class='icon_menu_item__content' and text()='Eliminar tarea']"));
}
