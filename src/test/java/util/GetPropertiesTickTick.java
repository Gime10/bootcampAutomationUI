package util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GetPropertiesTickTick {

	private static GetPropertiesTickTick getPropertiesTickTick= null;
	private String browser;
	private String host;
	private String mail;
	private String pwd;


	private GetPropertiesTickTick(){
		Properties properties = new Properties();
		String nameFile="ticktick.properties";
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(nameFile);
		if(inputStream!= null){
			try {
				properties.load(inputStream);
				browser=properties.getProperty("browser");
				host=properties.getProperty("host");
				mail=properties.getProperty("mail");
				pwd=properties.getProperty("pwd");

			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
	}

	public static GetPropertiesTickTick getInstance(){
		if (getPropertiesTickTick == null)
			getPropertiesTickTick=new GetPropertiesTickTick();
		return getPropertiesTickTick;
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
		return pwd;
	}

}
