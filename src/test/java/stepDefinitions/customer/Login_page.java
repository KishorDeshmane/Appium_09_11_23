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

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_page {
	Landing_page_objects fp=new Landing_page_objects(DriverFactory.getDriver());
	Login_page_objects li= new Login_page_objects(DriverFactory.getDriver());
	Sign_up_page_objects sp = new Sign_up_page_objects(DriverFactory.getDriver());
	Verify_otp_page_objects vo = new Verify_otp_page_objects(DriverFactory.getDriver());
	Logger logger = LogManager.getLogger(Login_page.class);
	
	/**
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	@Given("Verify that user is on the log in page from the landing page")
	public void verify_that_user_is_on_the_log_in_page_from_the_landing_page() {
	    fp.login_button_is_clicked();
	    boolean actual = li.log_in_text_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that back button should be displayed in the log in page")
	public void verify_that_back_button_should_be_displayed_in_the_log_in_page() {
		boolean actual = li.back_button_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that back button should be clickable in the log in page")
	public void verify_that_back_button_should_be_clickable_in_the_log_in_page() {
		boolean actual = li.back_button_is_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that need help link text should be displayed in the log in page")
	public void verify_that_need_help_link_text_should_be_displayed_in_the_log_in_page() {
		boolean actual = li.need_help_link_text_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that need help link should be clickable in the log in page")
	public void verify_that_need_help_link_should_be_clickable_in_the_log_in_page() {
		boolean actual = li.need_help_link_text_is_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service man image should be displayed in the log in page")
	public void verify_that_service_man_image_should_be_displayed_in_the_log_in_page() {
		boolean actual = li.service_man_image_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that log in text should be displayed in the log in page")
	public void verify_that_log_in_text_should_be_displayed_in_the_log_in_page() {
		boolean actual = li.log_in_text_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that country code dropdown should be displayed in the log in page")
	public void verify_that_country_code_dropdown_should_be_displayed_in_the_log_in_page() {
		boolean actual = li.country_code_dropdown_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that country code dropodown should be clickable in the log in page")
	public void verify_that_country_code_dropodown_should_be_clickable_in_the_log_in_page() {
		boolean actual = li.country_code_dropodown_is_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that mobile number user field should be displayed in the log in page")
	public void verify_that_mobile_number_user_field_should_be_displayed_in_the_log_in_page() {
		boolean actual = li.mobile_number_user_field_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that mobile number user field should be clickable in the log in page")
	public void verify_that_mobile_number_user_field_should_be_clickable_in_the_log_in_page() {
		boolean actual = li.mobile_number_user_field_is_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that mobile number user field placeholder text should be {string} displayed in the log in page")
	public void verify_that_mobile_number_user_field_placeholder_text_should_be_displayed_in_the_log_in_page(String string) {
		String actual = li.mobile_number_user_field_placeholder_text();
	    Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that get otp button should be displayed in the log in page")
	public void verify_that_get_otp_button_should_be_displayed_in_the_log_in_page() {
		boolean actual = li.get_otp_button_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that get otp button should not be clickable in the log in page")
	public void verify_that_get_otp_button_should_not_be_clickable_in_the_log_in_page() {
		boolean actual = li.get_otp_button_is_clickable();
	    Assert.assertEquals(actual, false);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that facebook sign up button should be displayed in the log in page")
	public void verify_that_facebook_sign_up_button_should_be_displayed_in_the_log_in_page() {
		boolean actual = li.facebook_sign_up_button_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that facebook sign up button should be clickable in the log in page")
	public void verify_that_facebook_sign_up_button_should_be_clickable_in_the_log_in_page() {
		boolean actual = li.facebook_sign_up_button_is_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that google sign up button should be displayed in the log in page")
	public void verify_that_google_sign_up_button_should_be_displayed_in_the_log_in_page() {
		boolean actual = li.google_sign_up_button_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that google sign up button should be clickable in the log in page")
	public void verify_that_google_sign_up_button_should_be_clickable_in_the_log_in_page() {
		boolean actual = li.google_sign_up_button_is_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that already have an account text should be displayed in the log in page")
	public void verify_that_already_have_an_account_text_should_be_displayed_in_the_log_in_page() {
		boolean actual = li.already_have_an_account_text_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that sign up link should be displayed in the log in page")
	public void verify_that_sign_up_link_should_be_displayed_in_the_log_in_page() {
		boolean actual = li.sign_up_link_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that sign up link should be clickable in the log in page")
	public void verify_that_sign_up_link_should_be_clickable_in_the_log_in_page() {
		boolean actual = li.sign_up_link_is_clickable();
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
	
	@Given("Verify that user is on the log in page from landing page")
	public void verify_that_user_is_on_the_log_in_page_from_landing_page() {
	    fp.login_button_is_clicked();
	    boolean actual = li.log_in_text_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@When("user click on the country code dropdown button in the log in page")
	public void user_click_on_the_country_code_dropdown_button_in_the_log_in_page() {
	    li.country_code_dropodown_is_clicked();
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Then("User try to scroll the window till the last country code in log in page")
	public void user_try_to_scroll_the_window_till_the_last_country_code_in_log_in_page() {
	    li.scroll_country_code_options();
	    throw new PendingException();
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
	 * 
	 */
	
	@Given("Verify that user is on the log in page from landing page first")
	public void verify_that_user_is_on_the_log_in_page_from_landing_page_first() {
	    fp.login_button_is_clicked();
	    boolean actual = li.log_in_text_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@When("user enters test data as {string} in the mobile number user field in log in page")
	public void user_enters_test_data_as_in_the_mobile_number_user_field_in_log_in_page(String string) {
		li.mobile_number_user_field_send_text(string);
		String actual = li.mobile_number_user_field_placeholder_text();
		Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that get otp button should not be clickable in log in page")
	public void verify_that_get_otp_button_should_not_be_clickable_in_log_in_page() {
		boolean actual = li.get_otp_button_is_clickable();
	    Assert.assertEquals(actual, false);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that get otp button should be clickable in log in page")
	public void verify_that_get_otp_button_should_be_clickable_in_log_in_page() {
		boolean actual = li.get_otp_button_is_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@When("user click on the get otp button in the log in page")
	public void user_click_on_the_get_otp_button_in_the_log_in_page() {
	    boolean actual = li.get_otp_button_is_clickable();
		li.get_otp_button_is_clicked();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user should be on the verify otp page from the log in page")
	public void verify_that_user_should_be_on_the_verify_otp_page_from_the_log_in_page() {
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
	 * 
	 */
	
	@Given("Verify that user is on the log in page from the comeup page")
	public void verify_that_user_is_on_the_log_in_page_from_the_comeup_page() {
		fp.login_button_is_clicked();
	    boolean actual = li.log_in_text_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@When("User click on the sign up link from the log in page")
	public void user_click_on_the_sign_up_link_from_the_log_in_page() {
		boolean actual = li.sign_up_link_is_clickable();
	    Assert.assertEquals(actual, true);
	    li.sign_up_link_is_clicked();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that user is on the sign up page from the log in page")
	public void verify_that_user_is_on_the_sign_up_page_from_the_log_in_page() {
		boolean actual = sp.sign_up_logo_with_man_text_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
}
