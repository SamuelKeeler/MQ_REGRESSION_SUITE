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

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Battleground  MaxQuest/div_Battleground_vce-single-image-inner vce_a1760e'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Battleground  MaxQuest/div_Battleground_vce-single-image-inner vce_a1760e'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Battleground  MaxQuest/div_WINNER_vce-features--icon vce-icon'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Battleground  MaxQuest/div_WINNER_vce-features--icon vce-icon'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Battleground  MaxQuest/div_WINNER_vce-features--icon vce-icon'))

WebUI.mouseOver(findTestObject('Object Repository/Page_Battleground  MaxQuest/div_WINNER_vce-features--icon vce-icon'))

WebUI.click(findTestObject('Object Repository/Page_Battleground  MaxQuest/div_WINNER_vce-features--icon vce-icon'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Battleground  MaxQuest/button_Tap to unmute_ytp-large-play-button ytp-button ytp-large-play-button-red-bg'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Battleground  MaxQuest/button_Tap to unmute_ytp-large-play-button ytp-button ytp-large-play-button-red-bg'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Battleground  MaxQuest/button_Tap to unmute_ytp-large-play-button ytp-button ytp-large-play-button-red-bg'))

WebUI.click(findTestObject('Object Repository/Page_Battleground  MaxQuest/button_Tap to unmute_ytp-large-play-button ytp-button ytp-large-play-button-red-bg'))

WebUI.mouseOver(findTestObject('Object Repository/Page_Battleground  MaxQuest/div_WINNER_vce-video-popup-close-button'))

WebUI.click(findTestObject('Object Repository/Page_Battleground  MaxQuest/div_WINNER_vce-video-popup-close-button'))

WebUI.closeBrowser()

