package AppPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Step2 {
	        // variables
			private WebDriver driver;
			// locators
			private By AuctionName = By.xpath("//input[contains(@placeholder, 'Auction Name']");
			private By MainCategory = By.xpath("//input[contains(@placeholder, 'Select Category']");
			private By SelectMainCategory = By.xpath("//*[contains(@text,'FURNITURE & FURNISHINGS FITTINGS')]");
			private By SubCategory = By.xpath("//input[contains(@placeholder, 'Select subcategory']");
			private By SelectSubCategory = By.xpath("//*[contains(@text,'Furniture , Furnishings')]");
			private By Brand = By.xpath("//input[contains(@placeholder, 'Select Brand']");
			private By ChooseBrand = By.xpath("//*[contains(@text,'3M')]");
			private By Type = By.xpath("//input[contains(@placeholder, 'Select Type']");
			private By ChooseType = By.xpath("//*[contains(@text,'Chairs')]");
			private By QuantityField = By.xpath("//input[contains(@placeholder, 'Quantity']");
			private By AuctionDetailsField = By.xpath("//*[contains(@text,'mce-content-body')]");
			private By ChooseMainImage = By.xpath("//*[contains(@class,'Main Image')]");
			private By NextStep3= By.xpath("//*[contains(@class,'btn btn-buy continue')]");

			
			// constructor
			public Step2(WebDriver driver) {
				this.driver = driver;

            }
			// keywords / actions
			public void EnterAuctionName(String query) {
				driver.findElement(AuctionName).sendKeys(query);
			}
			public  void OpenMainCatogery() {
				driver.findElement(MainCategory).click();
			}
			public  void SelectItemMainCatogery() {
				driver.findElement(SelectMainCategory).click();
			}
			public  void OpenSubCatogery() {
				driver.findElement(SubCategory).click();
			}
			public  void SelectItemSubCatogery() {
				driver.findElement(SelectSubCategory).click();
			}
			public  void OpenBrandList() {
				driver.findElement(Brand).click();
			}
			public  void SelectItemBrandList() {
				driver.findElement(ChooseBrand).click();
			}
			public  void OpenTypeList() {
				driver.findElement(Type).click();
			}
			public  void SelectItemTypeList() {
				driver.findElement(ChooseType).click();
			}
			public void EnterQuantityNumber(String query) {
				driver.findElement(QuantityField).sendKeys(query);
			}
			public void EnterAuctionDetails(String query) {
				driver.findElement(AuctionDetailsField).sendKeys(query);
			}
			public void UploadMainImage(String query) {
				driver.findElement(ChooseMainImage).sendKeys(query);
			}
			public  void ClickonNextStep3() {
				driver.findElement(NextStep3).click();
			}
}
