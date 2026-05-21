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

WebUI.click(findTestObject('Page_Automation Exercise/a_Products'))

WebUI.delay(1)

WebUI.mouseOver(findTestObject('Page_Automation Exercise - All Products/div_Rs. 500'))

WebUI.enhancedClick(findTestObject('Page_Automation Exercise - All Products/a_Add to cart'))

WebUI.waitForElementVisible(findTestObject('Page_Automation Exercise/u_View Cart'), 3)

WebUI.enhancedClick(findTestObject('Page_Automation Exercise - All Products/u_View Cart'))

WebUI.click(findTestObject('Page_Automation Exercise - Checkout/a_Proceed To Checkout'))

WebUI.click(findTestObject('Page_Automation Exercise - Checkout/u_Register _ Login'))

WebUI.click(findTestObject('Page_Automation Exercise - Signup  Login/h2_New User Signup'))

WebUI.setText(findTestObject('Page_Automation Exercise - Signup  Login/input_Name_Signup'), 'aufaa dua')

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_Email_Signup'), 'aufaasuite02@gmail.com')

WebUI.click(findTestObject('Page_Automation Exercise - Signup  Login/button_Signup'))

WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise - Signup/b_Enter Account Information'))

WebUI.click(findTestObject('Page_Automation Exercise - Signup/input_Mrs'))

WebUI.setEncryptedText(findTestObject('Page_Automation Exercise - Signup/input_Password _'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.selectOptionByValue(findTestObject('Page_Automation Exercise - Signup/select_days'), '12', false)

WebUI.selectOptionByValue(findTestObject('Page_Automation Exercise - Signup/select_months'), '9', false)

WebUI.selectOptionByValue(findTestObject('Page_Automation Exercise - Signup/select_years'), '2010', false)

WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise - Signup/b_Address Information'))

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_First name _'), 'sdfghjk')

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_Last name _'), 'ertyuio')

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_Company'), 'esdtfujyujb')

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_Address _ (Street address, P.O. Box, Compa'), 'wertyuthgb')

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_Address 2'), 'dfghjhngbf')

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_State _'), 'dsafghber')

WebUI.selectOptionByValue(findTestObject('Page_Automation Exercise - Signup/select_Country _'), 'United States', false)

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_City _'), 'dfghjkhjgfed')

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_zipcode'), '12345')

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_Mobile Number _'), '23456787654')

WebUI.click(findTestObject('Page_Automation Exercise - Signup/button_Create Account'))

WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise - Account Created/b_Account Created'))

WebUI.click(findTestObject('Page_Automation Exercise - Account Created/a_Continue'))

WebUI.enhancedClick(findTestObject('Page_Automation Exercise - All Products/a_Cart'))

WebUI.click(findTestObject('Page_Automation Exercise - Checkout/a_Proceed To Checkout'))

WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise - Checkout/h2_Address Details'))

WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise - Checkout/h2_Review Your Order'))

WebUI.setText(findTestObject('Page_Automation Exercise - Checkout/textarea_message'), 'fgggfhftg')

WebUI.scrollToElement(findTestObject('Page_Automation Exercise - Checkout/a_Place Order'), 0)

WebUI.click(findTestObject('Page_Automation Exercise - Checkout/a_Place Order'))

WebUI.waitForElementVisible(findTestObject('Page_Automation Exercise - Payment/input_name_on_card'), 5)

WebUI.setText(findTestObject('Page_Automation Exercise - Payment/input_name_on_card'), 'gfffghfh')

WebUI.setText(findTestObject('Page_Automation Exercise - Payment/input_card_number'), '7858565')

WebUI.setText(findTestObject('Page_Automation Exercise - Payment/input_ex. 311'), '322')

WebUI.setText(findTestObject('Page_Automation Exercise - Payment/input_MM'), '99')

WebUI.setText(findTestObject('Page_Automation Exercise - Payment/input_YYYY'), '3432')

WebUI.click(findTestObject('Page_Automation Exercise - Payment/button_submit'))

WebUI.click(findTestObject('Page_Automation Exercise - Payment/div_Your order has been placed successfully'))

WebUI.click(findTestObject('Page_Automation Exercise - Order Placed/b_Order Placed'))

WebUI.click(findTestObject('Page_Automation Exercise - Order Placed/a_Continue'))

WebUI.closeBrowser()

