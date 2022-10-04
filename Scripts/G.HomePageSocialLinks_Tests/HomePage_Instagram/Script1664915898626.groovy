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

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/span_Crypto_fab fa-instagram'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/span_Crypto_fab fa-instagram'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/span_Crypto_fab fa-instagram'))

WebUI.click(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/span_Crypto_fab fa-instagram'))

WebUI.switchToWindowTitle('MaxQuest (@maxquestofficial) • Instagram photos and videos')

'Flakey, Instagram Doesnt like clicks in window, \r\n\r\n\r\n'
not_run: WebUI.click(findTestObject('Object Repository/Page_MaxQuest (maxquestofficial)  Instagram_8e6803/button_Only allow essential cookies'))

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/Page_MaxQuest (maxquestofficial)  Instagram_8e6803/div_maxquest.com'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/Page_MaxQuest (maxquestofficial)  Instagram_8e6803/div_maxquestofficialMessageFollow1 post73 f_f1bb63'))

not_run: WebUI.click(findTestObject('Object Repository/Page_MaxQuest (maxquestofficial)  Instagram_8e6803/div_maxquest.com'))

not_run: WebUI.switchToWindowTitle('The 1st Player vs Player Crypto Action Games | MaxQuest')

not_run: WebUI.click(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/div_A Different way to play. A New way to w_0e2c2e'))

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_A Different way to play_custom-logo-link'), 
    0)

WebUI.closeBrowser()

