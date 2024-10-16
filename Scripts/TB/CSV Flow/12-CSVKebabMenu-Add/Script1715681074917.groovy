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
WebUI.callTestCase(findTestCase('TB/CSV Flow/0-BEFORE TEST Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_UAT (Countable)/span_COM-AUT-Dec312023'))

WebUI.click(findTestObject('Object Repository/Page_UAT (Countable)/span_Trial Balance  Adj. Entries'))

//WebUI.click(findTestObject('Object Repository/Page_UAT (Countable)/span_Auto Map'))
//WebUI.click(findTestObject('Object Repository/Page_UAT (Countable)/span_Ignore'))
WebUI.mouseOver(findTestObject('TB CSV/TB Obj/Row of TB'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('TB CSV/TB Obj/TBKebab'))

WebUI.click(findTestObject('TB CSV/TB Obj/TBKebab'))

WebUI.click(findTestObject('Object Repository/client page/span_Add'))

WebUI.setText(findTestObject('Object Repository/Page_UAT (Countable)/input_Acc No_elem84'), '1234')

WebUI.setText(findTestObject('Object Repository/Page_UAT (Countable)/TB Description'), 'test@1234')

WebUI.delay(5)

WebUI.click(findTestObject('TB CSV/TB Obj/TBCSVEdit and Delete/mapnumberhyphen/span_-', [('variable') : '']))

WebUI.setText(findTestObject('Object Repository/Page_UAT (Countable)/input_Search_mat-input-19'), 'Machinery')

WebUI.click(findTestObject('Object Repository/Page_UAT (Countable)/span_Machinery, equipment, furniture, and fixtures'))

WebUI.click(findTestObject('Object Repository/Page_UAT (Countable)/span_Save'))

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_UAT (Countable)/div_Cashflow Category Updated Successfully'), 
    0)

