package stepDefinitions.customer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import com.applicationHooks.AppHooks;
import com.pages.Landing_page_objects;
import com.pages.Login_page_objects;
import com.pages.Sign_up_page_objects;
import com.pages.Verify_otp_page_objects;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Sign_up_page {
	
	Landing_page_objects fp=new Landing_page_objects(DriverFactory.getDriver());
	Sign_up_page_objects sp = new Sign_up_page_objects(DriverFactory.getDriver());
	Verify_otp_page_objects vo = new Verify_otp_page_objects(DriverFactory.getDriver());
	Login_page_objects li= new Login_page_objects(DriverFactory.getDriver());
	Logger logger = LogManager.getLogger(Sign_up_page.class);
	
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
	
	@Given("Verify that user is on the sign up page from the landing page")
	public void verify_that_user_is_on_the_sign_up_page_from_the_landing_page() {
	    fp.sign_up_button_is_clicked();	
	    System.out.println("sdfsdf");
	    boolean actual = sp.first_name_user_field_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that back button should be displayed in the sign up page")
	public void verify_that_back_button_should_be_displayed_in_the_sign_up_page() {
		boolean actual = sp.back_button_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that back button should be clickable in the sign up page")
	public void verify_that_back_button_should_be_clickable_in_the_sign_up_page() {
		boolean actual = sp.back_button_is_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that need help link text should be displayed in the sign up page")
	public void verify_that_need_help_link_text_should_be_displayed_in_the_sign_up_page() {
		boolean actual = sp.need_help_link_text_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
		
	}

	@Then("Verify that need help link text should be clickable in the sign up page")
	public void verify_that_need_help_link_text_should_be_clickable_in_the_sign_up_page() {
		boolean actual = sp.need_help_link_text_is_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that sign up and service man image should be displayed in the sign up page")
	public void verify_that_sign_up_and_service_man_image_should_be_displayed_in_the_sign_up_page() {
		boolean actual = sp.sign_up_and_service_man_image_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that sign up text should be displayed in the sign up page")
	public void verify_that_sign_up_text_should_be_displayed_in_the_sign_up_page() {
		boolean actual = sp.sign_up_logo_with_man_text_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that first name user field should be displayed in the sign up page")
	public void verify_that_first_name_user_field_should_be_displayed_in_the_sign_up_page() {
		boolean actual = sp.first_name_user_field_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that first name user field placeholder text should be {string} displayed in the sign up page")
	public void verify_that_first_name_user_field_placeholder_text_should_be_displayed_in_the_sign_up_page(String string) {
		String actual = sp.first_name_user_field_placeholder_value();
	    Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that first name user field should be clickable in the sign up page")
	public void verify_that_first_name_user_field_should_be_clickable_in_the_sign_up_page() {
		boolean actual = sp.first_name_user_field_is_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that last name user field should be displayed in the sign up page")
	public void verify_that_last_name_user_field_should_be_displayed_in_the_sign_up_page() {
		boolean actual = sp.last_name_user_field_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that last name user field placeholder text should be {string} displayed in the sign up page")
	public void verify_that_last_name_user_field_placeholder_text_should_be_displayed_in_the_sign_up_page(String string) {
		String actual = sp.last_name_user_field_placeholder_value();
	    Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that last name user field should be clickable in the sign up page")
	public void verify_that_last_name_user_field_should_be_clickable_in_the_sign_up_page() {
		boolean actual = sp.last_name_user_field_is_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that country code flag should be displayed in the sign up page")
	public void verify_that_country_code_flag_should_be_displayed_in_the_sign_up_page() {
		boolean actual = sp.country_code_flag_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that country code flag should be clickable in the sign up page")
	public void verify_that_country_code_flag_should_be_clickable_in_the_sign_up_page() {
		boolean actual = sp.country_code_flag_is_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that mobile number user field should be displayed in the sign up page")
	public void verify_that_mobile_number_user_field_should_be_displayed_in_the_sign_up_page() {
		boolean actual = sp.mobile_number_user_field_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that mobile number user field should be clickable in the sign up page")
	public void verify_that_mobile_number_user_field_should_be_clickable_in_the_sign_up_page() {
		boolean actual = sp.mobile_number_user_field_is_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that mobile number user field placeholder text should be {string} displayed in the sign up page")
	public void verify_that_mobile_number_user_field_placeholder_text_should_be_displayed_in_the_sign_up_page(String string) {
		String actual = sp.mobile_number_user_field_placeholder_text();
	    Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that get otp button should be displayed in the sign up page")
	public void verify_that_get_otp_button_should_be_displayed_in_the_sign_up_page() {
		boolean actual = sp.get_otp_button_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that get otp button should not be clickable in the sign up page")
	public void verify_that_get_otp_button_should_not_be_clickable_in_the_sign_up_page() {
		boolean actual = sp.get_otp_button_is_not_clickable();
	    Assert.assertEquals(actual, false);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that by continuing something text should be displayed below the get otp button in the sign up page")
	public void verify_that_by_continuing_something_text_should_be_displayed_below_the_get_otp_button_in_the_sign_up_page() {
		boolean actual = sp.by_continuing_something_text_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that t and c link text should be clickable below the get otp button in the sign up page")
	public void verify_that_t_and_c_link_text_should_be_clickable_below_the_get_otp_button_in_the_sign_up_page() {
		boolean actual = sp.t_and_c_link_text_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that privacy policy link text should be clickable in the get otp button in the sign up page")
	public void verify_that_privacy_policy_link_text_should_be_clickable_in_the_get_otp_button_in_the_sign_up_page() {
		boolean actual = sp.privacy_policy_link_text_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that facebook sign up button should be displayed in the sign up page")
	public void verify_that_facebook_sign_up_button_should_be_displayed_in_the_sign_up_page() {
		boolean actual = sp.facebook_sign_up_button_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that facebook sign up button should be clickable in the sign up page")
	public void verify_that_facebook_sign_up_button_should_be_clickable_in_the_sign_up_page() {
		boolean actual = sp.facebook_sign_up_button_is_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that google sign up button should be displayed in the sign up page")
	public void verify_that_google_sign_up_button_should_be_displayed_in_the_sign_up_page() {
		boolean actual = sp.google_sign_up_button_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that google sign up button should be clickable in the sign up page")
	public void verify_that_google_sign_up_button_should_be_clickable_in_the_sign_up_page() {
		boolean actual = sp.google_sign_up_button_is_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that apple sign up button should be displayed in the sign up page")
	public void verify_that_apple_sign_up_button_should_be_displayed_in_the_sign_up_page() {
		boolean actual = sp.apple_sign_up_button_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that apple sign up button should be clickable in the sign up page")
	public void verify_that_apple_sign_up_button_should_be_clickable_in_the_sign_up_page() {
		boolean actual = sp.apple_sign_up_button_is_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that already have an account text should be displayed in the sign up page")
	public void verify_that_already_have_an_account_text_should_be_displayed_in_the_sign_up_page() {
		boolean actual = sp.already_have_an_account_text_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that log in link should be displayed in the sign up page")
	public void verify_that_log_in_link_should_be_displayed_in_the_sign_up_page() {
		boolean actual = sp.log_in_link_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that log in link should be clickable in the sign up page")
	public void verify_that_log_in_link_should_be_clickable_in_the_sign_up_page() {
		boolean actual = sp.log_in_link_is_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	/**
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	@Given("Verify that user is on the sign up page from the landing front page")
	public void verify_that_user_is_on_the_sign_up_page_from_the_landing_front_page() {
	    fp.sign_up_button_is_clicked();	
	    boolean actual = sp.first_name_user_field_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@When("user click on the back button in the sign up page")
	public void user_click_on_the_back_button_in_the_sign_up_page() {
	    sp.back_button_is_clicked();
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user is on the landing page from the sign up page")
	public void verify_that_user_is_on_the_landing_page_from_the_sign_up_page() {
	    boolean actual= fp.sign_up_button_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	/**
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	@Given("Verify that user is on the sign up page from the start page")
	public void verify_that_user_is_on_the_sign_up_page_from_the_start_page() {
	    fp.sign_up_button_is_clicked();	
	    boolean actual = sp.first_name_user_field_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@When("user click on the need help text link sign up page")
	public void user_click_on_the_need_help_text_link_sign_up_page() {
		boolean actual = sp.need_help_link_text_is_clickable();
	    sp.need_help_link_text_is_clicked();
	    Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user is on the contact and support page from the sign up page")
	public void verify_that_user_is_on_the_contact_and_support_page_from_the_sign_up_page() {
//	    boolean actual = cas.contact_and_support_page();
	    Assert.assertEquals(false, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
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
	
	@Given("Verify that user is on the sign up page from the startup page")
	public void verify_that_user_is_on_the_sign_up_page_from_the_startup_page() {
		fp.sign_up_button_is_clicked();
		boolean actual = sp.first_name_user_field_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@When("user send text in the first name user field {string} in the sign up page")
	public void user_send_text_in_the_first_name_user_field_something_in_the_sign_up_page(String string) {
		sp.first_name_user_field_send_text(string);
		String actual= sp.first_name_user_field_placeholder_value();
		//System.out.println("text sended "+actual);
		Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@When("user send text in the last name user field {string} in the sign up page")
	public void user_send_text_in_the_last_name_user_field_something_in_the_sign_up_page(String string) {
	    sp.last_name_user_field_send_text(string);
	    String actual= sp.last_name_user_field_placeholder_value();
		Assert.assertEquals(actual, string);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@When("user search {string} and select UAE country code in the sign up page")
	public void user_search_something_and_select_uae_country_code_in_the_sign_up_page(String string) {
		sp.country_code_flag_dropdown_is_clicked();
		sp.country_code_dropdown_search_user_field_clicked();
		sp.country_code_dropdown_search_user_field_send_text(string);
		boolean actual = sp.country_code_dropdown_search_user_field_send_text_select_uae_is_clickable();
		Assert.assertEquals(actual, true);
		sp.country_code_dropdown_search_user_field_send_text_select_uae();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@When("User send mobile number in the mobile number user field {string} in the sign up page")
	public void user_send_mobile_number_in_the_mobile_number_user_field_something_in_the_sign_up_page(String string) {
	    sp.mobile_number_user_field_send_text(string);
	    String actual = sp.mobile_number_user_field_placeholder_text();
	    Assert.assertEquals(actual, string);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("user click on the get otp button in the sign up page")
	public void user_click_on_the_get_otp_button_in_the_sign_up_page() {
		boolean actual = sp.get_otp_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
		sp.get_otp_button_is_clicked();
	}
	
	@Then("User should be on the verify otp page from the sign up page")
	public void user_should_be_on_the_verify_otp_page_from_the_sign_up_page() {
	    boolean actual = vo.edit_number_link_text_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

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
	 * 
	 */
	
	@Given("Verify that user is on the sign up page from the first landing page")
	public void verify_that_user_is_on_the_sign_up_page_from_the_first_landing_page() {
		fp.sign_up_button_is_clicked();
		boolean actual = sp.first_name_user_field_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@When("User enter first name {string} last name {string} and mobile number {string}")
	public void user_enter_first_name_last_name_and_mobile_number(String string, String string2,String string3) {
		sp.first_name_user_field_send_text(string);
		String actual = sp.first_name_user_field_placeholder_value();
		Assert.assertEquals(actual, string);
		sp.last_name_user_field_send_text(string2);
		String actual1 = sp.last_name_user_field_placeholder_value();
		Assert.assertEquals(actual1, string2);
		sp.mobile_number_user_field_send_text(string3);
		String actual2 = sp.mobile_number_user_field_placeholder_text();
		Assert.assertEquals(actual2, string3);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that get otp button should not be clickable with invalid test data in the sign up page")
	public void verify_that_get_otp_button_should_not_be_clickable_with_invalid_test_data_in_the_sign_up_page() {
		boolean actual = sp.get_otp_button_is_not_clickable();
	    Assert.assertEquals(actual, false);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that get otp button should be clickable with valid test data in the sign up page")
	public void verify_that_get_otp_button_should_be_clickable_with_valid_test_data_in_the_sign_up_page() {
		boolean actual = sp.get_otp_button_is_not_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
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
	
	@Given("Verify that user is on the sign up page from the comeup page")
	public void verify_that_user_is_on_the_sign_up_page_from_the_comeup_page() {
		fp.sign_up_button_is_clicked();
		boolean actual = sp.first_name_user_field_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@When("User click on the log in link from the sign up page")
	public void user_click_on_the_log_in_link_from_the_sign_up_page() {
		boolean actual = sp.log_in_link_is_clickable();
	    Assert.assertEquals(actual, true);
	    sp.log_in_link_is_clicked();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user is on the log in page from the sign up page")
	public void verify_that_user_is_on_the_log_in_page_from_the_sign_up_page() {
	    boolean actual = li.log_in_text_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
}
