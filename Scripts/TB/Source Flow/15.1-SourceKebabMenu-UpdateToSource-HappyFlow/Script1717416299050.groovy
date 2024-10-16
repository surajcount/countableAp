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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.callTestCase(findTestCase('TB/Source Flow/11-SourceKebabMenu-Add'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('TB Source/SourceAddTag'), 30)

WebUI.delay(2)

WebDriver driver = DriverFactory.getWebDriver()

Actions actions = new Actions(driver)

WebUI.click(findTestObject('TB Source/SourceTableClick'))

actions.sendKeys(Keys.ARROW_UP).build().perform()

actions.sendKeys(Keys.ARROW_UP).build().perform()

actions.sendKeys(Keys.ARROW_UP).build().perform()

WebUI.delay(2)

WebUI.mouseOver(findTestObject('TB Source/SourceAddTag'))

WebUI.delay(2)

String accountNumberfetched = WebUI.getText(findTestObject('TB Source/AccountNumberForNewAccount - Automation1'))

String accountDescripfetched = WebUI.getText(findTestObject('TB Source/AccountDescriptionForNewAccount - Automation1'))

WebUI.click(findTestObject('TB Source/SourceTBNewAccountKebabMenu - Automation1'))

WebUI.click(findTestObject('TB Source/SourceKebabUpdateToSource'))

String updateToSourceInfoText = WebUI.getText(findTestObject('TB Source/UpdateToSourcePopupInformationText'))

String ExpectedTextPopup = 'Once an account is added to accounting software it cannot be deleted from Countable platform and user needs to log into Xero/QuickBooks/Sage to delete it'

if (updateToSourceInfoText == ExpectedTextPopup) {
    println('PopUp information text matches')
} else {
    println('Information text not matches')
}

String updatetosourcepopupAccountCode = WebUI.getText(findTestObject('TB Source/UpdateToSourcePopupAccountCode'))

println('Account code on popup is ' + updatetosourcepopupAccountCode)

String updatetosourcepopupAccountDescription = WebUI.getText(findTestObject('TB Source/UpdateToSourcePopupAccountDescription'))

println('Account Description on popup is ' + updatetosourcepopupAccountDescription)

WebUI.click(findTestObject('TB Source/UpdateToSourcePopupAccountType'))

WebUI.click(findTestObject('TB Source/UpdateToSourcePopupAccountType-Liability'))

WebUI.click(findTestObject('TB Source/UpdateToSourcePopupUpdateAccountButton'))

