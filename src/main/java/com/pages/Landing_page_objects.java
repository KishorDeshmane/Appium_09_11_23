package com.pages;

import java.util.List;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

import io.appium.java_client.android.AndroidDriver;

public class Landing_page_objects {
	public AndroidDriver driver;
	
	
	@FindBy(className="android.widget.ImageView")
	private WebElement splash_screen_logo;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Enter as Guest\"]")
	private WebElement landing_page_enter_as_guest_link;

	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
	private WebElement enter_as_guest_coming_soon_pop_up;
	
	@FindBy(className="android.widget.ImageView")
	private WebElement landing_page_logo_above_text;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
	private WebElement landing_page_movable_text_group;
	
	@FindBy(className="com.horcrux.svg.u")
	private List<WebElement> landing_page_movable_text_belows_dots;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView[3]")
	private WebElement landing_page_servicemen_image;

	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Sign Up\"]")
	private WebElement landing_page_sign_up_button;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Login\"]")
	private WebElement landing_page_log_in_button;
	
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public Landing_page_objects(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	public boolean splash_screen_logo_is_displayed() {
		try {
			return splash_screen_logo.isDisplayed();
		} catch (StaleElementReferenceException e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, splash_screen_logo);
			return splash_screen_logo.isDisplayed();
		}
	}
	
	public boolean enter_as_guest_link_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, landing_page_enter_as_guest_link);
			return landing_page_enter_as_guest_link.isEnabled();
		} catch (StaleElementReferenceException e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, landing_page_enter_as_guest_link);
			return landing_page_enter_as_guest_link.isEnabled();
		}	
	}
	
	public void enter_as_guest_link_is_clicked() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, landing_page_enter_as_guest_link);
		} catch (StaleElementReferenceException e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, landing_page_enter_as_guest_link);
		}	
		 landing_page_enter_as_guest_link.click();
	}
	
	public boolean pop_as_coming_soon_is_displayed(){
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, enter_as_guest_coming_soon_pop_up);
			return enter_as_guest_coming_soon_pop_up.isDisplayed();
		} catch (StaleElementReferenceException e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, enter_as_guest_coming_soon_pop_up);
			return enter_as_guest_coming_soon_pop_up.isDisplayed();
		}	
	}
	
	public boolean enter_as_guest_link_is_displayed(){
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, landing_page_enter_as_guest_link);
			return landing_page_enter_as_guest_link.isDisplayed();
		} catch (StaleElementReferenceException e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, landing_page_enter_as_guest_link);
			return landing_page_enter_as_guest_link.isDisplayed();
		}	
	}
	
	public boolean moving_text_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, landing_page_movable_text_group);
			return landing_page_movable_text_group.isDisplayed();
		} catch (StaleElementReferenceException e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, landing_page_movable_text_group);
			return landing_page_movable_text_group.isDisplayed();
		}	
	}

	public boolean dots_below_the_moving_text_is_displayed() {
		for (WebElement index : landing_page_movable_text_belows_dots) {
			System.out.println("Text is : " + index.getText() + " = " + index.isDisplayed());
			boolean ss = index.isDisplayed();	
			if (ss) {
				return true;
			}
		}
		return false;
	}

	public boolean service_men_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, landing_page_servicemen_image);
			return landing_page_servicemen_image.isDisplayed();
		} catch (StaleElementReferenceException e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, landing_page_servicemen_image);
			return landing_page_servicemen_image.isDisplayed();
		}	
	}
	
	public boolean sign_up_button_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, landing_page_sign_up_button);
			return landing_page_sign_up_button.isDisplayed();
		} catch (StaleElementReferenceException e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, landing_page_sign_up_button);
			return landing_page_sign_up_button.isDisplayed();
		}	
	}
	
	public boolean sign_up_button_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, landing_page_sign_up_button);
			return landing_page_sign_up_button.isEnabled();
		} catch (StaleElementReferenceException e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, landing_page_sign_up_button);
			return landing_page_sign_up_button.isEnabled();
		}	
	}

	public void sign_up_button_is_clicked() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 20, landing_page_sign_up_button);
		} catch (StaleElementReferenceException e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 20, landing_page_sign_up_button);
		}	
		landing_page_sign_up_button.click();
	}
	
	public boolean login_button_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, landing_page_log_in_button);
			return landing_page_log_in_button.isDisplayed();
		} catch (StaleElementReferenceException e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, landing_page_log_in_button);
			return landing_page_log_in_button.isDisplayed();
		}	
	}
	
	public boolean login_button_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, landing_page_log_in_button);
			return landing_page_log_in_button.isEnabled();
		} catch (StaleElementReferenceException e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, landing_page_log_in_button);
			return landing_page_log_in_button.isEnabled();
		}	
	}
	
	public void login_button_is_clicked() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, landing_page_log_in_button);
		} catch (StaleElementReferenceException e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, landing_page_log_in_button);
		}	
		landing_page_log_in_button.click();
	}
	
}
