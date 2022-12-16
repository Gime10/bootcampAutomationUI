package page.ticktick;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class TaskSection {

	public Label list=new Label(By.xpath("//a/p[text()='Lists']"));
	public Button menuList=new Button(By.xpath("//p[text()='Lists']/preceding::button[@class='add-icon w-[18px] h-[18px] flex-none opacity-0 group-hover:opacity-100 group-focus-visible:opacity-100 focus-visible:opacity-100 focus:opacity-100']"));


	public TaskSection(){}

	public void clickOnTask(String nameTask){
		Label TaskCreated = new Label(By.xpath("//p[text()='"+nameTask+"']"));
		TaskCreated.click();
	}
	public void hoverOnTask(String nameTask){
		Label TaskCreated = new Label(By.xpath("//p[text()='"+nameTask+"']"));
		TaskCreated.hover();
	}
	public boolean isTaskDisplayedInList(String nameTask){
		Label taskCreated = new Label(By.xpath("//p[text()='"+nameTask+"'] "));
		return taskCreated.isControlDisplayed();
	}
	public Label getTask(String nameTask){
		Label taskCreated = new Label(By.xpath("//p[text()='"+nameTask+"']"));
		return taskCreated;
	}
}
