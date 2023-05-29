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

WebUI.navigateToUrl('https://uat.c2cassets.com/')

WebUI.setText(findTestObject('Object Repository/Page_Connect2Clinic/input_Login to Virtual Clinic_OTP-input'), '8072536860')

WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/button_Continue'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Connect2Clinic/input_Edit_password-input'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/button_Allow'))

WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/button_Book Appointment'))

WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/p_Instant Consultation'))

WebUI.setText(findTestObject('Object Repository/Page_Connect2Clinic/input_Patient Name_patient_name_Search'), '2')

WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/div_C2C SMS'))

WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/img_Fees seen by Patient  3_p-2'))

WebUI.setText(findTestObject('Object Repository/Page_Connect2Clinic/input_Patient Name_patient_name_Search'), '8867487024')

WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/button_Share Link'))

WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/button_Yes'))

WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/li_2Enter Details'))

WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/p_2'))

WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/p_1'))

WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/p_2'))

WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/p_2'))

WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/li_1Login'))

WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/li_1Login'))

WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/div_Patient will join the consultation shor_a60ea0'))

WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/div_Patient will join the consultation shor_a60ea0'))

WebUI.closeBrowser()

WebUI.verifyOptionPresentByValue(findTestObject(null), '', false, 0)

