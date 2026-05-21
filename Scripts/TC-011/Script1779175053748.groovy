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

WebUI.navigateToUrl('https://automationexercise.com')

WebUI.click(findTestObject('Page_Automation Exercise/a_Products'))

WebUI.refresh()

WebUI.verifyElementPresent(findTestObject('Page_Automation Exercise - All Products/h2_All Products'), 0)

WebUI.enhancedClick(findTestObject('Page_Automation Exercise - All Products/a_View Product'))

WebUI.verifyElementPresent(findTestObject('Page_Automation Exercise - Product Details/a_Write Your Review'), 0)

WebUI.setText(findTestObject('Page_Automation Exercise - Product Details/input_Your Name'), 'aufaa')

WebUI.setText(findTestObject('Page_Automation Exercise - Product Details/input_Email Address'), 'aufaa01@gmail.com')

WebUI.setText(findTestObject('Page_Automation Exercise - Product Details/textarea_Add Review Here'), 'test')

WebUI.click(findTestObject('Page_Automation Exercise - Product Details/button_button-review'))

WebUI.verifyElementPresent(findTestObject('Page_Automation Exercise - Product Details/span_Thank you for your review'), 
    0)

WebUI.closeBrowser()

