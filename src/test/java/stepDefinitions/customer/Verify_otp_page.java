package stepDefinitions.customer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import com.applicationHooks.AppHooks;
import com.pages.Landing_page_objects;
import com.pages.Login_page_objects;
import com.pages.Sign_up_page_objects;
import com.pages.Verify_otp_page_objects;
import com.pages.home.Home_page_objects;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Verify_otp_page {
	
	Landing_page_objects fp=new Landing_page_objects(DriverFactory.getDriver());
	Sign_up_page_objects sp = new Sign_up_page_objects(DriverFactory.getDriver());
	Verify_otp_page_objects vo = new Verify_otp_page_objects(DriverFactory.getDriver());
	Login_page_objects li= new Login_page_objects(DriverFactory.getDriver());
	Home_page_objects hp = new Home_page_objects(DriverFactory.getDriver());
	Logger logger = LogManager.getLogger(Verify_otp_page.class);
	
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
	
	@Given("Verify that user is on the verify otp page from the sign up page")
	public void verify_that_user_is_on_the_verify_otp_page_from_the_sign_up_page() {
	    fp.sign_up_button_is_clicked();
	    sp.first_name_user_field_send_text(AppHooks.prop.getProperty("FirstName"));
	    sp.last_name_user_field_send_text(AppHooks.prop.getProperty("LastName"));
	    sp.mobile_number_user_field_send_text(AppHooks.prop.getProperty("MobileNumber"));
	    sp.get_otp_button_is_clicked();
	    boolean actual = vo.edit_number_link_text_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Given("Verify that user is on the verify otp page from the log in page")
	public void verify_that_user_is_on_the_verify_otp_page_from_the_log_in_page() {
	    fp.login_button_is_clicked();
	    li.mobile_number_user_field_send_text(AppHooks.prop.getProperty("MobileNumber"));
	    li.get_otp_button_is_clicked();
	    boolean actual = vo.edit_number_link_text_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that back button should be displayed in the verify otp page")
	public void verify_that_back_button_should_be_displayed_in_the_verify_otp_page() {
		boolean actual = vo.back_button_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that back button should be clickable in the verify otp page")
	public void verify_that_back_button_should_be_clickable_in_the_verify_otp_page() {
		boolean actual = vo.back_button_is_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that need help link text should be displayed in the verify otp page")
	public void verify_that_need_help_link_text_should_be_displayed_in_the_verify_otp_page() {
		boolean actual = vo.need_help_link_text_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that need help link should be clickable in the verify otp page")
	public void verify_that_need_help_link_should_be_clickable_in_the_verify_otp_page() {
		boolean actual = vo.need_help_link_text_is_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that plane image should be displayed in the verify otp page")
	public void verify_that_plane_image_should_be_displayed_in_the_verify_otp_page() {
		boolean actual = vo.plane_image_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that verify otp text should be displayed in the verify otp page")
	public void verify_that_verify_otp_text_should_be_displayed_in_the_verify_otp_page() {
		boolean actual = vo.verify_otp_text_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that we have sent an otp text should be displayed in the verify otp page")
	public void verify_that_we_have_sent_an_otp_text_should_be_displayed_in_the_verify_otp_page() {
		boolean actual = vo.we_have_sent_an_otp_text_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that otp sent mobile number should be displayed in the verify otp page")
	public void verify_that_otp_sent_mobile_number_should_be_displayed_in_the_verify_otp_page() {
		boolean actual = vo.otp_sent_mobile_number_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that otp user fields should be clickable in the verify otp page")
	public void verify_that_otp_user_fields_should_be_clickable_in_the_verify_otp_page() {
		boolean actual = vo.otp_user_fields_is_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that edit number text link should be displayed in the verify otp page")
	public void verify_that_edit_number_text_link_should_be_displayed_in_the_verify_otp_page() {
		boolean actual = vo.edit_number_link_text_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that edit number text link should be clickable in the verify otp page")
	public void verify_that_edit_number_text_link_should_be_clickable_in_the_verify_otp_page() {
		boolean actual = vo.edit_number_text_link_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that resend in countdown should be displayed in the verify otp page")
	public void verify_that_resend_in_countdown_should_be_displayed_in_the_verify_otp_page() {
		boolean actual = vo.resend_in_countdown_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that verify otp button should be displayed in the verify otp page")
	public void verify_that_verify_otp_button_should_be_displayed_in_the_verify_otp_page() {
		boolean actual = vo.verify_otp_button_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that verify otp button should not be clickable in the verify otp page")
	public void verify_that_verify_otp_button_should_not_be_clickable_in_the_verify_otp_page() {
		boolean actual = vo.verify_otp_button_is_clickable();
	    Assert.assertEquals(actual, false);
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
	
	@When("user click in the first box and send valid otp in the user field from the verify otp page")
	public void user_click_in_the_first_box_and_send_the_valid_otp_in_the_user_field_from_the_verify_otp_page() {
		vo.otp_user_field_box_is_clicked();
		vo.otp_user_fields_send_text(AppHooks.prop.getProperty("OTP"));
		boolean actual = vo.otp_user_fields_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@When("user click in the first box and send five digit otp in the user field from the verify otp page")
	public void user_click_in_the_first_box_and_send_five_digit_otp_in_the_user_field_from_the_verify_otp_page() {
		vo.otp_user_field_box_is_clicked();
		vo.otp_user_fields_send_text(AppHooks.prop.getProperty("five_digit_otp"));
		boolean actual = vo.otp_user_fields_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@When("user click in the first box and send invalid otp in the user field from the verify otp page")
	public void user_click_in_the_first_box_and_send_invalid_otp_in_the_user_field_from_the_verify_otp_page() {
		vo.otp_user_field_box_is_clicked();
		vo.otp_user_fields_send_text(AppHooks.prop.getProperty("Invalid_otp"));
		boolean actual = vo.otp_user_fields_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that verify otp button should be clickable in verify otp page")
	public void verify_that_verify_otp_button_should_be_clickable_in_verify_otp_page() {
		vo.back_button_pressed();
		boolean actual = vo.verify_otp_button_is_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user should be on the same verify otp page")
	public void verify_that_user_should_be_on_the_same_verify_otp_page() {
		boolean actual = vo.edit_number_link_text_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that verify otp button should not be clickable in verify otp page")
	public void verify_that_verify_otp_button_should_not_be_clickable_in_verify_otp_page() {
		vo.back_button_pressed();
		boolean actual = vo.verify_otp_button_is_clickable();
	    Assert.assertEquals(actual, false);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@When("user click on the verify otp button in the verify otp page")
	public void user_click_on_the_verify_otp_button_in_the_verify_otp_page() {
	    vo.verify_otp_button_is_clicked();
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user is on the home page of the application")
	public void verify_that_user_is_on_the_home_page_of_the_application() {
	    boolean actual = hp.home_button_in_blue_is_displayed();
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
	
	@When("user click on the edit number link from the verify otp page")
	public void user_click_on_the_edit_number_link_from_the_verify_otp_page() {
	    boolean actual = vo.edit_number_text_link_should_be_clickable();
		vo.edit_number_text_link_should_be_clicked();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@When("user click on the back button in the verify otp page")
	public void user_click_on_the_back_button_in_the_verify_otp_page() {
	    boolean actual = vo.back_button_is_clickable();
		vo.back_button_is_clicked();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user should be on the log in page from verify otp page")
	public void verify_that_user_should_be_on_the_log_in_page_from_verify_otp_page() {
		boolean actual = li.country_code_dropodown_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user should be on the sign up page from verify otp page")
	public void verify_that_user_should_be_on_the_sign_up_page_from_verify_otp_page() {
		boolean actual = sp.mobile_number_user_field_is_displayed();
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
	 */
	
	@When("user click on the resend otp link from the verify otp page")
	public void user_click_on_the_resend_otp_link_from_the_verify_otp_page() {
	    boolean actual = vo.resend_otp_link_is_clickable();
	    vo.resend_otp_link_is_clicked();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that user should get the respected pop with message in the verify otp page")
	public void verify_that_user_should_get_the_respected_pop_with_message_in_the_verify_otp_page() {
	    boolean actual = vo.otp_send_successfully_pop_up_is_displayed();
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
	 * 
	 */
	
	@When("user click on the need help link in the verify otp page")
	public void user_click_on_the_need_help_link_in_the_verify_otp_page() {
		boolean actual = vo.need_help_link_text_is_clickable();
	    vo.need_help_link_text_is_clicked();
	    Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user should be on the contact and support page from verify otp page")
	public void Verify_that_user_should_be_on_the_contact_and_support_page_from_verify_otp_page() {
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
	 * 
	 */
	
	
	
	
}
