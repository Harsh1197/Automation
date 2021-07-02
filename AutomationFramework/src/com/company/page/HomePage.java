package com.company.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public static WebElement clickDress(final WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"));		
	}
	//*[@id="category"]
	public static WebElement dressType(final WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[1]/a"));		
	}
	public static WebElement addToCart(final WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span"));		
	}
	public static WebElement proceedToCheckout(final WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));		
	}
	public static WebElement shoppingCartCheckout(final WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));		
	}
	public static WebElement confirmAddressCheckout(final WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));		
	}
	public static WebElement addressCheckout(final WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span"));	
		
	}
	public static WebElement checkbox(final WebDriver driver) {
		return driver.findElement(By.id("cgv"));		
	}
	public static WebElement shippingCheckout(final WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span"));		
	}
	public static WebElement paymentMethod1(final WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a"));		
	}
	public static WebElement paymentMethod2(final WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a"));		
	}
	public static WebElement orderConfirmation(final WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span"));		
	}
	public static WebElement status(final WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/p/strong"));		
	}
	
	
}
