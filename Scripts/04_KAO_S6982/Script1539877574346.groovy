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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://staging.cvs.triadretail.net/shop-assets/04_KAO_S6982_JergnsBCSupp/')

WebUI.click(findTestObject('04_KAO_S6982_Page_Moisturizers  Deep hydration/span_Jergens Brand Shop'))

//WebUI.verifyElementVisible(null,1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/04_KAO_S6982_Page_Moisturizers  Deep hydration/span_Jergens Brand Shop'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_KAO_S6982_Page_Moisturizers  Deep hydration/span_Jergens Brand Shop (1)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_KAO_S6982_Page_Moisturizers  Deep hydration/p_Lock in the JERGENS moisture'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_KAO_S6982_Page_Moisturizers  Deep hydration/p_Glides on smoothly.Locks in'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_KAO_S6982_Page_Moisturizers  Deep hydration/img_img-rw'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_KAO_S6982_Page_Moisturizers  Deep hydration/img_img-rw trm-responsive-img'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_KAO_S6982_Page_Moisturizers  Deep hydration/img_img-rw trm-responsive-img (4)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_KAO_S6982_Page_Moisturizers  Deep hydration/img_img-rw trm-responsive-img (3)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_KAO_S6982_Page_Moisturizers  Deep hydration/img_img-rw trm-responsive-img (2)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_KAO_S6982_Page_Moisturizers  Deep hydration/img_img-rw trm-responsive-img (1)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_KAO_S6982_Page_Moisturizers  Deep hydration/img_img-rw trm-hero-fam'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_KAO_S6982_Page_Moisturizers  Deep hydration/img_img-rw trm-hero-fam (3)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_KAO_S6982_Page_Moisturizers  Deep hydration/img_img-rw trm-hero-fam (2)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_KAO_S6982_Page_Moisturizers  Deep hydration/img_img-rw trm-hero-fam (1)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_KAO_S6982_Page_Moisturizers  Deep hydration/img_img-rw (3)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_KAO_S6982_Page_Moisturizers  Deep hydration/img_img-rw (2)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_KAO_S6982_Page_Moisturizers  Deep hydration/img_img-rw (1)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_KAO_S6982_Page_Moisturizers  Deep hydration/h1_Nourishing oils straight fr'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_KAO_S6982_Page_Moisturizers  Deep hydration/h1_JERGENS Nourishing Oil Blen'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_KAO_S6982_Page_Moisturizers  Deep hydration/div_Let your beautiful shineSh'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_KAO_S6982_Page_Moisturizers  Deep hydration/div_Create your own sunshineNo'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_KAO_S6982_Page_Moisturizers  Deep hydration/a_Shop Wet Skin moisturizers'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_KAO_S6982_Page_Moisturizers  Deep hydration/a_Shop Oil Infused moisturizer'),1, FailureHandling.CONTINUE_ON_FAILURE)


WebUI.closeBrowser()

