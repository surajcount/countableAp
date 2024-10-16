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

WebUI.click(findTestObject('Letters/Letters Template/Firm-Edit-Sections'))

WebUI.click(findTestObject('Letters/Letters Template/Templates-Section-AddNewSection'))

WebUI.setText(findTestObject('Letters/Letters Template/Firm-Section-Edit-TextField'), 'New Section')

WebUI.click(findTestObject('Letters/Letters Template/Firm-Section-Edit-Cross'))

WebUI.click(findTestObject('Letters/Letters Template/Templates-Section-AddNewSection'))

String newSectionTemplates = NewSectionInsideTemplates

WebUI.setText(findTestObject('Letters/Letters Template/Firm-Section-Edit-TextField'), newSectionTemplates)

WebUI.click(findTestObject('Letters/Letters Template/Firm-Section-Edit-Tick'))

WebUI.verifyTextPresent('New Section Added Successfully', false)

//WebUI.scrollToElement(newSectionElement, 30)
WebElement scrollableSection = driver.findElement(By.xpath('//div[@class="templates-list border-0 h-100 pb-4 px-4"]'))

// Create Actions object
Actions actions = new Actions(driver)

// Create JavascriptExecutor object
//JavascriptExecutor jsExecutor = ((driver) as JavascriptExecutor)
//JavascriptExecutor jsExecutor = ((driver) as JavascriptExecutor)
JavascriptExecutor jsExecutor = (JavascriptExecutor) driver

// Get the current scroll position
long lastScrollTop = ((jsExecutor.executeScript('return arguments[0].scrollTop;', scrollableSection)) as long)

while (true) {
    // Perform scroll action by sending ARROW_DOWN key
    actions.moveToElement(scrollableSection).click().sendKeys(Keys.ARROW_DOWN).perform()

    // Wait for the scroll action to complete
    Thread.sleep(300)

    // Get the new scroll position after sending ARROW_DOWN key
    long newScrollTop = ((jsExecutor.executeScript('return arguments[0].scrollTop;', scrollableSection)) as long)

    // Get the scrollHeight (total height of scrollable content)
    long scrollHeight = ((jsExecutor.executeScript('return arguments[0].scrollHeight;', scrollableSection)) as long)

    // If the scroll position hasn't changed or reached the bottom, break the loop
    if ((newScrollTop == lastScrollTop) || ((newScrollTop + scrollableSection.getSize().getHeight()) >= scrollHeight)) {
        break
    }
    
    lastScrollTop = newScrollTop
}

// Define TestObject for selectionNewSection and targetElement
TestObject selectionNewSectionobj = new TestObject().addProperty('xpath', ConditionType.EQUALS, ('//p[contains(text(),\'' + 
    newSectionTemplates) + '\')]')

//WebElement selectionNewSection = driver.findElement(By.xpath(('//p[contains(text(),\'' + newSectionTemplates) + '\')]'))
//selectionNewSection.click()
TestObject targetElement = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//p[text()=\'Signature\']')

WebUI.click(selectionNewSectionobj)

// Perform drag and drop action
WebUI.dragAndDropToObject(selectionNewSectionobj, targetElement)

WebDriverWait wait = new WebDriverWait(driver, 10)

// Re-locate the element
WebElement sectionEdiMiddleNewSection = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(('//span[text()=\'' + 
            newSectionTemplates) + '\']/ancestor::div[contains(@class, \'page-content\')]//div[contains(@class, \'tiny-mc-container\')]')))

sectionEdiMiddleNewSection.click()

WebUI.click(findTestObject('Letters/Letters Template/Firm-Edit-Elements'))

WebUI.delay(5)

jsExecutor.executeScript('tinymce.activeEditor.setContent(\'\');')

// Locate and click on the "Date" element inside the TinyMCE editor
WebElement date = driver.findElement(By.xpath('//a[@title="Date"]'))

date.click()

// Wait to ensure the action is completed (if needed)
WebUI.delay(2)

// Get JavascriptExecutor object from WebDriver
//JavascriptExecutor jsExecutor = (JavascriptExecutor) driver
// Insert a new line (break tag) into the TinyMCE editor
jsExecutor.executeScript('tinymce.activeEditor.execCommand(\'mceInsertContent\', false, \'<br><br>\');')

// Optionally, wait to ensure the action completes
WebUI.delay(2)

// Locate and click on the "Entity Name" element inside the TinyMCE editor
WebElement EntityName = driver.findElement(By.xpath('//a[@title="Entity Name"]'))

EntityName.click()

// Optionally, add a delay to ensure all actions are completed
WebUI.delay(2)

jsExecutor.executeScript('tinymce.activeEditor.execCommand(\'mceInsertContent\', false, \'<br><br>\');')

WebElement addrMgmt = driver.findElement(By.xpath('//a[@title="Addresse - Management"]'))

addrMgmt.click()

WebElement addrBOD = driver.findElement(By.xpath('(//span[contains(text(),"Addresse - Board of directors")])[1]'))

addrBOD.click()

WebElement addrSHL = driver.findElement(By.xpath('//span[contains(text(),"Addresse - Shareholders")]'))

addrSHL.click()

jsExecutor.executeScript('tinymce.activeEditor.execCommand(\'mceInsertContent\', false, \'<br><br>\');')

WebElement CYYEAR = driver.findElement(By.xpath('//div[@class="templates-list px-4 border-0 h-100 pb-4 ng-star-inserted"]//span[contains(text(),"Year end date (CY)")]'))

