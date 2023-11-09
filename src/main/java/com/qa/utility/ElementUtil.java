package com.qa.utility;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.factory.DriverFactory;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class ElementUtil {
	public static ElementUtil eu = new ElementUtil();

//	public void waitForPageLoad(WebDriver driver) {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Contants.small_wait));
//		wait.until(new ExpectedCondition<Boolean>() {
//			public Boolean apply(WebDriver wdriver) {
//				return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
//			}
//		});

	
	
		/*
		 * Wait<WebDriver> wait = new WebDriverWait(driver, 30); wait.until(new
		 * Function<WebDriver, Boolean>() { public Boolean apply(WebDriver driver) {
		 * System.out.println("Current Window State       : " +
		 * String.valueOf(((JavascriptExecutor)
		 * driver).executeScript("return document.readyState"))); return String
		 * .valueOf(((JavascriptExecutor)
		 * driver).executeScript("return document.readyState")) .equals("complete"); }
		 * });
		 */
//	}

	public void window_scrollBy(AndroidDriver driver, int x, int y) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// vertical y and horizontal x
		js.executeScript("window.scrollBy(" + x + "," + y + ")");
	}
	
	
	
	
	
	public void scroll_till_text(AndroidDriver driver, String text) {
		
//		TouchAction action = new TouchAction(driver);
//		Dimension windowSize = driver.manage().window().getSize();
//		Point startingPoint = new Point(windowSize.getWidth() / 2, windowSize.getHeight() * 3 / 4);
//		Point endingPoint = new Point(windowSize.getWidth() / 2, windowSize.getHeight() / 4);
//		LongPress press = new LongPress(startingPoint);
//		MoveTo move = new MoveTo(endingPoint);
//		Release release = new Release(endingPoint);
//		TouchAction scrollAction = action.longPress(press).moveTo(move).release(release);
//		scrollAction.perform();
		
//		WebElement webViewElement = driver.findElement(By.xpath("android.webkit.WebView"));
//		String webContext = driver.getContext(webViewElement);
//		driver.context(webContext);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//		driver.context("NATIVE_APP");

//		List<WebElement> el = driver.findElements(By.xpath(""));
//		MobileElement listitem = (MobileElement) driver.findElement(
//				MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
//						+ "new UiSelector().description(\"text\"));"));
		
		
		
//		AndroidDriver<MobileElement> driver = new AndroidDriver(...);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        WebElement element = driver.findElement(By.id("myElement"));
//        String script = "arguments[0].scrollIntoView(true).instance(0);";
//        js.executeScript(script, element);
    
		
//		try {
			driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
					+ ".scrollIntoView(new UiSelector().textMatches(\""+text+"\").instance(0));"));

