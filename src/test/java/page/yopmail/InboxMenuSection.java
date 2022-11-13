package page.yopmail;

import control.Button;
import control.Iframe;
import control.Label;
import org.openqa.selenium.By;

public class InboxMenuSection {

	public Button createMessage =new Button(By.id("newmail"));
	public Button updateMessage=new Button(By.id("refresh"));
	public Button deleteMessage=new Button(By.id("delsel"));
	public Iframe iframeInbox=new Iframe(By.id("ifinbox"));


	public boolean nameMailReceivedListed(String nameMailReceived)
	{

		Label nameMail =new Label(By.xpath("//span[text()='"+nameMailReceived+"']"));
		return  nameMail.isControlDisplayed();
	}
	public boolean SubjectReceivedListed(String Subject)
	{
		Label subjectMail =new Label(By.xpath("//div[text()='"+Subject+"']"));
		return  subjectMail.isControlDisplayed();
	}
}
