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

WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/button_Book Appointment'))

if (Appointment_type == 'Instant Consultation') {
    WebUI.click(findTestObject('Page_Connect2Clinic/p_Appointment_Type', [('Appointment_type') : Appointment_type]))

    WebUI.setText(findTestObject('Object Repository/Page_Connect2Clinic/input_Patient Name_patient_name_Search'), '2')

    WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/div_C2C SMS'))

    WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/img_Fees seen by Patient  3_p-2'))

    WebUI.setText(findTestObject('Object Repository/Page_Connect2Clinic/input_Patient Name_patient_name_Search'), '8867487024')

    WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/button_Share Link'))

    WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/button_Yes'))

    WebUI.takeScreenshot()
} else if (Appointment_type == 'In-Clinic Consultation') {
    WebUI.click(findTestObject('Page_Connect2Clinic/p_Appointment_Type', [('Appointment_type') : Appointment_type]))

    WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/img'))

    WebUI.click(findTestObject('Page_Connect2Clinic/abbr_22', [('Date') : Appointment_Date]))

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/i_In-Clinic Regular_fa fa-caret-up'))

    WebUI.click(findTestObject('Page_Connect2Clinic/div_In-Clinic Regular', [('Consultation_Type') : Consultation_Type]))

    WebUI.delay(5)

    WebUI.click(findTestObject('Page_Connect2Clinic/Button_TimeSlot'))

    WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/button_Save  Continue'))

    WebUI.delay(10)

    WebUI.setText(findTestObject('Page_Connect2Clinic/input_Patient_name'), Patient_Name)

    WebUI.delay(5)

    WebUI.click(findTestObject('Page_Connect2Clinic/h5_Patient_Name'))

    WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/button_Save  Continue'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/button_Pay at Clinic'))

    WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/button_Proceed'))

    WebUI.delay(2)

    WebUI.verifyElementText(findTestObject('Object Repository/Page_Connect2Clinic/h2_Consultation Booked'), 'Consultation Booked')

    WebUI.takeScreenshot()

    WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/button_Okay'))
} else {
    WebUI.click(findTestObject('Page_Connect2Clinic/p_Appointment_Type', [('Appointment_type') : Appointment_type]))

    WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/img'))

    WebUI.click(findTestObject('Page_Connect2Clinic/abbr_22', [('Date') : Appointment_Date]))

    WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/i_In-Clinic Regular_fa fa-caret-up'))

    WebUI.click(findTestObject('Page_Connect2Clinic/div_In-Clinic Regular', [('Consultation_Type') : Consultation_Type]))

    WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/i_In-Clinic Regular_fa fa-caret-up'))

    WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/span_In-Clinic Regular'))

    WebUI.click(findTestObject('Page_Connect2Clinic/Button_TimeSlot', [('Time_Slot') : Time_Slot]))

    WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/button_Save  Continue'))

    WebUI.delay(2)

    WebUI.setText(findTestObject('Page_Connect2Clinic/input_Patient_name'), Patient_Name)

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/h5_Patient_Name'))

    WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/button_Save  Continue'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/div_C2C SMS'))

    WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/button_Send'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/button_Proceed'))

    WebUI.delay(2)

    WebUI.verifyElementText(findTestObject('Object Repository/Page_Connect2Clinic/h2_Consultation Booked'), 'Linked Shared to Patient')

    WebUI.takeScreenshot()

    WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/button_Okay'))
}

WebUI.closeBrowser()