//		} catch (Exception e) {
//			driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
//					+ ".scrollIntoView(new UiSelector().textMatches(\""+text+"\").instance(2));"));
//
//		}
		
		
	
	}
	
	
	public void scroll_screen(AndroidDriver driver) {
		
		Dimension size = driver.manage().window().getSize();
		System.out.println(size.getWidth());
		int startx=(int) (size.getWidth()/2);
		System.out.println(size.getHeight());
		int startY=(int) (size.getHeight()/2);
		
		
		//int endx = startx;
		//int endy = (int) (size.getHeight()*0.50);
		PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
		Sequence seq = new Sequence(finger1, 1)
				.addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), 145, 1277))
				.addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
				.addAction(new Pause(finger1, Duration.ofMillis(200)))
				.addAction(finger1.createPointerMove(Duration.ofMillis(200) , PointerInput.Origin.viewport(), startx, startY))
				.addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		
		driver.perform(Collections.singletonList(seq));
		
	}
	
	
	
	
	
	
	
	

	public void wait_for_element_to_be_clickable(AndroidDriver driver, int time, WebElement element) {
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(time));
		wt.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void wait_for_element_to_be_selected(AndroidDriver driver, int time, WebElement element) {
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(time));
		wt.until(ExpectedConditions.elementSelectionStateToBe(element, true));
	}
	
	public void wait_for_element_to_be_not_selected(AndroidDriver driver, int time, WebElement element) {
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(time));
		wt.until(ExpectedConditions.elementSelectionStateToBe(element, false));
	}
	
	public void wait_for_element_to_be_displayed(AndroidDriver driver, int time, WebElement element) {
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(time));
		wt.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void wait_for_element_text_be_cleared(WebDriver driver,int  count , WebElement element) {
		for (int i = 0; i < count; i++) { 
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			element.sendKeys(Keys.CONTROL+"a");
			element.sendKeys(Keys.BACK_SPACE);
		}
	}
	
	public void wait_for_element_to_be_displayed_in_string_form(AndroidDriver driver, int time, WebElement element, String attribute , String value) {
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(time));
		wt.until(ExpectedConditions.attributeContains(element, attribute, value));
	}
	
	public void wait_for_to_be_title_is_displayed(AndroidDriver driver, int time, String title) {
		WebDriverWait wt=new WebDriverWait(driver, Duration.ofSeconds(time));
		wt.until(ExpectedConditions.titleContains(title));
	}

	public void get_window_handels_pages(AndroidDriver driver) {
		String homePageWinId = driver.getWindowHandle();
		System.out.println("Home page window ID: " + homePageWinId);
		Set<String> allWinIds = driver.getWindowHandles();
		System.out.println("All windows ID: " + allWinIds);
		allWinIds.remove(homePageWinId);
		System.out.println("After remoing homeWinID, all windows ID: " + allWinIds);
		Iterator<String> itr = allWinIds.iterator();
		String childWinId = itr.next();
		driver.switchTo().window(childWinId);
		// or
		// switch control to child window
		// driver.switchTo().window(allWinIds.iterator().next());
		System.out.println("new page title: " + driver.getTitle());
		System.out.println("new page ulr: " + driver.getCurrentUrl());
		driver.close();
		// driver.quit();//comment below code
		driver.switchTo().window(homePageWinId);
		// now you are allow to identify any element from home window
		System.out.println("setteled page title: " + driver.getTitle());
		System.out.println("setteled page ulr: " + driver.getCurrentUrl());
	}

	public void clickByJS(WebDriver driver, WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele);
	}

	public boolean isAlertPresent(AndroidDriver driver, Duration time) {
		try {
//			WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(time));
			WebDriverWait wt = new WebDriverWait(driver, time);
			wt.until(ExpectedConditions.alertIsPresent());
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void scroll_till_lement(AndroidDriver driver, WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
	}


	public double get_location_of_element_in_x_axis(WebElement element) {
		Point locaaation = element.getLocation();
		double element_x = locaaation.getX();
		System.out.println(element_x);
		return element_x;
	}
	
	
	public double get_location_of_element_in_y_axis(WebElement element) {
		Point locaaation = element.getLocation();
		double element_y = locaaation.getY();
		System.out.println(element_y);
		return element_y;
	}
	
	
	public void send_text(WebElement element, String value) {
		element.click();
		element.sendKeys(value);
	}

	public void upload_file_auto_it(AndroidDriver driver, WebElement element, String location_of_exe_file) {
		Actions act = new Actions(driver);
		act.moveToElement(element).click().build().perform();
		try {
			Runtime.getRuntime().exec(location_of_exe_file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void rightClick(WebElement option, AndroidDriver driver) {
		Actions action = new Actions(driver);
		action.moveToElement(option).contextClick().build().perform();
	}

	public void mouseHoverWithCords(AndroidDriver driver, WebElement option, int x, int y) {
		Actions action = new Actions(driver);
		action.moveToElement(option, x, y).perform();
	}

	public void mouseHover(AndroidDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}

	public void doubleClick(AndroidDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).doubleClick().perform();
	}

	public void switchToRequiredFrameUsingName(String name, AndroidDriver driver) {
		driver.switchTo().frame(name);
	}

	public void switchToRequiredFrameUsingWebElement(WebElement element, AndroidDriver driver) {
		driver.switchTo().frame(element);
	}

	public void switchToRequiredFrameUsingIndex(int index, AndroidDriver driver) {
		driver.switchTo().frame(index);
	}

	public void switchControlBackToMainPage(AndroidDriver driver) {
		driver.switchTo().defaultContent();
	}

	public WebElement getActiveElement(AndroidDriver driver) {
		return driver.switchTo().activeElement();
	}
	
	public void refresh_your_page(AndroidDriver driver) {
		driver.navigate().refresh();
	}

	public String current_page_title(AndroidDriver driver) {
		return driver.getTitle();
	}
	
	public void scroll_up_body_click(int num, AndroidDriver driver)  {
		WebElement e=driver.findElement(By.xpath("//body"));
		for (int i = 0; i < num; i++) {
			try {
				Thread.sleep(250);
			} catch (InterruptedException ek) {
				ek.printStackTrace();
			}
			e.sendKeys(Keys.PAGE_UP);
		}
	}
	
	public void scroll_down_body_click(int num, AndroidDriver driver)  {
		WebElement e=driver.findElement(By.xpath("//body"));
		for (int i = 0; i < num; i++) {
			try {
				Thread.sleep(250);
			} catch (InterruptedException es) {
				es.printStackTrace();
			}
			e.sendKeys(Keys.PAGE_DOWN);
		}
	}
	
	public void scroll_end_of_page_with_keyboard_click(int num)  {
		for (int i = 0; i < num; i++) {
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			WebElement el=DriverFactory.getDriver().findElement(By.xpath("//body"));
			el.sendKeys(Keys.PAGE_DOWN);
		}
	}
	
	public String project_path() {
		String projectPath = System.getProperty("user.dir");
		return projectPath;
	}
	
	public void navigate_back(AndroidDriver driver) {
		driver.navigate().back();
	}
	
	public void opened_second_tab_with_parent_tab() {
		WebElement body = DriverFactory.getDriver().findElement(By.xpath("//body"));
        body.sendKeys(Keys.CONTROL + "\t");
	}

	public void switch_handel_to_the_second_tab(AndroidDriver driver) {
		 ((JavascriptExecutor) driver).executeScript("window.open()");
	        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	        driver.switchTo().window(tabs.get(1));
	}


	
}
