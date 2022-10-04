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

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/div_video classvce-self-hosted-video-player_f58220'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/div_video classvce-self-hosted-video-player_f58220'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_Play Now'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_Play Now'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_Play Now'))

WebUI.mouseOver(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_Play Now'))

WebUI.click(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_Play Now'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Battleground  MaxQuest/img'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Battleground  MaxQuest/img'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Battleground  MaxQuest/span_BACK TO LOBBY'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Battleground  MaxQuest/span_BACK TO LOBBY'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Battleground  MaxQuest/span_BACK TO LOBBY'))

WebUI.mouseOver(findTestObject('Object Repository/Page_Battleground  MaxQuest/span_BACK TO LOBBY'))

WebUI.click(findTestObject('Object Repository/Page_Battleground  MaxQuest/span_BACK TO LOBBY'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Battleground  MaxQuest/span_BACK TO HOME'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Battleground  MaxQuest/span_BACK TO HOME'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Battleground  MaxQuest/span_BACK TO HOME'))

WebUI.mouseOver(findTestObject('Object Repository/Page_Battleground  MaxQuest/span_BACK TO HOME'))

WebUI.click(findTestObject('Object Repository/Page_Battleground  MaxQuest/span_BACK TO HOME'))

WebUI.closeBrowser()

