package com.company.action;

import org.openqa.selenium.WebDriver;
import com.company.page.LoginPage;

public class LoginAction {
	WebDriver driver;
	
	public LoginAction(WebDriver driver) {
		this.driver=driver;
	}
public void signUpEmail(String email ) {
LoginPage.get_email(driver).sendKeys(email);	
}
public void customer_name(String firstName,String lastName) {
	LoginPage.get_FirstName(driver).sendKeys(firstName);
	LoginPage.get_LastName(driver).sendKeys(lastName);
}
public void customer_password(String password) {
	LoginPage.get_password(driver).sendKeys(password);
}
public void customer_address(String address) {
	LoginPage.get_Address(driver).sendKeys(address);
}
public void customer_city(String city) {
	LoginPage.get_City(driver).sendKeys(city);
}
public void custumer_contact(long mobile){
	Long mob=mobile;
	LoginPage.get_Contact(driver).sendKeys(mob.toString());
}
public void customer_AliasAddress(String address) {
	LoginPage.get_Address(driver).sendKeys(address);
}

public void customer_pinCode(String postCode) {
	LoginPage.get_ZipCode(driver).sendKeys(postCode);
}

}
