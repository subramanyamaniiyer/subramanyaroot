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

WebUI.navigateToUrl('https://staging-walmart.triadretail.net/01_SCJ_P5056_KIWIEA18')

WebUI.maximizeWindow()

//WebUI.verifyElementVisible(null,1, FailureHandling.CONTINUE_ON_FAILURE)


WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_ShoeCareSCJohnson/p_Save money with longer-lasti'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_ShoeCareSCJohnson/p_From pastes and polishes to'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_ShoeCareSCJohnson/img_trm-signature'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_ShoeCareSCJohnson/img_trm-logo-footer'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_ShoeCareSCJohnson/h2_Tips  tricks'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_ShoeCareSCJohnson/h2_Alternative uses'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_ShoeCareSCJohnson/h1_Step up your shoe care game'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_ShoeCareSCJohnson/h1_Keep your shoes and equipme'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_ShoeCareSCJohnson/div_trm-brand-logos'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_ShoeCareSCJohnson/div_Protect  Clean'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_ShoeCareSCJohnson/div_Laces'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_ShoeCareSCJohnson/a_Tile-linkOverlay js-tile-lin'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_ShoeCareSCJohnson/a_Tile-linkOverlay js-tile-lin (6)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_ShoeCareSCJohnson/a_Tile-linkOverlay js-tile-lin (5)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_ShoeCareSCJohnson/a_Tile-linkOverlay js-tile-lin (4)'),1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_ShoeCareSCJohnson/a_Tile-linkOverlay js-tile-lin (3)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_ShoeCareSCJohnson/a_Tile-linkOverlay js-tile-lin (2)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_ShoeCareSCJohnson/a_Tile-linkOverlay js-tile-lin (1)'),1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

