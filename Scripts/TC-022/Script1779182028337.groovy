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

WebUI.click(findTestObject('Page_Automation Exercise/a_Contact us'))

WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise - Contact Us/h2_Get In Touch'))

WebUI.setText(findTestObject('Page_Automation Exercise - Contact Us/input_Name'), 'AUFAA')

WebUI.setText(findTestObject('Page_Automation Exercise - Contact Us/input_Email'), 'aufaa@gmail.com')

WebUI.setText(findTestObject('Page_Automation Exercise - Contact Us/input_Subject'), 'test')

WebUI.setText(findTestObject('Page_Automation Exercise - Contact Us/textarea_Your Message Here'), 'test bug')

WebUI.uploadFile(findTestObject('Page_Automation Exercise - Contact Us/input_upload_file'), 'C:\\Users\\ACER\\Downloads\\dog.jpg')

WebUI.click(findTestObject('Page_Automation Exercise - Contact Us/input_submit'))

WebUI.waitForAlert(3)

WebUI.acceptAlert()

WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise - Contact Us/div_Success Your details have been submitted su'))

WebUI.click(findTestObject('Page_Automation Exercise - Contact Us/a_Home'))

WebUI.closeBrowser()

