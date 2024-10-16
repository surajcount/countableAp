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

WebUI.callTestCase(findTestCase('TB/Source Flow/0-Login-UAT'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('DashboardIcons/Client'))

String clientSelect = clientSelection
WebDriver driver = DriverFactory.getWebDriver()

WebElement clbutton = driver.findElement(By.xpath("//a[contains(text(),'" + clientSelect + "')]"))
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

String teamMemberSelect = clientTeamMember

WebElement teamMember = driver.findElement(By.xpath("//span[contains(text(), '" + teamMemberSelect + "')]"))

// Scroll the team member element into view
((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", teamMember)

// Click on the team member element
teamMember.click()

//WebUI.scrollToElement(findTestObject('Object Repository/CreateEngagement/span_Canada December-CSV'), 10)

//WebUI.click(findTestObject('Object Repository/CreateEngagement/span_Canada December-CSV'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/CreateEngagement/input_Time Allocation()_mat-input-16'), '10')

WebUI.click(findTestObject('Object Repository/CreateEngagement/img_Budgeted hours (H)_ng-star-inserted'))

WebUI.click(findTestObject('Object Repository/CreateEngagement/span_Create Engagement_1'))

