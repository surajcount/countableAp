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
import org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait
import org.openqa.selenium.support.ui.ExpectedConditions as ExpectedConditions
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor

WebUI.click(findTestObject('Letters/Letters Template/Firm-EditRHSButton'))

WebDriver driver = DriverFactory.getWebDriver()

//------------------------EDIT-------------------------
String sectionEdit = sectionEditButton // Make sure sectionEditButton is defined correctly

// Use an explicit wait to locate the element
WebDriverWait wait = new WebDriverWait(driver, 10)

WebElement sectionEditSelection = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(('//div[@title=\'' +sectionEdit) + '\']//button[@title=\'Edit\']')))

// Perform the click action
sectionEditSelection.click()

WebUI.click(findTestObject('Letters/Letters Template/Firm-Section-Edit-Cross'))

WebUI.delay(5)

// Re-locate the element after delay, since the DOM might have changed
sectionEditSelection = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(('//div[@title=\'' + sectionEdit) +
			'\']//button[@title=\'Edit\']')))

sectionEditSelection.click()

WebUI.clearText(findTestObject('Letters/Letters Template/Firm-Section-Edit-TextField'))

WebUI.setText(findTestObject('Letters/Letters Template/Firm-Section-Edit-TextField'), 'Edited Section')

WebUI.click(findTestObject('Letters/Letters Template/Firm-Section-Edit-Tick'))

WebUI.verifyTextPresent('Edited Section', false)

WebUI.click(findTestObject('Letters/Letters Template/Firm-Kebab-Rename-EDIT Section-TextField - Save'))

WebUI.click(findTestObject('Letters/Letters Template/Templates-Letters-Com'))

WebUI.click(findTestObject('Letters/Letters Template/Firm-EditRHSButton'))

//------------------------DELETE-------------------------
String sectionDelete = sectionDeleteButton // Ensure sectionDeleteButton is properly defined

// Correcting the XPath string with proper handling of quotes
WebElement sectionDeleteSelection = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(('//div[@title="' +
			sectionDelete) + '"]//img[@alt="Delete"]')))

sectionDeleteSelection.click()

WebUI.click(findTestObject('Letters/Letters Template/Firm-Kebab-Move-Move-Delete-Button'))

WebUI.verifyTextPresent('Section Deleted Successfully', false)

WebUI.click(findTestObject('Letters/Letters Template/Firm-Kebab-Rename-EDIT Section-TextField - Save'))

WebUI.click(findTestObject('Letters/Letters Template/Templates-Letters-Com'))

String comELLetterSectionEdit = WebUI.getText(findTestObject('Letters/Letters Template/Templates-Letters-Com'))

//===================<<ENGAGEMENT LETTER>>>=================================================================
println('--------Actual Letter------------------')

println('Actual Engagement Letter Data: ' + comELLetterSectionEdit)

