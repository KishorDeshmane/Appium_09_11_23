package com.pages;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.utility.ElementUtil;
import io.appium.java_client.android.AndroidDriver;

public class Sign_up_page_objects {
	public AndroidDriver driver;
	
	/**
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/com.horcrux.svg.SvgView")
	private WebElement sign_up_back_button;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")
	private WebElement need_help_link_text;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.widget.TextView")
	private WebElement sign_up_logo_with_man_text;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[1]/com.horcrux.svg.SvgView/com.horcrux.svg.l/com.horcrux.svg.u")
	private WebElement sign_up_logo_with_man;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText[1]")
	private WebElement first_name_user_field;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText[2]")
	private WebElement last_name_user_field;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"🇦🇪, +971, \"]/android.widget.TextView[2]")
	private WebElement country_code_dropdown_text;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText")
	private WebElement country_code_dropdown_search_user_field;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"🇦🇪, +971, United Arab Emirates\"]")
	private WebElement country_code_dropdown_search_user_field_UAE;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.widget.EditText")
	private WebElement mobile_number_user_field;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Get OTP\"]")
	private WebElement get_otp_button;

	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView")
	private WebElement by_continuing_text_below_get_otp;
	
	@FindBy(xpath="")
	private WebElement t_and_c_text_below_get_otp;
	
	@FindBy(xpath="")
	private WebElement privacy_and_policy_text_below_get_otp;
	
	@FindBy(xpath="(//android.view.ViewGroup[@content-desc=\"Sign Up\"])[1]")
	private WebElement facebook_sign_up_button;
	
	@FindBy(xpath="(//android.view.ViewGroup[@content-desc=\"Sign Up\"])[2]")
	private WebElement google_sign_up_button;
	
	@FindBy(xpath="(//android.view.ViewGroup[@content-desc=\"Sign Up\"])[3]")
	private WebElement apple_sign_up_button;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
	private WebElement already_have_an_account_text;
	
	@FindBy(linkText="Login")
	private WebElement log_in_link_in_sign_up_page;
	
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public Sign_up_page_objects(AndroidDriver driver) {
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
			return sign_up_back_button.isDisplayed();
		} catch (Exception e) {
			return sign_up_back_button.isDisplayed();
		}
	}

	public boolean back_button_is_clickable() {
		try {
			return sign_up_back_button.isEnabled();
		} catch (StaleElementReferenceException e) {
			return sign_up_back_button.isEnabled();
		}
	}
	
	public void back_button_is_clicked() {
		try {
			sign_up_back_button.click();
		} catch (StaleElementReferenceException e) {
			sign_up_back_button.click();
		}
	}

	public boolean need_help_link_text_is_displayed() {
		try {
			return need_help_link_text.isDisplayed();
		} catch (StaleElementReferenceException e) {
			return need_help_link_text.isDisplayed();
		}
	}

	public boolean need_help_link_text_is_clickable() {
		try {
			return need_help_link_text.isDisplayed();
		} catch (StaleElementReferenceException e) {
			return need_help_link_text.isDisplayed();
		}
	}
	
	public void need_help_link_text_is_clicked() {
		try {
			 need_help_link_text.click();
		} catch (StaleElementReferenceException e) {
			 need_help_link_text.click();
		}
	}
	
	public boolean sign_up_and_service_man_image_is_displayed() {
		try {
			return sign_up_logo_with_man.isDisplayed();
		} catch (StaleElementReferenceException e) {
			return sign_up_logo_with_man.isDisplayed();
		}
	}

	public boolean sign_up_logo_with_man_text_is_displayed() {
		try {
			return sign_up_logo_with_man_text.isDisplayed();
		} catch (Exception e) {
			return sign_up_logo_with_man_text.isDisplayed();
		}
	}

	public boolean first_name_user_field_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, first_name_user_field);
			return first_name_user_field.isDisplayed();
		} catch (StaleElementReferenceException e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, first_name_user_field);
			return first_name_user_field.isDisplayed();
		}
	}

	public String first_name_user_field_placeholder_value() {
		ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, first_name_user_field);
		return first_name_user_field.getText();
	}

	public boolean first_name_user_field_is_clickable() {
		try {
			return first_name_user_field.isEnabled();
		} catch (Exception e) {
			return first_name_user_field.isEnabled();
		}
	}
	
	public void first_name_user_field_send_text(String string) {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 15, first_name_user_field);
			first_name_user_field.sendKeys(string);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 15, first_name_user_field);
			first_name_user_field.sendKeys(string);
		}
	}
	
	public boolean last_name_user_field_is_displayed() {
		try {
			return last_name_user_field.isDisplayed();
		} catch (Exception e) {
			return last_name_user_field.isDisplayed();
		}
	}

	public String last_name_user_field_placeholder_value() {
		try {
			return last_name_user_field.getText();
		} catch (Exception e) {
			return last_name_user_field.getText();
		}
	}

	public boolean last_name_user_field_is_clickable() {
		try {
			return last_name_user_field.isEnabled();
		} catch (StaleElementReferenceException e) {
			return last_name_user_field.isEnabled();
		}
	}

	public void last_name_user_field_send_text(String string) {
		try {
			last_name_user_field.sendKeys(string);
		} catch (Exception e) {
			last_name_user_field.sendKeys(string);
		}
	}
	
	public boolean country_code_flag_is_displayed() {
		try {
			return country_code_dropdown_text.isDisplayed();
		} catch (StaleElementReferenceException e) {
			return country_code_dropdown_text.isDisplayed();
		}
	}

	public boolean country_code_flag_is_clickable() {
		try {
			return country_code_dropdown_text.isEnabled();
		} catch (StaleElementReferenceException e) {
			return country_code_dropdown_text.isEnabled();
		}
	}
	
	public void country_code_flag_dropdown_is_clicked() {
		try {
			 country_code_dropdown_text.click();
		} catch (StaleElementReferenceException e) {
			country_code_dropdown_text.click();
		}
	}
	
	public void country_code_dropdown_search_user_field_clicked() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 20, country_code_dropdown_search_user_field);
			country_code_dropdown_search_user_field.click();
		} catch (StaleElementReferenceException e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 20, country_code_dropdown_search_user_field);
			country_code_dropdown_search_user_field.click();
		}
	}
	
	public void country_code_dropdown_search_user_field_send_text(String string) {
		try {
			country_code_dropdown_search_user_field.sendKeys(string);
		} catch (StaleElementReferenceException e) {
			country_code_dropdown_search_user_field.sendKeys(string);
		}
	}
	
	public boolean country_code_dropdown_search_user_field_send_text_select_uae_is_clickable() {
		try {
			return country_code_dropdown_search_user_field_UAE.isEnabled();
			} catch (StaleElementReferenceException e) {
			return country_code_dropdown_search_user_field_UAE.isEnabled();
		}
	}
	
	
	public void country_code_dropdown_search_user_field_send_text_select_uae() {
		try {
			country_code_dropdown_search_user_field_UAE.click();
			} catch (StaleElementReferenceException e) {
			country_code_dropdown_search_user_field_UAE.click();
		}
	}

	public boolean mobile_number_user_field_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 15, mobile_number_user_field);
			return mobile_number_user_field.isDisplayed();
		} catch (StaleElementReferenceException e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 15, mobile_number_user_field);
			return mobile_number_user_field.isDisplayed();
		}
	}

	public boolean mobile_number_user_field_is_clickable(){
		try {
			return mobile_number_user_field.isEnabled();
		} catch (StaleElementReferenceException e) {
			return mobile_number_user_field.isEnabled();
		}
	}
	
	public String mobile_number_user_field_placeholder_text() {
		try {
			return mobile_number_user_field.getText();
		} catch (StaleElementReferenceException e) {
			return mobile_number_user_field.getText();
		}
	}
	
	public void mobile_number_user_field_send_text(String string) {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 15, mobile_number_user_field);
			mobile_number_user_field.sendKeys(string);
		} catch (StaleElementReferenceException e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 15, mobile_number_user_field);
			mobile_number_user_field.sendKeys(string);
		}
	}

	public boolean get_otp_button_is_displayed() {
		try {
			return get_otp_button.isDisplayed();
		} catch (StaleElementReferenceException e) {
			return get_otp_button.isDisplayed();
		}
	}

	public boolean get_otp_button_is_not_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 15, get_otp_button);
			return get_otp_button.isEnabled();
		} catch (StaleElementReferenceException e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 15, get_otp_button);
			return get_otp_button.isEnabled();
		}
	}
	
	public boolean get_otp_button_is_clickable() {
		try {
			return get_otp_button.isEnabled();
		} catch (StaleElementReferenceException e) {
			return get_otp_button.isEnabled();
		}
	}
	
	public void get_otp_button_is_clicked() {
		try {
			 get_otp_button.click();
		} catch (StaleElementReferenceException e) {
			 get_otp_button.click();
		}
	}

	public boolean by_continuing_something_text_is_displayed() {
		try {
			return by_continuing_text_below_get_otp.isDisplayed();
		} catch (StaleElementReferenceException e) {
			return by_continuing_text_below_get_otp.isDisplayed();
		}
	}
	
	public boolean t_and_c_link_text_should_be_clickable() {
		try {
			return t_and_c_text_below_get_otp.isEnabled();
		} catch (StaleElementReferenceException e) {
			return t_and_c_text_below_get_otp.isEnabled();
		}
	}

	public boolean privacy_policy_link_text_should_be_clickable() {
		try {
			return privacy_and_policy_text_below_get_otp.isEnabled();
		} catch (StaleElementReferenceException e) {
			return privacy_and_policy_text_below_get_otp.isEnabled();
		}
	}

	public boolean facebook_sign_up_button_is_displayed() {
		try {
			return facebook_sign_up_button.isDisplayed();
		} catch (StaleElementReferenceException e) {
			return facebook_sign_up_button.isDisplayed();
		}
	}

	public boolean facebook_sign_up_button_is_clickable() {
		try {
			return facebook_sign_up_button.isEnabled();
		} catch (StaleElementReferenceException e) {
			return facebook_sign_up_button.isEnabled();
		}
	}

	public boolean google_sign_up_button_is_displayed() {
		try {
			return google_sign_up_button.isDisplayed();
		} catch (StaleElementReferenceException e) {
			return country_code_dropdown_text.isDisplayed();
		}
	}

	public boolean google_sign_up_button_is_clickable() {
		try {
			return google_sign_up_button.isEnabled();
		} catch (StaleElementReferenceException e) {
			return google_sign_up_button.isEnabled();
		}
	}

	public boolean apple_sign_up_button_is_displayed() {
		try {
			return apple_sign_up_button.isDisplayed();
		} catch (StaleElementReferenceException e) {
			return apple_sign_up_button.isDisplayed();
		}
	}

	public boolean apple_sign_up_button_is_clickable() {
		try {
			return apple_sign_up_button.isEnabled();
		} catch (StaleElementReferenceException e) {
			return apple_sign_up_button.isEnabled();
		}
	}

	public boolean already_have_an_account_text_is_displayed() {
		try {
			return already_have_an_account_text.isEnabled();
		} catch (StaleElementReferenceException e) {
			return already_have_an_account_text.isEnabled();
		}
	}

	public boolean log_in_link_is_displayed() {
		try {
			return log_in_link_in_sign_up_page.isDisplayed();
		} catch (StaleElementReferenceException e) {
			return log_in_link_in_sign_up_page.isDisplayed();
		}
	}

	public boolean log_in_link_is_clickable() {
		try {
			return log_in_link_in_sign_up_page.isEnabled();
		} catch (StaleElementReferenceException e) {
			return log_in_link_in_sign_up_page.isEnabled();
		}
	}

	public void log_in_link_is_clicked() {
		try {
			 log_in_link_in_sign_up_page.click();
		} catch (StaleElementReferenceException e) {
			 log_in_link_in_sign_up_page.click();
		}
	}

	
}
