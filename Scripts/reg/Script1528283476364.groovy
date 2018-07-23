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

/*WebUI.navigateToUrl('https://staging-walmart.triadretail.net/fosterfarms')
WebUI.click(findTestObject('Page_Foster Farms/img_trm-desktop'))
WebUI.click(findTestObject('Page_Foster Farms/h2_Enter to Win Tix'))
WebUI.click(findTestObject('Page_Foster Farms/img'))
WebUI.click(findTestObject('Page_Foster Farms/img_trm-desktop_1'))
WebUI.click(findTestObject('Page_Foster Farms/a_Get Coupon'))
WebUI.click(findTestObject('Page_Foster Farms/a_Learn More'))
WebUI.click(findTestObject('Page_Foster Farms/button_Next'))
WebUI.click(findTestObject('Page_Foster Farms/button_Previous'))*/

WebUI.maximizeWindow()

//WebUI.verifyElementVisible(null,1 ,FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_FosterFarms/p_Take great taste with you th'),1 ,FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_FosterFarms/p_Learn how you could win free'),1 ,FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_FosterFarms/img_trm-socialicon'),1 ,FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_FosterFarms/img_trm-socialicon (1)'),1 ,FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_FosterFarms/img_trm-desktop'),1 ,FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_FosterFarms/img_trm-desktop (2)'),1 ,FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_FosterFarms/img_trm-desktop (1)'),1 ,FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_FosterFarms/h2_Sun Fun  Flavor'),1 ,FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_FosterFarms/h2_Get Creative With Your Corn'),1 ,FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_FosterFarms/div_Save up to 3.50'),1 ,FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_FosterFarms/div_Get Creative With Your Cor'),1 ,FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_FosterFarms/div_Connect with us'),1 ,FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_FosterFarms/button_Previous'),1 ,FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_FosterFarms/button_Next'),1 ,FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_FosterFarms/a_Tile-linkOverlay js-tile-lin'),1 ,FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_FosterFarms/a_Tile-linkOverlay js-tile-lin (4)'),1 ,FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_FosterFarms/a_Tile-linkOverlay js-tile-lin (3)'),1 ,FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_FosterFarms/a_Tile-linkOverlay js-tile-lin (2)'),1 ,FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_FosterFarms/a_Tile-linkOverlay js-tile-lin (1)'),1 ,FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_FosterFarms/a_Learn More'),1 ,FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_FosterFarms/a_Get Coupon'),1 ,FailureHandling.CONTINUE_ON_FAILURE)




WebUI.closeBrowser()

