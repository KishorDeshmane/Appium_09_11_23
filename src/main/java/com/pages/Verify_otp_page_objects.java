package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

import io.appium.java_client.android.AndroidDriver;

public class Verify_otp_page_objects {
	public AndroidDriver driver;
	
	/**
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup")
	private WebElement back_button;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")
	private WebElement need_help_link_text;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/com.horcrux.svg.SvgView")
	private WebElement plane_image;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[1]")
	private WebElement verify_otp_text;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2]")
	private WebElement we_have_sent_an_otp_text;
	
	@FindBy(xpath="")
	private WebElement otp_sent_mobile_number;
	
//	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView
//	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[2]
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[2]")
	private WebElement otp_user_field_box_one;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[2]")
	private WebElement otp_user_field_second_number;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[3]")
	private WebElement otp_user_field_third_number;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[4]")
	private WebElement otp_user_field_fourth_number;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[5]")
	private WebElement otp_user_field_fifth_number;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[6]")
	private WebElement otp_user_field_sixth_number;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Edit Number\"]/android.widget.TextView")
	private WebElement edit_number_link;

	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Resend in\"]/android.widget.TextView")
	private WebElement resend_in_countdown;

	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Resend OTP\"]/android.widget.TextView")
	private WebElement resend_otp_link;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Verify OTP\"]")
	private WebElement verify_otp_button;

	@FindBy(xpath="")
	private WebElement otp_send_successfully_pop_up;

	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public Verify_otp_page_objects(AndroidDriver driver) {
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

	public boolean back_button_is_displayed() {
		try {
			return back_button.isDisplayed();
		} catch (Exception e) {
			return back_button.isDisplayed();
		}
	}

	public boolean back_button_is_clickable() {
		try {
			return back_button.isEnabled();
		} catch (Exception e) {
			return back_button.isEnabled();
		}
	}
	
	public void back_button_is_clicked() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, back_button);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, back_button);
		}
		back_button.click();
	}

	public boolean need_help_link_text_is_displayed() {
		try {
			return need_help_link_text.isDisplayed();
		} catch (Exception e) {
			return need_help_link_text.isDisplayed();
		}
	}
	
	public boolean need_help_link_text_is_clickable() {
		try {
			return need_help_link_text.isEnabled();
		} catch (Exception e) {
			return need_help_link_text.isEnabled();
		}
	}
	
	public void need_help_link_text_is_clicked() {
		try {
			 need_help_link_text.click();
		} catch (Exception e) {
			 need_help_link_text.click();
		}
	}

	public boolean plane_image_is_displayed() {
		try {
			return plane_image.isDisplayed();
		} catch (Exception e) {
			return plane_image.isDisplayed();
		}
	}

	public boolean verify_otp_text_is_displayed() {
		try {
			return verify_otp_text.isDisplayed();
		} catch (Exception e) {
			return verify_otp_text.isDisplayed();
		}
	}

	public boolean we_have_sent_an_otp_text_is_displayed() {
		try {
			return we_have_sent_an_otp_text.isDisplayed();
		} catch (Exception e) {
			return we_have_sent_an_otp_text.isDisplayed();
		}
	}

	public boolean otp_sent_mobile_number_is_displayed() {
		try {
			return otp_sent_mobile_number.isDisplayed();
		} catch (Exception e) {
			return otp_sent_mobile_number.isDisplayed();
		}
	}

	public boolean otp_user_fields_is_clickable() {
		try {
			return otp_user_field_box_one.isEnabled();
		} catch (Exception e) {
			return otp_user_field_box_one.isEnabled();
		}
	}
	
	public void otp_user_field_box_is_clicked() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, otp_user_field_box_one);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, otp_user_field_box_one);
		}
		otp_user_field_box_one.click();
	}
	
	public void otp_user_fields_send_text(String int1) {
		Actions a = new Actions(driver);
		a.sendKeys(String.valueOf(int1)).perform();
	}

	public boolean edit_number_link_text_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 15, edit_number_link);
			return edit_number_link.isDisplayed();
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 15, edit_number_link);
			return edit_number_link.isDisplayed();
		}
	}

	public boolean edit_number_text_link_should_be_clickable() {
		try {
			return edit_number_link.isEnabled();
		} catch (Exception e) {
			return edit_number_link.isEnabled();
		}
	}
	
	public void edit_number_text_link_should_be_clicked() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, edit_number_link);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, edit_number_link);
		}
		edit_number_link.click();
	}

	public boolean resend_in_countdown_is_displayed() {
		try {
			return resend_in_countdown.isDisplayed();
		} catch (Exception e) {
			return resend_in_countdown.isDisplayed();
		}
	}

	public boolean verify_otp_button_is_displayed() {
		try {
			return verify_otp_button.isDisplayed();
		} catch (Exception e) {
			return verify_otp_button.isDisplayed();
		}
	}

	public boolean verify_otp_button_is_clickable() {
		try {
			return verify_otp_button.isEnabled();
		} catch (Exception e) {
			return verify_otp_button.isEnabled();
		}
	}
	
	public void verify_otp_button_is_clicked() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, verify_otp_button);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, verify_otp_button);
		}
		verify_otp_button.click();
	}
	
	public void back_button_pressed() {
		ElementUtil.eu.navigate_back(driver);
	}

	public boolean resend_otp_link_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 40, resend_otp_link);
			return resend_otp_link.isEnabled();
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 40, resend_otp_link);
			return resend_otp_link.isEnabled();
		}
	}

	public void resend_otp_link_is_clicked() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 40, resend_otp_link);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 40, resend_otp_link);
		}
		 resend_otp_link.click();
	}

	public boolean otp_send_successfully_pop_up_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, otp_send_successfully_pop_up);
			return otp_send_successfully_pop_up.isEnabled();
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, otp_send_successfully_pop_up);
			return otp_send_successfully_pop_up.isEnabled();
		}
	}
	
	
	
}
