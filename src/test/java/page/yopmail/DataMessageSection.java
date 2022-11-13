package page.yopmail;

import control.AreaTextBox;
import control.Button;
import control.Iframe;
import control.TextBox;
import org.openqa.selenium.By;

public class DataMessageSection {
	public TextBox toMessage =new TextBox(By.id("msgto"));
	public TextBox subject =new TextBox(By.id("msgsubject"));
	public AreaTextBox bodyTextMessage =new AreaTextBox((By.id("msgbody")));
	public  Button sendMessage =new Button(By.id("msgsend"));

	public Iframe iFrame =new Iframe(By.id("ifmail"));

     public boolean MessageIsDisplayed(String Text)
	{
		AreaTextBox BodyText=new AreaTextBox(By.xpath("//div[text()='"+Text+"']"));
		return BodyText.isControlDisplayed();
	}




}
