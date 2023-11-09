package stepDefinitions.customer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import com.applicationHooks.AppHooks;
import com.pages.Landing_page_objects;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Landing_page {
	Landing_page_objects fp=new Landing_page_objects(DriverFactory.getDriver());
	Logger logger = LogManager.getLogger(Landing_page.class);
	
	/**
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	@Then("Verify that user should displayed the splash screen in the starting of the application")
	public void verify_that_user_should_displayed_the_splash_screen_in_the_starting_of_the_application() {
		boolean actual = fp.splash_screen_logo_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user should be clickable in the enter as guest link in the landing of the application")
	public void verify_that_user_should_be_clickable_in_the_enter_as_guest_link_in_the_landing_of_the_application() {
		boolean actual = fp.enter_as_guest_link_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that user should displayed the enter as guest link in the landing page of the application")
	public void verify_that_user_should_displayed_the_enter_as_guest_link_in_the_landing_page_of_the_application() {
		boolean actual = fp.enter_as_guest_link_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that user should displayed the moving text in the landing page of the application")
	public void verify_that_user_should_displayed_the_moving_text_in_the_landing_page_of_the_application() {
		boolean actual = fp.moving_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user should displayed the dots below the moving text in the landing page of the application")
	public void verify_that_user_should_displayed_the_dots_below_the_moving_text_in_the_landing_page_of_the_application() {
		boolean actual = fp.dots_below_the_moving_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that user should displayed the service men image in the landing page of the application")
	public void verify_that_user_should_displayed_the_service_men_image_in_the_landing_page_of_the_application() {
		boolean actual = fp.service_men_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user should be displayed the sign up button in the landing page of the application")
	public void verify_that_user_should_be_displayed_the_sign_up_button_in_the_landing_page_of_the_application() {
		boolean actual = fp.sign_up_button_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that user should be clickable the sign up button in the landing page of the application")
	public void verify_that_user_should_be_clickable_the_sign_up_button_in_the_landing_page_of_the_application() {
		boolean actual = fp.sign_up_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that user should be displayed the login button in the landing page of the application")
	public void verify_that_user_should_be_displayed_the_login_button_in_the_landing_page_of_the_application() {
		boolean actual = fp.login_button_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that user should be clickable the login button in the landing page of the application")
	public void verify_that_user_should_be_clickable_the_login_button_in_the_landing_page_of_the_application() {
		boolean actual = fp.login_button_is_clickable();
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
	 * 
	 * 
	 */
	
	@When("user click on the enter as guest in the landing page")
	public void user_click_on_the_enter_as_guest_in_the_landing_page() {
	    boolean actual = fp.enter_as_guest_link_is_clickable();
		fp.enter_as_guest_link_is_clicked();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user should get the respected pop as coming soon in the landing page")
	public void verify_that_user_should_get_the_respected_pop_as_coming_soon_in_the_landing_page() {
	    boolean actual = fp.pop_as_coming_soon_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
}
