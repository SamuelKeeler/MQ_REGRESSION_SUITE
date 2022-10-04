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

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_Help Center'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_Help Center'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_Help Center'))

WebUI.mouseOver(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_Help Center'))

WebUI.click(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_Help Center'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Help Center  MaxQuest/div_The quickest way to find the answer to _ae3e8f'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Help Center  MaxQuest/a_See All'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Help Center  MaxQuest/a_See All'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Help Center  MaxQuest/a_See All'))

WebUI.click(findTestObject('Object Repository/Page_Help Center  MaxQuest/a_See All'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_FAQ  MaxQuest/div_General                                _6f5ff0'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_FAQ  MaxQuest/div_General'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_FAQ  MaxQuest/div_Gameplay'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_FAQ  MaxQuest/div_Battleground'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_FAQ  MaxQuest/div_Fastfire'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_FAQ  MaxQuest/div_Account'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_FAQ  MaxQuest/div_Deposits  Withdrawals'), 0)

WebUI.click(findTestObject('Object Repository/Page_FAQ  MaxQuest/a_What is MaxQuest'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_FAQ  MaxQuest/p_MaxQuest is a reward-based hybrid skill g_edde9a'))

WebUI.click(findTestObject('Object Repository/Page_FAQ  MaxQuest/i_Who are the Heroes_fas fa-chevron-down'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_FAQ  MaxQuest/p_The MaxQuest Squad is ragtag band of boun_6c9e2a'))

WebUI.click(findTestObject('Object Repository/Page_FAQ  MaxQuest/i_What is Battleground_fas fa-chevron-down'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_FAQ  MaxQuest/span_Battleground is the multiplayer mode f_ca416b'))

WebUI.click(findTestObject('Object Repository/Page_FAQ  MaxQuest/i_What is Fastfire_fas fa-chevron-down'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_FAQ  MaxQuest/span_Fastfire is the single player mode for_ec58c0'))

WebUI.click(findTestObject('Object Repository/Page_FAQ  MaxQuest/i_Can I change my personal information_fas _44b7ee'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_FAQ  MaxQuest/span_Contact Customer Support to edit infor_e872d1'))

WebUI.click(findTestObject('Object Repository/Page_FAQ  MaxQuest/i_Are there fees for deposits and withdrawa_a212a0'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_FAQ  MaxQuest/p_MaxQuest will never take any fees for dep_292056'))

WebUI.closeBrowser()

