package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.utility.ElementUtil;
import io.appium.java_client.android.AndroidDriver;

public class Login_page_objects {
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
	
	@FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup")
	private WebElement back_button;

	@FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/com.horcrux.svg.SvgView")
	private WebElement need_help_link;

	@FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/com.horcrux.svg.SvgView/com.horcrux.svg.l/com.horcrux.svg.u")
	private WebElement service_man_image;

	@FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[1]")
	private WebElement log_in_text;

	@FindBy(xpath= "//android.view.ViewGroup[@content-desc=\"🇦🇪, +971, \"]")
	private WebElement country_code_dropdown;

	@FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText")
	private WebElement mobile_number_user_field;

	@FindBy(xpath= "//android.view.ViewGroup[@content-desc=\"Get OTP\"]")
	private WebElement get_otp_button;

	@FindBy(xpath= "(//android.view.ViewGroup[@content-desc=\"Login\"])[1]")
	private WebElement facebook_sign_up_button;

	@FindBy(xpath= "(//android.view.ViewGroup[@content-desc=\"Login\"])[2]")
	private WebElement google_sign_up_button;

	@FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2]")
	private WebElement already_have_an_account_text;

	@FindBy(xpath= "")
	private WebElement sign_up_link;

	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"🇦🇪, +971, United Arab Emirates\"]")
	private WebElement country_code_dropdown_search_user_field_UAE;
	
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public Login_page_objects(AndroidDriver driver) {
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

	public boolean need_help_link_text_is_displayed() {
		try {
			return need_help_link.isDisplayed();
		} catch (Exception e) {
			return need_help_link.isDisplayed();
		}
	}

	public boolean need_help_link_text_is_clickable() {
		try {
			return need_help_link.isEnabled();
		} catch (Exception e) {
			return need_help_link.isEnabled();
		}
	}

	public boolean service_man_image_is_displayed() {
		try {
			return service_man_image.isDisplayed();
		} catch (Exception e) {
			return service_man_image.isDisplayed();
		}
	}

	public boolean log_in_text_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 15, log_in_text);
			return log_in_text.isDisplayed();
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 15, log_in_text);
			return log_in_text.isDisplayed();
		}
	}

	public boolean country_code_dropdown_is_displayed() {
		try {
			return country_code_dropdown.isDisplayed();
		} catch (Exception e) {
			return country_code_dropdown.isDisplayed();
		}
	}

	public boolean country_code_dropodown_is_clickable() {
		try {
			return country_code_dropdown.isEnabled();
		} catch (Exception e) {
			return country_code_dropdown.isEnabled();
		}
	}
	
	public void country_code_dropodown_is_clicked() {
		try {
			country_code_dropdown.click();
		} catch (Exception e) {
			country_code_dropdown.click();
		}
	}

	public boolean mobile_number_user_field_is_displayed() {
		try {
			return mobile_number_user_field.isDisplayed();
		} catch (Exception e) {
			return mobile_number_user_field.isDisplayed();
		}
	}

	public boolean mobile_number_user_field_is_clickable() {
		try {
			return mobile_number_user_field.isEnabled();
		} catch (Exception e) {
			return mobile_number_user_field.isEnabled();
		}
	}
	
	public void mobile_number_user_field_send_text(String string) {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 15, mobile_number_user_field);
			 mobile_number_user_field.sendKeys(string);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 15, mobile_number_user_field);
			 mobile_number_user_field.sendKeys(string);
		}
	}

	public String mobile_number_user_field_placeholder_text() {
		return mobile_number_user_field.getText();
	}

	public boolean get_otp_button_is_displayed() {
		try {
			return get_otp_button.isDisplayed();
		} catch (Exception e) {
			return get_otp_button.isDisplayed();
		}
	}

	public boolean get_otp_button_is_clickable() {
		try {
			return get_otp_button.isEnabled();
		} catch (Exception e) {
			return get_otp_button.isEnabled();
		}
	}
	
	public void get_otp_button_is_clicked() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 15, get_otp_button);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 15, get_otp_button);
		}
		get_otp_button.click();
	}

	public boolean facebook_sign_up_button_is_displayed() {
		try {
			return facebook_sign_up_button.isDisplayed();
		} catch (Exception e) {
			return facebook_sign_up_button.isDisplayed();
		}
	}

	public boolean facebook_sign_up_button_is_clickable() {
		try {
			return facebook_sign_up_button.isEnabled();
		} catch (Exception e) {
			return facebook_sign_up_button.isEnabled();
		}
	}

	public boolean google_sign_up_button_is_displayed() {
		try {
			return google_sign_up_button.isDisplayed();
		} catch (Exception e) {
			return google_sign_up_button.isDisplayed();
		}
	}

	public boolean google_sign_up_button_is_clickable() {
		try {
			return google_sign_up_button.isEnabled();
		} catch (Exception e) {
			return google_sign_up_button.isEnabled();
		}
	}

	public boolean already_have_an_account_text_is_displayed() {
		try {
			return already_have_an_account_text.isDisplayed();
		} catch (Exception e) {
			return already_have_an_account_text.isDisplayed();
		}
	}

	public boolean sign_up_link_is_displayed() {
		try {
			return sign_up_link.isEnabled();
		} catch (Exception e) {
			return sign_up_link.isEnabled();
		}
	}

	public boolean sign_up_link_is_clickable() {
		try {
			return sign_up_link.isEnabled();
		} catch (Exception e) {
			return sign_up_link.isEnabled();
		}
	}

	public void sign_up_link_is_clicked() {
		try {
			 sign_up_link.click();
		} catch (Exception e) {
			 sign_up_link.click();
		}
	}

	public void scroll_country_code_options() {
//		ElementUtil.eu.get_location_of_element_in_x_axis(already_have_an_account_text);
//		ElementUtil.eu.get_location_of_element_in_y_axis(already_have_an_account_text);
		
		ElementUtil.eu.scroll_till_text(driver, "United Arab Emirates");
		
//		ElementUtil.eu.scroll_screen(driver);
		
		 try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
