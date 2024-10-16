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

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/PLusForNew entry'))

WebUI.switchToWindowIndex(2)

WebUI.maximizeWindow()

WebUI.delay(3)

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/input_text_1st ACC desc'))

WebUI.setText(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/input_text_1st ACC desc'), 
    'accounts receivable (A/R)')

WebUI.click(findTestObject('TB Source/AdjEntry/AccountsReceivableAR'))

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/input_text_2ndAccDesc'))

WebUI.setText(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/input_text_2ndAccDesc'), 
    'accounts payable')

WebUI.click(findTestObject('TB Source/AdjEntry/AccountsPayable'))

WebUI.setText(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/Account1Debit1'), 
    '10.10')

WebUI.setText(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/Account2credit2'), 
    '5.00')

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-RECORD/PlusButtonToAdd3rdAccount'))

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/input_text_3rdAccDesc'))

WebUI.setText(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/input_text_3rdAccDesc'), 
    'Retained earning')

WebUI.click(findTestObject('TB Source/AdjEntry/RetainedEarning'))

WebUI.setText(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/Account3credit3'), 
    '5.10')

WebUI.setText(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/textarea_Notes_AddYourNotes_For_Journal_Entry'), 
    'Restricted Accounts')

WebUI.click(findTestObject('Object Repository/TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-RECORD/span_Save'))

WebUI.delay(3)

