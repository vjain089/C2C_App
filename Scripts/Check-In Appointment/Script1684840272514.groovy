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

WebUI.callTestCase(findTestCase('C2C_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/i_In-Clinic Regular_fa fa-caret-up'))

WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/div_In-Clinic Consultation'))

WebUI.setText(findTestObject('Object Repository/Page_Connect2Clinic/input_Patient Name_patient_name_Search'), 'Raksh Ed')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/img_Sort'))

WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/span_MostRecentFirst'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/div_Confirmed'))

WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/path'))

WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/span_Mark Check In'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/div_Checked In'))

WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/svg_May 23, 2023_MuiSvgIcon-root'))

WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/span_Start Consultation'))

WebUI.delay(2)

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Connect2Clinic/h4_Consultation already in progress'),5,FailureHandling.OPTIONAL)) {
	
	WebUI.verifyElementText(findTestObject('Object Repository/Page_Connect2Clinic/h4_Consultation already in progress'), 'Consultation already in progress')
	WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/button_Yes'))
}

WebUI.click(findTestObject('Page_Connect2Clinic/div_In Progress'))

WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/svg_May 23, 2023_MuiSvgIcon-root'))

WebUI.click(findTestObject('Page_Connect2Clinic/span_End Consultation'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/div_Completed'))

WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/svg_May 23, 2023_MuiSvgIcon-root'))

WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/div_Raise Invoice'))

WebUI.delay(2)

WebUI.setText(findTestObject('Page_Connect2Clinic/input_Fee'), '5')

WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/p_PAYMENT METHOD FOR AMOUNT TO BE PAID'))

WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/button_Submit'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Page_Connect2Clinic/h4_Consultation already in progress'), 'Invoice Raised Successfully')

WebUI.click(findTestObject('Page_Connect2Clinic/button_Okay'))

