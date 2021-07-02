package applications;

import org.testng.annotations.Test;

import com.company.action.LoginAction;
import com.company.page.HomePage;
import com.company.page.LoginPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import utility.Browsers;
import utility.ReadProperties;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.BeforeSuite;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class LoginHome {
	WebDriver driver;
	private Properties prop;
	public Browsers br;
	public static ExtentReports report;
	public static ExtentTest test;
	
@BeforeSuite
public void beforeSuite(){
	report=new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html");
	test=report.startTest("ExtentDemo");
}
  @BeforeClass
  public void beforeClass() throws Exception {
	  String title="My Store";
	  prop=new ReadProperties().readProperties("inputData");
	  br=new Browsers();
	  driver=br.launchBrowser(prop.getProperty("browser"));
	  driver.get(prop.getProperty("url"));
	  if(driver.getTitle().equals(title))
	  {
	  test.log(LogStatus.PASS, "Navigated to the specified URL");
	  }
	  else
	  {
	  test.log(LogStatus.FAIL, "Test Failed");
	  }
	  
  }
@Test(priority=1)
public void personalDetails()throws Exception {
	Thread.sleep(3000);
	 String info="Your personal information";
	LoginAction loginAction=new LoginAction(driver);
	
	LoginPage.getloginButton(driver).click();
	Thread.sleep(3000);
	loginAction.signUpEmail(prop.getProperty("email"));
	Thread.sleep(3000);
	LoginPage.get_SubmitCreate(driver).click();
	Thread.sleep(3000);
    LoginPage.get_title(driver).click();
	Thread.sleep(1000);
	loginAction.customer_name(prop.getProperty("fname"),prop.getProperty("lname"));
	Thread.sleep(1000);
	loginAction.customer_password(prop.getProperty("pwd"));
	Select day=new Select(LoginPage.get_Dob(driver).get(0));
	day.selectByIndex(2);
	Select month=new Select(LoginPage.get_Dob(driver).get(1));
	month.selectByIndex(11);
	Select year=new Select(LoginPage.get_Dob(driver).get(2));
	year.selectByIndex(11);	
	
	
}
  @Test(priority=2)
  public void addressDetails()throws Exception{
	  String msgCheck="Welcome to your account.";
	    LoginAction loginAction=new LoginAction(driver);
	    loginAction.customer_address(prop.getProperty("address"));
	    Thread.sleep(2000);
	    loginAction.customer_city(prop.getProperty("city"));  
	    Select state=new Select(LoginPage.get_State(driver));
	    state.selectByIndex(6);
	    loginAction.customer_pinCode(prop.getProperty("postcode"));
	    loginAction.custumer_contact(123456789);
	    loginAction.customer_AliasAddress(prop.getProperty("address"));
	    LoginPage.register(driver).click();
	    Assert.assertEquals(LoginPage.get_username(driver).getText(),"Alex Carey");
	    if(driver.findElement(By.xpath("//*[@id=\"center_column\"]/p")).getText().contains(msgCheck)) {
	    	test.log(LogStatus.PASS, "User Account Created");
	    }
	    else {
	    	  test.log(LogStatus.FAIL, "Test Failed");
	    }
  }
  
  
  @Test(priority=3)
  public void commoditySelect()throws Exception {
	  String status="complete";
	  Actions action = new Actions(driver);  
	  WebElement dress = HomePage.clickDress(driver);
	  WebElement dressType=HomePage.dressType(driver);
	  Thread.sleep(3000);
	  action.moveToElement(dress).moveToElement(dressType).click().build().perform();
	  WebElement addToCart=HomePage.addToCart(driver);
	  action.moveToElement(addToCart).click().build().perform();
	  String cartStatus="Product successfully added to your shopping cart";
	  System.out.println(driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/h2")).getAttribute("innerText"));
	  if(driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/h2")).getAttribute("innerText").contains(cartStatus)) {
	    	test.log(LogStatus.PASS, "Item Added to Cart");
	    }
	    else {
	    	  test.log(LogStatus.FAIL, "Test Failed");
	    }
	  HomePage.proceedToCheckout(driver).click();
	  Thread.sleep(1000);
	  HomePage.shoppingCartCheckout(driver).click();
	  Thread.sleep(1000);
	  HomePage.addressCheckout(driver).click();
	  Thread.sleep(1000);
	  HomePage.checkbox(driver).click();
	  Thread.sleep(1000);
	  HomePage.shippingCheckout(driver).click();
	  Thread.sleep(1000);
	  HomePage.paymentMethod1(driver).click();
	  Thread.sleep(1000);
	  HomePage.orderConfirmation(driver).click();
	  if(HomePage.status(driver).getText().contains(status)) {
	    	test.log(LogStatus.PASS, "Order Confirmed");
	    }
	    else {
	    	  test.log(LogStatus.FAIL, "Test Failed");
	    }
	  
  }
  
  @AfterClass
  public void afterClass() {
	  report.endTest(test);
	  report.flush();
  driver.quit();
  }

}
