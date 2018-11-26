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

WebUI.navigateToUrl('http://staging.cvs.triadretail.net/shop-assets/04_MMM_O4432_3MPainSpons/')

WebUI.click(findTestObject('04_MMM_O4432_Page_FUTURO/div_FUTURO'))

WebUI.verifyElementVisible(findTestObject('04_MMM_O4432_Page_FUTURO/span_Watch'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('04_MMM_O4432_Page_FUTURO/span_FUTURO'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('04_MMM_O4432_Page_FUTURO/section_Targeted pressure in a'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('04_MMM_O4432_Page_FUTURO/section_Support around the clo'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('04_MMM_O4432_Page_FUTURO/section_Stay active maternity'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('04_MMM_O4432_Page_FUTURO/section_Ankle  Foot Supports'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('04_MMM_O4432_Page_FUTURO/p_Ditch your routine.'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('04_MMM_O4432_Page_FUTURO/img_FUTURO_img-rw trm-responsi'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('04_MMM_O4432_Page_FUTURO/h1_Brace for adventure'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('04_MMM_O4432_Page_FUTURO/div_Targeted pressure in a cli'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('04_MMM_O4432_Page_FUTURO/div_Take a stand'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('04_MMM_O4432_Page_FUTURO/div_Stay active workout'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('04_MMM_O4432_Page_FUTURO/div_Stay active moves'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('04_MMM_O4432_Page_FUTURO/div_Stay active maternity'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('04_MMM_O4432_Page_FUTURO/div_FUTURO'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('04_MMM_O4432_Page_FUTURO/div_Brace for adventure'),1, FailureHandling.CONTINUE_ON_FAILURE)




//WebUI.verifyElementVisible(null,1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()