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

WebUI.navigateToUrl('https://staging-walmart.triadretail.net/halo-top')

WebUI.click(findTestObject('Page_Halo_Top_Creamery/img_trm-desktop'))

WebUI.click(findTestObject('Page_Halo_Top_Creamery/p_Finally enjoy ice cream as a'))

//WebUI.verifyElementPresent(null, 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Halo_Top_Creamery_spy/p_Finally enjoy ice cream as a'), 20)
WebUI.verifyElementPresent(findTestObject('Object Repository/Halo_Top_Creamery_spy/img_trm-desktop'), 20)
WebUI.verifyElementPresent(findTestObject('Object Repository/Halo_Top_Creamery_spy/img'), 20)
WebUI.verifyElementPresent(findTestObject('Object Repository/Halo_Top_Creamery_spy/img (8)'), 20)
WebUI.verifyElementPresent(findTestObject('Object Repository/Halo_Top_Creamery_spy/img (7)'), 20)
WebUI.verifyElementPresent(findTestObject('Object Repository/Halo_Top_Creamery_spy/img (6)'), 20)
WebUI.verifyElementPresent(findTestObject('Object Repository/Halo_Top_Creamery_spy/img (5)'), 20)
WebUI.verifyElementPresent(findTestObject('Object Repository/Halo_Top_Creamery_spy/img (4)'), 20)
WebUI.verifyElementPresent(findTestObject('Object Repository/Halo_Top_Creamery_spy/img (3)'), 20)
WebUI.verifyElementPresent(findTestObject('Object Repository/Halo_Top_Creamery_spy/img (2)'), 20)
WebUI.verifyElementPresent(findTestObject('Object Repository/Halo_Top_Creamery_spy/img (1)'), 20)
WebUI.verifyElementPresent(findTestObject('Object Repository/Halo_Top_Creamery_spy/h3_Stay up to Date on All the'), 20)
WebUI.verifyElementPresent(findTestObject('Object Repository/Halo_Top_Creamery_spy/h3_Decadent  Creamy Ice Cream'), 20)
WebUI.verifyElementPresent(findTestObject('Object Repository/Halo_Top_Creamery_spy/h2_Find Your Flavor Before It'), 20)
WebUI.verifyElementPresent(findTestObject('Object Repository/Halo_Top_Creamery_spy/div_Find Your Flavor Before It'), 20)
WebUI.verifyElementPresent(findTestObject('Object Repository/Halo_Top_Creamery_spy/a_Tile-linkOverlay js-tile-lin'), 20)
WebUI.verifyElementPresent(findTestObject('Object Repository/Halo_Top_Creamery_spy/a_Tile-linkOverlay js-tile-lin (3)'), 20)
WebUI.verifyElementPresent(findTestObject('Object Repository/Halo_Top_Creamery_spy/a_Tile-linkOverlay js-tile-lin (2)'), 20)
WebUI.verifyElementPresent(findTestObject('Object Repository/Halo_Top_Creamery_spy/a_Tile-linkOverlay js-tile-lin (1)'), 20)


WebUI.closeBrowser()

