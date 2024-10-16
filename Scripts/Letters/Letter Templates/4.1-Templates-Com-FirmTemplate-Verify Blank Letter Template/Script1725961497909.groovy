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

	
    WebUI.callTestCase(findTestCase('Letters/Letter Templates/0-Login-UAT Login CANADA'), [:], FailureHandling.STOP_ON_FAILURE)
	WebDriver driver = DriverFactory.getWebDriver()
	
    // Perform actions to add and select the report
    WebUI.click(findTestObject('Letters/Letters Template/Templates Icon'))

    WebUI.click(findTestObject('Letters/Letters Template/Drop Down Templates'))

    WebUI.click(findTestObject('Letters/Letters Template/Letters Template'))

    WebUI.click(findTestObject('Letters/Letters Template/Letters-FirmTemplate-Expand'))

    String blankLetterName = blankReportName //Name declared in variables

	WebElement selectblankletter = driver.findElement(By.xpath("//p[contains(text(), '" + blankLetterName + "')]"))
	selectblankletter.click() // Select the newly added report
	
	String blankLetter = WebUI.getText(findTestObject('Letters/Letters Template/Templates-Letters-Com'))
	
	//===================<<BLANK LETTER>>>=================================================================
	println('--------Actual Letter------------------')
	
	println('Blank Letter Data: ' + blankLetter)
	
	String expectedBlankLetter="""Header goes here
Date



Entity Name

Complete address



Dear 
First Name
,
<Enter Description here>
         Yours truly,
ON BEHALF OF
Firm Name


Firm Signature

(Signature)

Date

(Date)
Footer goes here"""
	
println('Expected Letter Data: ' + expectedBlankLetter)

if (blankLetter.trim() == expectedBlankLetter.trim()) {
	println('Blank Letter matching')
} else {
	println('Blank Not matching')
}
