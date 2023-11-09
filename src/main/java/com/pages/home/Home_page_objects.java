package com.pages.home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

import io.appium.java_client.android.AndroidDriver;

public class Home_page_objects {
	public AndroidDriver driver;
	
	/**
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	@FindBy(xpath="")
	private WebElement sign_up_successfull_text_pop_up;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Home\"]/android.view.ViewGroup")
	private WebElement home_button_in_blue;
	
	/**
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */


	public Home_page_objects(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 *
	 */
	
	public boolean sign_up_successfull_text_in_pop_up_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, sign_up_successfull_text_pop_up);
			return sign_up_successfull_text_pop_up.isDisplayed();
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, sign_up_successfull_text_pop_up);
			return sign_up_successfull_text_pop_up.isDisplayed();
		}
	}
	
	public boolean home_button_in_blue_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 15, home_button_in_blue);
			return home_button_in_blue.isDisplayed();
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 15, home_button_in_blue);
			return home_button_in_blue.isDisplayed();
		}
	}
	
	
}
