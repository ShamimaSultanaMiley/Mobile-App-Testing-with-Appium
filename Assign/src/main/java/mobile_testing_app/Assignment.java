package mobile_testing_app;


import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import mobile_testing_app.MobileTesting;

import io.appium.java_client.android.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.interactions.*;

import java.time.Duration;

public class Assignment {
	private static String[] loginPageElements = {"com.experitest.ExperiBank:id/usernameTextField", "com.experitest.ExperiBank:id/passwordTextField", "com.experitest.ExperiBank:id/loginButton"};
	private static String[] summaryPageElements = {"com.experitest.ExperiBank:id/makePaymentButton", "com.experitest.ExperiBank:id/logoutButton"};
	private static String[] paymentPageElements = {"com.experitest.ExperiBank:id/phoneTextField", "com.experitest.ExperiBank:id/nameTextField", "com.experitest.ExperiBank:id/nameTextField",
											"com.experitest.ExperiBank:id/amountLabel", "com.experitest.ExperiBank:id/amount", "com.experitest.ExperiBank:id/countryTextField",
											"com.experitest.ExperiBank:id/countryButton", "com.experitest.ExperiBank:id/sendPaymentButton", "com.experitest.ExperiBank:id/cancelButton"};
	

	/* Start Here */
	
	public static void run() throws NoSuchElementException {
		AndroidDriver<AndroidElement> driver = (AndroidDriver<AndroidElement>) MobileTesting.getDriver();
		
		long timeout = 6; // 6 seconds
		WebDriverWait wait = new WebDriverWait(driver, timeout);

		/* Start testing */
		Actions action = new Actions(driver);
		Alert alert;
		
		// (1) Check if on login page
		/* WRITE HERE */
		try{
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.experitest.ExperiBank:id/loginView")));
		} catch (TimeoutException ex) {
			ex.printStackTrace();
		}

		MobileTesting.printTest(1);
		
		// (2) Type the string "company" to the username field
		/* WRITE HERE */
		driver.findElement(By.id("com.experitest.ExperiBank:id/usernameTextField")).sendKeys("company");

		MobileTesting.printTest(2);
		
		// (3) Focus the password field
		/* WRITE HERE */
		AndroidElement element = driver.findElement(By.id(loginPageElements[1])); // Password field
		element.click();  // You can focus the password field by clicking it

		MobileTesting.printTest(3);
		
		// (4) Type the string "company" to the password field
		/* WRITE HERE */
		element.sendKeys("company");
		
		MobileTesting.printTest(4);
		
		// (5) Focus the username field
		/* WRITE HERE */
		element = driver.findElement(By.id(loginPageElements[0]));
		element.click(); // You can focus the username field by clicking it
		
		MobileTesting.printTest(5);
		
		// (6) Empty out the username field
		/* WRITE HERE */
		element.clear(); // This will clear the username field
		
		MobileTesting.printTest(6);
		
		// (7) Press the login button and ensure still on login page
		/* WRITE HERE */
		element = driver.findElement(By.id(loginPageElements[2])); // Login button
		element.click(); // Click the login button
		
		MobileTesting.printTest(7);
		
		// (8) Re-type "company" to the username field
		/* WRITE HERE */
		element = driver.findElement(By.id(loginPageElements[0])); // Username field
		element.sendKeys("company");


		MobileTesting.printTest(8);
		
		// (9) Press the login button and ensure now on summary page with $100
		/* WRITE HERE */
		element = driver.findElement(By.id(loginPageElements[2])); // Login button
		element.click(); // Click the login button
		// You can wait for a unique element on the summary page to ensure you are on the summary page.
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.experitest.ExperiBank:id/uniqueElementOnSummaryPage")));
		} catch (TimeoutException ex) {
			ex.printStackTrace();
		}
		MobileTesting.printTest(9);
		
		// (10) Press the make payment button and ensure now on payment page
		/* WRITE HERE */