// Define the multi-line text block
String elcomcontentAfterEditing = 'Header goes here\nDate\n\n\n  First Name\nLast Name\nEntity Name\nComplete address\n\n\n  Dear\nFirst Name\n,\n  You have requested that, on the basis of information that you will provide, we assist you in the preparation of the compiled financial information of \nEntity Name\n, which comprise the balance sheet as at\nYear end date (CY)\n, and the statement of income and retained earnings for the year then ended, and Note X, which describes the basis of accounting to be applied in the preparation of the compiled financial information\nOur Responsibilities\nWe will perform the compilation engagement in accordance with the Canadian Standard on Related Services (CSRS) 4200, Compilation Engagements, which requires us to comply with relevant ethical requirements.\n\nA compilation engagement involves us assisting you in the preparation of compiled financial information. Since a compilation engagement is not an assurance engagement, we are not required to perform procedures to verify the accuracy or completeness of the information you provide to us for the compilation engagement. Accordingly, we will not express an audit opinion or a review conclusion, or provide any form of assurance on the compiled financial information.\nReporting\nUnless unanticipated difficulties are encountered, our report will be substantially in the form below:\nTo Management of\nEntity Name\n  On the basis of information provided by management, we have compiled the\nBalance Sheet\nof\nEntity Name\n as at\nYear end date (CY)\n, the \nStatement of income and Retained Earnings\nfor the year then ended, and Note X, which describes the basis of accounting applied in the preparation of the compiled financial information (“financial information”).\n\nManagement is responsible for the accompanying financial information, including the accuracy and completeness of the underlying information used to compile it and the selection of the basis of accounting.\n\nWe performed this engagement in accordance with Canadian Standard on Related Services (CSRS) 4200, Compilation Engagements, which requires us to comply with relevant ethical requirements. Our responsibility is to assist management in the preparation of the financial information.\n\nWe did not perform an audit engagement or a review engagement, nor were we required to perform procedures to verify the accuracy or completeness of the information provided by management. Accordingly, we do not express an audit opinion or a review conclusion, or provide any form of assurance on the financial information.\n\nReaders are cautioned that the financial information may not be appropriate for their purposes.\nPractitioner\'s signature\nDate of the practitioner\'s report\nPractitioner\'s address\nUse of Information\nIt is acknowledged that we will have access to all information about identified individuals (“personal information”) in your custody that we require to complete our Engagement. Our services are provided on the basis that:\na. You represent to us that management has obtained any required consents for our collection, use, disclosure, storage, transfer and process of personal information required under applicable privacy legislation and professional regulation; and\nb. We will hold all personal information in compliance with our Privacy Statement.\nFile Inspections\nIn accordance with professional regulations (and by firm policy), our client files must periodically be reviewed by practice inspectors and by other firm personnel to ensure that we are adhering to professional and firm standards.\nFile reviewers are required to maintain confidentiality of client information.\nOne of the underlying principles of the profession isa duty of confidentiality with respect to client affairs. Each professional accountantmust preserve the secrecy of all confidential information that becomes knownduring the practice of the profession. Accordingly, we will not provide any thirdparty with confidential information concerning the affairs of\nEntity Name\n unless:\na. We have been specifically authorized with prior consent.\nb. We have been ordered or expressly required by law or by the provincial Code of Professional Conduct / Code of Ethics; or\nc. The information requested is (or enters) public domain.\nCommunications\nIn performing our services, we will send messages and documents electronically. As such communications can be intercepted, misdirected, infected by a virus, or otherwise used or communicated by an unintended third party, we cannot guarantee or warrant those communications from us will be properly delivered only to the addressee. Therefore, we specifically disclaim, and you release us from,any liability or responsibility whatsoever for interception or unintentional disclosure of communications transmitted by us in connection with the performance of this Engagement. In that regard, you agree that we shall have no liability for any loss or damage to anyperson or entity resulting from such communications, including any that are consequential,incidental, direct, indirect, punitive, exemplary orspecial damages (such as loss of data, revenues or anticipated profits).\nIf you do not consent to our use of electronic communications,please notify us in writing.\nOther Terms of Engagement\n[Optional paragraph (Note: a separate engagement letter for additional services, including bookkeeping, is recommended):]\nSubject to management review and approval, we will carry out such bookkeeping as we find necessary prior to the preparation of the compiled financial information, prepare the necessary federal and provincial income tax returns and prepare any special reports as required.Management will provide the information necessary to complete the returns/reportsand will file them with the appropriate authorities on a timely basis.\n\n[Optional paragraph:]\nIt should be noted that our accounting work in the area of GST/HST and other commodity taxes is limited to that appropriate to compile the financial information.Accordingly, we may not detect situations where you are incorrectly collecting GST/HSTor incorrectly claiming input tax credits. As you are aware, failure toproperly account for the GST/HST could result in you or your company becoming liable for tax, interest or penalties. These situations may also arise for provincial sales tax, custom duties and excise taxes.\n\n[Optional paragraph:]\nWe will also be pleased to provide other additional services upon request. Such services include income tax planning, GST/HST and PST advice, businessfinancing, management consulting and valuations.\nOwnership\nThe working papers, files, other materials, reports and work created, developed or performed by us during the course of the Engagement are the property of our firm,constitute our confidential information and will be retained by us in accordance with our firm\'s policies and procedures.\n\nDuring the course of our work, we may provide, for your own use, certain software, spread sheets andother intellectual property to assist with the provision of our services. Suchsoftware, spreadsheets and other intellectual property must not be copied,distributed or used for any other purpose. We also do not provide any warranties in relation to these items and will not be liable for any lostor corrupted data or other damage or loss suffered or incurred by you in connection with your use of them.\n\nWe retain the copyright and all intellectual property rights in any originalmaterials provided to you.\nAccounting Advice\nExcept as outlined in this letter, the Engagement does not contemplate the provision of specific accounting advice or opinions or the issuance of a written report on the application of accounting standards to specific transactions and to the facts and circumstances of the entity. Such services, if requested, would be provided under a separate engagement letter.\nDispute Resolution\nYou agree that any dispute that may arise regarding the meaning, performance or enforcement of this Engagement will, prior to resorting to litigation, be submitted to mediation.\n[Check to ensure this indemnity wording complies with the rules of your provincial body/Ordre, relevant provincial statutes and the rules of the jurisdiction in which your client is reporting. Also, it is highly advisable to obtain legal advice.]\n  Entity Name\nhereby agrees to indemnify, defend (by counsel retained and instructed by us) and hold harmless our firm (and its partners, agents and employees) from and against any and all losses, costs(including solicitors’ fees), damages, expenses, claims, demands and liabilities arising out of (or in consequence of):\na. The breach by\nEntity Name\n, or its directors,officers, agents, or employees, of any of the covenants or obligations of \nEntity Name\n here in, including, without restricting the generality of the foregoing, the misuse of, or the unauthorized dissemination of, our engagement report or the financial information in reference to which the engagement report is issued, orany other work product made available to you by our firm.\nb. A misrepresentation by a member of your management or those charged with governance.\n[Check to ensure this limitation of liability provision complies with the rules of your provincial body/Ordre, relevant provincial statutes and the rules of the jurisdiction in which your client is reporting. It is highly advisable to obtain legal advice if you intend to include a limitations of liability clause.]\n  Our aggregate liability forall claims, losses, liabilities and damages in connection with this Engagement,whether as a result of breach of contract, tort (including negligence), or otherwise, regardless of the theory of liability, is limited to $Amount . Our liability shall be several and not joint and several. We shall only be liable for our proportionate share of any loss or damage, based on our contribution relative to the others’ contributions and only if your claim is commenced within 24 months or less of the date\nEntity Name\nshould have been aware of the potential claim. In addition, we will not be liable in any event for consequential, incidental, indirect, punitive,exemplary, aggravated or special damages, including any amount for loss of profit, data or goodwill, whether or not the likelihood of such loss or damage was contemplated.\nWe will use all reasonable efforts to complete the Engagement as described in this letter within the agreed upon time frames.\n[Insert agreed upon time frames, such as provision of schedules, start and finish of fieldwork, meeting to review findings, finalization of financial information, expected date of communication, dates of governance meetings,\nor reference to document where the time frames were agreed upon.]\nHowever,we shall not be liable for failures or delays in performance that arise from causes beyond our reasonable control, including any delays in the performance by \nEntity Name\n of its obligations.\nFees at Regular Billing Rates\nOur professional fees will be based on our regular billing rates, plus direct out-of-pocket expenses and applicable GST, and are due when rendered. Fees for additional services will be established separately.\n[Or]\n\nEstimated Fees\nWe estimate that our fees for these services will be $[amount], or in the range of $[amount] to $[amount], for the Engagement and $[amount] for the tax return, plus direct out-of-pocket expenses and applicable GST/HST. This fee estimate is based on:\nThe anticipated cooperation from all your personnel in preparing the requested information on a timely basis; \nThe ongoing assistance of personnel throughout the Engagement; and\nThe assumption that unexpected circumstances will not be encountered. \nIf significant additional time is likely to be incurred, we will discuss the reasons with you and agree on a revised fee estimate before we incur the additional costs.\nFees will be rendered as work progresses and are payable on presentation.\nRetainer\nPrior to commencing our services, we require that you provide us with a retainer in the amount of $[amount].\nThe retainer will be applied against our final invoice, and any unused portion will be returned to you upon our collection of all outstanding fees and costs related to this Engagement.\nBilling\nOur fees and costs will be billed monthly and are payable upon receipt. Invoices unpaid 30 days past the billing date may be deemed delinquent and are subject to an interest charge of [number]% per month. We reserve the right to suspend our services or to withdraw from this Engagement in the event that any of our invoices are deemed delinquent. In the event that any collection action is required to collect unpaid balances due to us, you agree to reimburse us for our costs of collection, including lawyers\' fees\n\nCosts of Responding to Government or Legal Processes\nIn the event we are required to respond to a subpoena, court order, government agency or other legal process for the production of documents and/or testimony relative to information we obtained and/or prepared during the course of this Engagement, you agree to compensate us, at our normal hourly rates, for the time we expend in connection with such response and to reimburse us for all of our out-of-pocket costs (including applicable GST/HST) incurred.\nManagement acknowledges and understands that failureto fulfill its obligations as set out in this engagement letter will result,upon written notice, in the termination of the Engagement.\nEither party may terminate this agreement for any reason upon providing written notice to the other party not less than 30 calendar days before the effective date of termination. If early termination takes place,\nEntity Name\n shall be responsible for all time and expenses incurred up to the termination date and all costs in terminating any agreement with any specialist or other third party retained by us in connection with this Engagement.\nIf we are unable to complete the Engagement, we may withdraw from the Engagement before issuing our Compilation Engagement Report or compiling the financial information. If this occurs, we will communicate the reasons and provide details.\nThis engagement letter will continue in force for subsequent Engagements unless terminated by either party by written notice prior to the commencement of the subsequent Engagement.\nThis engagement letter includes the relevant terms that will govern the Engagement for which it has been prepared. The terms of this letter supersede any prior oral or written representations or commitments by or between the parties. Any material changes or additions to the terms set forth in this letter will only become effective if evidenced by a written amendment to this letter, signed by all of the parties.\n\nIf you have any questions about the contents of this letter, please raise them with us. Please sign and return the attached copy of this letter to indicate your acknowledgment of, and agreement with, the arrangements for the compilation engagement.\n\nWe appreciate the opportunity of continuing to be of service to your company.\nYours truly,\nON BEHALF OF\nFirm Name\n\n\nFirm Signature\n\n(Signature)\n\nDate\n\n(Date)\n  ACKNOWLEDGED AND AGREED ON BEHALF OF THE MANAGEMENT OF \nEntity Name\n  Client Signature\n\n(Signature)\n\nClient Signed Date\n\n(Date)\nFooter goes here'

