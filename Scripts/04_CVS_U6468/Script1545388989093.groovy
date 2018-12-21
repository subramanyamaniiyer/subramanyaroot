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

WebUI.navigateToUrl('http://staging.cvs.triadretail.net/shop-assets/04_CVS_U6468_WomensWellness18/')

WebUI.click(findTestObject('04_CVS_U6468_Page_FeminineCare/span_Feminine Care'))


WebUI.verifyElementVisible(findTestObject('Object Repository/04_CVS_U6468_Page_FeminineCare/span_Feminine Care'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_CVS_U6468_Page_FeminineCare/img_Yeast Infections_img-rw tr'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_CVS_U6468_Page_FeminineCare/img_Tampons_img-rw trm-respons'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_CVS_U6468_Page_FeminineCare/img_Shop by category_img-rw tr'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_CVS_U6468_Page_FeminineCare/img_Shop by brand_img-rw trm-r'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_CVS_U6468_Page_FeminineCare/img_Pregnancy  Ovulation Tests'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_CVS_U6468_Page_FeminineCare/img_Pantiliners_img-rw trm-res'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_CVS_U6468_Page_FeminineCare/img_Pads_img-rw trm-responsive'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_CVS_U6468_Page_FeminineCare/img_Moisturizers  Lubricants_i'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_CVS_U6468_Page_FeminineCare/img_Menstrual Cup_img-rw trm-r'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_CVS_U6468_Page_FeminineCare/img_Menstrual  Pain Relief_img'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_CVS_U6468_Page_FeminineCare/img_Menopause Relief_img-rw tr'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_CVS_U6468_Page_FeminineCare/img_Intimate Cleansing  Deodor'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_CVS_U6468_Page_FeminineCare/img_Bladder Health_img-rw trm-'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_CVS_U6468_Page_FeminineCare/h2_Shop by category'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_CVS_U6468_Page_FeminineCare/h2_Shop by brand'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_CVS_U6468_Page_FeminineCare/h1_Be unstoppable. Be you.'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_CVS_U6468_Page_FeminineCare/div_Top deals'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_CVS_U6468_Page_FeminineCare/div_Period solutions'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_CVS_U6468_Page_FeminineCare/div_Pads'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_CVS_U6468_Page_FeminineCare/div_New look Same great qualit'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_CVS_U6468_Page_FeminineCare/div_Feminine freshness just go'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_CVS_U6468_Page_FeminineCare/div_Feminine Care'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_CVS_U6468_Page_FeminineCare/div_Be unstoppable. Be you.'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_CVS_U6468_Page_FeminineCare/button_Vaginal health'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_CVS_U6468_Page_FeminineCare/button_Menstrual support'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_CVS_U6468_Page_FeminineCare/button_Menopause'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_CVS_U6468_Page_FeminineCare/button_Intimate cleansing'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_CVS_U6468_Page_FeminineCare/button_Fertility'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_CVS_U6468_Page_FeminineCare/button_Bladder health'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_CVS_U6468_Page_FeminineCare/a_See more'),1, FailureHandling.CONTINUE_ON_FAILURE)


//WebUI.verifyElementVisible(null,1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()
