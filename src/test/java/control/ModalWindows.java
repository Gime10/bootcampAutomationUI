package control;

import org.openqa.selenium.By;
import session.Session;

import javax.swing.text.AsyncBoxView;

public class ModalWindows extends Control{
	public ModalWindows(By locator) {
		super(locator);
	}

	public void switchModal()
	{
		this.find();

		Session.getInstance().getBrowser().switchTo().activeElement();
				//.frame(this.control);
	}

}
