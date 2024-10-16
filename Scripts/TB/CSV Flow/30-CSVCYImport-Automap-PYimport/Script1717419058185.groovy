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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.By as By
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.callTestCase(findTestCase('TB/CSV Flow/0-BEFORE TEST Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('TB/CSV Flow/1-EngagementCreation - COM'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('TB/CSV Flow/3-ImportCurrentYr'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_UAT (Countable)/span_Trial Balance  Adj. Entries'))

WebUI.click(findTestObject('Page_UAT (Countable)/span_Auto Map'))

WebUI.click(findTestObject('Page_UAT (Countable)/span_Ignore'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Page_UAT (Countable)/span_Import'))

WebUI.delay(2)

WebUI.uploadFile(findTestObject('TB CSV/TB Obj/CSV Import'), 'C:\\Amol\\TB\\Trial Balance Grouping_2021_peform_import.xlsx')

WebUI.click(findTestObject('TB CSV/TB Obj/OverwritePopupYes'))

WebUI.click(findTestObject('Object Repository/Page_UAT (Countable)/span_Re-Import'))

WebUI.click(findTestObject('Object Repository/Page_UAT (Countable)/span_Import'))

WebUI.click(findTestObject('TB CSV/TB Obj/ImportYearDropdown'))

WebUI.click(findTestObject('TB CSV/TB Obj/previousYrInDropDown'))

WebUI.uploadFile(findTestObject('TB CSV/TB Obj/CSV Import'), 'C:\\Amol\\TB\\Trial Balance Grouping_2020_peform_import.xlsx')

WebUI.click(findTestObject('Object Repository/Page_UAT (Countable)/span_Import_1'))

WebUI.click(findTestObject('Object Repository/Page_UAT (Countable)/span_Import'))

WebUI.click(findTestObject('TB CSV/TB Obj/ImportYearDropdown'))

WebUI.click(findTestObject('TB CSV/TB Obj/lastYrInDropDown'))

WebUI.uploadFile(findTestObject('TB CSV/TB Obj/CSV Import'), 'C:\\Amol\\TB\\Trial Balance Grouping_2019_peform_import.xlsx')

WebUI.click(findTestObject('Object Repository/Page_UAT (Countable)/span_Import_1'))

WebUI.delay(5)

