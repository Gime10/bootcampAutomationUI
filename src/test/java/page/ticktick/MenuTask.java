package page.ticktick;

import control.Button;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;

public class MenuTask {


	public Button taskMenuButton=new Button(By.xpath("//ul[@id='project-ul']//div[@class='peer w-[18px] h-[18px] absolute right-0 top-1/2 -translate-y-1/2 opacity-0 group-hover:opacity-100 group-focus-visible:opacity-100 focus-visible:opacity-100 focus:opacity-100']"));
	public Button taskEditButton=new Button(By.xpath("//li[@data-menu-id='-projectEdit']"));
	public TextBox taskNewName=new TextBox(By.id("edit-project-name"));
	public Button taskSaveButton=new Button(By.xpath("//button[text()='Save']"));
	public Button taskDeleteButton=new Button(By.xpath("//li[@data-menu-id='-projectDelete']"));

}
