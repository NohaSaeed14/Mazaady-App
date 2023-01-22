package AppPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Step3 {
	       // variables
			private WebDriver driver;

			// locators
			private By SellingType = By.name("selling_type");
			private By ChooseSellingType = By.xpath("//input[@value='ESTIMATION VALUE']");
			private By BuyNowValue = By.xpath("//input[contains(@placeholder, 'Buy Now Value']");
			private By StartingBidValue = By.xpath("//input[contains(@placeholder, 'Starting Bid Value']");
			private By EstimatedValue = By.xpath("//input[contains(@placeholder, 'Estimated Value']");
			private By DateField = By.xpath("//input[contains(@placeholder, 'Date']");
			private By ChooseDate = By.id("mddtp-date__ok");
			private By TimeField = By.xpath("//input[contains(@placeholder, 'Time']");
			private By ChooseTime = By.id("mddtp-time__ok");
			private By AuctionShowType = By.xpath("//span[contains(@class, 'switcher') and contains(text(), 'ON')]");
			private By NextStep4= By.xpath("//*[contains(@class,'btn btn-buy continue')]");
			private By AddProduct = By.xpath("//input[@type='submit']");
			private By SuccessMessage = By.xpath("//*[contains(@text,'product added successfully')]");

			// constructor
			public Step3(WebDriver driver) {
				this.driver = driver;
			}
			// keywords / actions
			public  void OpenSellingType() {
				driver.findElement(SellingType).click();
			
            }
			public  void ChooseItemSellingType() {
				driver.findElement(ChooseSellingType).click();
			}
			public void EnterBuyNowValue(String query) {
				driver.findElement(BuyNowValue).sendKeys(query);
			}
			public void EnterStartingBidValue(String query) {
				driver.findElement(StartingBidValue).sendKeys(query);
			}
			public void EnterEstimatedValue(String query) {
				driver.findElement(EstimatedValue).sendKeys(query);
			}
			public  void OpenCalendar() {
				driver.findElement(DateField).click();
			
            }
			public  void ChooseDateField() {
				driver.findElement(ChooseDate).click();
			
           }
			public  void OpenTime() {
				driver.findElement(TimeField).click();
			
           }
			public  void ChooseTimeField() {
				driver.findElement(ChooseTime).click();
		   }
				public  void ChooseAuctionShowType() {
					driver.findElement(AuctionShowType).click();
				}
				public  void ClickonNextStep4() {
					driver.findElement(NextStep4).click();
				}	
				public  void ClickonAddProduct() {
					driver.findElement(AddProduct).click();
				}
				
				public boolean CheckaddedProduct() {
					return driver.findElement(SuccessMessage).isDisplayed();
				}
}
			
