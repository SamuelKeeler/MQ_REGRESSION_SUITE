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

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_About'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_Terms  Conditions'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_AML Policy'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_Privacy Policy'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_Crypto'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_Help Center'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Help Center  MaxQuest/div_Need Some Backup                Weve go_5defdd'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Help Center  MaxQuest/div_Need Some Backup                Weve go_5defdd'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Help Center  MaxQuest/a_See All'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Help Center  MaxQuest/a_See All'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Help Center  MaxQuest/a_See All'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Help Center  MaxQuest/a_Help Center'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Help Center  MaxQuest/a_About'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Help Center  MaxQuest/a_Terms  Conditions'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Help Center  MaxQuest/a_AML Policy'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Help Center  MaxQuest/a_Privacy Policy'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Help Center  MaxQuest/a_Crypto'), 0)

WebUI.click(findTestObject('Object Repository/Page_Help Center  MaxQuest/a_About'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/h1_Player VS player Arena'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/h1_Play to win crypto'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/h1_Our Heroes'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/h1_Single player missions'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/a_Help Center'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/a_About'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/a_Terms  Conditions'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/a_AML Policy'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/a_Privacy Policy'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/a_Crypto'), 0)

WebUI.click(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/a_Terms  Conditions'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Terms  Conditions  MaxQuest/h1_Terms  Conditions'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Terms  Conditions  MaxQuest/div_MaxQuest                 Terms  Conditi_479181'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Terms  Conditions  MaxQuest/a_Help Center'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Terms  Conditions  MaxQuest/a_About'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Terms  Conditions  MaxQuest/a_Terms  Conditions'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Terms  Conditions  MaxQuest/a_AML Policy'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Terms  Conditions  MaxQuest/a_Privacy Policy'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Terms  Conditions  MaxQuest/a_Crypto'), 0)

WebUI.click(findTestObject('Object Repository/Page_Terms  Conditions  MaxQuest/a_AML Policy'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Aml Policy  MaxQuest/b_ANTI-MONEY LAUNDERING'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Aml Policy  MaxQuest/b_ANTI TERRORISM FINANCING PROCEDURES'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Aml Policy  MaxQuest/div_img height1 width1 styledisplaynone src_7cacd0'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Aml Policy  MaxQuest/a_Help Center'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Aml Policy  MaxQuest/a_About'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Aml Policy  MaxQuest/a_Terms  Conditions'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Aml Policy  MaxQuest/a_AML Policy'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Aml Policy  MaxQuest/a_Privacy Policy'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Aml Policy  MaxQuest/a_Crypto'), 0)

WebUI.click(findTestObject('Object Repository/Page_Aml Policy  MaxQuest/a_Privacy Policy'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Privacy Policy  MaxQuest/h1_Privacy Policy'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Privacy Policy  MaxQuest/div_MQ Technology DWC-LLC (operating under _8862ee'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Privacy Policy  MaxQuest/a_Help Center'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Privacy Policy  MaxQuest/a_About'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Privacy Policy  MaxQuest/a_Terms  Conditions'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Privacy Policy  MaxQuest/a_AML Policy'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Privacy Policy  MaxQuest/a_Privacy Policy'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Privacy Policy  MaxQuest/a_Crypto'), 0)

WebUI.click(findTestObject('Object Repository/Page_Privacy Policy  MaxQuest/a_Crypto'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Crypto  MaxQuest/h2_EVERYTHING YOU NEED TO KNOW ABOUT CRYPTO'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Crypto  MaxQuest/div_A Quick QA                       What a_85d32e'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Crypto  MaxQuest/div_Online purchases                       _f93e75'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Crypto  MaxQuest/a_Help Center'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Crypto  MaxQuest/a_About'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Crypto  MaxQuest/a_Terms  Conditions'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Crypto  MaxQuest/a_AML Policy'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Crypto  MaxQuest/a_Privacy Policy'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Crypto  MaxQuest/a_Crypto'), 0)

WebUI.closeBrowser()

