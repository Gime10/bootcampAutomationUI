package session;

import browser.FactoryBrowser;
import control.Iframe;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.xml.sax.Locator;
import util.GetProperties;

public class Session {
     private static Session instance=null;
     private WebDriver browser;
     private Session(){
         browser= FactoryBrowser.make(GetProperties.getInstance().getBrowser()).create();
     }

     public static Session getInstance(){
         if (instance==null)
             instance=new Session();
         return instance;
     }

     public void closeSession(){
         browser.quit();
         instance=null;
     }

    public WebDriver getBrowser() {
        return browser;
    }

    public void acceptAlert() {
        browser.switchTo().alert().accept();
    }
}