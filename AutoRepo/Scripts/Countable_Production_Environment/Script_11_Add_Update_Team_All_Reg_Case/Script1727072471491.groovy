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

WebUI.openBrowser('')

'This Script Covers addition and updating team member info for firm user.\r\nThis script have adding client through file upload flow where validation of \r\nduplicate/existing and incoorect file format has done.\r\nEnsure to have the respective data in corresponding uploaded file.\r\nUpdate the variable used for adding team member.'
WebUI.navigateToUrl('https://platform.countable.co/login')

WebUI.findWebElement(findTestObject('Page_UAT (Countable)/EmailElement'), 0)

WebUI.setText(findTestObject('Page_UAT (Countable)/EmailElement'), LoginEmail)

WebUI.findWebElement(findTestObject('Page_UAT (Countable)/Password'), 5)

WebUI.setEncryptedText(findTestObject('Page_UAT (Countable)/Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('Page_UAT (Countable)/span_Login'))

WebUI.delay(2)

WebUI.maximizeWindow()

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/DashBoard_Team_Icon'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/img_Icon_TeamAddtion_Option_BTN'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Add New Member'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Choose Category_Object1st'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Category_Partner_M'))

WebUI.setText(findTestObject('AddTeam_AllRegression_Dashboard/input_Field_First Name_M'), 'Surya')

WebUI.setText(findTestObject('AddTeam_AllRegression_Dashboard/input_Last Name_M'), 'Rama')

WebUI.setText(findTestObject('AddTeam_AllRegression_Dashboard/input_Title_M'), 'Partner')

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/span_ng-arrow-AccessType'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/span_Admin'))

WebUI.setText(findTestObject('AddTeam_AllRegression_Dashboard/input_Email_M'), TeamMemberEmail)

try {
    WebUI.check(findTestObject('AddTeam_AllRegression_Dashboard/Access_EditInformation'))
}
catch (Exception e) {
    WebUI.uncheck(findTestObject('AddTeam_AllRegression_Dashboard/Access_EditInformation'))
} 

WebUI.delay(1)

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Add_Button'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/span_Confirm'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/DashBoard_Team_Icon'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/img_Icon_TeamAddtion_Option_BTN'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Upload Existing Member'))

WebUI.uploadFile(findTestObject('AddTeam_AllRegression_Dashboard/Upload_inputdata_file'), IncorrectFormat)

WebUI.delay(3)

WebUI.uploadFile(findTestObject('AddTeam_AllRegression_Dashboard/Upload_inputdata_file'), 'C:\\Users\\Admin\\Desktop\\UploadTeam_Data\\UploadTeam_DataExisting_Teamdata.csv')

WebUI.verifyElementText(findTestObject('AddTeam_AllRegression_Dashboard/p_Email already exist. Please re-check the record information'), 
    'Email already exist. Please re-check the record information', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/DataUpload_Cancel_Button'))

WebUI.uploadFile(findTestObject('AddTeam_AllRegression_Dashboard/Upload_inputdata_file'), CorrectDataFile)

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Data_Upload_Btn'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/span_Confirm'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/DashBoard_Team_Icon'))

WebUI.setText(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Search Button_Team'), 'Sury')

WebUI.clearText(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Search Button_Team'))

WebUI.setText(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Search Button_Team'), 'manager')

WebUI.clearText(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Search Button_Team'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Search Button_Team'), Keys.chord(Keys.ENTER))

WebUI.verifyElementText(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/VerifyPartnerCount'), '6', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/VerifyTotalTeamCount'), '10', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/All_Team_Tab'))

WebUI.delay(4)

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Partner_Tab'))

WebUI.delay(3)

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Staff_Tab'))

WebUI.delay(2)

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/All_Team_Tab'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/InviteButton_Single_Allteam'))

WebUI.delay(4)

WebUI.verifyElementText(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Verify Invite_Status'), 'Invite Sent')

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Staff_Tab'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/SelectAllTeam_Staff'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/DropDownArrow_BTN_Asgn_Partner'))

WebUI.setText(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Search_ListAssign_Partner_StaffTab'), 
    'Sur')

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Select_Partner_To_Assign'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Search_ListAssign_Partner_StaffTab'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Search_ListAssign_Partner_StaffTab'), 
    Keys.chord(Keys.ESCAPE))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/SelectAllTeam_Staff'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/DropDownArrow_BTN_Asgn_Partner'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Unassigned_BTN_Staff_Section'))

WebUI.delay(3)

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Search_ListAssign_Partner_StaffTab'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Search_ListAssign_Partner_StaffTab'), 
    Keys.chord(Keys.ESCAPE), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/SelectAllTeam_Staff'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/InviteAll_Staff_Team'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/InviteAll_No_Button'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/InviteAll_Staff_Team'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/InviteAll_Yes_Button'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/All_Team_Tab'))

WebUI.delay(2)

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Staff_Tab'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Edit_Button_Team_Staff_Sec'))

WebUI.setText(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Edit_Detail_LastName'), 'Agni')

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/SaveButton_Edit_Details'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Confirmation_SaveButton_Edit_Details'))

WebUI.delay(4)

WebUI.setText(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Search Button_Team'), 'Monte')

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Delete_Button_AllTeam_Sec'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Confirmation_DeleteTeam_Mem_BTN_AllClient'))

WebUI.delay(3)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