println('--------Expected Letter------------------')

println('Expected Engagement Letter Data: ' + elcomcontentAfterEditing)

if (comELLetterSectionEdit.trim() == elcomcontentAfterEditing.trim()) {
	println('Engagement Letter matching')
} else {
	println('Engagement Letter Not matching')
}

//------------------------LOCK-------------------------
WebUI.click(findTestObject('Letters/Letters Template/Templates-Letters-Com'))

WebUI.click(findTestObject('Letters/Letters Template/Firm-EditRHSButton'))

String sectionLock = sectionLockButton // Ensure sectionDeleteButton is properly defined

// Correcting the XPath string with proper handling of quotes
WebElement sectionLockSelection = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(('//div[@title="' +
			sectionLock) + '"]//img[@alt="Lock"]')))

sectionLockSelection.click()

// Correct XPath to locate the "Edit" button element with the disabled attribute directly
WebElement editButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath('//button[@disabled=\'true\' and @title=\'Edit\']')))

// Use JavaScript to confirm the "Edit" button's disabled state
boolean isEditDisabledJS = ((JavascriptExecutor) driver).executeScript('return arguments[0].hasAttribute("disabled");', editButton) as boolean

// Log the result for the "Edit" button
if (isEditDisabledJS) {
	println('The Edit button is disabled (verified by JavaScript).')
} else {
	println('The Edit button is enabled (verified by JavaScript).')
}

