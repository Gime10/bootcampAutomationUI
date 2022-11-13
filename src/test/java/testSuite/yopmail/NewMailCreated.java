package testSuite.yopmail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import util.GetPropertiesYopmail;

public class NewMailCreated extends TestBase{
	@Test
	public void NewMailCreated(){

		String nameMail=GetPropertiesYopmail.getInstance().getMail();
        pageYopmail.Create();
		Assertions.assertEquals(pageYopmail.CreatedMailDisplayed(), pageYopmail.NameMailCreated(nameMail),"El mail no fue creado");

	}


}

