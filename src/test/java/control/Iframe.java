package control;

import org.openqa.selenium.By;
import session.Session;

public class Iframe extends Control{


	public Iframe(By locator) {
		super(locator);
	}

	public void switchIframe()
	{
		this.find();
		Session.getInstance().getBrowser().switchTo().frame(this.control);
	}
	public void leaveIframe()
	{
		Session.getInstance().getBrowser().switchTo().defaultContent();
	}
}
