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

WebUI.setText(findTestObject('Object Repository/Page_Mandaluyong E-Services/input_Email Address_input_username'), 'gwen@sharklasers.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Mandaluyong E-Services/input_Password_password'), 'OrT/QrbDeMfQOHLTXq6LIQ==')

WebUI.click(findTestObject('Object Repository/Page_Mandaluyong E-Services/button_LOG-IN'))

WebUI.click(findTestObject('Object Repository/Page_Mandaluyong E-Services/a_Zoning Administration Division'))

WebUI.click(findTestObject('Object Repository/Page_Mandaluyong E-Services/a_Zoning Application'))

WebUI.click(findTestObject('Object Repository/Page_Mandaluyong E-Services/a_Locational Clearance'))

WebUI.click(findTestObject('Object Repository/Page_Mandaluyong E-Services/input_New Construction_txt_lcinfonature_of__e085da'))

WebUI.click(findTestObject('Object Repository/Page_Mandaluyong E-Services/input_INFORMATION_txt_lcinfoapp_position'))

WebUI.setText(findTestObject('Object Repository/Page_Mandaluyong E-Services/input__txt_lcinfonopgm_fn'), 'JUAN')

WebUI.setText(findTestObject('Object Repository/Page_Mandaluyong E-Services/input__txt_lcinfonopgm_ln'), 'PELAEZ')

WebUI.click(findTestObject('Object Repository/Page_Mandaluyong E-Services/input_Invalid field. Please enter proper te_3469a4'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mandaluyong E-Services/select_NAJR.IIIIIIIVVVIVIIVIIIIXXXIXIIXIIIX_14a9c9'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Page_Mandaluyong E-Services/input__txt_lcinfophno_case'), '9548934782')

WebUI.setText(findTestObject('Object Repository/Page_Mandaluyong E-Services/input__txt_lcinfoemail_case'), 'PELAEZ@GMAIL.COM')

WebUI.click(findTestObject('Object Repository/Page_Mandaluyong E-Services/input_Please upload a file here_txt_lcinfoappby'))

WebUI.setText(findTestObject('Object Repository/Page_Mandaluyong E-Services/input_Name of FirmCorpCo_txt_lcinfonfcc'), 'SAMPLE FIRM')

WebUI.setText(findTestObject('Object Repository/Page_Mandaluyong E-Services/input__txt_lcinfotpta'), 'CORP')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mandaluyong E-Services/select_- Select Region -Bangsamoro Autonomo_43e1fd'), 
    '0300000000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mandaluyong E-Services/select_- Select Province -AuroraBataanBulac_24d277'), 
    '0305400000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mandaluyong E-Services/select_- Select City -ApalitArayatBacolorCa_68478a'), 
    '0305419000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mandaluyong E-Services/select_- Select Barangay -San AgustinSan Ba_11df06'), 
    '0305419009', true)

WebUI.setText(findTestObject('Object Repository/Page_Mandaluyong E-Services/input__txt_lcinfohblasubf_ha'), 'LOT 4A')

WebUI.setText(findTestObject('Object Repository/Page_Mandaluyong E-Services/input_Block No_txt_lcinfohblasubf_ha'), 'BLOCK 9')

WebUI.setText(findTestObject('Object Repository/Page_Mandaluyong E-Services/input__txt_lcinfohblasubf_ha_1'), '123 NEWARK ST')

WebUI.setText(findTestObject('Object Repository/Page_Mandaluyong E-Services/input__txt_lcinfosubd_ha'), 'ALLEY VILLAGE')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mandaluyong E-Services/select_-Select Barangay Here-              _4b8666'), 
    '24', true)

WebUI.setText(findTestObject('Object Repository/Page_Mandaluyong E-Services/input__txt_lcinfohblasubf_lpe'), 'LOT 6')

WebUI.setText(findTestObject('Object Repository/Page_Mandaluyong E-Services/input_Block No_txt_lcinfohblasubf_lpe'), 'BLOCK 10A')

WebUI.setText(findTestObject('Object Repository/Page_Mandaluyong E-Services/input__txt_lcinfosubd_lpe'), 'VILLARCITY SUBDIVISION')

WebUI.setText(findTestObject('Object Repository/Page_Mandaluyong E-Services/input_ZIP Code_txt_lcinfozipc_lpe'), '4756')

WebUI.click(findTestObject('Object Repository/Page_Mandaluyong E-Services/span_PIN LOCATION ON GOOGLE MAP'))

WebUI.click(findTestObject('Object Repository/Page_Mandaluyong E-Services/div_To navigate, press the arrow keys'))

WebUI.click(findTestObject('Object Repository/Page_Mandaluyong E-Services/button_PROCEED'))

WebUI.click(findTestObject('Object Repository/Page_Mandaluyong E-Services/input_Invalid field_project_description'))

WebUI.setText(findTestObject('Object Repository/Page_Mandaluyong E-Services/input__txt_lcinfofau_sqm'), '100')

WebUI.setText(findTestObject('Object Repository/Page_Mandaluyong E-Services/input__txt_lcinfotfab_sqm'), '100')

WebUI.setText(findTestObject('Object Repository/Page_Mandaluyong E-Services/input_Gross Floor Area of Building (sqm)_tx_aa6ffc'), 
    '100')

WebUI.setText(findTestObject('Object Repository/Page_Mandaluyong E-Services/input_Project Cost_txt_lcinfoprojcos'), '1,500,000')

WebUI.setText(findTestObject('Object Repository/Page_Mandaluyong E-Services/input__txt_lcinfolotarea'), '100')

WebUI.setText(findTestObject('Object Repository/Page_Mandaluyong E-Services/textarea_Products to be Stored_txt_lcinfoprodst'), 
    'N/A')

WebUI.setText(findTestObject('Object Repository/Page_Mandaluyong E-Services/input__txt_lcinfotctno'), '0')

WebUI.click(findTestObject('Object Repository/Page_Mandaluyong E-Services/section_Back to Select Application Type    _69e96e'))

WebUI.setText(findTestObject('Object Repository/Page_Mandaluyong E-Services/input__txt_lcinfotctno'), '4578562411')

WebUI.click(findTestObject('Object Repository/Page_Mandaluyong E-Services/input__txt_lcinfoproperty_owned'))

WebUI.click(findTestObject('Object Repository/Page_Mandaluyong E-Services/input_Please upload a file here_checkbox_at_f5debb'))

WebUI.closeBrowser()

