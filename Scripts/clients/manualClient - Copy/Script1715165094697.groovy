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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://uat.adinovis.com/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_UAT (Countable)/input_Email_mat-input-0'), 'uatcanada25@yopmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_UAT (Countable)/input_Password_mat-input-1'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('Object Repository/Page_UAT (Countable)/mat-icon_visibility_off'))

WebUI.click(findTestObject('Object Repository/Page_UAT (Countable)/span_Login'))

WebUI.click(findTestObject('Object Repository/Page_UAT (Countable)/img'))

WebUI.click(findTestObject('Object Repository/client page/AddClient'))

WebUI.click(findTestObject('Object Repository/client page/Add New Client Button'))

WebUI.setText(findTestObject('Object Repository/client page/EntityName_mat-input-8'), 'Automation Client')

WebUI.click(findTestObject('client page/Corporation Field'))

WebUI.click(findTestObject('Object Repository/client page/div_Corporation'))

WebUI.setText(findTestObject('Object Repository/client page/IncorporationDate'), '1/1/2018')

WebUI.setText(findTestObject('Object Repository/client page/Client First Name'), 'Automation')

WebUI.setText(findTestObject('Object Repository/client page/Client Last Name'), 'Client')

WebUI.setText(findTestObject('Object Repository/client page/Client Email'), 'automanual@yopmail.com')

WebUI.click(findTestObject('Object Repository/client page/div_Engagement Partner'))

WebUI.click(findTestObject('Object Repository/client page/p_uatcanada25yopmail.com - UAT'))

WebUI.click(findTestObject('Object Repository/client page/span_Add'))

String str = WebUI.getText(findTestObject('Object Repository/Page_UAT (Countable)/div_toaster'))

System.out.println('Str is ' + str)

if (true) {
}

WebUI.setText(findTestObject('Object Repository/client page/EntityName_mat-input-8'), 'Automation Client 2')

WebUI.click(findTestObject('Object Repository/client page/span_Add'))

String str2 = WebUI.getText(findTestObject('Object Repository/Page_UAT (Countable)/div_toaster'))

System.out.println('Str is ' + str2)

