package page.todoist;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class LoginSection {

	public TextBox mailTextBox =new TextBox(By.id("element-0"));
	public TextBox passTexBox =new TextBox(By.id("element-3"));
	public Button sendButton=new Button(By.xpath("//button[@data-gtm-id='start-email-login']"));

	public void loginTodoins(String mail, String pwd){
		mailTextBox.setText(mail);
		passTexBox.setText(pwd);
		sendButton.click();
	}
}