// Correct XPath to locate the "Delete" button with the disabled attribute, targeting the button itself
WebElement deleteButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath('//button[@disabled=\'true\' and .//img[@alt=\'Delete\']]')))

// Use JavaScript to confirm the "Delete" button's disabled state
boolean isDeleteDisabledJS = ((JavascriptExecutor) driver).executeScript('return arguments[0].hasAttribute("disabled");', deleteButton) as boolean

// Log the result for the "Delete" button
if (isDeleteDisabledJS) {
	println('The Delete button is disabled (verified by JavaScript).')
} else {
	println('The Delete button is enabled (verified by JavaScript).')
}

WebUI.click(findTestObject('Letters/Letters Template/Firm-Kebab-Rename-EDIT Section-TextField - Save'))
WebUI.click(findTestObject('Letters/Letters Template/Templates-Letters-Com'))

WebUI.click(findTestObject('Letters/Letters Template/Firm-EditRHSButton'))

WebElement sectionUnLockSelection = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(('//div[@title="' +sectionLock) + '"]//img[@alt="Unlock"]')))

sectionUnLockSelection.click()


WebUI.click(findTestObject('workbook/TBGrouping/TBGrouping_Note_CancelBtn'))

WebUI.click(findTestObject('TB CSV/TB Obj/ImportYes popup'))

WebUI.click(findTestObject('Letters/Letters Template/Firm-EditRHSButton'))

WebElement unlockButtonAgain = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(('//div[@title="' + sectionLock) + '"]//img[@alt="Unlock"]')))
unlockButtonAgain.click()

WebUI.click(findTestObject('Letters/Letters Template/Firm-Kebab-Rename-EDIT Section-TextField - Save'))

WebUI.click(findTestObject('Letters/Letters Template/Templates-Letters-Com'))
