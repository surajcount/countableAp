import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait
import org.openqa.selenium.support.ui.ExpectedConditions as ExpectedConditions
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor

WebUI.callTestCase(findTestCase('TB/Source Flow/0-Login-UAT'), [:], FailureHandling.STOP_ON_FAILURE)


String engClick = engagementClick
WebDriver driver = DriverFactory.getWebDriver()

// Use explicit wait to ensure the element is present before interacting
WebDriverWait wait = new WebDriverWait(driver, 30)

try {
	WebElement engbutton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[contains(.,'" + engClick + "')]/preceding-sibling::div")))
	// Scroll into view if necessary
	//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", engbutton)
	// Click the engagement button
	engbutton.click()
} catch (Exception e) {
	KeywordUtil.markFailed("Element not found: " + e.getMessage())
}

//WebUI.click(findTestObject('TB Source/AutomationEngagementClick'))

WebUI.delay(3)

WebUI.click(findTestObject('TB Source/TBButtonLHS'))

WebUI.delay(4)

String TBfinalValueCY = WebUI.getText(findTestObject('TB Source/FinalPYNetIncome'))

println(TBfinalValueCY)

WebUI.click(findTestObject('TB Source/LHSFinancialStatement'))

WebUI.click(findTestObject('TB Source/LHSFinancialStatementDoc'))

WebUI.click(findTestObject('TB Source/FSStatementOfLossAndDeficit'))

String statementCYNetLoss = WebUI.getText(findTestObject('TB Source/StatementOfLossAndDeficitCYNetLoss'))

println(statementCYNetLoss)

// Function to convert text to numeric value considering negative values in parentheses
// Remove parentheses and convert to negative value
// Convert directly to positive value
// Convert the text values to numeric values considering negative values
double value1 = parseValue(TBfinalValueCY)

double value2 = parseValue(statementCYNetLoss)

// Round off the numeric values to the nearest whole number
long roundedValue1 = Math.round(value1)

long roundedValue2 = Math.round(value2)

// Print the values for verification
println('Rounded Value 1: ' + roundedValue1)

println('Rounded Value 2: ' + roundedValue2)

// Compare the rounded numeric values
if (roundedValue1 == roundedValue2) {
    println('The values are equal according to accounting standards.')
} else {
    println('The values are not equal according to accounting standards.')
}

double parseValue(String valueText) {
    if (valueText.startsWith('(') && valueText.endsWith(')')) {
        return -(Double.parseDouble(valueText.replace('(', '').replace(')', '')))
    } else {
        return Double.parseDouble(valueText)
    }
}

