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
WebDriverWait wait = new WebDriverWait(driver, 60) // Increase the timeout if necessary

try {
	// Wait until the element is clickable (visible and interactable)
	WebElement engbutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(('//p[contains(.,\'' + engClick) + '\')]/preceding-sibling::div')))
	
	// Explicit casting of the driver as JavascriptExecutor
	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver
	
	// Scroll into view
	jsExecutor.executeScript('arguments[0].scrollIntoView({behavior: "smooth", block: "center"});', engbutton)
	
	// Perform the click action
	engbutton.click()
} catch (Exception e) {
	// Log a detailed error message
	KeywordUtil.markFailed('Element not found or scroll issue: ' + e.getMessage())
}

WebUI.click(findTestObject('TB Source/TBButtonLHS'))

String scrollToEle = scrollToAut3
// Create a dynamic TestObject with XPath that finds the element containing the specific text
TestObject dynamicObject = new TestObject('dynamicObject')
dynamicObject.addProperty('xpath', ConditionType.EQUALS, "//td[contains(.,'" + scrollToEle + "')]")

// Scroll to the element containing the text
WebUI.scrollToElement(dynamicObject, 30)

WebUI.delay(2)

// Additional interactions
WebUI.mouseOver(findTestObject('TB Source/SourceAddTag'))
WebUI.delay(2)
String addRed = addTagRed

try {
	// Wait until the element is clickable
	WebElement kebabAdd = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[contains(@title, '" + addRed + "')]/preceding-sibling::td[3]")))
	
	// Print or log the element for debugging purposes
	KeywordUtil.logInfo("Found element with title: " + kebabAdd.getAttribute('title'))
	
	// Perform the click action
	kebabAdd.click()
	
	KeywordUtil.logInfo("Successfully clicked on the kebab element.")
	
} catch (Exception e) {
	// Handle exceptions and log an error message
	KeywordUtil.markFailed("Failed to find or click the element: " + e.getMessage())
}
//WebUI.click(findTestObject('TB CSV/TB Obj/TBKebab'))

String accountNumberfetched = WebUI.getText(findTestObject('TB Source/AccountNumberForNewAccount'))
println(accountNumberfetched)
String accountDescripfetched = WebUI.getText(findTestObject('TB Source/AccountDescriptionForNewAccount'))
println(accountDescripfetched)

WebUI.click(findTestObject('TB Source/SourceTBNewAccountKebabMenu'))
WebUI.click(findTestObject('TB Source/SourceKebabUpdateToSource'))

WebUI.click(findTestObject('TB Source/UpdateToSourcePopupAccountType'))
WebUI.click(findTestObject('TB Source/UpdateToSourcePopupAccountType-Liability'))
WebUI.click(findTestObject('TB Source/UpdateToSourcePopupUpdateAccountButton'))

WebUI.delay(30)

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjustingEntryOnTB'))

WebUI.switchToWindowIndex(1)
WebUI.maximizeWindow()

WebUI.click(findTestObject('TB Source/AdjEntry/NewAccValidateANDpushback/CheckboxBesideJE'))
WebUI.click(findTestObject('TB Source/AdjEntry/ValidateAccountV'))
