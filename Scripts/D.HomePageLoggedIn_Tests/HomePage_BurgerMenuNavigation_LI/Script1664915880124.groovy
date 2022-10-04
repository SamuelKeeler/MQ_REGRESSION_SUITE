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

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/button_Toggle navigation'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/button_Toggle navigation'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/button_Toggle navigation'))

WebUI.mouseOver(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/button_Toggle navigation'))

WebUI.click(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/button_Toggle navigation'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/div_Battleground          Fastfire         _ceebe9'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/div_Battleground          Fastfire         _ceebe9'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/ul_Battleground          Fastfire          _f5200e'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/ul_Battleground          Fastfire          _f5200e'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_Battleground'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_Battleground'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_Battleground'))

WebUI.mouseOver(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_Battleground'))

WebUI.click(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_Battleground'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Battleground  MaxQuest/img'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Battleground  MaxQuest/img'))

WebUI.click(findTestObject('Object Repository/Page_Battleground  MaxQuest/div_CASINO_navbar-toggle'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Battleground  MaxQuest/a_FASTFIRE'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Battleground  MaxQuest/a_FASTFIRE'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Battleground  MaxQuest/a_FASTFIRE'))

WebUI.mouseOver(findTestObject('Object Repository/Page_Battleground  MaxQuest/a_FASTFIRE'))

WebUI.click(findTestObject('Object Repository/Page_Battleground  MaxQuest/a_FASTFIRE'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Fastfire  MaxQuest/div_Fastfire_vce-single-image-inner vce-sin_5f2b87'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Fastfire  MaxQuest/div_Fastfire_vce-single-image-inner vce-sin_5f2b87'))

WebUI.click(findTestObject('Object Repository/Page_Fastfire  MaxQuest/button_Toggle navigation'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Fastfire  MaxQuest/a_Triple Max Blast'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Fastfire  MaxQuest/a_Triple Max Blast'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Fastfire  MaxQuest/a_Triple Max Blast'))

WebUI.mouseOver(findTestObject('Object Repository/Page_Fastfire  MaxQuest/a_Triple Max Blast'))

WebUI.click(findTestObject('Object Repository/Page_Fastfire  MaxQuest/a_Triple Max Blast'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Play Fastfire Triple Max Blast  MaxQuest/div_Get ready to blast off into crypto rich_66fa36'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Play Fastfire Triple Max Blast  MaxQuest/div_Get ready to blast off into crypto rich_66fa36'))

WebUI.click(findTestObject('Object Repository/Page_Play Fastfire Triple Max Blast  MaxQuest/button_Toggle navigation'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Play Fastfire Triple Max Blast  MaxQuest/a_Max Rewards'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Play Fastfire Triple Max Blast  MaxQuest/a_Max Rewards'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Play Fastfire Triple Max Blast  MaxQuest/a_Max Rewards'))

WebUI.mouseOver(findTestObject('Object Repository/Page_Play Fastfire Triple Max Blast  MaxQuest/a_Max Rewards'))

WebUI.click(findTestObject('Object Repository/Page_Play Fastfire Triple Max Blast  MaxQuest/a_Max Rewards'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Max Rewards  MaxQuest/div_Max Rewards_vce-col-content'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Max Rewards  MaxQuest/div_Max Rewards_vce-col-content'))

WebUI.click(findTestObject('Object Repository/Page_Max Rewards  MaxQuest/button_Toggle navigation'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Max Rewards  MaxQuest/a_Refer Friends'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Max Rewards  MaxQuest/a_Refer Friends'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Max Rewards  MaxQuest/a_Refer Friends'))

WebUI.mouseOver(findTestObject('Object Repository/Page_Max Rewards  MaxQuest/a_Refer Friends'))

WebUI.click(findTestObject('Object Repository/Page_Max Rewards  MaxQuest/a_Refer Friends'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Refer Friends  MaxQuest/h1_REFER FRIENDS'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Refer Friends  MaxQuest/h1_REFER FRIENDS'))

WebUI.click(findTestObject('Object Repository/Page_Refer Friends  MaxQuest/button_Toggle navigation'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Refer Friends  MaxQuest/a_Casino'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Refer Friends  MaxQuest/a_Casino'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Refer Friends  MaxQuest/a_Casino'))

WebUI.mouseOver(findTestObject('Object Repository/Page_Refer Friends  MaxQuest/a_Casino'))

WebUI.click(findTestObject('Object Repository/Page_Refer Friends  MaxQuest/a_Casino'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_All the latest Casino Slots and Jackpo_ea74d7/input_Play Now_search'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_All the latest Casino Slots and Jackpo_ea74d7/input_Play Now_search'))

WebUI.click(findTestObject('Object Repository/Page_All the latest Casino Slots and Jackpo_ea74d7/button_Toggle navigation'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_All the latest Casino Slots and Jackpo_ea74d7/ul_Battleground          Fastfire          _f5200e'), 
    0)

WebUI.closeBrowser()

