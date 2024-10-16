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
WebUI.callTestCase(findTestCase('TB/CSV Flow/0-BEFORE TEST Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-RECORD/span_COM-AUT-Dec312023'))

WebUI.click(findTestObject('Object Repository/TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-RECORD/span_Trial Balance  Adj. Entries'))

WebUI.click(findTestObject('Object Repository/TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjustingEntryOnTB'))

WebUI.delay(3)

//Edit
WebUI.switchToWindowIndex('1')

WebUI.click(findTestObject('Object Repository/TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-RECORD/EditButtonOnSavedJE'))

WebUI.delay(3)

WebUI.switchToWindowIndex('2')

WebUI.click(findTestObject('Object Repository/TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-RECORD/PlusButtonToAdd3rdAccount'))

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/input_text_3rdAccDesc'))

WebUI.setText(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/input_text_3rdAccDesc'), 
    'Cash & Cash Equivalents (deleted)')

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-RECORD/span_Cash Cash Equivalents (deleted)'))

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-RECORD/PlusButtonToAdd4thAccount'))

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/input_text_4THAccDesc'))

WebUI.setText(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/input_text_4THAccDesc'), 
    'Prepaid expenses:Prepaid Legal Fees (deleted)')

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-RECORD/4THAccountAdding'))

WebUI.setText(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/Account3credit3'), 
    '10.10')

WebUI.setText(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/Account4Debit4'), 
    '10.10')

WebUI.click(findTestObject('Object Repository/TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-RECORD/span_Save'))

WebUI.delay(3)

