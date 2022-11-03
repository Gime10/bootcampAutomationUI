package basicSelenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

import java.util.Date;

public class BasicSeleniumTask1 {


	WebDriver driver;

	@BeforeEach
	public void setup(){
		System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://todo.ly/");
	}

	@AfterEach
	public void cleanup(){
		driver.quit();
	}

	@Test
	public void verifyCRUDProject() throws InterruptedException {

		// login
		driver.findElement(By.xpath("//img[contains(@src,'pagelogin')]")).click();
		driver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail")).sendKeys("bootcamp@mojix44.com");
		driver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxPassword")).sendKeys("12345");
		driver.findElement(By.id("ctl00_MainContent_LoginControl1_ButtonLogin")).click();
		Thread.sleep(1000);
		Assertions.assertTrue(driver.findElement(By.id("ctl00_HeaderTopControl1_LinkButtonLogout")).isDisplayed()
				, "ERROR login was incorrect");

		// create
		String nameProject = "Gimena Mojix";
		driver.findElement(By.xpath("//td[text()='Add New Project']")).click();
		driver.findElement(By.id("NewProjNameInput")).sendKeys(nameProject);
		driver.findElement(By.id("NewProjNameButton")).click();
		Thread.sleep(1000);
		int actualResult = driver.findElements(By.xpath(" //td[text()='" + nameProject + "'] ")).size();
		Assertions.assertTrue(actualResult >= 1
				, "ERROR The project was not created");

		//nameProject = "Update" + new Date().getTime();
		// create new task
		String taskName = "Task01";
		driver.findElement(By.id("NewItemContentInput")).click();
		driver.findElement(By.id("NewItemContentInput")).sendKeys(taskName);
		driver.findElement(By.id("NewItemAddButton")).click();
		Thread.sleep(1000);

		//System.out.println(driver.findElements(By.xpath("//div[contains(@onclick,\"ItemList.EditItemText(this)\") and contains(@class,\"ItemContentDiv\") and contains(@style,\"color: rgb(0, 0, 0);\")]")).size());
		Assertions.assertTrue(driver.findElements(By.xpath("//div[contains(@onclick,'ItemList.EditItemText(this)') and contains(@class,'ItemContentDiv') and contains(@style,'color: rgb(0, 0, 0);')]")).size()>= 1
				, "ERROR the task was not created");

		// update
         String  newName="TaskUpdated";
		driver.findElement(By.xpath(" //div[text()='"+taskName+"' and @class='ItemContentDiv'] ")).click();
		Thread.sleep(4000);

		//driver.findElement(By.id("ItemEditTextbox")).click();
		driver.findElement(By.id("ItemEditTextbox")).sendKeys(newName);
		Thread.sleep(1000);
		driver.findElement(By.id("ItemEditTextbox")).sendKeys(Keys.ENTER);
		//String actual=driver.findElement(By.xpath("//div[@class='ItemContentDiv' and @style='color: rgb(0, 0, 0);'])");
		//Thread.sleep(1000);
		//System.out.println("El texto actual es :"+actual);
		//Assertions.assertTrue(driver.findElement(By.id("ItemEditTextbox")).getText() == ""
		//		, "ERROR The project was not removed");*/
	}
}
