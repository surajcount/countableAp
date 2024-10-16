import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.util.concurrent.Delayed as Delayed
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
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait
import org.openqa.selenium.support.ui.ExpectedConditions as ExpectedConditions

WebUI.callTestCase(findTestCase('Letters/Letter Templates/0-Login-UAT Login US'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('DashboardIcons/Client'))

String clientSelectLetterUS = clientSelectionLetterUS

WebDriver driver = DriverFactory.getWebDriver()

WebElement clbutton = driver.findElement(By.xpath(('//a[contains(text(),\'' + clientSelectLetterUS) + '\')]'))

clbutton.click()

//WebUI.click(findTestObject('workbook/TBGrouping/Client Selection For Source Eng creation tb group'))
WebUI.click(findTestObject('Object Repository/CreateEngagement/span_Create Engagement'))

WebUI.click(findTestObject('CreateEngagement/EngagementTypeArrow'))

WebUI.click(findTestObject('CreateEngagement/EngTypeDropDownCompilationCOM'))

WebUI.click(findTestObject('CreateEngagement/CreateEngPopUpProceedBtn'))

WebUI.click(findTestObject('Object Repository/Page_UAT (Countable)/button_PeriodYear End Date_mdc-icon-button _efc6c7'))

WebUI.click(findTestObject('Object Repository/Page_UAT (Countable)/Month'))

WebUI.click(findTestObject('Object Repository/CreateEngagement/Year 2023'))

WebUI.click(findTestObject('Object Repository/CreateEngagement/December 2023'))

WebUI.click(findTestObject('Object Repository/CreateEngagement/31st december 2023'))

WebUI.click(findTestObject('CreateEngagement/ApplyStep1'))

WebUI.setText(findTestObject('Object Repository/CreateEngagement/input_Budget()_mat-input-12'), '10')

WebUI.click(findTestObject('Object Repository/CreateEngagement/input_text'))

WebUI.click(findTestObject('Object Repository/CreateEngagement/span_Statement of Cash Flows and Notes to FI'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/CreateEngagement/span_Team member'))

WebUI.click(findTestObject('CreateEngagement/step2Team member'))

// Assuming clientTeamMemberUS is properly initialized
String teamMemberSelectUS = clientTeamMemberUS

// Check if the team member element is visible
if (WebUI.verifyElementVisible(findTestObject('Object Repository/CreateEngagement/step2Team member'), FailureHandling.OPTIONAL)) {
	// Use a dynamic XPath to find the team member span element
	WebElement teamMemberUS = driver.findElement(By.xpath("(//span[contains(text(), '" + teamMemberSelectUS + "')])[3]"))
	
	// Optional delay for better interaction timing
	WebUI.delay(2)
	
	// Click on the team member element if found
	teamMemberUS.click()
} else {
	// Mark test as failed if the team member element is not visible
	KeywordUtil.markFailed('Team member element is not visible.')
}


//WebUI.scrollToElement(findTestObject('Object Repository/CreateEngagement/span_Canada December-CSV'), 10)
//WebUI.click(findTestObject('Object Repository/CreateEngagement/span_Canada December-CSV'), FailureHandling.STOP_ON_FAILURE)
WebUI.setText(findTestObject('Object Repository/CreateEngagement/input_Time Allocation()_mat-input-16'), '10')

WebUI.click(findTestObject('Object Repository/CreateEngagement/img_Budgeted hours (H)_ng-star-inserted'))

WebUI.click(findTestObject('Object Repository/CreateEngagement/span_Create Engagement_1'))

//----VERIFY ENGAGEMENT AND MANAGEMENT LETTER FOR COM ENGAGEMENT
String engClickUS = engagementClickUS

try {
    // Define WebDriver instance
    //WebDriver driver = DriverFactory.getWebDriver()
    // Define an explicit wait
    WebDriverWait wait = new WebDriverWait(driver, 30)

    // Wait for the loader to disappear (adjust the locator for the loader based on your application)
    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath('//div[@class=\'loader-class\']')))

    // Wait for the element to be clickable after the loader disappears
    WebElement engbutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(), '$engClickUS')]/preceding::td[1]//button")))

    // Scroll into view if necessary
    //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", engbutton)
    // Click the engagement button
    WebUI.delay(30)

    engbutton.click()
}
catch (Exception e) {
    KeywordUtil.markFailed('Element not found or not clickable: ' + e.getMessage())
} 

WebUI.delay(5)

WebElement clientOnboardingSection = driver.findElement(By.xpath('//span[contains(text(),\'Client Onboarding\')]'))

clientOnboardingSection.click()

WebElement comcanadaEL = driver.findElement(By.xpath('//span[contains(text(),\'Engagement Letter\')]'))

comcanadaEL.click()

String actualstrEL = WebUI.getText(findTestObject('Object Repository/Page_UAT (Countable)/div_toaster'))

String expectedstrEL = 'Letter added to the engagement successfully'

System.out.println('Str is ' + actualstrEL)

if (actualstrEL == expectedstrEL) {
    println('US COM Engagement letter Loaded')
} else {
    println('US COM Engagement Letter not loaded')
}

WebUI.delay(5)
