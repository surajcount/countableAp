import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testobject.TestObject as TestObject
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.builtin.ScrollToTextKeyword as ScrollToTextKeyword
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.builtin.ScrollToElementKeyword as ScrollToElementKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait
import org.openqa.selenium.support.ui.ExpectedConditions as ExpectedConditions
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import org.openqa.selenium.interactions.Actions as Actions
import org.openqa.selenium.Keys as Key

WebUI.callTestCase(findTestCase('Letters/Letter Templates/0-Login-UAT Login US'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('DashboardIcons/Client'))

WebUI.click(findTestObject('Object Repository/client page/AddClient'))

WebUI.click(findTestObject('Object Repository/client page/Add New Client Button'))

String clientEntityNameLetterUS = clientEntityNameLetterUS

WebUI.setText(findTestObject('Object Repository/client page/EntityName_mat-input-8'), clientEntityNameLetterUS)

WebUI.click(findTestObject('client page/Corporation Field'))

WebUI.click(findTestObject('Object Repository/client page/div_Corporation'))

WebUI.click(findTestObject('client page/USEntityTypeArrow'))

WebUI.click(findTestObject('client page/USClientCCorp'))

WebUI.setText(findTestObject('Object Repository/client page/IncorporationDate'), '1/1/2018')

WebUI.setText(findTestObject('Object Repository/client page/Client First Name'), 'Automation')

WebUI.setText(findTestObject('Object Repository/client page/Client Last Name'), 'Client')

String clientEmailIdLetterUS = clientEmailAddressLetterUS

WebUI.setText(findTestObject('Object Repository/client page/Client Email'), clientEmailIdLetterUS)

WebUI.click(findTestObject('client page/div_Engagement Partner - US'))

WebUI.scrollToElement(findTestObject('client page/p_v22canadayopmail.com UAT'), 30)

WebUI.click(findTestObject('client page/p_v22canadayopmail.com UAT'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/client page/span_Add'))

String str = WebUI.getText(findTestObject('Object Repository/Page_UAT (Countable)/div_toaster'))

System.out.println('Str is ' + str)

