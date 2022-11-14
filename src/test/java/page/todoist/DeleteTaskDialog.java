package page.todoist;

import control.Button;
import control.Iframe;
import org.openqa.selenium.By;

public class DeleteTaskDialog {

	public Iframe deleteTask =new Iframe(By.xpath("//div[@class='_31956461 c6a2474f _04f32a92 eb8408ce _6cce36ca _57850d52 _64eb02c8 _51ff4c0f']"));

	public Button deleteButton=new Button(By.xpath("//span[@class='bbdb467b c6a2474f _48affbca _57850d52' and text()='Eliminar']"));

}
