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

WebUI.click(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/button_Toggle navigation'))

WebUI.click(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_Battleground'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Battleground  MaxQuest/img'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Battleground  MaxQuest/img'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Battleground  MaxQuest/a_PLAY NOW'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Battleground  MaxQuest/a_PLAY NOW'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Battleground  MaxQuest/a_PLAY NOW'))

WebUI.mouseOver(findTestObject('Object Repository/Page_Battleground  MaxQuest/a_PLAY NOW'))

WebUI.click(findTestObject('Object Repository/Page_Battleground  MaxQuest/a_PLAY NOW'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Battleground  MaxQuest/span_HOW TO PLAY'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Battleground  MaxQuest/span_HOW TO PLAY'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Battleground  MaxQuest/span_HOW TO PLAY'))

WebUI.mouseOver(findTestObject('Object Repository/Page_Battleground  MaxQuest/span_HOW TO PLAY'))

WebUI.click(findTestObject('Object Repository/Page_Battleground  MaxQuest/span_HOW TO PLAY'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Battleground  MaxQuest/h3_Instructions  Rules'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Battleground  MaxQuest/img_1'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Battleground  MaxQuest/img_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Battleground  MaxQuest/div_How to play      Compete in a room made_9806f2'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Battleground  MaxQuest/button_CLOSE'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Battleground  MaxQuest/button_CLOSE'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Battleground  MaxQuest/button_CLOSE'))

WebUI.mouseOver(findTestObject('Object Repository/Page_Battleground  MaxQuest/button_CLOSE'))

WebUI.click(findTestObject('Object Repository/Page_Battleground  MaxQuest/button_CLOSE'))

WebUI.closeBrowser()

