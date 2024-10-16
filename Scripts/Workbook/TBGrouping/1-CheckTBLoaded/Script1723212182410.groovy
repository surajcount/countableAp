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
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.support.ui.WebDriverWait
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.WebElement
import org.openqa.selenium.By
import com.kms.katalon.core.webui.driver.DriverFactory

WebUI.callTestCase(findTestCase('Workbook/TBGrouping/0-Login-UAT Login'), [:], FailureHandling.STOP_ON_FAILURE)

String engselection = workbookClientName
WebDriver driver = DriverFactory.getWebDriver()

println("Value of engselection: " + engselection)

try {
	WebDriverWait wait = new WebDriverWait(driver, 30) // Wait for up to 30 seconds
	WebElement clientSelecttb = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'" + engselection + "')]/preceding-sibling::div")))
	
	// Scroll to element if necessary
	//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", clientSelecttb)
	
	// Click the element
	clientSelecttb.click()
} catch (Exception e) {
	KeywordUtil.markFailed("Element not found: " + e.getMessage())
}

WebUI.delay(3)

WebUI.click(findTestObject('TB Source/TBButtonLHS'))

WebUI.delay(30)

WebUI.callTestCase(findTestCase('TB/Source Flow/ApplyPPEtoAvoidIgnore'), [:], FailureHandling.STOP_ON_FAILURE)

if (true) {
	println('TB is loaded')
} else {
	println('TB not loaded or already loaded')
}
