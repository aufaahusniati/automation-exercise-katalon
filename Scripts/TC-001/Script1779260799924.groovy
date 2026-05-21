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

WebUI.openBrowser('https://automationexercise.com')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://automationexercise.com')

WebUI.click(findTestObject('Page_Automation Exercise/a_Signup _ Login'))

WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise - Signup  Login/h2_New User Signup'))

WebUI.setText(findTestObject('Page_Automation Exercise - Signup  Login/input_Name_Signup'), 'aufaa satu')

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_Email_Signup'), 'aufaasuite01@gmail.com')

WebUI.click(findTestObject('Page_Automation Exercise - Signup  Login/button_Signup'))

WebUI.click(findTestObject('Page_Automation Exercise - Signup/input_Mrs'))

WebUI.click(findTestObject('Page_Automation Exercise - Signup/input_Name _'))

WebUI.setEncryptedText(findTestObject('Page_Automation Exercise - Signup/input_Password _'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.selectOptionByValue(findTestObject('Page_Automation Exercise - Signup/select_days'), '15', false)

WebUI.selectOptionByValue(findTestObject('Page_Automation Exercise - Signup/select_months'), '12', false)

WebUI.selectOptionByValue(findTestObject('Page_Automation Exercise - Signup/select_years'), '2011', false)

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_First name _'), 'aufaa')

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_Last name _'), 'satu')

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_Company'), 'sssssssssss')

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_Address _ (Street address, P.O. Box, Compa'), 'aaaaaaaaaaa')

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_Address 2'), 'qqqqqqqqqqqq')

WebUI.selectOptionByValue(findTestObject('Page_Automation Exercise - Signup/select_Country _'), 'Singapore', false)

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_State _'), 'rrrrrrrrrrrrrr')

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_City _'), 'vvvvvvvvvvvvvvvvv')

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_zipcode'), '12345')

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_Mobile Number _'), '0987654321')

WebUI.click(findTestObject('Page_Automation Exercise - Signup/button_Create Account'))

WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise - Account Created/b_Account Created'))

WebUI.click(findTestObject('Page_Automation Exercise - Account Created/a_Continue'))

WebUI.closeBrowser()

