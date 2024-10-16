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

//WebUI.click(findTestObject('TB Source/AutomationEngagementClick'))
WebUI.delay(3)

WebUI.click(findTestObject('TB Source/TBButtonLHS'))

//WebUI.click(findTestObject('Object Repository/Page_UAT (Countable)/span_Auto Map'))
//WebUI.click(findTestObject('Object Repository/Page_UAT (Countable)/span_Ignore'))
WebUI.mouseOver(findTestObject('TB CSV/TB Obj/Row of TB'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('TB CSV/TB Obj/TBKebab'))

WebUI.click(findTestObject('TB CSV/TB Obj/TBKebab'))

WebUI.click(findTestObject('Object Repository/client page/span_Add'))

WebUI.setText(findTestObject('Object Repository/Page_UAT (Countable)/input_Acc No_elem84'), '4567.8')

WebUI.setText(findTestObject('Object Repository/Page_UAT (Countable)/TB Description'), 'Automation3')

WebUI.delay(5)

WebUI.click(findTestObject('TB CSV/TB Obj/TBCSVEdit and Delete/mapnumberhyphen/span_-', [('variable') : '']))

WebUI.delay(3)

WebUI.setText(findTestObject('TB Source/MapNumberBoxSearchField'), 'Machinery')

WebUI.click(findTestObject('Object Repository/Page_UAT (Countable)/span_Machinery, equipment, furniture, and fixtures'))

WebUI.click(findTestObject('Object Repository/Page_UAT (Countable)/span_Save'))

WebUI.delay(5)

WebUI.callTestCase(findTestCase('TB/Source Flow/17.1-SourceKebabMenu-AddToSource-HappyFlow'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjustingEntryOnTB'))

WebUI.switchToWindowIndex(1)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/PLusForNew entry'))

WebUI.switchToWindowIndex(2)

WebUI.maximizeWindow()

WebUI.delay(3)

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/input_text_1st ACC desc'))

'Account added to countable only and Object is specific to Automation1 which is account name mentioned on Add script'
WebUI.setText(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/input_text_1st ACC desc'),
	'Automation3')

WebUI.click(findTestObject('TB Source/AddedCountableAccount'))

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/input_text_2ndAccDesc'))

WebUI.setText(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/input_text_2ndAccDesc'),
	'Automation4')

'This is the same account added to source from kebab menu and Object here is specific to Automation2 which is the Account name'
WebUI.click(findTestObject('TB Source/AddedToSourceAccount'))

WebUI.setText(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/Account1Debit1'),
	'10.10')

WebUI.setText(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/Account2credit2'),
	'10.10')

WebUI.click(findTestObject('Object Repository/TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-RECORD/span_Save'))

WebUI.delay(3)

WebUI.switchToWindowIndex(1)

WebUI.scrollToElement(findTestObject('TB Source/AdjEntryScrollToAccount'), 0)

WebUI.click(findTestObject('TB Source/AdjEntry/NewAccValidateANDpushback/CheckboxBesideJE'))

WebUI.click(findTestObject('TB Source/AdjEntry/ValidateAccountV'))

WebUI.verifyTextPresent('Automation3: Account not yet pushed to source or not synced with the source', false)

WebUI.closeWindowIndex(1)
