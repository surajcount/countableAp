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

WebUI.click(findTestObject('Letters/Letters Template/MasterLibraryTab'))

WebUI.click(findTestObject('Letters/Letters Template/CanadaComLetter'))

WebUI.verifyTextPresent('Engagement Letter - Existing Standards', false)

WebUI.click(findTestObject('Letters/Letters Template/Canada_COM_Engagement Letter - Existing Standards'))

WebUI.verifyTextPresent('Engagement Letter - Existing Standards', false)

WebUI.click(findTestObject('Letters/Letters Template/Letters-Master-FirmTemplates'))

WebUI.verifyTextPresent('Select a location', false)

WebUI.verifyTextPresent('Select where you want to add this letter', false)

WebUI.verifyTextPresent('Existing folder', false)

WebUI.verifyTextPresent('Create new folder', false)

WebUI.click(findTestObject('Letters/Letters Template/Letters-CreateNewFolder-RadioButton'))

WebUI.verifyTextPresent('Folder name', false)

WebUI.setText(findTestObject('Letters/Letters Template/Letter-CreateNewFolder-FolderNameTextField'), 'Automation Letter')

WebUI.click(findTestObject('Letters/Letters Template/Letters-CreateNewFolder-AddButton'))

WebUI.click(findTestObject('Letters/Letters Template/MasterLibraryTab'))

WebUI.click(findTestObject('Letters/Letters Template/Letters-MasterLibrary-ExpandCollapseIcon-COM'))

WebUI.click(findTestObject('Letters/Letters Template/Letters-MasterLibrary-ExpandCollapseIcon-COM'))

WebUI.click(findTestObject('Letters/Letters Template/Letters-MasterLibrary-ALLCheckboxes-COM'))

WebUI.click(findTestObject('Letters/Letters Template/Letters-Master-CopyIcon'))

WebUI.verifyTextPresent('Select a location', false)

WebUI.verifyTextPresent('Select where you want to add this letter', false)

WebUI.verifyTextPresent('Existing folder', false)

WebUI.verifyTextPresent('Create new folder', false)

WebUI.verifyTextPresent('Add to existing folder', false)

WebUI.click(findTestObject('Letters/Letters Template/Letters-Master-Copy-Existing-DropDown'))

WebUI.click(findTestObject('Letters/Letters Template/Letters-MasterLibrary-Copy-DropDown-Selection'))

WebUI.click(findTestObject('Letters/Letters Template/Letters-CreateNewFolder-AddButton'))

WebUI.verifyTextPresent('Letter(s) copied successfully to firm templates', false)

WebUI.verifyTextPresent('Engagement Letter - Existing Standards1', false)