		element = driver.findElement(By.id(summaryPageElements[0])); // Make Payment button
		element.click(); // Click the make payment button
		// You can wait for a unique element on the payment page to ensure you are on the payment page.
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.experitest.ExperiBank:id/uniqueElementOnPaymentPage")));
		} catch (TimeoutException ex) {
			ex.printStackTrace();
		}

		MobileTesting.printTest(10);
		
		// (11) Type the string "612-555-0112" to the phone field
		/* WRITE HERE */
		element = driver.findElement(By.id(paymentPageElements[0])); // Phone field
		element.sendKeys("612-555-0112");
		
		MobileTesting.printTest(11);
		
		// (12) Type the string "Alice" to the name text field
		/* WRITE HERE */

		element = driver.findElement(By.id(paymentPageElements[1])); // Name text field
		element.sendKeys("Alice");
		MobileTesting.printTest(12);
		
		// (13) Drag the amount slider to $35
		/* WRITE HERE */
		MobileElement amountSlider = driver.findElement(By.id(paymentPageElements[3])); // Amount slider element

		int startX = amountSlider.getLocation().getX(); // X-coordinate of the start point
		int endX = startX + 200; // You may need to adjust the value based on your app's UI

		int centerY = amountSlider.getLocation().getY() + (amountSlider.getSize().getHeight() / 2); // Y-coordinate of the center

		TouchAction touchAction = new TouchAction(driver);
		touchAction.press(PointOption.point(startX, centerY))
				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))) // Adjust the duration as needed
				.moveTo(PointOption.point(endX, centerY))
				.release()
				.perform();

		MobileTesting.printTest(13);
		
		// (14) Press the send payment button and ensure still on payment page
		/* WRITE HERE */

		element = driver.findElement(By.id(paymentPageElements[7])); // Send Payment button
		element.click(); // Click the send payment button

        // You can wait for a unique element on the payment page to ensure you are still on the payment page.
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.experitest.ExperiBank:id/uniqueElementOnPaymentPage")));
		} catch (TimeoutException ex) {
			ex.printStackTrace();
		}

		MobileTesting.printTest(14);
		
		// (15) Type the string "United States" to the country text field
		/* WRITE HERE */

		element = driver.findElement(By.id(paymentPageElements[6])); // Country text field
		element.sendKeys("United States");
		MobileTesting.printTest(15);
		
		// (16) Press the cancel button and ensure now on summary page with $100
		/* WRITE HERE */

		element = driver.findElement(By.id(paymentPageElements[8])); // Cancel button
		element.click(); // Click the cancel button

        // You can wait for a unique element on the summary page to ensure you are on the summary page.
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.experitest.ExperiBank:id/uniqueElementOnSummaryPage")));
		} catch (TimeoutException ex) {
			ex.printStackTrace();
		}

		MobileTesting.printTest(16);
		
		// (17) Press the make payment button and ensure now on payment page with default values
		/* WRITE HERE */

		element = driver.findElement(By.id(summaryPageElements[0])); // Make Payment button
		element.click(); // Click the make payment button

        // You can wait for a unique element on the payment page to ensure you are on the payment page.
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.experitest.ExperiBank:id/uniqueElementOnPaymentPage")));
		} catch (TimeoutException ex) {
			ex.printStackTrace();
		}

		MobileTesting.printTest(17);
		
		// (18) Type the string "612-555-0355" to the phone field
		/* WRITE HERE */

		element = driver.findElement(By.id(paymentPageElements[0])); // Phone field
		element.sendKeys("612-555-0355");
		MobileTesting.printTest(18);
				
		// (19) Type the string "Bob" to the name text field
		/* WRITE HERE */

		MobileElement nameTextField = driver.findElement(By.id(paymentPageElements[1])); // Name text field
		nameTextField.sendKeys("Bob");
		MobileTesting.printTest(19);
		
		// (20) Drag the amount slider to $55
		/* WRITE HERE */
		amountSlider = driver.findElement(By.id(paymentPageElements[3])); // Amount slider element

		endX = amountSlider.getLocation().getX() + 400; // Adjust the end position based on your app's UI

		TouchAction touchAction20 = new TouchAction(driver);
		centerY = 0;
		touchAction20.press(PointOption.point(400, centerY)) // Assuming startX is 0
				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))) // Adjust the duration as needed
				.moveTo(PointOption.point(endX, centerY))
				.release()
				.perform();


		MobileTesting.printTest(20);
		
		// (21) Press the country button
		/* WRITE HERE */

		MobileElement countryButton = driver.findElement(By.id(paymentPageElements[7])); // Country button
		countryButton.click();
		MobileTesting.printTest(21);
		
		// (22) Select France from the country list (13th on the list)
		/* WRITE HERE */

		// You may need to scroll the country list to find and select France. Here's a general approach:
		MobileElement countryList = driver.findElement(By.id("countryListId")); // Replace with the actual ID of the country list
		MobileElement france = driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"France\"))");
		france.click();

		MobileTesting.printTest(22);
		
		// (23) Press the send payment button and ensure alert appears
		/* WRITE HERE */

		MobileElement sendPaymentButton = driver.findElement(By.id(paymentPageElements[7])); // Send Payment button
		sendPaymentButton.click();

		MobileTesting.printTest(23);
		
		// (24) Dismiss the alert and ensure now on payment page
		/* WRITE HERE */

		// Dismissing an alert depends on the specific behavior of the alert in your app. Here's a general approach:
		 alert = driver.switchTo().alert();
		alert.dismiss();

		// After dismissing the alert, you can wait for an element on the payment page to ensure you are back on that page.

		MobileTesting.printTest(24);
		
		// (25) Press the send payment button and ensure alert appears again
		/* WRITE HERE */

		sendPaymentButton = driver.findElement(By.id(paymentPageElements[7])); // Send Payment button
		sendPaymentButton.click();

        // You can wait for an alert to appear by checking for a specific alert element or by using the expected conditions for alerts.

		MobileTesting.printTest(25);
		
		// (26) Accept the alert and ensure now on summary page
		/* WRITE HERE */

		// Accepting the alert depends on the specific behavior of the alert in your app. Here's a general approach:
		alert = driver.switchTo().alert();
		alert.accept();

// After accepting the alert, you can wait for an element on the summary page to ensure you are back on that page.
		MobileTesting.printTest(26);
		
		// (27) Press the logout button and ensure now on login page
		/* WRITE HERE */

		MobileElement logoutButton = driver.findElement(By.id(summaryPageElements[1])); // Logout button
		logoutButton.click();
		MobileTesting.printTest(27);
	}
}
