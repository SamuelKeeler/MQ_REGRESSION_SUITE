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

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/span_Crypto_fab fa-youtube'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/span_Crypto_fab fa-youtube'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/span_Crypto_fab fa-youtube'))

WebUI.click(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/span_Crypto_fab fa-youtube'))

WebUI.switchToWindowTitle('Before you continue to YouTube')

WebUI.click(findTestObject('Object Repository/Page_Before you continue to YouTube/div_We use cookies and data toDeliver and m_d68547'))

WebUI.click(findTestObject('Object Repository/Page_Before you continue to YouTube/span_Accept all'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Max Quest - YouTube/div_Max Quest          Max Quest  10 subscribers'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Max Quest - YouTube/tp-yt-paper-button_Subscribe'), 0)

WebUI.closeBrowser()