CYYEAR.click()

WebElement PYYEAR = driver.findElement(By.xpath('//div[@class="templates-list px-4 border-0 h-100 pb-4 ng-star-inserted"]//span[contains(text(),"Year end date (PY)")]'))

PYYEAR.click()

jsExecutor.executeScript('tinymce.activeEditor.execCommand(\'mceInsertContent\', false, \'<br><br>\');')

WebElement noteX = driver.findElement(By.xpath('//div[@class="templates-list px-4 border-0 h-100 pb-4 ng-star-inserted"]//span[contains(text(),"Note X")]'))

noteX.click()

jsExecutor.executeScript('tinymce.activeEditor.execCommand(\'mceInsertContent\', false, \'<br><br>\');')

WebElement clientcity = driver.findElement(By.xpath('//div[@class="templates-list px-4 border-0 h-100 pb-4 ng-star-inserted"]//span[contains(text(),"Client City")]'))

clientcity.click()

jsExecutor.executeScript('tinymce.activeEditor.execCommand(\'mceInsertContent\', false, \'<br><br>\');')

WebElement cityprovince = driver.findElement(By.xpath('//div[@class="templates-list px-4 border-0 h-100 pb-4 ng-star-inserted"]//span[contains(text(),"City, Province")]'))

cityprovince.click()

jsExecutor.executeScript('tinymce.activeEditor.execCommand(\'mceInsertContent\', false, \'<br><br>\');')

WebElement completeaddress = driver.findElement(By.xpath('//div[@class="templates-list px-4 border-0 h-100 pb-4 ng-star-inserted"]//span[contains(text(),"Complete address")]'))

completeaddress.click()

jsExecutor.executeScript('tinymce.activeEditor.execCommand(\'mceInsertContent\', false, \'<br><br>\');')

WebElement firmaddress = driver.findElement(By.xpath('//div[@class="templates-list px-4 border-0 h-100 pb-4 ng-star-inserted"]//span[contains(text(),"Firm address")]'))

firmaddress.click()

jsExecutor.executeScript('tinymce.activeEditor.execCommand(\'mceInsertContent\', false, \'<br><br>\');')

WebElement postalcode = driver.findElement(By.xpath('//div[@class="templates-list px-4 border-0 h-100 pb-4 ng-star-inserted"]//span[contains(text(),"Postal Code")]'))

postalcode.click()

jsExecutor.executeScript('tinymce.activeEditor.execCommand(\'mceInsertContent\', false, \'<br><br>\');')

WebElement fname = driver.findElement(By.xpath('//div[@class="templates-list px-4 border-0 h-100 pb-4 ng-star-inserted"]//span[contains(text(),"First Name")]'))

fname.click()

WebElement lname = driver.findElement(By.xpath('//div[@class="templates-list px-4 border-0 h-100 pb-4 ng-star-inserted"]//span[contains(text(),"Last Name")]'))

lname.click()

jsExecutor.executeScript('tinymce.activeEditor.execCommand(\'mceInsertContent\', false, \'<br><br>\');')

WebElement bs = driver.findElement(By.xpath('//div[@class="templates-list px-4 border-0 h-100 pb-4 ng-star-inserted"]//span[contains(text(),"Balance Sheet")]'))

bs.click()

jsExecutor.executeScript('tinymce.activeEditor.execCommand(\'mceInsertContent\', false, \'<br><br>\');')

WebElement st = driver.findElement(By.xpath('//div[@class="templates-list px-4 border-0 h-100 pb-4 ng-star-inserted"]//span[contains(text(),"Statement of income and Retained Earnings")]'))

st.click()

jsExecutor.executeScript('tinymce.activeEditor.execCommand(\'mceInsertContent\', false, \'<br><br>\');')

WebElement firmname = driver.findElement(By.xpath('//div[@class="templates-list px-4 border-0 h-100 pb-4 ng-star-inserted"]//span[contains(text(),"Firm Name")]'))

firmname.click()

jsExecutor.executeScript('tinymce.activeEditor.execCommand(\'mceInsertContent\', false, \'<br><br>\');')

WebElement partnerName = driver.findElement(By.xpath('//div[@class="templates-list px-4 border-0 h-100 pb-4 ng-star-inserted"]//span[contains(text(),"Partner Name")]'))

partnerName.click()

jsExecutor.executeScript('tinymce.activeEditor.execCommand(\'mceInsertContent\', false, \'<br><br>\');')

WebElement firmsign = driver.findElement(By.xpath('//div[@class="templates-list px-4 border-0 h-100 pb-4 ng-star-inserted"]//span[contains(text(),"Firm Signature")]'))

firmsign.click()

jsExecutor.executeScript('tinymce.activeEditor.execCommand(\'mceInsertContent\', false, \'<br><br>\');')

WebElement clientsign = driver.findElement(By.xpath('//div[@class="templates-list px-4 border-0 h-100 pb-4 ng-star-inserted"]//span[contains(text(),"Client Signature")]'))

clientsign.click()

jsExecutor.executeScript('tinymce.activeEditor.execCommand(\'mceInsertContent\', false, \'<br><br>\');')

WebElement clientsigndate = driver.findElement(By.xpath('//div[@class="templates-list px-4 border-0 h-100 pb-4 ng-star-inserted"]//span[contains(text(),"Client Signed Date")]'))

clientsigndate.click()

WebUI.click(findTestObject('Letters/Letters Template/Firm-Kebab-Rename-EDIT Section-TextField - Save'))