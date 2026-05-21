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

WebUI.scrollToElement(findTestObject('Page_Automation Exercise - All Products/a_View Product'), 0)

WebUI.click(findTestObject('Page_Automation Exercise - All Products/a_View Product'))

WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise - Product Details/h2_Blue Top'), FailureHandling.STOP_ON_FAILURE)

WebUI.clearText(findTestObject('Page_Automation Exercise - Product Details/input_quantity'))

WebUI.setText(findTestObject('Page_Automation Exercise - Product Details/input_quantity'), '2')

WebUI.click(findTestObject('Page_Automation Exercise - Product Details/button_Add to cart'))

WebUI.waitForElementVisible(findTestObject('Page_Automation Exercise - Product Details/u_View Cart'), 3)

WebUI.click(findTestObject('Page_Automation Exercise - Product Details/u_View Cart'))

WebUI.verifyElementText(findTestObject('Page_Automation Exercise - Checkout/button_3'), '2')

WebUI.closeBrowser()

