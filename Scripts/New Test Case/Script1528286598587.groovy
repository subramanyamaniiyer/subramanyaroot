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

WebUI.maximizeWindow()
/*
WebUI.navigateToUrl('https://staging-walmart.triadretail.net/pureleaf')
WebUI.click(findTestObject('Page_Pure Leaf Teas/img_trm-desktop'))
WebUI.click(findTestObject('Page_Pure Leaf Teas/h2_Simply Delicious'))
WebUI.click(findTestObject('Page_Pure Leaf Teas/p_Gather around more wholesome'))
WebUI.click(findTestObject('Page_Pure Leaf Teas/img'))
WebUI.click(findTestObject('Page_Pure Leaf Teas/video_jw-video jw-reset'))
WebUI.click(findTestObject('Page_Pure Leaf Teas/video_jw-video jw-reset'))
WebUI.click(findTestObject('Page_Pure Leaf Teas/video_jw-video jw-reset_1'))
WebUI.click(findTestObject('Page_Pure Leaf Teas/video_jw-video jw-reset_1'))
WebUI.click(findTestObject('Page_Pure Leaf Teas/video_jw-video jw-reset_2'))
WebUI.click(findTestObject('Page_Pure Leaf Teas/video_jw-video jw-reset_2'))
WebUI.click(findTestObject('Page_Pure Leaf Teas/div_Recipe Video'))
WebUI.click(findTestObject('Page_Pure Leaf Teas/div_Recipe Video              _1'))
WebUI.click(findTestObject('Page_Pure Leaf Teas/div_Recipe Video              _2'))
WebUI.click(findTestObject('Page_Pure Leaf Teas/video_jw-video jw-reset_3'))
WebUI.click(findTestObject('Page_Pure Leaf Teas/video_jw-video jw-reset_3'))
WebUI.click(findTestObject('Page_Pure Leaf Teas/video_jw-video jw-reset_4'))
WebUI.click(findTestObject('Page_Pure Leaf Teas/video_jw-video jw-reset_4'))
WebUI.click(findTestObject('Page_Pure Leaf Teas/video_jw-video jw-reset_5'))
WebUI.click(findTestObject('Page_Pure Leaf Teas/video_jw-video jw-reset_5'))
WebUI.click(findTestObject('Page_Pure Leaf Teas/button_Next'))
WebUI.click(findTestObject('Page_Pure Leaf Teas/button_Previous'))
*/

WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Pure_leaf/video_jw-video jw-reset'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Pure_leaf/p_Shop your favorite flavors.'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Pure_leaf/p_Product information is provi'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Pure_leaf/p_Important Walmart Disclaimer'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Pure_leaf/p_If you have dietary restrict'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Pure_leaf/p_Gather around more wholesome'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Pure_leaf/img_trm-desktop'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Pure_leaf/img'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Pure_leaf/h2_Simply Delicious'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Pure_leaf/h2_An Unforgettable Tea Experi'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Pure_leaf/div_Recipe Video'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Pure_leaf/div_Recipe Video (5)'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Pure_leaf/div_Recipe Video (4)'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Pure_leaf/div_Recipe Video (3)'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Pure_leaf/div_Recipe Video (2)'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Pure_leaf/div_Recipe Video (1)'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Pure_leaf/div_Important Walmart Disclaim'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Pure_leaf/div_0000010001000100'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Pure_leaf/div_0000005900590059'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Pure_leaf/div_0000005900590059 (1)'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Pure_leaf/div_0000005500550055'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Pure_leaf/div_0000005200520052'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Pure_leaf/div_0000005100510051'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Pure_leaf/button_Next'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Pure_leaf/a_Tile-linkOverlay js-tile-lin'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Pure_leaf/a_Tile-linkOverlay js-tile-lin (3)'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Pure_leaf/a_Tile-linkOverlay js-tile-lin (2)'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Pure_leaf/a_Tile-linkOverlay js-tile-lin (1)'), FailureHandling.CONTINUE_ON_FAILURE)




WebUI.closeBrowser()

