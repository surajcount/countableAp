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

WebUI.callTestCase(findTestCase('Workbook/TBGrouping/0-Login-prod Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('workbook/TBGrouping/AutomationEngagementClick TB Flow'))

WebUI.delay(3)

WebUI.click(findTestObject('TB Source/TBButtonLHS'))

WebUI.delay(10)

WebUI.click(findTestObject('workbook/TBGrouping/WorkbookButton'))

WebUI.delay(3)

WebUI.switchToWindowIndex(1)

WebUI.delay(3)

'Add Note to account flow'
WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_AddNote'))

WebUI.verifyTextPresent('Add a Note', false)

WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_Note_CancelBtn'))

WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_AddNote'))

WebUI.setText(findTestObject('workbook/TBGrouping/TBGrouping_Note_TextArea'), 'Adding Note to automation')

WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_Note_SaveBtn'))

WebUI.verifyTextPresent('Notes created successfully', false)

WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_AddNote'))

WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_Notes_Close_X'))

WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_AddNote'))

WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_Note_NameClick'))

WebUI.verifyTextPresent('Notes', false)

WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_Notes_Back Arrow'))

WebUI.mouseOver(findTestObject('workbook/TBGrouping/TBGrouping_Note_NameClick'))

WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_Notes_KebabMenu'))

WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_Note_Kebab_Edit'))

WebUI.setText(findTestObject('workbook/TBGrouping/TBGrouping_Note_TextArea'), 'Edited')

WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_Note_SaveBtn'))

WebUI.verifyTextPresent('Notes created successfully', false)

WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_AddNote'))

WebUI.mouseOver(findTestObject('workbook/TBGrouping/TBGrouping_Note_NameClick'))

WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_Notes_KebabMenu'))

WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_Note_Kebab_Delete'))

WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_Notes_KebabMenu_Delete_DeleteBttn'))

WebUI.verifyTextPresent('Notes deleted successfully', false)

WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_AddNote'))

WebUI.setText(findTestObject('workbook/TBGrouping/TBGrouping_Note_TextArea'), 'Adding Note to automation')

WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_Note_SaveBtn'))

WebUI.verifyTextPresent('Notes created successfully', false)

WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_AddNote'))

WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_Note_NewNote'))

WebUI.setText(findTestObject('workbook/TBGrouping/TBGrouping_Note_TextArea'), 'New Note')

WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_Note_SaveBtn'))

WebUI.verifyTextPresent('Notes created successfully', false)

String notebadgecount = WebUI.getText(findTestObject('workbook/TBGrouping/TBGrouping_Note_CountBadge'))

println('Current Note count is ' + notebadgecount)

