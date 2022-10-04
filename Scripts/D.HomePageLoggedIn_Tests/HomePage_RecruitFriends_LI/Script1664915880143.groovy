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

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/h1_Max Rewards'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/h1_Max Rewards'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/div_Explore our giveaways, discounts, and e_0afb6b'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/div_Explore our giveaways, discounts, and e_0afb6b'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_Read More'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_Read More'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_Read More'))

WebUI.click(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_Read More'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/div_Get 5 Max Coins for free when you refer_a8bca6'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/div_Get 5 Max Coins for free when you refer_a8bca6'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_GET REWARDED'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_GET REWARDED'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_GET REWARDED'))

WebUI.click(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_GET REWARDED'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Refer Friends  MaxQuest/h1_REFER FRIENDS'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Refer Friends  MaxQuest/h1_REFER FRIENDS'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Refer Friends  MaxQuest/input_Grab all your friends and start earni_c89c2d'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Refer Friends  MaxQuest/input_Grab all your friends and start earni_d0df5c'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Refer Friends  MaxQuest/input_Grab all your friends and start earni_4ddf63'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Refer Friends  MaxQuest/input_Grab all your friends and start earni_23fd06'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Refer Friends  MaxQuest/button_Add More'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Refer Friends  MaxQuest/button_Add More'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Refer Friends  MaxQuest/button_Add More'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Refer Friends  MaxQuest/button_Submit'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Refer Friends  MaxQuest/button_Submit'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Refer Friends  MaxQuest/button_Submit'))

WebUI.setText(findTestObject('Object Repository/Page_Refer Friends  MaxQuest/input_Grab all your friends and start earni_c89c2d'), 
    'samk95@hotmail.co.uk')

WebUI.click(findTestObject('Object Repository/Page_Refer Friends  MaxQuest/button_Submit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Refer Friends  MaxQuest/div_x       Refer friends'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Refer Friends  MaxQuest/p_Please make a purchase to enable Friend invites'), 
    0)

WebUI.mouseOver(findTestObject('Object Repository/Page_Refer Friends  MaxQuest/span_x'))

WebUI.click(findTestObject('Object Repository/Page_Refer Friends  MaxQuest/span_x'))

WebUI.click(findTestObject('Object Repository/Page_Refer Friends  MaxQuest/button_Add More'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Refer Friends  MaxQuest/input_Grab all your friends and start earni_0079a4'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Refer Friends  MaxQuest/input_Grab all your friends and start earni_0079a4'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Refer Friends  MaxQuest/input_Grab all your friends and start earni_cf3092'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Refer Friends  MaxQuest/input_Grab all your friends and start earni_cf3092'))

WebUI.closeBrowser()

