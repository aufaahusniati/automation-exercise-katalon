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

WebUI.openBrowser('https://automationexercise.com/products')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://automationexercise.com/products')

WebUI.waitForElementVisible(findTestObject('Page_Automation Exercise - All Products/input_Search Product'), 5)

WebUI.setText(findTestObject('Page_Automation Exercise - All Products/input_Search Product'), 'top')

WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise - All Products/h2_Searched Products'))

WebUI.click(findTestObject('Page_Automation Exercise - All Products/button_submit_search'))

WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise - All Products/h2_Searched Products'))

WebUI.mouseOver(findTestObject('Page_Automation Exercise - All Products/div_Rs. 500'))

WebUI.delay(1)

WebUI.enhancedClick(findTestObject('Page_Automation Exercise - All Products/a_Add to cart'))

WebUI.click(findTestObject('Page_Automation Exercise - All Products/u_View Cart'))

WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise - Checkout/a_Blue Top'))

WebUI.click(findTestObject('Page_Automation Exercise - Product Details/a_Signup _ Login'))

WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise - Signup  Login/h2_Login to your account'))

WebUI.setText(findTestObject('Page_Automation Exercise - Signup  Login/input_Email_Login'), 'aufaasuite01@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Automation Exercise - Signup  Login/input_Password_Login'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Page_Automation Exercise - Signup  Login/button_Login'))

WebUI.click(findTestObject('Page_Automation Exercise/a_Cart'))

WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise - Checkout/a_Blue Top'))

WebUI.closeBrowser()

