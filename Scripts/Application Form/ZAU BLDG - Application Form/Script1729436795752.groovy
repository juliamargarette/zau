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

WebUI.navigateToUrl('https://mandacoreqa.unifysyscontrol.com/index.php/login')

WebUI.setText(findTestObject('Object Repository/Application Form/Page_Mandaluyong E-Services/Page_Mandaluyong E-Services/input_Email Address_input_username'), 
    'gwen@sharklasers.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Application Form/Page_Mandaluyong E-Services/Page_Mandaluyong E-Services/input_Password_password'), 
    'OrT/QrbDeMfQOHLTXq6LIQ==')

WebUI.click(findTestObject('Object Repository/Application Form/Page_Mandaluyong E-Services/Page_Mandaluyong E-Services/button_LOG-IN'))

WebUI.click(findTestObject('Object Repository/Application Form/Page_Mandaluyong E-Services/Page_Mandaluyong E-Services/img_ONLINE SERVICES_img-fluid banner-image _ba0b3c'))

WebUI.click(findTestObject('Object Repository/Application Form/Page_Mandaluyong E-Services/Page_Mandaluyong E-Services/a_Zoning Application'))

WebUI.click(findTestObject('Object Repository/Application Form/Page_Mandaluyong E-Services/Page_Mandaluyong E-Services/a_Locational Clearance'))

WebUI.click(findTestObject('Object Repository/Application Form/Page_Mandaluyong E-Services/Page_Mandaluyong E-Services/input__txt_lcinfonature_of_application'))

WebUI.click(findTestObject('Object Repository/Application Form/Page_Mandaluyong E-Services/Page_Mandaluyong E-Services/input_INFORMATION_txt_lcinfoapp_position'))

WebUI.setText(findTestObject('Object Repository/Application Form/Page_Mandaluyong E-Services/Page_Mandaluyong E-Services/input__txt_lcinfonopgm_fn'), 
    'AIAH')

WebUI.setText(findTestObject('Object Repository/Application Form/Page_Mandaluyong E-Services/Page_Mandaluyong E-Services/input__txt_lcinfonopgm_ln'), 
    'ARCETA')

WebUI.click(findTestObject('Object Repository/Application Form/Page_Mandaluyong E-Services/Page_Mandaluyong E-Services/input_Invalid field. Please enter proper te_3469a4'))

WebUI.setText(findTestObject('Object Repository/Application Form/Page_Mandaluyong E-Services/Page_Mandaluyong E-Services/input__txt_lcinfophno_case'), 
    '9458795676')

WebUI.setText(findTestObject('Object Repository/Application Form/Page_Mandaluyong E-Services/Page_Mandaluyong E-Services/input__txt_lcinfoemail_case'), 
    'aiah@sharklasers.com')

WebUI.click(findTestObject('Object Repository/Application Form/Page_Mandaluyong E-Services/Page_Mandaluyong E-Services/p_Applied by'))

WebUI.click(findTestObject('Object Repository/Application Form/Page_Mandaluyong E-Services/Page_Mandaluyong E-Services/input_Please upload a file here_txt_lcinfoappby'))

WebUI.setText(findTestObject('Object Repository/Application Form/Page_Mandaluyong E-Services/Page_Mandaluyong E-Services/input_Name of FirmCorpCo_txt_lcinfonfcc'), 
    'SAMPLE FIRM')

WebUI.setText(findTestObject('Object Repository/Application Form/Page_Mandaluyong E-Services/Page_Mandaluyong E-Services/input__txt_lcinfotpta'), 
    'CORP')

WebUI.selectOptionByValue(findTestObject('Object Repository/Application Form/Page_Mandaluyong E-Services/Page_Mandaluyong E-Services/select_- Select Region -Bangsamoro Autonomo_43e1fd'), 
    '0100000000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Application Form/Page_Mandaluyong E-Services/Page_Mandaluyong E-Services/select_- Select Province -Ilocos NorteIloco_87f89a'), 
    '0103300000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Application Form/Page_Mandaluyong E-Services/Page_Mandaluyong E-Services/select_- Select City -AgooAringayBacnotanBa_f53a49'), 
    '0103306000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Application Form/Page_Mandaluyong E-Services/Page_Mandaluyong E-Services/select_- Select Barangay -AgdeppaAlzateBang_2c7b44'), 
    '0103306008', true)

WebUI.setText(findTestObject('Object Repository/Application Form/Page_Mandaluyong E-Services/Page_Mandaluyong E-Services/input__txt_lcinfohblasubf_ha'), 
    'LOT 4')

WebUI.setText(findTestObject('Object Repository/Application Form/Page_Mandaluyong E-Services/Page_Mandaluyong E-Services/input_Block No_txt_lcinfohblasubf_ha'), 
    'BLOCK 10A')

