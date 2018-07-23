import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://staging-samsclub.triadretail.net/Featured-Brand/Purina/Pet-Shop/')

WebUI.maximizeWindow()

//WebUI.verifyElementPresent(null, 10)

//WebUI.verifyElementPresent(null, 0, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/object_spy_02_NES_N1799/div_pov__pets'), 10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/object_spy_02_NES_N1799/div_sc_logo_desk samsclub_logo'), 10 , FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/object_spy_02_NES_N1799/div_shop__animals'), 10 , FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/object_spy_02_NES_N1799/a_SCROLL DOWN FOR MORE INFO'), 10 , FailureHandling.CONTINUE_ON_FAILURE)

//WebUI.click(findTestObject('Object Repository/object_spy_02_NES_N1799/a_SCROLL DOWN FOR MORE INFO'), 10)

WebUI.verifyElementPresent(findTestObject('Object Repository/object_spy_02_NES_N1799/a_Subscribe and save.'), 10 , FailureHandling.CONTINUE_ON_FAILURE)

//WebUI.verifyElementPresent(findTestObject('Object Repository/object_spy_02_NES_N1799/div_at-expanding-share-button-'), 10)

WebUI.verifyElementPresent(findTestObject('Object Repository/object_spy_02_NES_N1799/div_Save time with Club Pickup'), 10 , FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('object_spy_02_NES_N1799/h2_textverify'), 10 , FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/object_spy_02_NES_N1799/img (1)'), 10 , FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/object_spy_02_NES_N1799/img (2)'), 10 , FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/object_spy_02_NES_N1799/img (3)'), 10 , FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/object_spy_02_NES_N1799/img'), 10 , FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/object_spy_02_NES_N1799/img_desktop pov__products'), 10 , FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/object_spy_02_NES_N1799/strong_club-size options from'), 10, FailureHandling.CONTINUE_ON_FAILURE)

//WebUI.verifyElementPresent(, 10)

//WebUI.click(findTestObject('Page_SamsClub.com - In Clubs Now -/img'))

//WebUI.click(findTestObject('Page_SamsClub.com - In Clubs Now -/img_1'))

//WebUI.click(findTestObject('Page_SamsClub.com - In Clubs Now -/img_shop__nav-active'))

//WebUI.click(findTestObject('Page_SamsClub.com - In Clubs Now -/img_2'))

//WebUI.click(findTestObject('Page_SamsClub.com - In Clubs Now -/img_3'))

//WebUI.click(findTestObject('Page_SamsClub.com - In Clubs Now -/img_shop__nav-active'))

/*WebUI.click(findTestObject('Page_SamsClub.com - In Clubs Now -/a_next'))

WebUI.click(findTestObject('Page_SamsClub.com - In Clubs Now -/a_next'))

WebUI.click(findTestObject('Page_SamsClub.com - In Clubs Now -/a_next'))

WebUI.click(findTestObject('Page_SamsClub.com - In Clubs Now -/a_next'))

WebUI.click(findTestObject('Page_SamsClub.com - In Clubs Now -/a_next'))

WebUI.click(findTestObject('Page_SamsClub.com - In Clubs Now -/a_prev'))

WebUI.click(findTestObject('Page_SamsClub.com - In Clubs Now -/img_shop__nav-active_1'))

WebUI.click(findTestObject('Page_SamsClub.com - In Clubs Now -/a_next'))

WebUI.click(findTestObject('Page_SamsClub.com - In Clubs Now -/a_next'))

WebUI.click(findTestObject('Page_SamsClub.com - In Clubs Now -/a_next'))

WebUI.click(findTestObject('Page_SamsClub.com - In Clubs Now -/a_next'))

WebUI.click(findTestObject('Page_SamsClub.com - In Clubs Now -/img_shop__nav-active_2'))

WebUI.click(findTestObject('Page_SamsClub.com - In Clubs Now -/a_next'))

WebUI.click(findTestObject('Page_SamsClub.com - In Clubs Now -/a_next'))

WebUI.click(findTestObject('Page_SamsClub.com - In Clubs Now -/a_next'))

WebUI.click(findTestObject('Page_SamsClub.com - In Clubs Now -/a_next'))*/

WebUI.closeBrowser()

