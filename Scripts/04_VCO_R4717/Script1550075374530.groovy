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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://staging.cvs.triadretail.net/shop-assets/04_VCO_R4717_VitaCoco/')

WebUI.click(findTestObject('04_VCO_R4717_Page_Vita Coco/span_Vita Coco'))


WebUI.verifyElementVisible(findTestObject('Object Repository/04_VCO_R4717_Page_Vita Coco/span_Vita Coco'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_VCO_R4717_Page_Vita Coco/span_Vita Coco (1)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_VCO_R4717_Page_Vita Coco/section_Replenish lost electro'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_VCO_R4717_Page_Vita Coco/section_Blue Goodness spirulin'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_VCO_R4717_Page_Vita Coco/p_Whether its post-workout or'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_VCO_R4717_Page_Vita Coco/h2_Replenish lost electrolytes'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_VCO_R4717_Page_Vita Coco/div_Refuel with vital nutrient'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_VCO_R4717_Page_Vita Coco/div_Hydrate with the goodness'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_VCO_R4717_Page_Vita Coco/div_Get a taste of the tropics'),1, FailureHandling.CONTINUE_ON_FAILURE)


//WebUI.verifyElementVisible(null,1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()