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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import org.openqa.selenium.interactions.Actions as Actions
import org.openqa.selenium.Keys as Keys

// Call the login test case
WebUI.callTestCase(findTestCase('TB/Source Flow/0-Login-UAT'), [:], FailureHandling.STOP_ON_FAILURE)

String engClick = engagementClick
WebDriver driver = DriverFactory.getWebDriver()

// Use explicit wait to ensure the element is present before interacting
WebDriverWait wait = new WebDriverWait(driver, 30)

try {
	WebElement engbutton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[contains(.,'" + engClick + "')]/preceding-sibling::div")))
	// Scroll into view if necessary
//	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", engbutton)
	// Click the engagement button
	engbutton.click()
} catch (Exception e) {
	KeywordUtil.markFailed("Element not found: " + e.getMessage())
}

//WebUI.click(findTestObject('TB Source/AutomationEngagementClick'))

WebUI.delay(3)

WebUI.click(findTestObject('TB Source/TBButtonLHS'))

WebUI.delay(3)

// Define the Test Object for the table cells in the "Acc No." column
TestObject columnCells = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//table/tbody/tr/td[3]')
// Get the list of elements in the "Acc No." column
List<WebElement> accNoCells = WebUI.findWebElements(columnCells, 30)
println('Number of cells in Acc No. column: ' + accNoCells.size())
// Create a list to store the account numbers
List<WebElement> accountNumbers = new ArrayList<String>()
// Loop through the cells and extract the text
for (WebElement cell : accNoCells) {
	String accountNumber = cell.getText()
	accountNumbers.add(accountNumber)
}
// Print the account numbers
println('Account numbers in column 2:')
for (String accountNumber : accountNumbers) {
	println(accountNumber)
}
// Convert the first 10 non-empty values to List<Double>
List<Double> accountNumbersDouble = []
int count = 0
for (String accountNumber : accountNumbers) {
	if (accountNumber && count < 10) {
		try {
			accountNumbersDouble.add(Double.parseDouble(accountNumber))
			count++
		} catch (NumberFormatException e) {
			// Handle invalid format if needed
			println("Invalid format: $accountNumber")
		}
	}
}
// Check if the list is sorted in ascending order
boolean isAscending = true
for (int i = 1; i < accountNumbersDouble.size(); i++) {
	println(accountNumbersDouble[i - 1]  +"----------" +accountNumbersDouble[i])
	if (accountNumbersDouble[i - 1] > accountNumbersDouble[i]) {
		isAscending = false
		break
	}
}
// Check if the list is sorted in descending order
boolean isDescending = true
for (int i = 1; i < accountNumbersDouble.size(); i++) {
	if (accountNumbersDouble[i - 1] < accountNumbersDouble[i]) {
		isDescending = false
		break
	}
}
// Output the result
if (isAscending) {
	println("The first 10 account numbers are sorted in ascending order.")
} else if (isDescending) {
	println("The first 10 account numbers are sorted in descending order.")
} else {
	println("The first 10  account numbers are not sorted.")
}