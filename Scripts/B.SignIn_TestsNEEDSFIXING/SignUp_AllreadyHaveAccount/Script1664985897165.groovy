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

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('https://maxquest.com/')

not_run: WebUI.mouseOver(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_Join'))

not_run: WebUI.click(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_Join'))

not_run: WebUI.setText(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/input_Start your journey_email'), 
    'samk95@hotmail.co.uk')

'CURSED TEST CANNOT CLICK CHECKBOX\r\n'
not_run: WebUI.setText(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/input_Email is not valid_username'), 
    'SamTester')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/input_Username is not valid_password'), 
    'ufxyx2TotSAyll4EMnJoaA==')

not_run: WebUI.mouseOver(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/label_Yes, Im over 21 and I agree to the Te_6a71bc'))

not_run: WebUI.click(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/label_Yes, Im over 21 and I agree to the Te_6a71bc'))

not_run: WebUI.check(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/label_Yes, Im over 21 and I agree to the Te_6a71bc'))

not_run: WebUI.click(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/input_Yes, please send me game tips and fre_964072'))

not_run: WebUI.verifyElementText(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/span_Email already exists'), 
    'Email already exists')

not_run: WebUI.click(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/span_x'))

not_run: WebUI.closeBrowser()

