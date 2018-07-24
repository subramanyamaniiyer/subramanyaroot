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

WebUI.navigateToUrl('https://staging-walmart.triadretail.net/hallmark')

WebUI.click(findTestObject('Greeting_Cards_Hallmark/h4_Birthday Cards'))

//WebUI.verifyElementPresent(null, 5, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Greeting_Cards_Hallmark/p_Important Walmart Disclaimer'), 5, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Greeting_Cards_Hallmark/h4_Wedding Cards  Gift Wrap'), 5, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Greeting_Cards_Hallmark/h4_Celebration Cards  Gift Wra'), 5, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Greeting_Cards_Hallmark/h4_Birthday Gift Wrap'), 5, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Greeting_Cards_Hallmark/h4_Birthday Cards'), 5, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Greeting_Cards_Hallmark/h4_Baby Cards  Gift Wrap'), 5, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Greeting_Cards_Hallmark/div_Shop online or find a part'), 5, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Greeting_Cards_Hallmark/a_Tile-linkOverlay js-tile-lin'), 5, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Greeting_Cards_Hallmark/a_Tile-linkOverlay js-tile-lin (9)'), 5, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Greeting_Cards_Hallmark/a_Tile-linkOverlay js-tile-lin (8)'), 5, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Greeting_Cards_Hallmark/a_Tile-linkOverlay js-tile-lin (7)'), 5, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Greeting_Cards_Hallmark/a_Tile-linkOverlay js-tile-lin (6)'), 5, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Greeting_Cards_Hallmark/a_Tile-linkOverlay js-tile-lin (5)'), 5, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Greeting_Cards_Hallmark/a_Tile-linkOverlay js-tile-lin (4)'), 5, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Greeting_Cards_Hallmark/a_Tile-linkOverlay js-tile-lin (3)'), 5, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Greeting_Cards_Hallmark/a_Tile-linkOverlay js-tile-lin (2)'), 5, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Greeting_Cards_Hallmark/a_Tile-linkOverlay js-tile-lin (19)'), 5, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Greeting_Cards_Hallmark/a_Tile-linkOverlay js-tile-lin (18)'), 5, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Greeting_Cards_Hallmark/a_Tile-linkOverlay js-tile-lin (17)'), 5, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Greeting_Cards_Hallmark/a_Tile-linkOverlay js-tile-lin (16)'), 5, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Greeting_Cards_Hallmark/a_Tile-linkOverlay js-tile-lin (15)'), 5, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Greeting_Cards_Hallmark/a_Tile-linkOverlay js-tile-lin (14)'), 5, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Greeting_Cards_Hallmark/a_Tile-linkOverlay js-tile-lin (13)'), 5, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Greeting_Cards_Hallmark/a_Tile-linkOverlay js-tile-lin (12)'), 5, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Greeting_Cards_Hallmark/a_Tile-linkOverlay js-tile-lin (11)'), 5, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Greeting_Cards_Hallmark/a_Tile-linkOverlay js-tile-lin (10)'), 5, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Greeting_Cards_Hallmark/a_Tile-linkOverlay js-tile-lin (1)'), 5, FailureHandling.CONTINUE_ON_FAILURE)



WebUI.closeBrowser()

