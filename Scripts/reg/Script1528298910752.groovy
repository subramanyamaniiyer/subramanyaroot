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

//WebUI.verifyElementVisible(null,1, FailureHandling.CONTUNE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Fruit_ofthe_Loom/ul_ 2018 Fruit of the Loom Inc'),1, FailureHandling.CONTUNE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Fruit_ofthe_Loom/p_Get Fruit of the Loom underw'),1, FailureHandling.CONTUNE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Fruit_ofthe_Loom/li_women-area trackMe'),1, FailureHandling.CONTUNE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Fruit_ofthe_Loom/li_mens-crew trackMe'),1, FailureHandling.CONTUNE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Fruit_ofthe_Loom/li_mens-brief trackMe'),1, FailureHandling.CONTUNE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Fruit_ofthe_Loom/li_mens-breathable active trac'),1, FailureHandling.CONTUNE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Fruit_ofthe_Loom/li_mens-boxers trackMe'),1, FailureHandling.CONTUNE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Fruit_ofthe_Loom/li_mens-area active trackMe'),1, FailureHandling.CONTUNE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Fruit_ofthe_Loom/img'),1, FailureHandling.CONTUNE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Fruit_ofthe_Loom/img (4)'),1, FailureHandling.CONTUNE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Fruit_ofthe_Loom/img (3)'),1, FailureHandling.CONTUNE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Fruit_ofthe_Loom/img (2)'),1, FailureHandling.CONTUNE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Fruit_ofthe_Loom/img (1)'),1, FailureHandling.CONTUNE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Fruit_ofthe_Loom/h2_EVERSOFT T-SHIRT WITH DUAL'),1, FailureHandling.CONTUNE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Fruit_ofthe_Loom/div_trm-logo'),1, FailureHandling.CONTUNE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Fruit_ofthe_Loom/div_SO LIGHT YOU WONTNOTICE IT'),1, FailureHandling.CONTUNE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Fruit_ofthe_Loom/button_slick-prev trackMe slic'),1, FailureHandling.CONTUNE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Fruit_ofthe_Loom/button_slick-next trackMe slic'),1, FailureHandling.CONTUNE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Fruit_ofthe_Loom/a_WOMEN'),1, FailureHandling.CONTUNE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Fruit_ofthe_Loom/a_TODDLERS'),1, FailureHandling.CONTUNE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Fruit_ofthe_Loom/a_Tile-linkOverlay js-tile-lin'),1, FailureHandling.CONTUNE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Fruit_ofthe_Loom/a_Tile-linkOverlay js-tile-lin (3)'),1, FailureHandling.CONTUNE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Fruit_ofthe_Loom/a_Tile-linkOverlay js-tile-lin (2)'),1, FailureHandling.CONTUNE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Fruit_ofthe_Loom/a_Tile-linkOverlay js-tile-lin (1)'),1, FailureHandling.CONTUNE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Fruit_ofthe_Loom/a_Shop now'),1, FailureHandling.CONTUNE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Fruit_ofthe_Loom/a_MEN'),1, FailureHandling.CONTUNE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Fruit_ofthe_Loom/a_GIRLS'),1, FailureHandling.CONTUNE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Page_Fruit_ofthe_Loom/a_BOYS'),1, FailureHandling.CONTUNE_ON_FAILURE)

/*WebUI.navigateToUrl('https://staging-walmart.triadretail.net/fruit-of-the-loom')
WebUI.click(findTestObject('Page_Fruit of the Loom/ul_MEN'))
WebUI.click(findTestObject('Page_Fruit of the Loom/ul_MEN'))
WebUI.click(findTestObject('Page_Fruit of the Loom/h2_EVERSOFT T-SHIRT WITH DUAL'))
WebUI.click(findTestObject('Page_Fruit of the Loom/img'))
WebUI.click(findTestObject('Page_Fruit of the Loom/button_slick-next trackMe slic'))
WebUI.click(findTestObject('Page_Fruit of the Loom/button_slick-next trackMe slic'))
WebUI.click(findTestObject('Page_Fruit of the Loom/button_slick-next trackMe slic'))
WebUI.click(findTestObject('Page_Fruit of the Loom/button_slick-next trackMe slic'))
WebUI.click(findTestObject('Page_Fruit of the Loom/li_women-area trackMe'))
WebUI.click(findTestObject('Page_Fruit of the Loom/li_mens-area trackMe'))
WebUI.click(findTestObject('Page_Fruit of the Loom/ul_ 2018 Fruit of the Loom Inc'))*/

WebUI.closeBrowser()

