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

WebUI.callTestCase(findTestCase('Letters/Letter Templates/0-Login-UAT Login CANADA'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Letters/Letters Template/Templates Icon'))

WebUI.click(findTestObject('Letters/Letters Template/Drop Down Templates'))

WebUI.click(findTestObject('Letters/Letters Template/Letters Template'))

WebUI.click(findTestObject('Letters/Letters Template/Letters-FirmTemplate-Expand'))

WebUI.click(findTestObject('Letters/Letters Template/FirmTemplate-SubFolder-KebabMenu'))

WebUI.click(findTestObject('Letters/Letters Template/FirmTemplate-SubFolder-KebabMenu - Duplicate'))

WebUI.verifyTextPresent('Select a location', false)

WebUI.verifyTextPresent('Letter name', false)

WebUI.verifyTextPresent('Select where you want to duplicate this letter', false)

WebUI.click(findTestObject('Letters/Letters Template/Letters-Master-Copy-Existing-DropDown'))

WebUI.click(findTestObject('Letters/Letters Template/Letters-MasterLibrary-Copy-DropDown-Selection'))

WebUI.verifyTextPresent('Template name already exists, please enter a different name', false)

WebUI.clearText(findTestObject('Letters/Letters Template/Firm-Kebab-Duplicate-Existing'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Letters/Letters Template/Firm-Kebab-Duplicate-Existing'), 'Renamed Auto Letters')

WebUI.delay(3)

WebUI.click(findTestObject('Letters/Letters Template/Firm-Kebab-Duplicate-Existing-DuplicateButton'))

WebUI.click(findTestObject('Letters/Letters Template/Letters-FirmTemplate-Expand'))

WebUI.click(findTestObject('Letters/Letters Template/FirmTemplate-SubFolder-KebabMenu'))

WebUI.click(findTestObject('Letters/Letters Template/FirmTemplate-SubFolder-KebabMenu - Duplicate'))

WebUI.click(findTestObject('Letters/Letters Template/Letters-CreateNewFolder-RadioButton'))

WebUI.setText(findTestObject('Letters/Letters Template/Letter-CreateNewFolder-FolderNameTextField'), 'Automation Letter')

WebUI.verifyTextPresent('Folder Name already exists', false)

WebUI.clearText(findTestObject('Letters/Letters Template/Letter-CreateNewFolder-FolderNameTextField'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Letters/Letters Template/Letter-CreateNewFolder-FolderNameTextField'), 'New Folder Duplicate @123')

WebUI.click(findTestObject('Letters/Letters Template/Firm-Kebab-Duplicate-Existing-DuplicateButton'))

WebUI.delay(3)

