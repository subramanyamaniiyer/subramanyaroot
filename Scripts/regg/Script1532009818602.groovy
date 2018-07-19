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

WebUI.navigateToUrl('https://staging-walmart.triadretail.net/KraftGrilling')

WebUI.maximizeWindow()

//WebUI.verifyElementVisible(null,1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_KraftGrilling/p_Get ready for refreshment.'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_KraftGrilling/p_Enjoy flavor at its finest.'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_KraftGrilling/h3_Toppings  dips'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_KraftGrilling/h3_Sides'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_KraftGrilling/h3_Drinks'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_KraftGrilling/h3_Dressings'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_KraftGrilling/h3_Desserts'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_KraftGrilling/h3_Condiments'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_KraftGrilling/div_Toppings  dips'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_KraftGrilling/div_Grill your best    Get ess'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_KraftGrilling/div_Drinks'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_KraftGrilling/div_Dressings'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_KraftGrilling/div_Desserts'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_KraftGrilling/a_Tile-linkOverlay js-tile-lin'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_KraftGrilling/a_Tile-linkOverlay js-tile-lin (3)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_KraftGrilling/a_Tile-linkOverlay js-tile-lin (2)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_KraftGrilling/a_Tile-linkOverlay js-tile-lin (1)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_KraftGrilling/a_Add to cart'),1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

