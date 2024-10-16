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
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By

//WebUI.callTestCase(findTestCase('TB/CSV Flow/EngagementCreation old design'), [:], FailureHandling.STOP_ON_FAILURE)
//WebUI.callTestCase(findTestCase('TB/CSV Flow/3-ImportCurrentYr'), [:], FailureHandling.STOP_ON_FAILURE)
//WebUI.callTestCase(findTestCase('TB/CSV Flow/4-ImportPreviousYrs'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('TB/CSV Flow/0-BEFORE TEST Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-RECORD/span_COM-AUT-Dec312023'))

WebUI.click(findTestObject('Object Repository/TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-RECORD/span_Trial Balance  Adj. Entries'))

WebUI.click(findTestObject('Object Repository/TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjustingEntryOnTB'))

WebUI.switchToWindowIndex(1)

WebUI.delay(3)

//Add
WebUI.click(findTestObject('Object Repository/TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/PLusForNew entry'))

WebUI.switchToWindowIndex(2)

WebUI.delay(3)

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/input_text_1st ACC desc'))

WebUI.setText(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/input_text_1st ACC desc'), 
    '1001 RBC IND Chequing (deleted)')

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/p_1010 RBC IND Chequing (deleted)'))

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/input_text_2ndAccDesc'))

WebUI.setText(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/input_text_2ndAccDesc'), 
    'countable cash on hand (deleted)')

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/p_countable cash on hand (deleted)'))

WebUI.setText(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/Account1Debit1'), 
    '10.10')

WebUI.setText(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/Account2credit2'), 
    '10.10')

WebUI.setText(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/textarea_Notes_AddYourNotes_For_Journal_Entry'), 
    'JE Entry')

WebUI.click(findTestObject('Object Repository/TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-RECORD/span_Save'))

WebUI.delay(3)

WebUI.switchToWindowIndex(1)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/PLusForNew entry'))

WebUI.switchToWindowIndex(2)

WebUI.delay(3)

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/EntryType_Arrow_On_Adj_Entry'))

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/span_Eliminating'))

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/input_text_1st ACC desc'))

WebUI.setText(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/input_text_1st ACC desc'), 
    '1001 RBC IND Chequing (deleted)')

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/p_1010 RBC IND Chequing (deleted)'))

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/input_text_2ndAccDesc'))

WebUI.setText(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/input_text_2ndAccDesc'), 
    'countable cash on hand (deleted)')

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/p_countable cash on hand (deleted)'))

WebUI.setText(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/Account1Debit1'), 
    '10.10')

WebUI.setText(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/Account2credit2'), 
    '10.10')

WebUI.setText(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/textarea_Notes_AddYourNotes_For_Eliminating_Entry'), 
    'Eliminating')

WebUI.click(findTestObject('Object Repository/TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-RECORD/span_Save'))

WebUI.delay(3)

WebUI.switchToWindowIndex(1)

WebUI.delay(3)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/PLusForNew entry'))

WebUI.switchToWindowIndex(2)

WebUI.delay(3)

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/EntryType_Arrow_On_Adj_Entry'))

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/span_PBC'))

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/input_text_1st ACC desc'))

WebUI.setText(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/input_text_1st ACC desc'), 
    '1001 RBC IND Chequing (deleted)')

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/p_1010 RBC IND Chequing (deleted)'))

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/input_text_2ndAccDesc'))

WebUI.setText(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/input_text_2ndAccDesc'), 
    'countable cash on hand (deleted)')

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/p_countable cash on hand (deleted)'))

WebUI.setText(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/Account1Debit1'), 
    '10.10')

WebUI.setText(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/Account2credit2'), 
    '10.10')

WebUI.setText(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/textarea_Notes_AddYourNotes_For_PBC_Entry'), 
    'PBC')

WebUI.click(findTestObject('Object Repository/TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-RECORD/span_Save'))

WebUI.delay(2)

WebUI.switchToWindowIndex(1)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/PLusForNew entry'))

WebUI.switchToWindowIndex(2)

WebUI.delay(2)

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/EntryType_Arrow_On_Adj_Entry'))

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/span_Reclassifying Entry'))

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/input_text_1st ACC desc'))

WebUI.setText(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/input_text_1st ACC desc'), 
    '1001 RBC IND Chequing (deleted)')

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/p_1010 RBC IND Chequing (deleted)'))

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/input_text_2ndAccDesc'))

WebUI.setText(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/input_text_2ndAccDesc'), 
    'countable cash on hand (deleted)')

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/p_countable cash on hand (deleted)'))

WebUI.setText(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/Account1Debit1'), 
    '10.10')

WebUI.setText(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/Account2credit2'), 
    '10.10')

WebUI.setText(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/textarea_Notes_AddYourNotes_For_RJE_Entry'), 
    'Reclassifying Entry')

WebUI.click(findTestObject('Object Repository/TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-RECORD/span_Save'))

WebUI.delay(3)

//WebUI.switchToWindowIndex(1)
//WebUI.delay(3)
WebUI.switchToWindowIndex(1)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/PLusForNew entry'))

WebUI.switchToWindowIndex(2)

WebUI.delay(2)

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/EntryType_Arrow_On_Adj_Entry'))

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/span_Tax'))

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/input_text_1st ACC desc'))

WebUI.setText(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/input_text_1st ACC desc'), 
    '1001 RBC IND Chequing (deleted)')

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/p_1010 RBC IND Chequing (deleted)'))

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/input_text_2ndAccDesc'))

WebUI.setText(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/input_text_2ndAccDesc'), 
    'countable cash on hand (deleted)')

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/p_countable cash on hand (deleted)'))

WebUI.setText(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/Account1Debit1'), 
    '10.10')

WebUI.setText(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/Account2credit2'), 
    '10.10')

WebUI.setText(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/textarea_Notes_AddYourNotes_For_RJE_Entry'), 
    'Tax')

WebUI.click(findTestObject('Object Repository/TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-RECORD/span_Save'))

WebUI.delay(3)

