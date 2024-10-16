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
import org.openqa.selenium.By as By

WebUI.callTestCase(findTestCase('TB/CSV Flow/0-BEFORE TEST Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_UAT (Countable)/span_COM-AUT-Dec312023'))

WebUI.click(findTestObject('Object Repository/Page_UAT (Countable)/span_Trial Balance  Adj. Entries'))

WebUI.mouseOver(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/Filters/DescriptionFilter/DescriptionFilterHover'))

WebUI.delay(3)

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/Filters/DescriptionFilter/DescriptionFilterClick'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/Filters/DescriptionFilter/DescriptionFilterSearch'), 'inventory')

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/Filters/DescriptionFilter/DescriptionFilterSearchSelection'))

String descriptionselection = WebUI.getText(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/Filters/DescriptionFilter/DescriptionFilterSearchSelection'))

println('Description selected is ' + descriptionselection)

String descriptionselectedonTB = WebUI.getText(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/Filters/DescriptionFilter/DescriptionFilterAfterSelection'))

println('Description showing on TB is ' + descriptionselectedonTB)

if (descriptionselection == descriptionselectedonTB) {
    println('Description Search Result is correct')
} else {
    println('Incorrect Description')
}

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/Filters/DescriptionFilter/FilterWindowClose'))

WebUI.mouseOver(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/Filters/DescriptionFilter/DescriptionFilterHover'))

WebUI.delay(3)

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/Filters/DescriptionFilter/DescriptionFilterClick'))

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/Filters/DescriptionFilter/FilterWindowClearAll'))

WebUI.delay(5)

WebUI.mouseOver(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/Filters/DescriptionFilter/DescriptionFilterHover'))

WebUI.delay(3)

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/Filters/DescriptionFilter/DescriptionFilterClick'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/Filters/DescriptionFilter/DescriptionFilterSelectionOnScroll'), 
    20)

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/Filters/DescriptionFilter/DescriptionFilterSelectionOnScroll'))

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/Filters/DescriptionFilter/FilterWindowClose'))

WebUI.mouseOver(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/Filters/DescriptionFilter/DescriptionFilterHover'))

WebUI.delay(3)

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/Filters/DescriptionFilter/DescriptionFilterClick'))

WebUI.delay(5)

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/Filters/DescriptionFilter/DescriptionFilterSelectAllCheckbox'))

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/Filters/DescriptionFilter/FilterWindowClose'))

