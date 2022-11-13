package util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GetPropertiesYopmail {
	private static GetPropertiesYopmail getPropertiesYopmail= null;
	private String browser;
	private String host;
	private String mail;


	private GetPropertiesYopmail(){
		Properties properties = new Properties();
		String nameFile="yopmail.properties";
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(nameFile);
		if(inputStream!= null){
			try {
				properties.load(inputStream);
				browser=properties.getProperty("browser");
				host=properties.getProperty("host");
				mail=properties.getProperty("mail");

			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
	}

	public static GetPropertiesYopmail getInstance(){
		if (getPropertiesYopmail == null)
			getPropertiesYopmail=new GetPropertiesYopmail();
		return getPropertiesYopmail;
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

}
