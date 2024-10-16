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
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.callTestCase(findTestCase('TB/Source Flow/0-Login-UAT'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('DashboardIcons/Client'))

String clientIntegrationButton = clientIntButton
WebDriver driver = DriverFactory.getWebDriver()

WebElement intbutton = driver.findElement(By.xpath("//td[@title='" + clientIntButton + "']/following-sibling::td[3]"))
intbutton.click() 

//WebUI.click(findTestObject('IntegrationOnClientPage/IntegrationButton'))

WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('IntegrationOnClientPage/IntegrationWindowXero'))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('IntegrationOnClientPage/IntegrationWindowXeroUserName'), 'amolpatil@zoof.co.in')

WebUI.sendKeys(findTestObject('IntegrationOnClientPage/IntegrationWindowXeroPassword'), 'amol@1027')

WebUI.click(findTestObject('IntegrationOnClientPage/IntegrationWindowXeroLoginButton'))

WebUI.delay(30)

WebUI.click(findTestObject('IntegrationOnClientPage/IntegrationWindowXeroAllowAccess'))

WebUI.click(findTestObject('IntegrationOnClientPage/CloseIntegrationWindow'))

