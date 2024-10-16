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

WebUI.callTestCase(findTestCase('TB/CSV Flow/0-BEFORE TEST Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_UAT (Countable)/span_COM-AUT-Dec312023'))

WebUI.click(findTestObject('Object Repository/Page_UAT (Countable)/span_Trial Balance  Adj. Entries'))

WebUI.mouseOver(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/Filters/MapFilter/MapNumberFilterHover'))

WebUI.delay(2)

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/Filters/MapFilter/MapNumberFilterClick'))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Object Repository/TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/Filters/MapFilter/MapNumberFilterSearch'), 
    'inventory')

WebUI.click(findTestObject('Object Repository/TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/Filters/MapFilter/MapNumberSearchSelection'))

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/Filters/DescriptionFilter/FilterWindowClose'))

WebUI.mouseOver(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/Filters/MapFilter/MapNumberFilterHover'))

WebUI.delay(2)

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/Filters/MapFilter/MapNumberFilterClick'))

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/Filters/DescriptionFilter/FilterWindowClearAll'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/Filters/MapFilter/MapNumberFilterHover'))

WebUI.delay(2)

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/Filters/MapFilter/MapNumberFilterClick'))

WebUI.scrollToElement(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/Filters/MapFilter/MapNumberScrollandSelect'), 
    30)

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/Filters/MapFilter/MapNumberScrollandSelect'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/Filters/DescriptionFilter/FilterWindowClose'))

WebUI.mouseOver(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/Filters/MapFilter/MapNumberFilterHover'))

WebUI.delay(2)

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/Filters/MapFilter/MapNumberFilterClick'))

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/Filters/DescriptionFilter/FilterWindowClearAll'))

