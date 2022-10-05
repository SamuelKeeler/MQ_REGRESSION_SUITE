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

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Battleground  MaxQuest/p_Jump into 90-second player vs player batt_4f9fd6'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Battleground  MaxQuest/div_WINNER TAKES ALL                 Jump i_e3d544'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Battleground  MaxQuest/div_WINNER_vce-features--icon vce-icon'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Battleground  MaxQuest/div_WINNER_vce-features--icon vce-icon'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Battleground  MaxQuest/span_WINNER_vce-icon-container vcv-ui-icon-_208485'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Battleground  MaxQuest/button_Sign Up'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Battleground  MaxQuest/button_Sign Up'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Battleground  MaxQuest/button_Sign Up'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Battleground  MaxQuest/div_video classvce-self-hosted-video-player_352f28'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Battleground  MaxQuest/div_video classvce-self-hosted-video-player_352f28'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Battleground  MaxQuest/button_Sign Up'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Battleground  MaxQuest/button_Sign Up'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Battleground  MaxQuest/button_Sign Up'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Battleground  MaxQuest/div_Engage in player vs player battles in t_a1e343'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Battleground  MaxQuest/div_Engage in player vs player battles in t_a1e343'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Battleground  MaxQuest/button_Sign Up'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Battleground  MaxQuest/button_Sign Up'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Battleground  MaxQuest/button_Sign Up'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Battleground  MaxQuest/div_A new adventure awaits in Sector X Comp_3ee756'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Battleground  MaxQuest/div_A new adventure awaits in Sector X Comp_3ee756'))

WebUI.closeBrowser()

