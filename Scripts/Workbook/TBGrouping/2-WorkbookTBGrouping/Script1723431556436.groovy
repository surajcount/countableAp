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

WebUI.callTestCase(findTestCase('Workbook/TBGrouping/0-Login-UAT Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('workbook/TBGrouping/AutomationEngagementClick TB Flow'))

WebUI.delay(3)

WebUI.click(findTestObject('TB Source/TBButtonLHS'))

WebUI.delay(10)

WebUI.click(findTestObject('workbook/TBGrouping/WorkbookButton'))

WebUI.delay(3)

WebUI.switchToWindowIndex(1)

WebUI.delay(3)

'Verify Header Text\r\n'
WebUI.verifyTextPresent('Trial Balance Grouping', false)

WebUI.mouseOver(findTestObject('workbook/TBGrouping/TBGroupingTextLHS'))

WebUI.click(findTestObject('workbook/TBGrouping/TBLHSEdit'))

WebUI.click(findTestObject('workbook/TBGrouping/TBGroupingEDITTextField_Cancel'))

WebUI.mouseOver(findTestObject('workbook/TBGrouping/TBLHSEdit'))

WebUI.click(findTestObject('workbook/TBGrouping/TBLHSEdit'))

WebUI.delay(3)

'Editing LHS TB Grouping label'
WebUI.setText(findTestObject('workbook/TBGrouping/TBEDIT_TEXTFIELD'), 'TB Grouping')

WebUI.click(findTestObject('workbook/TBGrouping/TBEDITField - TickMark'))

WebUI.delay(1)

'Verifying toaster message'
WebUI.verifyTextPresent('Name saved successfully', false)

WebUI.mouseOver(findTestObject('workbook/TBGrouping/TBGrouping_As At'))

WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_As At_ Edit icon'))

'Editing As at text in middle section'
WebUI.setText(findTestObject('workbook/TBGrouping/TBGrouping As AT input field'), 'As at Edited')

WebUI.click(findTestObject('workbook/TBGrouping/TBEDITField - TickMark'))

'Verifying toaster message'
WebUI.verifyTextPresent('Header details updated successfully', false)

WebUI.delay(3)

'Collapse'
WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_CollpaseAll'))

WebUI.delay(3)

'Expand'
WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_Expand All'))

WebUI.delay(3)

'Refresh'
WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_Refresh'))

WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_Export'))

'pdf'
WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_PDF'))

'excel'
WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_Excel'))

