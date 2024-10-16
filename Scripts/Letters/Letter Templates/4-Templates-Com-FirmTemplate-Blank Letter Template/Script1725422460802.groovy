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

try {
    WebUI.callTestCase(findTestCase('Letters/Letter Templates/0-Login-UAT Login CANADA'), [:], FailureHandling.STOP_ON_FAILURE)

    // Perform actions to add and select the report
    WebUI.click(findTestObject('Letters/Letters Template/Templates Icon'))

    WebUI.click(findTestObject('Letters/Letters Template/Drop Down Templates'))

    WebUI.click(findTestObject('Letters/Letters Template/Letters Template'))

    WebUI.click(findTestObject('Letters/Letters Template/Letters-FirmTemplate-Expand'))

    WebUI.click(findTestObject('Letters/Letters Template/Firm-Folder-1stFolder'))

    WebUI.click(findTestObject('Letters/Letters Template/Firm-Folder-Kebab-Create New Template'))

    WebUI.verifyTextPresent('Create New Letter', false)

    String blankLetterName = blankReportName //Name declared in variables

    WebUI.setText(findTestObject('Letters/Letters Template/Firm-Folder-Kebab-Create New Template - TextField'), blankLetterName)

    WebUI.click(findTestObject('Letters/Letters Template/Firm-Folder-Kebab-Create New Template - TextField - CreateBtn'))

    WebUI.verifyTextPresent('Blank Template is successfully saved', false)

    WebUI.click(findTestObject('Letters/Letters Template/Letters-FirmTemplate-Expand'))

    // Step to select the newly added report
    WebDriver driver = DriverFactory.getWebDriver()

    WebElement blankletter = driver.findElement(By.xpath(('//p[contains(text(), \'' + blankLetterName) + '\')]'))

    blankletter.click( // Select the newly added report
        )
}
catch (Exception e) {
    KeywordUtil.markFailed('An error occurred: ' + e.message)
} 
finally { 
    // Step 10: Close the browser if no further steps are needed
}

