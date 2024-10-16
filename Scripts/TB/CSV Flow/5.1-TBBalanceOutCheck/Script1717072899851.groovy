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
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.testobject.ConditionType as ConditionType

WebUI.callTestCase(findTestCase('TB/CSV Flow/0-BEFORE TEST Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_UAT (Countable)/span_COM-AUT-Dec312023'))

WebUI.click(findTestObject('Object Repository/Page_UAT (Countable)/span_Trial Balance  Adj. Entries'))

// Define the XPath to locate the number element
String numberElementXPath = '/html[1]/body[1]/app-root[1]/app-dashboard[1]/div[1]/div[1]/div[2]/ntr-dashboard[1]/div[1]/div[3]/trailbalance-details[1]/div[1]/div[2]/div[3]/table[1]/tfoot[1]/tr[1]/td[5]/span[1]'

// Create a TestObject dynamically
TestObject numberElement = new TestObject()

numberElement.addProperty('xpath', ConditionType.EQUALS, numberElementXPath)

// Find the element containing the number
WebElement element = WebUI.findWebElement(numberElement)

// Retrieve the color of the element
String color = element.getCssValue('color' // The CSS property to check color
    )

//Expected
String expectedColor = 'rgba(217, 45, 32, 1)'

// Log the color value
println('Color value: ' + color)

if (color == expectedColor) {
    println('TB is out of balance')
} else {
    println('TB is not out of balance')
}

