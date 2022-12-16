package page.ticktick;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class LoginSection {
	public TextBox emailTxtBox = new TextBox(By.id("emailOrPhone"));
	public TextBox passwordTxtBox = new TextBox(By.id("password"));
	public Button loginButton= new Button(By.xpath("//button[@class='button__3eXSs ']"));


	public void login(String mail, String pwd){
		emailTxtBox.setText(mail);
		passwordTxtBox.setText(pwd);
		loginButton.click();
	}
}
