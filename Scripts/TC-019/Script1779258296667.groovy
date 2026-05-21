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

WebUI.openBrowser('https://automationexercise.com/')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://automationexercise.com/')

WebUI.click(findTestObject('Page_Automation Exercise/a_Signup _ Login'))

WebUI.setText(findTestObject('Page_Automation Exercise - Signup  Login/input_Name_Signup'), 'aufaa empat')

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_Email_Signup'), 'aufaasuite04@gmail.com')

WebUI.click(findTestObject('Page_Automation Exercise - Signup  Login/button_Signup'))

WebUI.click(findTestObject('Page_Automation Exercise - Signup/label_Mrs'))

WebUI.setEncryptedText(findTestObject('Page_Automation Exercise - Signup/input_Password _'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.selectOptionByValue(findTestObject('Page_Automation Exercise - Signup/select_days'), '13', false)

WebUI.selectOptionByValue(findTestObject('Page_Automation Exercise - Signup/select_months'), '11', false)

WebUI.selectOptionByValue(findTestObject('Page_Automation Exercise - Signup/select_years'), '2009', false)

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_First name _'), 'jack')

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_Last name _'), 'rochmat')

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_Company'), 'jack jack')

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_Address _ (Street address, P.O. Box, Compa'), 'jackkkk')

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_Address 2'), 'jackkkk')

WebUI.selectOptionByValue(findTestObject('Page_Automation Exercise - Signup/select_Country _'), 'United States', false)

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_State _'), 'jack 01')

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_City _'), 'jack 02')

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_zipcode'), '12345')

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_Mobile Number _'), '0987654321')

WebUI.click(findTestObject('Page_Automation Exercise - Signup/button_Create Account'))

WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise - Account Created/b_Account Created'))

WebUI.click(findTestObject('Page_Automation Exercise - Account Created/a_Continue'))

WebUI.enhancedClick(findTestObject('Page_Automation Exercise/a_Products'))

WebUI.refresh()

WebUI.mouseOver(findTestObject('Page_Automation Exercise - All Products/div_Rs. 500'))

WebUI.delay(1)

WebUI.enhancedClick(findTestObject('Page_Automation Exercise - All Products/a_Add to cart'))

WebUI.click(findTestObject('Page_Automation Exercise - All Products/u_View Cart'))

WebUI.click(findTestObject('Page_Automation Exercise - Checkout/a_Proceed To Checkout'))

WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise - Checkout/ul_address_delivery'))

WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise - Checkout/li_Mrs. jack rochmat'))

WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise - Checkout/li_jack jack'))

WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise - Checkout/li_jackkkk'))

WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise - Checkout/li_jackkkk_1'))

WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise - Checkout/li_jack 02 jack 01'))

WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise - Checkout/li_United States'))

WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise - Checkout/li_0987654321'))

WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise - Checkout/ul_address_invoice'))

WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise - Checkout/li_Mrs. jack rochmat_1'))

WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise - Checkout/li_jack jack_1'))

WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise - Checkout/li_jackkkk_2'))

WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise - Checkout/li_jackkkk_3'))

WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise - Checkout/li_jack 02 jack 01_1'))

WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise - Checkout/li_United States_1'))

WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise - Checkout/li_0987654321_1'))

WebUI.closeBrowser()

