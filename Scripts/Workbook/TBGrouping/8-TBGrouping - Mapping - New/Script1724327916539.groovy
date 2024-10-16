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
import com.kms.katalon.core.webui.keyword.builtin.ScrollToElementKeyword as ScrollToElementKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
//import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper

WebUI.callTestCase(findTestCase('Workbook/TBGrouping/0-Login-prod Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('workbook/TBGrouping/AutomationEngagementClick TB Flow'))

WebUI.delay(3)

WebUI.click(findTestObject('TB Source/TBButtonLHS'))

WebUI.delay(10)

WebUI.click(findTestObject('workbook/TBGrouping/WorkbookButton'))

WebUI.delay(3)

WebUI.switchToWindowIndex(1)

WebUI.delay(3)

'1st checkbox of TB grouping'
WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_Checkboxes1'))

'2nd checkbox of TB grouping'
WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_Checkboxes2'))

'Leadsheet option after checkbox'
WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_Map No. Tab'))

'Leadsheet option after checkbox'
WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_LS_NewlyaddedTab'))

WebUI.verifyTextPresent('No records found!', false)

WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_LS_NewLS_NewButton'))

WebUI.verifyTextPresent('Add New Map No.', false)

WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_NewMap_GroupField'))

WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_LS_NewLS_GroupField - Assets'))

WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_NewMap_SubGroupField'))

WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_NewMap_SubGroupField - CurrentAsset'))

WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_NewMap_Category'))

WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_NewMap_Category Selection'))

WebUI.sendKeys(findTestObject('workbook/TBGrouping/TBGrouping_NewMap_Description'), 'TB Grouping New Map')

WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_LS_NewLS_Add Button'))

WebUI.mouseOver(findTestObject('workbook/TBGrouping/TBGrouping_NewMap_Newly added-HoverKebab'))

WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_NewMap_Newly added-HoverKebab'))

WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_NewMap_Newly added-HoverKebab - Edit'))

WebUI.clearText(findTestObject('workbook/TBGrouping/TBGrouping_NewMap_Description'))

WebUI.sendKeys(findTestObject('workbook/TBGrouping/TBGrouping_NewMap_Description'), 'TB Grouping New Map Edited')

WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_NewMap_Newly added-HoverKebab - Edit - Save'))

WebUI.mouseOver(findTestObject('workbook/TBGrouping/TBGrouping_NewMap_Newly added-HoverKebab'))

WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_NewMap_Newly added-HoverKebab'))

WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_NewMap_Newly added-HoverKebab - Delete'))

WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_NewMap_Newly added-HoverKebab - Delete'))

