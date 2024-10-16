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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

//Creating new adj entry on CY checking previous 3 yr date picker then while editing checking if previous 2 years can be selected or Not
WebUI.callTestCase(findTestCase('TB/Source Flow/0-Login-UAT'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/AdjEntryRecordingProdIssue/Page_UAT (Countable)/span_COM-AUT-Dec312023'))

WebUI.click(findTestObject('Object Repository/AdjEntryRecordingProdIssue/Page_UAT (Countable)/span_Trial Balance  Adj. Entries'))

WebUI.click(findTestObject('Object Repository/AdjEntryRecordingProdIssue/Page_UAT (Countable)/span_Adjusting Entries'))

WebUI.switchToWindowIndex(1)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/AdjEntryRecordingProdIssue/Page_UAT (Countable)/img'))

WebUI.switchToWindowIndex(2)

WebUI.maximizeWindow()

WebUI.delay(2)

WebUI.getText(findTestObject('AdjEntryRecordingProdIssue/Page_UAT (Countable)/EntryDateAdjEntryWindow'))

WebUI.click(findTestObject('Object Repository/AdjEntryRecordingProdIssue/Page_UAT (Countable)/button_Entry Date_mdc-icon-button mat-mdc-i_3afd78'))

WebUI.click(findTestObject('Object Repository/AdjEntryRecordingProdIssue/Page_UAT (Countable)/span_DEC 2023'))

WebUI.click(findTestObject('Object Repository/AdjEntryRecordingProdIssue/Page_UAT (Countable)/span_2022'))

if (true) {
    println('Button is clickable')
} else {
    println('Button is not clickable')

    KeywordUtil.markFailed('Button should be ENABLED but it is DISABLED.')
}

WebUI.click(findTestObject('Object Repository/AdjEntryRecordingProdIssue/Page_UAT (Countable)/span_2022_1'))

WebUI.click(findTestObject('Object Repository/AdjEntryRecordingProdIssue/Page_UAT (Countable)/span_DEC 2022'))

WebUI.click(findTestObject('Object Repository/AdjEntryRecordingProdIssue/Page_UAT (Countable)/span_2021'))

if (true) {
    println('Button is clickable')
} else {
    println('Button is not clickable')

    KeywordUtil.markFailed('Button should be ENABLED but it is DISABLED.')
}

WebUI.click(findTestObject('Object Repository/AdjEntryRecordingProdIssue/Page_UAT (Countable)/span_2021_1'))

WebUI.click(findTestObject('Object Repository/AdjEntryRecordingProdIssue/Page_UAT (Countable)/span_Cancel'))

WebUI.setText(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/input_text_1st ACC desc'), 
    'yr 4320.5')

WebUI.click(findTestObject('Object Repository/AdjEntryRecordingProdIssue/Page_UAT (Countable)/p_3rd yr 4320.5'))

WebUI.setText(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/input_text_2ndAccDesc'), 
    'MSD-WK')

WebUI.click(findTestObject('Object Repository/AdjEntryRecordingProdIssue/Page_UAT (Countable)/p_MSD-WK'))

WebUI.setText(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/Account1Debit1'), 
    '10.10')

WebUI.setText(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjEntryCSV-ADD-EDIT-DELETE-Manual/Account2credit2'), 
    '10.10')

WebUI.setText(findTestObject('Object Repository/AdjEntryRecordingProdIssue/Page_UAT (Countable)/textarea_Notes_mat-input-1'), 
    'enter upper fetched date here - 12/31/2023')

WebUI.click(findTestObject('Object Repository/AdjEntryRecordingProdIssue/Page_UAT (Countable)/span_Save'))

WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('Object Repository/AdjEntryRecordingProdIssue/Page_UAT (Countable)/img_1'))

WebUI.switchToWindowIndex(2)

WebUI.click(findTestObject('Object Repository/AdjEntryRecordingProdIssue/Page_UAT (Countable)/button_Entry Date_mdc-icon-button mat-mdc-i_3afd78'))

WebUI.click(findTestObject('Object Repository/AdjEntryRecordingProdIssue/Page_UAT (Countable)/span_DEC 2023'))

//WebUI.click(findTestObject('Object Repository/AdjEntryRecordingProdIssue/Page_UAT (Countable)/span_2022'))
TestObject buttonElement2022 = findTestObject('Object Repository/AdjEntryRecordingProdIssue/Page_UAT (Countable)/span_2022')

// Get the 'aria-disabled' attribute value
'chcking if 2022 is able to selected or Not'
String ariaDisabledAttributeValue2022 = WebUI.getAttribute(buttonElement2022, 'aria-disabled')

// Check if the button is disabled
if ((ariaDisabledAttributeValue2022 != null) && (ariaDisabledAttributeValue2022.toLowerCase() == 'true')) {
    println('Button is disabled' // Terminate the test case or perform other actions
        )
} else {
    println('Button is enabled')

    KeywordUtil.markFailed('Button should be disabled but it is enabled.')
}

//WebUI.click(findTestObject('Object Repository/AdjEntryRecordingProdIssue/Page_UAT (Countable)/span_2021'))
TestObject buttonElement2021 = findTestObject('Object Repository/AdjEntryRecordingProdIssue/Page_UAT (Countable)/span_2021')

'checking if 2021 is able to selected or Not\r\n'
String ariaDisabledAttributeValue2021 = WebUI.getAttribute(buttonElement2021, 'aria-disabled')

// Check if the button is disabled
if ((ariaDisabledAttributeValue2021 != null) && (ariaDisabledAttributeValue2021.toLowerCase() == 'true')) {
    println('Button is disabled' // Terminate the test case or perform other actions
        )
} else {
    println('Button is enabled')

    KeywordUtil.markFailed('Button should be disabled but it is enabled.')
}

WebUI.click(findTestObject('Object Repository/AdjEntryRecordingProdIssue/Page_UAT (Countable)/span_2023'))

WebUI.click(findTestObject('Object Repository/AdjEntryRecordingProdIssue/Page_UAT (Countable)/span_MAR'))

WebUI.click(findTestObject('Object Repository/AdjEntryRecordingProdIssue/Page_UAT (Countable)/span_1'))

WebUI.click(findTestObject('Object Repository/AdjEntryRecordingProdIssue/Page_UAT (Countable)/span_Apply'))

String dateAfterEdit = WebUI.getText(findTestObject('AdjEntryRecordingProdIssue/Page_UAT (Countable)/EntryDateAdjEntryWindow'))

print(dateAfterEdit)

//WebUI.setText(findTestObject('Object Repository/AdjEntryRecordingProdIssue/Page_UAT (Countable)/textarea_Notes_mat-input-1'), 
//  'enter upper fetched date here - 12/31/2023 >> to 3/1/2023')
WebUI.setText(findTestObject('Object Repository/AdjEntryRecordingProdIssue/Page_UAT (Countable)/textarea_Notes_mat-input-1'), 
    'enter upper fetched date here - 12/31/2023 >> to 3/1/2023')

WebUI.click(findTestObject('Object Repository/AdjEntryRecordingProdIssue/Page_UAT (Countable)/span_Save'))

WebUI.delay(5)

WebUI.closeWindowIndex(1)

