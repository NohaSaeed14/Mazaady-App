package AppPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Step1 {
    	// variables
		private WebDriver driver;

		// locators
		private By Menu = By.xpath("//*[contains(@class,'action-icons-text')]");
		private By AddProduct = By.xpath("//a[@href,'https://staging.mazaady.com/add-product\']");
		private By NextStep = By.xpath("//*[contains(@class,'btn btn-buy continue')]");

		// constructor
		public Step1(WebDriver driver) {
			this.driver = driver;
		}
		// keywords / actions
		public  void ClickonMenuList() {
			driver.findElement(Menu).click();
			
        }
		public  void ClickonAddProduct() {
			driver.findElement(AddProduct).click();
		}
		public  void ClickonNextStep() {
			driver.findElement(NextStep).click();
		}
}
