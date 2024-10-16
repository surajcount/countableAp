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
	//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", engbutton)
	// Click the engagement button
	engbutton.click()
} catch (Exception e) {
	KeywordUtil.markFailed("Element not found: " + e.getMessage())
}

//WebUI.click(findTestObject('TB Source/AutomationEngagementClick'))

WebUI.delay(3)

WebUI.click(findTestObject('TB Source/TBButtonLHS'))

WebUI.click(findTestObject('TB CSV/AdjustingEntryFlow/AdjustingEntryCSV/AdjustingEntryOnTB'))

WebUI.switchToWindowIndex(1)

WebUI.maximizeWindow()

WebUI.delay(4)

WebUI.click(findTestObject('TB Source/AdjEntry/input_Delete All_mat-mdc-checkbox-1-input'))

WebUI.click(findTestObject('TB Source/AdjEntry/ValidateAccountV'))

WebUI.mouseOver(findTestObject('TB Source/AdjEntry/InformationIconBesideJE'))

// Locate the table rows
List<WebElement> rows = WebUI.findWebElements(findTestObject('TB Source/AdjEntry/JE1Table'), 10)

// Iterate through each row to check for the red icon in the first column
for (WebElement row : rows) {
    // Check if the red icon is present in the first column of the current row
    List<WebElement> redIcons = row.findElements(By.xpath('.//td[1]//img[@alt=\'is not valid\']'))

    if (!(redIcons.isEmpty())) {
        // If the red icon is found, get the text of the desired column (e.g., the third column)
        String thirdColumnText = row.findElement(By.xpath('.//td[3]')).getText()

        println('Text of the third column for row with red icon: ' + thirdColumnText) //cash-Amol
		
		//String cashError=WebUI.getText(findTestObject('TB Source/AdjEntry/ErrorCash')) // : Account type is restricted for pushback entry
		// Create a new Test Object dynamically
		/*TestObject dynamicTestObject = new TestObject()
		String dynamicXPath = "//*[contains(substring-after(text(), '"+thirdColumnText+"'), ': Account type is restricted for pushback entry')]"
		dynamicTestObject.addProperty('xpath', ConditionType.EQUALS, dynamicXPath)
		*/
		String restricteddynamicXPath =': Account type is restricted for pushback entry'
		String actualdesiredText = thirdColumnText+restricteddynamicXPath
		println('Cash Error is '+actualdesiredText)
		
		String AccError=': Account type is restricted for pushback entry'
		String expectedError=thirdColumnText+AccError
		
		println('ERROR IN JE IS '+expectedError)
		
		if(actualdesiredText==expectedError) {
			println('Cash Account Error is matching and correct')
		}else {
			println('Error not matching with expected for cash')
		}	
    }
}



