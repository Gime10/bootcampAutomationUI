package page.yopmail;

import control.Button;
import control.Label;
import org.openqa.selenium.By;
import control.TextBox;
import util.GetPropertiesYopmail;

public class CreateMail{

	public TextBox newNameLabel = new TextBox(By.id("login"));
	public Button newMailButton = new Button(By.xpath("//button[@class='md']"));

	public Label labelCreated= new Label(By.xpath("//div[@class='bname']"));
	String mail= GetPropertiesYopmail.getInstance().getMail();
	public CreateMail(){}

	public void Create(){
		newNameLabel.setText(mail);
		newMailButton.click();
	}
	public String CreatedMailDisplayed()
	{
	String actualResult =labelCreated.getText();
	return actualResult;
	}
	public String NameMailCreated(String NameMail){

	String expectedResult= NameMail.toLowerCase()+"@yopmail.com";
	return  expectedResult;
	}
}
