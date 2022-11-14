package util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GetpropertiesTodoins {

	private static GetpropertiesTodoins getpropertiesTodoins= null;
	private String browser;
	private String host;
	private String mail;
	private String password;

	private GetpropertiesTodoins(){
		Properties properties = new Properties();
		String nameFile="todoins.properties";
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(nameFile);
		if(inputStream!= null){
			try {
				properties.load(inputStream);
				browser=properties.getProperty("browser");
				host=properties.getProperty("host");
				mail=properties.getProperty("mail");
				password=properties.getProperty("pwd");

			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
	}

	public static GetpropertiesTodoins getInstance(){
		if (getpropertiesTodoins == null)
			getpropertiesTodoins=new GetpropertiesTodoins();
		return getpropertiesTodoins;
	}

	public String getBrowser() {
		return browser;
	}

	public String getHost() {
		return host;
	}
	public String getMail() {
		return mail;
	}

	public String getPwd() {
		return password;
	}
}

