import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait
import org.openqa.selenium.support.ui.ExpectedConditions as ExpectedConditions
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import org.openqa.selenium.interactions.Actions as Actions
import org.openqa.selenium.Keys as Keys

// Call the login test case
WebUI.callTestCase(findTestCase('TB/Source Flow/0-Login-UAT'), [:], FailureHandling.STOP_ON_FAILURE)

String engClick = engagementClick
WebDriver driver = DriverFactory.getWebDriver()

// Use explicit wait to ensure the element is present before interacting
WebDriverWait wait = new WebDriverWait(driver, 30)

try {
	WebElement engbutton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[contains(.,'" + engClick + "')]/preceding-sibling::div")))
	// Scroll into view if necessary
//	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", engbutton)
	// Click the engagement button
	engbutton.click()
} catch (Exception e) {
	KeywordUtil.markFailed("Element not found: " + e.getMessage())
}

//WebUI.click(findTestObject('TB Source/AutomationEngagementClick'))

WebUI.delay(3)

WebUI.click(findTestObject('TB Source/TBButtonLHS'))

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjustingEntryOnTB'))

WebUI.switchToWindowIndex(1)

WebUI.verifyTextPresent('Validated', false)

// Define the test object for the icon
TestObject icon1 = findTestObject('TB Source/AdjEntry/RHSValidateIcon')

// Verify the icon is present
WebUI.verifyElementPresent(icon1, 10)

// Verify the icon is visible
WebUI.verifyElementVisible(icon1)

// Verify the src attribute of the image

String expectedSrcIcon1 = 'https://platform.countable.co/assets/images/ui-uplift-icons/global/check-green-circle.svg'
//String expectedSrcIcon1 = 'https://uat.adinovis.com/assets/images/ui-uplift-icons/global/check-green-circle.svg'

WebUI.verifyElementAttributeValue(icon1, 'src', expectedSrcIcon1, 10)

WebUI.verifyTextPresent('Validation Error', false)
// Define the test object for the icon
TestObject icon2 = findTestObject('TB Source/AdjEntry/RHSValidation Error Icon')

// Verify the icon is present
WebUI.verifyElementPresent(icon2, 10)

// Verify the icon is visible
WebUI.verifyElementVisible(icon2)

// Verify the src attribute of the image
String expectedSrcIcon2 = 'https://platform.countable.co/assets/images/ui-uplift-icons/global/info-error-circle.svg'
//String expectedSrcIcon2 = 'https://uat.adinovis.com/assets/images/ui-uplift-icons/global/info-error-circle.svg'
WebUI.verifyElementAttributeValue(icon2, 'src', expectedSrcIcon2, 10)


WebUI.verifyTextPresent('Pushed to Source', false)
//Define the test object for the icon
TestObject icon3 = findTestObject('TB Source/AdjEntry/RHSPushedToSourceIcon')

// Verify the icon is present
WebUI.verifyElementPresent(icon3, 10)

// Verify the icon is visible
WebUI.verifyElementVisible(icon3)

// Verify the src attribute of the image
String expectedSrcIcon3 = 'https://platform.countable.co/assets/images/ui-uplift-icons/global/p-success.svg'
//String expectedSrcIcon3 = 'https://uat.adinovis.com/assets/images/ui-uplift-icons/global/p-success.svg'

WebUI.verifyElementAttributeValue(icon3, 'src', expectedSrcIcon3, 10)


WebUI.verifyTextPresent('Source Error', false)
//Define the test object for the icon
TestObject icon4 = findTestObject('TB Source/AdjEntry/RHSSourceErrorIcon')

// Verify the icon is present
WebUI.verifyElementPresent(icon4, 10)

// Verify the icon is visible
WebUI.verifyElementVisible(icon4)

// Verify the src attribute of the image
String expectedSrcIcon4 = 'https://platform.countable.co/assets/images/ui-uplift-icons/global/source-error-icon.svg'
//String expectedSrcIcon4 = 'https://uat.adinovis.com/assets/images/ui-uplift-icons/global/source-error-icon.svg'

WebUI.verifyElementAttributeValue(icon4, 'src', expectedSrcIcon4, 10)

