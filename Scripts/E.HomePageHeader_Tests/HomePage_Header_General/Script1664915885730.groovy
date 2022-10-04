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

WebUI.click(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/input_Welcome back_username'), 
    'samk95@hotmail.co.uk')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/input_Welcome back_password'), 
    'ufxyx2TotSAyll4EMnJoaA==')

WebUI.click(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/input_Click here_loginContinueButton'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/div_QC 70,000.00     MC 7.00               _355b28'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/div_QC 70,000.00     MC 7.00               _355b28'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/div_QC 70,000.00     MC 7.00               _355b28_1_2'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/span_QC 70,000.00_slider'))

WebUI.click(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/span_QC 70,000.00_slider'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_Buy'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_Buy'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_Buy'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/i_Buy_fas fa-bell'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/i_Buy_fas fa-bell'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/i_Buy_fas fa-bell'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/i_Buy_fas fa-user'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/i_Buy_fas fa-user'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/i_Buy_fas fa-user'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/span_Online players 3143'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/span_Online players 3143'))

WebUI.click(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/i_Buy_fas fa-bell'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/ul_Buy_notifications-list'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/ul_Buy_notifications-list'))

WebUI.click(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/i_Buy_fas fa-bell'))

WebUI.click(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/i_Buy_fas fa-user'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/ul_Dashboard               Transactions    _40f60d'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/ul_Dashboard               Transactions    _40f60d'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_Dashboard'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_Dashboard'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_Dashboard'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_Transactions'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_Transactions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_Transactions'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_History'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_History'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_History'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_Settings'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_Settings'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_Settings'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_Log Out'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_Log Out'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_Log Out'))

WebUI.click(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/i_Buy_fas fa-user'))

WebUI.click(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/i_Buy_fas fa-user'))

WebUI.mouseOver(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_Log Out'))

WebUI.click(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_Log Out'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_Log in'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_Join'))

WebUI.closeBrowser()

