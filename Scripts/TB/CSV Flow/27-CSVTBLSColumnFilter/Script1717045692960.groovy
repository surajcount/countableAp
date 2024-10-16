import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
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
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.By as By
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.callTestCase(findTestCase('TB/CSV Flow/0-BEFORE TEST Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_UAT (Countable)/span_COM-AUT-Dec312023'))

WebUI.click(findTestObject('Object Repository/Page_UAT (Countable)/span_Trial Balance  Adj. Entries'))

WebUI.mouseOver(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/Filters/LSFilter/LSFilterHover'))

WebUI.delay(2)

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/Filters/LSFilter/LSFilterClick'))

WebUI.sendKeys(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/Filters/LSFilter/LSFilterSearch'), 'Inventories')

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/Filters/LSFilter/LSFilterSearchSelection'))

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/Filters/DescriptionFilter/FilterWindowClose'))

WebUI.mouseOver(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/Filters/LSFilter/LSFilterHover'))

WebUI.delay(2)

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/Filters/LSFilter/LSFilterClick'))

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/Filters/DescriptionFilter/FilterWindowClearAll'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/Filters/LSFilter/LSFilterHover'))

WebUI.delay(2)

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/Filters/LSFilter/LSFilterClick'))

WebUI.scrollToElement(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/Filters/LSFilter/LSFilterScrollandSelect'), 
    30)

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/Filters/LSFilter/LSFilterScrollandSelect'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/Filters/DescriptionFilter/FilterWindowClose'))

// Fetch filtered column data
TestObject dynamicTestObject = new TestObject()

dynamicTestObject.addProperty('xpath', ConditionType.EQUALS, '//table/tbody/tr/td[12]')

WebElement columnElement = WebUI.findWebElement(dynamicTestObject)

String actualValue = columnElement.getText()

String expectedData = 'I'

if (actualValue.equals(expectedData)) {
    println("Verification passed: Actual value '$actualValue' matches expected value '$expectedData'.")
} else {
    KeywordUtil.markFailedAndStop("Verification failed: Actual value '$actualValue' does not match expected value '$expectedData'.")
}

WebUI.mouseOver(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/Filters/LSFilter/LSFilterHover'))

WebUI.delay(2)

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/Filters/LSFilter/LSFilterClick'))

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/Filters/DescriptionFilter/FilterWindowClearAll'))

