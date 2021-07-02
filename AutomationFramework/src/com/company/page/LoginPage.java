package com.company.page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

public static WebElement getloginButton(final WebDriver driver) {
	return driver.findElement(By.className("login"));
	
}
public static WebElement get_email(final WebDriver driver) {
	return driver.findElement(By.name("email_create"));
}
public static WebElement get_SubmitCreate(final WebDriver driver) {
	return driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span"));
}	
public static WebElement get_title(final WebDriver driver)	{
	return driver.findElement(By.id("id_gender1"));
}
public static WebElement get_FirstName(final WebDriver driver) {
	return driver.findElement(By.name("customer_firstname"));
}
public static WebElement get_LastName(final WebDriver driver) {
	return driver.findElement(By.name("customer_lastname"));
}	
public static WebElement get_password(final WebDriver driver) {
	return driver.findElement(By.name("passwd"));
}		
public static List<WebElement> get_Dob(final WebDriver driver) {
	List<WebElement>dob = new ArrayList<WebElement>();
	dob.add(driver.findElement(By.name("days")));
	dob.add(driver.findElement(By.name("months")));
	dob.add(driver.findElement(By.name("years")));
return dob;
}
public static WebElement get_Address(final WebDriver driver) {
	return driver.findElement(By.name("address1"))	;
}
public static WebElement get_City(final WebDriver driver) {
	return driver.findElement(By.name("city"))	;
}	
public static WebElement get_State(final WebDriver driver) {
	return driver.findElement(By.id("id_state"))	;
}	
public static WebElement get_ZipCode(final WebDriver driver) {
	return driver.findElement(By.id("postcode"))	;
}	
public static WebElement get_Contact(final WebDriver driver) {
	return driver.findElement(By.id("phone_mobile"))	;
}
public static WebElement get_alias (final WebDriver driver) {
	return driver.findElement(By.id("alias"));
}

public static WebElement register(WebDriver driver) {
	// TODO Auto-generated method stub
	return driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span"));
}
public static WebElement get_username(WebDriver driver) {
	// TODO Auto-generated method stub
	return driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
}
}
