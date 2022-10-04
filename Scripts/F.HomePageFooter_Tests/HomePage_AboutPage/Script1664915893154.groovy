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

WebUI.click(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_About'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/div_A Different way to play. A New way to w_b40396'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/button_Get Started'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/button_Get Started'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/button_Get Started'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/h1_Player VS player Arena'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/div_Join 90-second player vs player battles_d97fec'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/a_Play Now'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/a_Play Now'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/a_Play Now'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/h1_Play to win crypto'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/div_Purchace extra coins and enter into the_258009'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/div_Not into crypto yet Watch a short video_e18395'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/a_Crypto Wallet'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/a_Crypto Wallet'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/a_Crypto Wallet'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/a_Purchase with FIAT'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/a_Purchase with FIAT'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/a_Purchase with FIAT'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/div_Purchase with FIAT_vce-features--icon vce-icon'), 
    0)

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/span_Purchase with FIAT_vce-icon-container _88b631'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/div_Purchase with FIAT_vce-features--icon vce-icon'))

WebUI.click(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/div_Purchase with FIAT_vce-features--icon vce-icon'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/div_Tap to unmute_ytp-cued-thumbnail-overlay-image'), 
    0)

WebUI.mouseOver(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/div_Purchase with FIAT_vce-video-popup-clos_1b84c4'))

WebUI.click(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/div_Purchase with FIAT_vce-video-popup-clos_1b84c4'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/div_Our Heroes                       Get in_f8b14b'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/div_Our Heroes                       Get in_f8b14b'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/div_Our Heroes                       Get in_f8b14b'), 
    3)

WebUI.mouseOver(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/div_Jack Logan_slick-next slick-arrow'))

WebUI.click(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/div_Jack Logan_slick-next slick-arrow'))

WebUI.click(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/div_Jack Logan_slick-next slick-arrow'))

WebUI.click(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/div_Jack Logan_slick-next slick-arrow'))

WebUI.click(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/div_Jack Logan_slick-next slick-arrow'))

WebUI.mouseOver(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/div_Jack Logan_slick-prev slick-arrow'))

WebUI.click(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/div_Jack Logan_slick-prev slick-arrow'))

WebUI.click(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/div_Jack Logan_slick-prev slick-arrow'))

WebUI.click(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/div_Jack Logan_slick-prev slick-arrow'))

WebUI.click(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/div_Jack Logan_slick-prev slick-arrow'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/a_Play Now_1'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/a_Play Now_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/a_Play Now_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/a_Play Now_1_2'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/a_Play Now_1_2'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/a_Play Now_1_2'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/div_Refer friends                          _613e9d'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/div_Refer friends                          _613e9d'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/a_Play With Friends'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/a_Play With Friends'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/a_Play With Friends'))

WebUI.click(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/a_Play With Friends'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/h4_Please LOG IN again'), 
    'Please LOG IN again')

WebUI.click(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/span_x'))

WebUI.click(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_About'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/h1_Join the MaxQuest Community'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/h1_Join the MaxQuest Community'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/div_Join us on Discord and follow us on soc_3cb19d'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/a_Join us on Discord and follow us on socia_5b2a32'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/a_Join us on Discord and follow us on socia_5b2a32'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/a_Join us on Discord and follow us on socia_5b2a32'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/a_Join us on Discord and follow us on socia_5b2a32_1'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/a_Join us on Discord and follow us on socia_5b2a32_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/a_Join us on Discord and follow us on socia_5b2a32_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/a_Join us on Discord and follow us on socia_5b2a32_1_2'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/a_Join us on Discord and follow us on socia_5b2a32_1_2'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/a_Join us on Discord and follow us on socia_5b2a32_1_2'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/a_Join us on Discord and follow us on socia_a92bb1'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/a_Join us on Discord and follow us on socia_a92bb1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/a_Join us on Discord and follow us on socia_a92bb1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/a_Join us on Discord and follow us on socia_5edda7'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/a_Join us on Discord and follow us on socia_5edda7'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/a_Join us on Discord and follow us on socia_5edda7'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/a_Join us on Discord and follow us on socia_5edda7_1'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/a_Join us on Discord and follow us on socia_5edda7_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/a_Join us on Discord and follow us on socia_5edda7_1'))

WebUI.click(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/a_Crypto Wallet'))

WebUI.mouseOver(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/span_x'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/h4_Please LOG IN again'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/span_x'))

not_run: WebUI.click(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/a_About'))

not_run: WebUI.click(findTestObject('Object Repository/Page_About Us  Learn more about MaxQuest/a_Purchase with FIAT'))

'Flakey'
not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/h4_Please LOG IN again'), 
    0)

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/h4_Please LOG IN again'))

not_run: WebUI.mouseOver(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/span_x'))

not_run: WebUI.click(findTestObject('Object Repository/Page_The 1st Player vs Player Crypto Action_dba80c/span_x'))

WebUI.closeBrowser()

