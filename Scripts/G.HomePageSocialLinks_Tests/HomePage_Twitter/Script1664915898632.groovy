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

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/span_Crypto_fab fa-twitter'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/span_Crypto_fab fa-twitter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/span_Crypto_fab fa-twitter'))

WebUI.click(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/span_Crypto_fab fa-twitter'))

WebUI.switchToWindowTitle('MaxQuest (@MaxQuest_) / Twitter')

WebUI.click(findTestObject('Object Repository/Page_MaxQuest (MaxQuest_)  Twitter/div_MaxQuest'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_MaxQuest (MaxQuest_)  Twitter/span_MaxQuest_'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_MaxQuest (MaxQuest_)  Twitter/span_maxquest.com'), 0)

WebUI.click(findTestObject('Object Repository/Page_MaxQuest (MaxQuest_)  Twitter/span_maxquest.com'))

WebUI.switchToWindowTitle('The 1st Player vs Player Crypto Action Games | MaxQuest')

WebUI.click(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/div_A Different way to play. A New way to w_a235a2'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_A Different way to play_custom-logo-link'))

WebUI.closeBrowser()
