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

WebUI.click(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_Join'))

WebUI.setText(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/input_Start your journey_email'), 
    'E')

WebUI.verifyElementText(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/span_Email is not valid'), 
    'Email is not valid.')

WebUI.click(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/div_x       Start your journey             _44f4df'))

WebUI.setText(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/input_Start your journey_email'), 
    'samk95@hotmail.co.uk')

WebUI.setText(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/input_Email is not valid_username'), 
    'Sam')

WebUI.verifyElementText(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/span_Username is not valid'), 
    'Username is not valid.')

WebUI.setText(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/input_Email is not valid_username'), 
    'SamTester')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/input_Username is not valid_password'), 
    'cvLmV8WBn88=')

WebUI.verifyElementText(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/span_Please use 6-16 characters, including _d9dd97'), 
    'Please use 6-16 characters, including at least 1 number, 1 letter and 1 special character -!@$^&*')

WebUI.click(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/input_Yes, please send me game tips and fre_964072'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/span_Password is not valid'), 
    'Password is not valid')

WebUI.setText(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/input_Email is not valid_username'), 
    'SamTes')

WebUI.setText(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/input_Start your journey_email'), 
    'samk95@hotmail.co.u')

WebUI.click(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/input_Yes, please send me game tips and fre_964072'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/span_Please enter username more than 8 character'), 
    'Please enter username more than 8 character')

WebUI.setText(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/input_Start your journey_email'), 
    'saadasdassmk95@hotmail.co.u')

WebUI.click(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/div_x       Start your journey             _8fc904'))

WebUI.setText(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/input_Start your journey_email'), 
    '5@hotmail.co.u')

WebUI.click(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/input_Yes, please send me game tips and fre_964072'))

WebUI.click(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/span_x'))

WebUI.closeBrowser()

