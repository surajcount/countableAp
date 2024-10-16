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
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.testobject.ConditionType as ConditionType

WebUI.callTestCase(findTestCase('TB/Source Flow/0-Login-UAT'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TB Source/AutomationEngagementClick'))

WebUI.delay(3)

WebUI.click(findTestObject('TB Source/TBButtonLHS'))

WebUI.scrollToElement(findTestObject('TB Source/AddToSourceAccount - tag verify'), 0)

WebDriver driver = DriverFactory.getWebDriver()

Actions actions = new Actions(driver)

WebUI.delay(2)

WebUI.click(findTestObject('TB Source/SourceTableClick'))

actions.sendKeys(Keys.ARROW_UP).build().perform()

actions.sendKeys(Keys.ARROW_UP).build().perform()

actions.sendKeys(Keys.ARROW_UP).build().perform()

WebUI.delay(2)

WebUI.mouseOver(findTestObject('TB Source/AddToSourceAccount - tag verify'))

String addTagElementXPath = WebUI.getText(findTestObject('TB Source/SourceAddTag'))

println(addTagElementXPath)

WebUI.delay(3)

// Define the XPath to locate the number element
//String addTagElementXPath = '//td[contains(@title,\'Automation2\')]/preceding-sibling::td[3]'
// Create a TestObject dynamically
TestObject addtagElement = new TestObject()
addtagElement.addProperty('xpath', ConditionType.EQUALS, addTagElementXPath)
// Find the element containing the number
WebElement element = WebUI.findWebElement(addtagElement)

// Retrieve the color of the element
String color = element.getCssValue('color') // The CSS property to check color
    

//Expected
String expectedColor = 'rgba(217, 45, 32, 1)'

// Log the color value
println('Color value: ' + color)

if (color == expectedColor) {
    println('Add Tag in Green')
} else {
    println('Add Tag is not in green')
}