WebUI.setText(findTestObject('Object Repository/Application Form/Page_Mandaluyong E-Services/Page_Mandaluyong E-Services/input__txt_lcinfohblasubf_ha_1'), 
    '123 ST')

WebUI.setText(findTestObject('Object Repository/Application Form/Page_Mandaluyong E-Services/Page_Mandaluyong E-Services/input__txt_lcinfosubd_ha'), 
    'AYALA ZOBEL')

WebUI.selectOptionByValue(findTestObject('Object Repository/Application Form/Page_Mandaluyong E-Services/Page_Mandaluyong E-Services/select_-Select Barangay Here-              _4b8666'), 
    '11', true)

WebUI.setText(findTestObject('Object Repository/Application Form/Page_Mandaluyong E-Services/Page_Mandaluyong E-Services/input__txt_lcinfohblasubf_lpe'), 
    'LOT 1')

WebUI.setText(findTestObject('Object Repository/Application Form/Page_Mandaluyong E-Services/Page_Mandaluyong E-Services/input_Block No_txt_lcinfohblasubf_lpe'), 
    'BLOCK 4A')

WebUI.click(findTestObject('Object Repository/Application Form/Page_Mandaluyong E-Services/Page_Mandaluyong E-Services/ul__select2-selection__rendered'))

WebUI.setText(findTestObject('Object Repository/Application Form/Page_Mandaluyong E-Services/Page_Mandaluyong E-Services/input__txt_lcinfosubd_lpe'), 
    'OLD VILLAGE')

WebUI.setText(findTestObject('Object Repository/Application Form/Page_Mandaluyong E-Services/Page_Mandaluyong E-Services/input_ZIP Code_txt_lcinfozipc_lpe'), 
    '4621')

WebUI.click(findTestObject('Object Repository/Application Form/Page_Mandaluyong E-Services/Page_Mandaluyong E-Services/button_PIN LOCATION ON GOOGLE MAP'))

WebUI.click(findTestObject('Object Repository/Application Form/Page_Mandaluyong E-Services/Page_Mandaluyong E-Services/button_CANCEL'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Application Form/Page_Mandaluyong E-Services/Page_Mandaluyong E-Services/select_-Select Barangay Here-              _4b8666'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Application Form/Page_Mandaluyong E-Services/Page_Mandaluyong E-Services/span_PIN LOCATION ON GOOGLE MAP'))

WebUI.click(findTestObject('Object Repository/Application Form/Page_Mandaluyong E-Services/Page_Mandaluyong E-Services/div_To navigate, press the arrow keys'))

WebUI.click(findTestObject('Object Repository/Application Form/Page_Mandaluyong E-Services/Page_Mandaluyong E-Services/span_PROCEED'))

WebUI.click(findTestObject('Object Repository/Application Form/Page_Mandaluyong E-Services/Page_Mandaluyong E-Services/input_Invalid field_project_description'))

WebUI.setText(findTestObject('Object Repository/Application Form/Page_Mandaluyong E-Services/Page_Mandaluyong E-Services/input_Floor Area to bebeing utilized (sqm)__d7e619'), 
    '100')

WebUI.setText(findTestObject('Object Repository/Application Form/Page_Mandaluyong E-Services/Page_Mandaluyong E-Services/input__txt_lcinfotfab_sqm'), 
    '100')

WebUI.setText(findTestObject('Object Repository/Application Form/Page_Mandaluyong E-Services/Page_Mandaluyong E-Services/input_Gross Floor Area of Building (sqm)_tx_aa6ffc'), 
    '100')

WebUI.setText(findTestObject('Object Repository/Application Form/Page_Mandaluyong E-Services/Page_Mandaluyong E-Services/input_Project Cost_txt_lcinfoprojcos'), 
    '1,200,000')

WebUI.setText(findTestObject('Object Repository/Application Form/Page_Mandaluyong E-Services/Page_Mandaluyong E-Services/input__txt_lcinfolotarea'), 
    '100')

WebUI.setText(findTestObject('Object Repository/Application Form/Page_Mandaluyong E-Services/Page_Mandaluyong E-Services/textarea_Products to be Stored_txt_lcinfoprodst'), 
    'N/A')

WebUI.setText(findTestObject('Object Repository/Application Form/Page_Mandaluyong E-Services/Page_Mandaluyong E-Services/input__txt_lcinfotctno'), 
    '3465754342')

WebUI.click(findTestObject('Object Repository/Application Form/Page_Mandaluyong E-Services/Page_Mandaluyong E-Services/input__txt_lcinfoproperty_owned'))

WebUI.click(findTestObject('Object Repository/Application Form/Page_Mandaluyong E-Services/Page_Mandaluyong E-Services/input_Please upload a file here_checkbox_at_f5debb'))

