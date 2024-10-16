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
import com.kms.katalon.core.webui.keyword.builtin.ScrollToElementKeyword as ScrollToElementKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
//import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper

WebUI.callTestCase(findTestCase('Workbook/TBGrouping/0-Login-prod Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('workbook/TBGrouping/AutomationEngagementClick TB Flow'))

WebUI.delay(3)

WebUI.click(findTestObject('TB Source/TBButtonLHS'))

WebUI.delay(10)

WebUI.click(findTestObject('workbook/TBGrouping/WorkbookButton'))

WebUI.delay(3)

WebUI.switchToWindowIndex(1)

WebUI.delay(3)

'1st checkbox of TB grouping'
WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_Checkboxes1'))

'2nd checkbox of TB grouping'
WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_Checkboxes2'))

'Leadsheet option after checkbox'
WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_Map No. Tab'))

'Search Field'
WebUI.setText(findTestObject('workbook/TBGrouping/TBGrouping_LS_SearchField'), 'Accounts Receivable')

WebUI.delay(5)

WebUI.mouseOver(findTestObject('workbook/TBGrouping/TBGrouping_Map number_AR_Plus Icon - Copy'))

//WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_Map number_AR_Plus Icon'))
'search result selection'
WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_MapNo._Search_AR_ARSelection'))

WebUI.delay(5)

'Move button\r\n'
WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_LS-MapNo_MoveBtn'))

WebUI.delay(4)

WebDriver driver = DriverFactory.getWebDriver()

// Locate the section title 'B - Accounts Receivable'
WebElement sectionElement = driver.findElement(By.xpath('//span[contains(text(),\'B - Accounts Receivable\')]'))

// Find all 'CHG' badges under this specific section
List<WebElement> chgBadgesUnderSection = sectionElement.findElements(By.xpath('//span[contains(text(),\'CHG\')]'))

// Verify if there are any 'CHG' badges under the section
if (chgBadgesUnderSection.size() > 0) {
    println('CHG badges are present under \'B - Accounts Receivable\'.')
} else {
    println('No CHG badges found under \'B - Accounts Receivable\'.')
}

// Get the WebDriver instance from Katalon
//WebDriver driver = DriverFactory.getWebDriver()
// Locate all the span elements with 'CHG' text
'code to select the CHG tag accounts'
List<WebElement> chgElements = driver.findElements(By.xpath('//span[contains(text(),\'CHG\')]'))

// Iterate through each matching span element and click the checkbox in the related div
for (WebElement chgElement : chgElements) {
    // Find the checkbox associated with this span directly by navigating the DOM structure
    WebElement checkbox = chgElement.findElement(By.xpath('.//following::input[@type=\'checkbox\'][1]'))

    // Click the checkbox if it's not already selected
    if (!(checkbox.isSelected())) {
        checkbox.click()
    }
}

'Leadsheet option after checkbox'
WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_Map No. Tab'))

WebUI.delay(5)

'Search Field'
WebUI.setText(findTestObject('workbook/TBGrouping/TBGrouping_LS_SearchField'), '1000.00')

WebUI.delay(5)

'search result selection'
WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_LS_SearchResultSelection'))

WebUI.delay(5)

'Move button\r\n'
WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_LS-MapNo_MoveBtn'))

WebUI.delay(4)

WebUI.mouseOver(findTestObject('workbook/TBGrouping/TBGrouping_MapNumber_1000.00_Hover'))

WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_MapNumber_1000.00_Hover'))

WebUI.scrollToElement(findTestObject('workbook/TBGrouping/TB Grouping_MapNumber_ScrollTo - Minerals'), 40)

WebUI.click(findTestObject('workbook/TBGrouping/TB Grouping_MapNumber_ScrollTo - Machinery Expenses - Select - Copy'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_MoveLS_YesButton'))

WebUI.scrollToElement(findTestObject('workbook/TBGrouping/TBGrouping_MapNo_ScrollToMapNumber'), 0)

