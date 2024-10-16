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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import org.openqa.selenium.WebElement
import java.time.LocalDate
import java.time.format.DateTimeFormatter

WebUI.callTestCase(findTestCase('TB/Source Flow/0-Login-UAT'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/AdjEntryRecordingProdIssue/Page_UAT (Countable)/span_COM-AUT-Dec312023'))

WebUI.click(findTestObject('Object Repository/AdjEntryRecordingProdIssue/Page_UAT (Countable)/span_Trial Balance  Adj. Entries'))

// Find and fetch financial year end date from the application (replace with your own locator)
WebElement financialYearEndDateElement = WebUI.findWebElement(findTestObject('AdjEntryRecordingProdIssue/Page_UAT (Countable)/FetchFinancialYearDate'))
String financialYearEndDateStr = financialYearEndDateElement.getText().trim()
println('Financial Year End date is '+financialYearEndDateStr)

// Convert financial year end date to LocalDate object
DateTimeFormatter financialYearEndFormatter = DateTimeFormatter.ofPattern('MMM dd yyyy')  // Adjust format to match 'Dec 31 2023'
LocalDate financialYearEndDate = LocalDate.parse(financialYearEndDateStr, financialYearEndFormatter)

// Calculate date 3 years ago from financial year end date
LocalDate threeYearsAgo = financialYearEndDate.minusYears(3)

WebUI.click(findTestObject('Object Repository/AdjEntryRecordingProdIssue/Page_UAT (Countable)/span_Adjusting Entries'))

WebUI.switchToWindowIndex(1)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/AdjEntryRecordingProdIssue/Page_UAT (Countable)/img'))

WebUI.switchToWindowIndex(2)

WebUI.maximizeWindow()

WebUI.delay(2)

// Identify the date input field (replace with your own locator)
TestObject dateInputField = findTestObject('AdjEntryRecordingProdIssue/Page_UAT (Countable)/EntryDateAdjEntryWindow')

// Get the 'min' and 'max' attributes from the date input field
String minDateStr = WebUI.getAttribute(dateInputField, 'min')
println('Minimum date that can be selected from HTML '+minDateStr)
String maxDateStr = WebUI.getAttribute(dateInputField, 'max')
println('Maximum date that can be selected from HTML'  +maxDateStr)

// Convert 'min' and 'max' attributes to LocalDate objects using ISO_LOCAL_DATE format
DateTimeFormatter isoFormatter = DateTimeFormatter.ISO_LOCAL_DATE
LocalDate minDate = LocalDate.parse(minDateStr, isoFormatter)
LocalDate maxDate = LocalDate.parse(maxDateStr, isoFormatter)

// Get the selected date and convert it to LocalDate object using MM/dd/yyyy format
String selectedDate = WebUI.getAttribute(dateInputField, 'value')
println('Current date showing is '+selectedDate)
DateTimeFormatter dateInputFormatter = DateTimeFormatter.ofPattern('MM/dd/yyyy')
LocalDate selectedDateObj = LocalDate.parse(selectedDate, dateInputFormatter)

// Verify if the selected date is within the last 3 years from financial year end date
if (selectedDateObj.isAfter(threeYearsAgo) || selectedDateObj.isEqual(threeYearsAgo)) {
	println("PASS: Selected date '${selectedDateObj}' is within the last 3 years from financial year end date (${financialYearEndDate}).")
} else {
	println("FAIL: Selected date '${selectedDateObj}' is NOT within the last 3 years from financial year end date (${financialYearEndDate}).")
	// Handle failure as needed (e.g., mark test as failed)
}
