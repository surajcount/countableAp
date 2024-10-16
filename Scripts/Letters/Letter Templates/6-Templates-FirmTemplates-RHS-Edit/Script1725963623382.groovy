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

WebUI.callTestCase(findTestCase('Letters/Letter Templates/0-Login-UAT Login CANADA'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Letters/Letters Template/Templates Icon'))

WebUI.click(findTestObject('Letters/Letters Template/Drop Down Templates'))

WebUI.click(findTestObject('Letters/Letters Template/Letters Template'))

WebUI.click(findTestObject('Letters/Letters Template/MasterLibraryTab'))

WebUI.click(findTestObject('Letters/Letters Template/Letters-MasterLibrary-ALLCheckboxes-COM'))

WebUI.click(findTestObject('Letters/Letters Template/Letters-Master-CopyIcon'))

WebUI.click(findTestObject('Letters/Letters Template/Letters-Master-Copy-Existing-DropDown'))

WebUI.click(findTestObject('Letters/Letters Template/Letters-MasterLibrary-Copy-DropDown-Selection'))

WebUI.click(findTestObject('Letters/Letters Template/Letters-CreateNewFolder-AddButton'))

WebUI.verifyTextPresent('Letter(s) copied successfully to firm templates', false)

WebUI.verifyTextPresent('Engagement Letter - Existing Standards', false)

WebUI.click(findTestObject('Letters/Letters Template/Firm-EditRHSButton'))

String allElements = WebUI.getText(findTestObject('Letters/Letters Template/Firm-Edit-AllElements'))

println('Actual Elements are ' + allElements)

String expectedElementsTemplate = 'Date\nEntity Name\nAddresse - Management\nAddresse - Board of directors\nAddresse - Shareholders\nYear end date (CY)\nYear end date (PY)\nNote X\nClient City\nCity, Province\nComplete address\nFirm address\nPostal Code\nFirst Name\nLast Name\nBalance Sheet\nStatement of income and Retained Earnings\nFirm Name\nFirm Signature\nClient Signature\nClient Signed Date\nPartner Name'

println('Expected Elements are ' + expectedElementsTemplate)

if (allElements.trim() == expectedElementsTemplate.trim()) {
    println('Elements matching')
} else {
    KeywordUtil.markFailed('Elements Not matching')
}

WebUI.click(findTestObject('Letters/Letters Template/Firm-Edit-Sections'))

String allSections = WebUI.getText(findTestObject('Letters/Letters Template/Firm-Edit-AllSections'))

println('Actual Sections are ' + allSections)

String expectedSections = """Subject
Intended Use of the Compiled Financial Information
Our Responsibilities
Management's Responsibilities
Reporting
Use of Information
File Inspections
Confidentiality
Communications
Other Terms of Engagement
Ownership
Accounting Advice
Dispute Resolution
Indemnity
Limitation of Liability
Time Frames
Fees at Regular Billing Rates
Termination
Survival of Terms
Conclusion
Signature"""

println('Expected Sections are ' + expectedSections)

if (allSections.trim() == expectedSections.trim()) {
	println('Sections matching')
} else {
	KeywordUtil.markFailed('Sections Not matching')
}


