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
import java.nio.file.*
import java.util.concurrent.TimeUnit as TimeUnit

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

WebUI.click(findTestObject('TB CSV/TB Obj/ExportButton'))

WebUI.click(findTestObject('TB CSV/TB Obj/ExportPdf'))

WebUI.click(findTestObject('TB CSV/TB Obj/ExportButton'))

WebUI.click(findTestObject('TB CSV/TB Obj/ExportExcel'))

WebUI.click(findTestObject('TB CSV/TB Obj/ExportButton'))

WebUI.click(findTestObject('TB CSV/TB Obj/ExportGfi'))

