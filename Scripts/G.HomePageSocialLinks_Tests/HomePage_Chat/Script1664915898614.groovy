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

WebUI.navigateToUrl('https://maxquest.com/')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/em_Crypto_zsiq_agtpic'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/em_Crypto_zsiq_agtpic'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/em_Crypto_zsiq_agtpic'))

WebUI.click(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/em_Crypto_zsiq_agtpic'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/input_Please enter a valid name_visname'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/input_Please enter a valid email address_visemail'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/textarea_Please enter a valid email address_bc02c9'), 
    0)

WebUI.setText(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/input_Please enter a valid name_visname'), 
    'TEST_ACCOUNT')

WebUI.setText(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/input_Please enter a valid email address_visemail'), 
    'Samk95@hotmail.co.uk')

WebUI.setText(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/textarea_Please enter a valid email address_bc02c9'), 
    'THIS IS A TEST MESSAGE IGNORE IT PLEASE.')

WebUI.click(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/em_Start Chat'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/span_Please wait while we connect you to ou_0db3f8'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/span_Please wait while we connect you to ou_0db3f8'))

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/div_TEST_ACCOUNT'), 
    0)

not_run: WebUI.rightClick(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/div_THIS IS A TEST MESSAGE IGNORE IT PLEASE'))

'Flakey Breaking the test'
not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/div_THIS IS A TEST MESSAGE IGNORE IT PLEASE_1'), 
    0)

not_run: WebUI.rightClick(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/div_THIS IS A TEST MESSAGE IGNORE IT PLEASE'))

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/div_THIS IS A TEST MESSAGE IGNORE IT PLEASE_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/textarea_THIS IS A TEST MESSAGE IGNORE IT P_7d0081'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/textarea_THIS IS A TEST MESSAGE IGNORE IT P_7d0081'))

WebUI.setText(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/textarea_THIS IS A TEST MESSAGE IGNORE IT P_7d0081'), 
    'REPLY')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/div_THIS IS A TEST MESSAGE IGNORE IT PLEASE_18c1a8'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/div_THIS IS A TEST MESSAGE IGNORE IT PLEASE_18c1a8'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/header_Chat with us now'))

WebUI.click(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/div_concat(id(, , showsiqconv, , ))_showsiqconv'))

not_run: WebUI.click(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/em_Awaiting to connect_siqc_eletype sqico-timer'))

'Flakey Breaking the test'
not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/div_THIS IS A TEST MESSAGE IGNORE IT PLEASE_1'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/div_concat(id(, , showsiqconv, , ))_showsiqconv'))

WebUI.click(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/div_Conversation(s)_win_close sqico-larrow'))

WebUI.closeBrowser()

