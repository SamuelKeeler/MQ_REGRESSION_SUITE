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

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/div_Do you want to try single player mode  _6d6a88'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/div_Do you want to try single player mode  _6d6a88'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_Play Now'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_Play Now'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_Play Now'))

WebUI.mouseOver(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_Play Now'))

WebUI.click(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_Play Now'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Fastfire  MaxQuest/div_Fastfire_vce-single-image-inner vce-sin_5f2b87'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Fastfire  MaxQuest/div_Fastfire_vce-single-image-inner vce-sin_5f2b87'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Fastfire  MaxQuest/div_ASSEMBLE the dragon stone fragments TO _cc7193'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Fastfire  MaxQuest/div_ASSEMBLE the dragon stone fragments TO _cc7193'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Fastfire  MaxQuest/a_PLAY NOW'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Fastfire  MaxQuest/a_PLAY NOW'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Fastfire  MaxQuest/a_PLAY NOW'))

WebUI.mouseOver(findTestObject('Object Repository/Page_Fastfire  MaxQuest/a_PLAY NOW'))

WebUI.click(findTestObject('Object Repository/Page_Fastfire  MaxQuest/a_PLAY NOW'))

'Had to write in a delay for testing'
WebUI.delay(15)

not_run: WebUI.click(findTestObject('Object Repository/Page_Fastfire  MaxQuest/canvas_Game Max Quest. Version 1.0.6. Date 27.09.2022. FPS 144_app-screen'))

WebUI.mouseOver(findTestObject('Object Repository/Page_Fastfire  MaxQuest/button_'))

WebUI.click(findTestObject('Object Repository/Page_Fastfire  MaxQuest/button_'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Fastfire  MaxQuest/div_Are you sure you want to exit the game _c5e844'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Fastfire  MaxQuest/div_Are you sure you want to exit the game _c5e844'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Fastfire  MaxQuest/button_Yes'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Fastfire  MaxQuest/button_Yes'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Fastfire  MaxQuest/button_Yes'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Fastfire  MaxQuest/button_No'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Fastfire  MaxQuest/button_No'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Fastfire  MaxQuest/button_No'))

WebUI.click(findTestObject('Object Repository/Page_Fastfire  MaxQuest/button_Yes'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Fastfire  MaxQuest/div_Head to the final frontier AND take dow_562571'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Fastfire  MaxQuest/div_Head to the final frontier AND take dow_562571'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Fastfire  MaxQuest/div_Embark on an epic solo adventure with t_a73fec'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Fastfire  MaxQuest/div_Embark on an epic solo adventure with t_a73fec'))

WebUI.closeBrowser()

