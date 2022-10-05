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

WebUI.click(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/button_Toggle navigation'))

WebUI.click(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_Battleground'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Battleground  MaxQuest/button_Sign Up'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Battleground  MaxQuest/button_Sign Up'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Battleground  MaxQuest/button_Sign Up'))

WebUI.click(findTestObject('Object Repository/Page_Battleground  MaxQuest/button_Sign Up'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Battleground  MaxQuest/div_x       Start your journey'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Battleground  MaxQuest/div_x       Start your journey'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Battleground  MaxQuest/div_It looks like this Email address is alr_1cf583'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Battleground  MaxQuest/div_It looks like this Email address is alr_1cf583'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Battleground  MaxQuest/input_Start your journey_email'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Battleground  MaxQuest/input_Start your journey_email'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Battleground  MaxQuest/input_Start your journey_email'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Battleground  MaxQuest/input_Email is not valid_username'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Battleground  MaxQuest/input_Email is not valid_username'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Battleground  MaxQuest/input_Email is not valid_username'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Battleground  MaxQuest/input_Username is not valid_password'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Battleground  MaxQuest/input_Username is not valid_password'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Battleground  MaxQuest/input_Username is not valid_password'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Battleground  MaxQuest/input_Yes, please send me game tips and fre_964072'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Battleground  MaxQuest/input_Yes, please send me game tips and fre_964072'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Battleground  MaxQuest/input_Yes, please send me game tips and fre_964072'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Battleground  MaxQuest/a_Continue with Facebook'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Battleground  MaxQuest/a_Continue with Facebook'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Battleground  MaxQuest/a_Continue with Facebook'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Battleground  MaxQuest/a_Continue with Google'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Battleground  MaxQuest/a_Continue with Google'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Battleground  MaxQuest/a_Continue with Google'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Battleground  MaxQuest/strong_Log in here'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Battleground  MaxQuest/strong_Log in here'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Battleground  MaxQuest/strong_Log in here'))

WebUI.click(findTestObject('Object Repository/Page_Battleground  MaxQuest/strong_Log in here'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Battleground  MaxQuest/div_The username or password was incorrect._d456fb'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Battleground  MaxQuest/input_Welcome back_username'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Battleground  MaxQuest/input_Welcome back_username'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Battleground  MaxQuest/input_Welcome back_username'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Battleground  MaxQuest/input_Welcome back_password'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Battleground  MaxQuest/input_Welcome back_password'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Battleground  MaxQuest/input_Welcome back_password'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Battleground  MaxQuest/input_Click here_loginContinueButton'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Battleground  MaxQuest/input_Click here_loginContinueButton'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Battleground  MaxQuest/input_Click here_loginContinueButton'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Battleground  MaxQuest/a_Continue with Facebook'), 0)

'Flakey'
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Battleground  MaxQuest/a_Continue with Facebook'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Battleground  MaxQuest/a_Continue with Facebook'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Battleground  MaxQuest/a_Continue with Google'), 0)

'Flakey'
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Battleground  MaxQuest/a_Continue with Google'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Battleground  MaxQuest/a_Continue with Google'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Battleground  MaxQuest/strong_Create Account'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Battleground  MaxQuest/strong_Create Account'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Battleground  MaxQuest/strong_Create Account'))

WebUI.click(findTestObject('Object Repository/Page_Battleground  MaxQuest/strong_Create Account'))

WebUI.click(findTestObject('Object Repository/Page_Battleground  MaxQuest/strong_Log in here'))

WebUI.setText(findTestObject('Object Repository/Page_Battleground  MaxQuest/input_Welcome back_username'), 'samk95@hotmail.co.uk')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Battleground  MaxQuest/input_Welcome back_password'), 'ufxyx2TotSAyll4EMnJoaA==')

WebUI.click(findTestObject('Object Repository/Page_Battleground  MaxQuest/input_Click here_loginContinueButton'))

WebUI.closeBrowser()

