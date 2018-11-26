import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://staging-samsclub.triadretail.net/Featured-Brand/Samsung/Early-Access/')

WebUI.click(findTestObject('Object Repository/Page_SamsClub.com - In Clubs Now -/img_Scroll_img_width'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_SamsClub.com - In Clubs Now -/img_Shop Now_img_width'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_SamsClub.com - In Clubs Now -/img_Scroll_img_width'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_SamsClub.com - In Clubs Now -/img_Scroll_img_width (1)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_SamsClub.com - In Clubs Now -/img'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_SamsClub.com - In Clubs Now -/div_U Flex Headphones'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_SamsClub.com - In Clubs Now -/div_Shop Now_col-lg-6 col-md-6'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_SamsClub.com - In Clubs Now -/div_SAVE 503.1 Channel 340W So'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_SamsClub.com - In Clubs Now -/div_SAVE 308.0 Galaxy Tab A 16'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_SamsClub.com - In Clubs Now -/div_SAVE 202.1 Channel Soundba'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_SamsClub.com - In Clubs Now -/div_SAVE 12010.1 Galaxy Tab A'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_SamsClub.com - In Clubs Now -/div_SAVE 1009.7 Galaxy Tab S3'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_SamsClub.com - In Clubs Now -/div_27 Curved LED Monitor'),1, FailureHandling.CONTINUE_ON_FAILURE)


//WebUI.verifyElementVisible(null,1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()
