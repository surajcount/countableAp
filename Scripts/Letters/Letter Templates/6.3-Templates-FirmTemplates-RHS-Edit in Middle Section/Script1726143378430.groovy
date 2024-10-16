import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testobject.TestObject as TestObject
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.builtin.ScrollToTextKeyword as ScrollToTextKeyword
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.builtin.ScrollToElementKeyword as ScrollToElementKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait
import org.openqa.selenium.support.ui.ExpectedConditions as ExpectedConditions
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import org.openqa.selenium.interactions.Actions as Actions
import org.openqa.selenium.Keys as Key

WebUI.callTestCase(findTestCase('Letters/Letter Templates/0-Login-UAT Login CANADA'), [:], FailureHandling.STOP_ON_FAILURE)

WebDriver driver = DriverFactory.getWebDriver()

WebUI.click(findTestObject('Letters/Letters Template/Templates Icon'))

WebUI.click(findTestObject('Letters/Letters Template/Drop Down Templates'))

WebUI.click(findTestObject('Letters/Letters Template/Letters Template'))

WebUI.click(findTestObject('Letters/Letters Template/Letters-FirmTemplate-Expand'))

String editDuplicateAuto = editduplicateRHS

WebElement letterSelection = driver.findElement(By.xpath(('//mat-expansion-panel[.//div[@class=\'title-content\' and @title=\'' + 
        editDuplicateAuto) + '\']]//mat-list-item[.//div[@class=\'list-item-content\' and @title=\'Engagement Letter - Existing Standards\']]'))

letterSelection.click()

WebUI.click(findTestObject('Letters/Letters Template/Firm-EditRHSButton'))

//----EDIT SECTION IN MIDDLE AND VERIFY
String editMiddleSection = sectionEditMiddleSection

// Use an explicit wait to locate the element
WebDriverWait wait = new WebDriverWait(driver, 10)

// Re-locate the element
WebElement sectionEdiMiddle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(('//span[text()=\'' + editMiddleSection) + 
            '\']/ancestor::div[contains(@class, \'page-content\')]//div[contains(@class, \'tiny-mc-container\')]')))

TestObject sectionScrollObject = new TestObject('sectionScrollObject')

sectionScrollObject.addProperty('xpath', ConditionType.EQUALS, ('//span[text()=\'' + editMiddleSection) + '\']/following::div[@class=\'page-content w-100 ng-star-inserted\'][1]')

println(sectionScrollObject)

WebUI.scrollToElement(sectionScrollObject, 5)

// Find the scrollable element by its XPath
WebElement scrollableElement = driver.findElement(By.xpath('//div[@class=\'d-block overflow-auto p-4 flex-1\']'))

// Create Actions object
Actions actions = new Actions(driver)

// Perform the action to move to the element, click to focus, and send the "Up" key multiple times
actions.moveToElement(scrollableElement).click().sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).perform()

actions.moveToElement(scrollableElement).click().sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).perform()

actions.moveToElement(scrollableElement).click().sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).perform()

sectionEdiMiddle.click()

//------EDIT TINY MCE
// Step 1: Switch to the iframe containing the TinyMCE editor
// Replace with the correct Test Object for the iframe
TestObject iframe = findTestObject('Letters/Letters Template/Firm-Sections-Edit-Section-Iframe')

// Switch to the iframe
WebUI.switchToFrame(iframe, 10 // Timeout of 10 seconds
    )

// Step 2: Locate the body element of the TinyMCE editor using XPath
// Replace the XPath with the correct path to the editable body of the TinyMCE editor
TestObject editorBody = new TestObject()

editorBody.addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, '//body[@id=\'tinymce\']')

// Click inside the TinyMCE body to focus
WebUI.click(editorBody)

// Step 3: Move to the end of the content, press Enter for a new line, and add your text
// Sends the END key to move to the end, then ENTER, then the desired text
WebUI.sendKeys(editorBody, Keys.chord(Keys.CONTROL, Keys.END) // Move cursor to the end
    )

