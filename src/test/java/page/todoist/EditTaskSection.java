package page.todoist;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class EditTaskSection {

	public TextBox editName=new TextBox(By.xpath("//div[@class='public-DraftStyleDefault-block public-DraftStyleDefault-ltr' ]"));
	public Button saveEditTask=new Button(By.xpath("//span[@class='bbdb467b c6a2474f _48affbca _57850d52' and text()='Guardar' ]"));
}
