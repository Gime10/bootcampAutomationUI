package page.todoist;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class ProjectSection {

	public Button buttonProjectSection =new Button(By.xpath("//a[@class='c6a2474f _04f32a92 cc313af7 b7b3664a ee7114e6 _57850d52']"));

	public ProjectSection() {
	}


	public boolean isProjectDisplayedInList(String nameProject){
		Label projectCreated = new Label(By.xpath("//span[text()='"+nameProject+"' ]"));
		return projectCreated.isControlDisplayed();
	}


	public void ClickOnProjectCreated(String nameProject){
		Button projectCreated=new Button(By.xpath("//span[text()='"+nameProject+"' ]"));
		projectCreated.click();
	}


}
