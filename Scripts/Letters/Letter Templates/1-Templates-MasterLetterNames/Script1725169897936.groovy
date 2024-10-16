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

WebUI.verifyTextPresent('No templates selected', false)

WebUI.verifyTextPresent('Currently no template is selected. Please choose a template from the left menu to proceed further', 
    false)

WebUI.click(findTestObject('Letters/Letters Template/MasterLibraryTab'))

WebUI.verifyTextPresent('CSRS 4200 - New compilation standards', false)

WebUI.verifyTextPresent('Section 2400 Review standards', false)

WebUI.verifyTextPresent('Tax', false)

WebUI.click(findTestObject('Letters/Letters Template/CanadaComLetter'))

WebUI.verifyTextPresent('Engagement Letter - Existing Standards', false)

WebUI.verifyTextPresent('Management responsibility & acknowledgement CSRS 4200', false)

WebUI.click(findTestObject('Letters/Letters Template/CanadaRevLetter'))

WebUI.verifyTextPresent('Engagement Letter Review - Master', false)

WebUI.verifyTextPresent('Engagement letter Review (Special purpose)', false)

WebUI.verifyTextPresent('Letter to a predecessor', false)

WebUI.verifyTextPresent('Letter to a successor', false)

WebUI.verifyTextPresent('Review Findings letter', false)

WebUI.verifyTextPresent('Request for management assistance Review', false)

WebUI.click(findTestObject('Letters/Letters Template/CanadaTaxLetter'))

WebUI.verifyTextPresent('Tax Engagement Letter', false)

WebUI.click(findTestObject('Letters/Letters Template/Canada_COM_Engagement Letter - Existing Standards'))

WebUI.verifyTextPresent('Engagement Letter - Existing Standards', false)

