package AppPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Home {
	// variables
	private WebDriver driver;
	private String url = "https://staging.mazaady.com/login";

	// locators
	private By EmailField = By.name("email");
	private By PasswordField = By.name("password");
	private By LoginButton=  By.xpath("//*[contains(@type,'Submit')]");


	// constructor
	public Home(WebDriver driver) {
		this.driver = driver;
	}

	// keywords / actions
	public void navigate() {
		driver.navigate().to(url);
	}

	public void EnterEmail(String query) {
		driver.findElement(EmailField).sendKeys("test22@gmail.com");
	}
	public void EnterPassword(String query) {

		driver.findElement(PasswordField).sendKeys("123456789");

	}
	
	public void ClickOnLogin() {

		driver.findElement(By.id("submit")).click();

    }
}
