package page.ticktick;

import control.Button;
import control.ModalWindows;
import org.openqa.selenium.By;

public class ModalDeleteSection {

   public ModalWindows modalDelete=new ModalWindows(By.xpath("//div[@class='popup fast-transition  z-[1] !outline-none']"));
	public Button taskPopupDeleteButton=new Button(By.xpath("//button[text()='Delete']"));
}
