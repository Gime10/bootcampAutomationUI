package testSuite.yopmail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import page.yopmail.DataMessageSection;
import session.Session;
import util.GetPropertiesYopmail;

public class NewMessageCreated extends TestBase{
	@Test
	public void NewMessageCreated(){

		String nameMail=GetPropertiesYopmail.getInstance().getMail()+"@yopmail.com";
		String subject="Test 1";
		String message="Mensaje de prueba";
		pageYopmail.Create();
		imboxMenu.createMessage.click();
		dataMessage.iFrame.switchIframe();
		dataMessage.toMessage.setText(nameMail);
		dataMessage.subject.setText(subject);
		dataMessage.bodyTextMessage.setText(message);
		dataMessage.sendMessage.click();
		dataMessage.iFrame.leaveIframe();
		imboxMenu.iframeInbox.switchIframe();
		Assertions.assertTrue(imboxMenu.nameMailReceivedListed(nameMail),"El mail no fue creado");


	}

}
