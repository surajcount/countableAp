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

WebUI.callTestCase(findTestCase('TB/CSV Flow/0-BEFORE TEST Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('DashboardIcons/Client'))

WebUI.click(findTestObject('Object Repository/client page/AddClient'))

WebUI.click(findTestObject('Object Repository/client page/Add New Client Button'))

// Define the client name from CSV
String csvClientName = csvClient

// Get the current WebDriver instance
WebDriver driver = DriverFactory.getWebDriver()

// Find the input field using XPath and input the client name
WebElement clientNameField = driver.findElement(By.xpath("//input[@id='mat-input-8']"))
clientNameField.sendKeys(csvClientName)

//WebUI.setText(findTestObject('Object Repository/client page/EntityName_mat-input-8'), 'Automation TB CSV')

WebUI.click(findTestObject('client page/Corporation Field'))

WebUI.click(findTestObject('Object Repository/client page/div_Corporation'))

WebUI.setText(findTestObject('Object Repository/client page/IncorporationDate'), '1/1/2018')

WebUI.setText(findTestObject('Object Repository/client page/Client First Name'), 'Automation')

WebUI.setText(findTestObject('Object Repository/client page/Client Last Name'), 'Client')

// Define the client name from CSV
String csvClientEmail = csvClientEmail

// Get the current WebDriver instance
//WebDriver driver = DriverFactory.getWebDriver()

// Find the input field using XPath and input the client name
WebElement clientEmailField = driver.findElement(By.xpath("//input[@formcontrolname='clientEmail']"))
clientEmailField.sendKeys(csvClientEmail)

//WebUI.setText(findTestObject('Object Repository/client page/Client Email'), 'AutomationCSV@yopmail.com')

WebUI.click(findTestObject('Object Repository/client page/div_Engagement Partner'))


String engagementPartner=engagementPartner
WebElement engagementPartnerClick = driver.findElement(By.xpath("//p[@title='" + engagementPartner + "']"))

engagementPartnerClick.click()


//WebUI.click(findTestObject('client page/p_v29canadayopmail.com UAT'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/client page/span_Add'))

String str = WebUI.getText(findTestObject('Object Repository/Page_UAT (Countable)/div_toaster'))

System.out.println('Str is ' + str)

