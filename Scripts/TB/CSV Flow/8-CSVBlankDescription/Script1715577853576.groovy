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

WebUI.callTestCase(findTestCase('TB/CSV Flow/0-BEFORE TEST Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_UAT (Countable)/span_COM-AUT-Dec312023'))

WebUI.click(findTestObject('Object Repository/Page_UAT (Countable)/span_Trial Balance  Adj. Entries'))

WebUI.click(findTestObject('TB CSV/TB Obj/import button'))

WebUI.delay(2)

WebUI.uploadFile(findTestObject('TB CSV/TB Obj/CSV Import'), 'C:\\Amol\\TB\\error\\blank desc.xlsx')

WebUI.verifyTextPresent('Import File Errors', false)

WebUI.verifyTextPresent('Group column data matching with countable groups', false)

TestObject dynamicObjectError1 = new TestObject()

String imageSrc1 = '/assets/images/icons/success-cross.png'

String imageSrc2 = '/assets/images/icons/success-tick.jpg'

dynamicObjectError1.addProperty('xpath', ConditionType.EQUALS, ('//span[.=\'Group column data matching with countable groups\']/preceding-sibling::div//img[@src=\'' + 
    imageSrc2) + '\']')

boolean isImagePresent1 = WebUI.verifyElementPresent(dynamicObjectError1, 10)

WebUI.verifyTextPresent('No duplicate account descriptions found', false)

TestObject dynamicObjectError2 = new TestObject()

dynamicObjectError2.addProperty('xpath', ConditionType.EQUALS, ('//span[.=\'No duplicate account descriptions found\']/preceding-sibling::div//img[@src=\'' + 
    imageSrc2) + '\']')

boolean isImagePresent2 = WebUI.verifyElementPresent(dynamicObjectError2, 10)

WebUI.verifyTextPresent('No duplicate account numbers found', false)

TestObject dynamicObjectError3 = new TestObject()

dynamicObjectError3.addProperty('xpath', ConditionType.EQUALS, ('//span[.=\'No duplicate account numbers found\']/preceding-sibling::div//img[@src=\'' + 
    imageSrc2) + '\']')

boolean isImagePresent3 = WebUI.verifyElementPresent(dynamicObjectError3, 10)

WebUI.verifyTextPresent('Trial Balance data is complete', false)

TestObject dynamicObjectError4 = new TestObject()

dynamicObjectError4.addProperty('xpath', ConditionType.EQUALS, ('//span[.=\'Trial Balance data is complete\']/preceding-sibling::div//img[@src=\'' + 
    imageSrc2) + '\']')

boolean isImagePresent4 = WebUI.verifyElementPresent(dynamicObjectError4, 10)

WebUI.verifyTextPresent('Rows description available', false)

TestObject dynamicObjectError5 = new TestObject()

dynamicObjectError5.addProperty('xpath', ConditionType.EQUALS, ('//span[.=\'Rows description available\']/preceding-sibling::div//img[@src=\'' + 
    imageSrc1) + '\']')

boolean isImagePresent5 = WebUI.verifyElementPresent(dynamicObjectError5, 10)

WebUI.click(findTestObject('TB CSV/TB Obj/CSVErrorObj/OkButton on popup'), FailureHandling.STOP_ON_FAILURE)

