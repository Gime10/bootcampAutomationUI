package page.todoist;

import control.Button;
import control.Iframe;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DeleteProjectForm {
	public WebElement modalAcceptButton;

	public Iframe deleteForm =new Iframe(By.xpath("//div[@aria-labelledby='confirm-dialog-title']"));

	public Button deleteButton=new Button(By.xpath("//button[@class='a8af2163 _3d1243b2 _352995bd c6a2474f _56a651f6']"));



}
