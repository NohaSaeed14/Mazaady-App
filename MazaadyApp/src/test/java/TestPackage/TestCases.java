package TestPackage;

import java.awt.Menu;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AppPages.Home;
import AppPages.Step1;
import AppPages.Step2;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCases {
	private WebDriver driver;

	private AppPages.Home home;
	private AppPages.Step1 Step1;
	private AppPages.Step2 Step2;
	private AppPages.Step3 Step3;


	@Test
	public void assertThatProductAddedSuccessfully() {
		home.EnterEmail("test22@gmail.com");
		home.EnterPassword("123456789");
		home.ClickOnLogin();
		Step1.ClickonMenuList();
		Step1.ClickonAddProduct();
		Step1.ClickonNextStep();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		
		Step2.EnterAuctionName("International Auction");
		Step2.OpenMainCatogery();
		Step2.SelectItemMainCatogery();
		Step2.OpenSubCatogery();
		Step2.SelectItemSubCatogery();
		Step2.OpenBrandList();
		Step2.SelectItemBrandList();
		Step2.OpenTypeList();
		Step2.SelectItemTypeList();
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,350)", "");
		Step2.EnterQuantityNumber("1");
		Step2.EnterAuctionDetails("Overall, the chair is 39-1/2” high x 25” wide x 25” deep. The seat is 16” x 20”, which accommodates most frames. The seat is 16-3/4” high, an ideal height for most operations and most sitters. And the back reclines at 14°, which makes it suitable for dining, keyboarding and relaxing");
		Step2.UploadMainImage("C:\\Users\\dell\\OneDrive\\Desktop\\Chair.png");
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Step2.ClickonNextStep3();
		Step3.OpenSellingType();
		Step3.ChooseItemSellingType();
		Step3.EnterBuyNowValue("500");
		Step3.EnterStartingBidValue("10");
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Step3.EnterEstimatedValue("60");
		Step3.OpenCalendar();
		Step3.ChooseDateField();
        Step3.OpenTime();
        Step3.ChooseTimeField();
        Step3.ChooseAuctionShowType();
        JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Step3.ClickonNextStep4();
		Step3.ClickonAddProduct();
		Step3.CheckaddedProduct();
		boolean CheckaddedProduct = Step3.CheckaddedProduct();
		Assert.assertTrue(CheckaddedProduct);
	}


	
	@BeforeMethod
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		home = new Home(driver);
		home.navigate();



    }
	@AfterMethod
	public void afterMethod() {
	driver.quit();
	}
}
