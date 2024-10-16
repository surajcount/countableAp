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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.WebElement
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testobject.TestObject


WebUI.callTestCase(findTestCase('TB/Source Flow/0-Login-UAT'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TB Source/AutomationEngagementClick'))

WebUI.delay(3)

WebUI.click(findTestObject('TB Source/TBButtonLHS'))

// Replace 'Unmap' and 'AutoMap' with the actual test objects of your buttons
TestObject button1 = findTestObject('TB Source/SourceTBUnmapButtonDisabled')
TestObject button2 = findTestObject('TB Source/SourceTBAutoMapButtonDisabled')

// Check if Button1 is enabled or disabled
boolean isButton1Clickable = WebUI.verifyElementClickable(button1, FailureHandling.CONTINUE_ON_FAILURE)
String button1DisabledAttribute = WebUI.getAttribute(button1, 'disabled')
boolean isButton1Disabled = (button1DisabledAttribute != null && button1DisabledAttribute.equals('true'))

if (isButton1Clickable && !isButton1Disabled) {
	println('Button 1 is enabled and clickable')
} else if (isButton1Disabled) {
	println('Button 1 is disabled')
} else {
	println('Button 1 is not clickable but does not have the disabled attribute explicitly set')
}

// Check if Button2 is enabled or disabled
boolean isButton2Clickable = WebUI.verifyElementClickable(button2, FailureHandling.CONTINUE_ON_FAILURE)
String button2DisabledAttribute = WebUI.getAttribute(button2, 'disabled')
boolean isButton2Disabled = (button2DisabledAttribute != null && button2DisabledAttribute.equals('true'))

if (isButton2Clickable && !isButton2Disabled) {
	println('Button 2 is enabled and clickable')
} else if (isButton2Disabled) {
	println('Button 2 is disabled')
} else {
	println('Button 2 is not clickable but does not have the disabled attribute explicitly set')
}