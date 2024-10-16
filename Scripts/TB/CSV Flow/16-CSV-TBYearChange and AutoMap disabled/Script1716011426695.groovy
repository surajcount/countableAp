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
import org.openqa.selenium.interactions.Actions as Actions
import com.kms.katalon.core.webui.driver.DriverFactory as driver
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver

//WebUI.callTestCase(findTestCase('TB/CSV Flow/EngagementCreation old design'), [:], FailureHandling.STOP_ON_FAILURE)
//WebUI.callTestCase(findTestCase('TB/CSV Flow/3-ImportCurrentYr'), [:], FailureHandling.STOP_ON_FAILURE)
//WebUI.callTestCase(findTestCase('TB/CSV Flow/4-ImportPreviousYrs'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.openBrowser('')

WebUI.navigateToUrl('https://uat.adinovis.com/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_UAT (Countable)/input_Email_mat-input-0'), 'v22canada@yopmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_UAT (Countable)/input_Password_mat-input-1'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('Object Repository/Page_UAT (Countable)/span_Login'))

WebUI.click(findTestObject('Object Repository/Page_UAT (Countable)/span_COM-AUT-Dec312023'))

WebUI.click(findTestObject('Object Repository/Page_UAT (Countable)/span_Trial Balance  Adj. Entries'))

// Wait for the button to be present for CURRENT YEAR
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_UAT (Countable)/span_Auto Map'), 10)

// Get the 'disabled' attribute value
String isDisabledCY = WebUI.getAttribute(findTestObject('Object Repository/Page_UAT (Countable)/span_Auto Map'), 'disabled')

// Use an if condition to check if the button is disabled
if ((isDisabledCY == 'true') || (isDisabledCY == 'disabled')) {
    WebUI.comment('Current Year is mapped') // Perform actions if the button is disabled
    // Perform actions if the button is not disabled
} else {
    WebUI.comment('Current Year is not mapped and so click on Auto Map')

    WebUI.click(findTestObject('Page_UAT (Countable)/span_Auto Map'))
}

WebUI.click(findTestObject('TB CSV/TB Obj/TBPageYearDropDown'))

WebUI.click(findTestObject('TB CSV/TB Obj/previousYrInDropDown'))
// Wait for the button to be present for PREVIOUS YEAR
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_UAT (Countable)/span_Auto Map'), 10)

// Get the 'disabled' attribute value
String isDisabledPY1 = WebUI.getAttribute(findTestObject('Object Repository/Page_UAT (Countable)/span_Auto Map'), 'disabled')

// Use an if condition to check if the button is disabled
if ((isDisabledPY1 == 'true') || (isDisabledPY1 == 'disabled')) {
	WebUI.comment('Previous Year is mapped') // Perform actions if the button is disabled
	// Perform actions if the button is not disabled
} else {
	WebUI.comment('Previous Year is not mapped and so click on Auto Map')

	WebUI.click(findTestObject('Page_UAT (Countable)/span_Auto Map'))
}

WebUI.click(findTestObject('TB CSV/TB Obj/TBPageYearDropDown'))

WebUI.click(findTestObject('TB CSV/TB Obj/lastYrInDropDown'))
// Wait for the button to be present for Last YEAR
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_UAT (Countable)/span_Auto Map'), 10)

// Get the 'disabled' attribute value
String isDisabledPY2 = WebUI.getAttribute(findTestObject('Object Repository/Page_UAT (Countable)/span_Auto Map'), 'disabled')

// Use an if condition to check if the button is disabled
if ((isDisabledPY2 == 'true') || (isDisabledPY2 == 'disabled')) {
	WebUI.comment('Last Year is mapped') // Perform actions if the button is disabled
	// Perform actions if the button is not disabled
} else {
	WebUI.comment('Last Year is not mapped and so click on Auto Map')

	WebUI.click(findTestObject('Page_UAT (Countable)/span_Auto Map'))
}