WebUI.sendKeys(editorBody, Keys.chord(Keys.ENTER) // Press Enter for a new line
    )

WebUI.sendKeys(editorBody, 'Your additional text goes here' // Add the desired text
    )

	// Step 4: Select the newly added text using JavaScript
	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver
	
	// Embedding the additional text directly into JavaScript
	String selectTextScript = """
var editor = document.getElementById('tinymce'); 
var textToSelect = 'Your additional text goes here'; // Directly embedded string
var textNode = Array.from(editor.childNodes).find(node => node.nodeType === Node.ELEMENT_NODE && node.textContent.includes(textToSelect));

if (textNode) {
    var range = document.createRange();
    var startOffset = textNode.textContent.indexOf(textToSelect);
    var endOffset = startOffset + textToSelect.length;
    range.setStart(textNode.firstChild, startOffset);  // Use firstChild to access the text content
    range.setEnd(textNode.firstChild, endOffset);
    
    var sel = window.getSelection();
    sel.removeAllRanges();
    sel.addRange(range);
} else {
    console.error('Text node not found or text does not match.');
}
"""
	
	// Execute the JavaScript to select the text
	jsExecutor.executeScript(selectTextScript)
	
	// Step 5: Switch back to the default content after editing
	WebUI.switchToDefaultContent()
	
	// Step 6: Locate and click the Bold button
	TestObject boldButton = new TestObject()
	boldButton.addProperty("xpath", com.kms.katalon.core.testobject.ConditionType.EQUALS, "//button[@title='Bold']")
	
	// Click the Bold button to bold the selected text
	WebUI.click(boldButton)
	
	TestObject italicButton = new TestObject()
	italicButton.addProperty("xpath", com.kms.katalon.core.testobject.ConditionType.EQUALS, "//button[@title='Italic']")
	WebUI.click(italicButton)
	
	TestObject strikethrough = new TestObject()
	strikethrough.addProperty("xpath", com.kms.katalon.core.testobject.ConditionType.EQUALS, "//button[@title='Strikethrough']")
	WebUI.click(strikethrough)
	
	TestObject alignLeft = new TestObject()
	alignLeft.addProperty("xpath", com.kms.katalon.core.testobject.ConditionType.EQUALS, "//button[@title='Align left']")
	WebUI.click(alignLeft)

	TestObject aligncenter = new TestObject()
	aligncenter.addProperty("xpath", com.kms.katalon.core.testobject.ConditionType.EQUALS, "//button[@title='Align center']")
	WebUI.click(aligncenter)
	
	TestObject justify = new TestObject()
	justify.addProperty("xpath", com.kms.katalon.core.testobject.ConditionType.EQUALS, "//button[@title='Justify']")
	WebUI.click(justify)
	
	TestObject alignright = new TestObject()
	alignright.addProperty("xpath", com.kms.katalon.core.testobject.ConditionType.EQUALS, "//button[@title='Align right']")
	WebUI.click(alignright)
	
	TestObject increaseIndent = new TestObject()
	increaseIndent.addProperty("xpath", com.kms.katalon.core.testobject.ConditionType.EQUALS, "//button[@title='Increase indent']")
	WebUI.click(increaseIndent)
	
	TestObject presentation1 = new TestObject()
	presentation1.addProperty("xpath", com.kms.katalon.core.testobject.ConditionType.EQUALS, "//span[@role='presentation']//span[@class='tox-icon tox-tbtn__icon-wrap']//*[name()='svg']")
	WebUI.click(presentation1)
	
	TestObject bulletPoint = new TestObject()
	bulletPoint.addProperty("xpath", com.kms.katalon.core.testobject.ConditionType.EQUALS, "//button[@title='Bullet list']//span[@class='tox-icon tox-tbtn__icon-wrap']//*[name()='svg']")
	WebUI.click(bulletPoint)
	
	WebUI.click(findTestObject('Letters/Letters Template/Firm-Kebab-Rename-EDIT Section-TextField - Save'))