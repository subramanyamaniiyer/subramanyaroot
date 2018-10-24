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

WebUI.navigateToUrl('http://staging.cvs.triadretail.net/shop-assets/04_KCK_O9351_Kleenex2018/?testing=1&date=8/12/2018')

WebUI.click(findTestObject('04_KCK_Q2464_Page_Household Products  Scott Klee/span_Scott Kleenex Cottonelle'))


//WebUI.verifyElementVisible(null,1, FailureHandling.CONTINUE_ON_FAILURE)


WebUI.verifyElementVisible(findTestObject('Object Repository/04_KCK_Q2464_Page_Household Products  Scott Klee/span_See'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_KCK_Q2464_Page_Household Products  Scott Klee/span_Scott Kleenex Cottonelle'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_KCK_Q2464_Page_Household Products  Scott Klee/span_Scott Kleenex Cottonelle (1)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_KCK_Q2464_Page_Household Products  Scott Klee/section_New Scott ComfortPlus'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_KCK_Q2464_Page_Household Products  Scott Klee/img_img-rw trm-responsive-img'),1, FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.verifyElementVisible(findTestObject('Object Repository/04_KCK_Q2464_Page_Household Products  Scott Klee/h1_Refreshingly clean everyday'),1, FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.verifyElementVisible(findTestObject('Object Repository/04_KCK_Q2464_Page_Household Products  Scott Klee/div_Try new Kleenex wipes'),1, FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.verifyElementVisible(findTestObject('Object Repository/04_KCK_Q2464_Page_Household Products  Scott Klee/div_Spend 20 get 5 ExtraBucks'),1, FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.verifyElementVisible(findTestObject('Object Repository/04_KCK_Q2464_Page_Household Products  Scott Klee/div_Scott ComfortPlus18 double'),1, FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.verifyElementVisible(findTestObject('Object Repository/04_KCK_Q2464_Page_Household Products  Scott Klee/div_Refreshingly clean everyda'),1, FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.verifyElementVisible(findTestObject('Object Repository/04_KCK_Q2464_Page_Household Products  Scott Klee/div_Kleenex Wet Wipes Germ Rem'),1, FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.verifyElementVisible(findTestObject('Object Repository/04_KCK_Q2464_Page_Household Products  Scott Klee/div_Kleenex Wet Wipes Gentle C'),1, FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.verifyElementVisible(findTestObject('Object Repository/04_KCK_Q2464_Page_Household Products  Scott Klee/div_Get up to 2 in extra savin'),1, FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.verifyElementVisible(findTestObject('Object Repository/04_KCK_Q2464_Page_Household Products  Scott Klee/div_Cottonelle Ultra ComfortCa'),1, FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.verifyElementVisible(findTestObject('Object Repository/04_KCK_Q2464_Page_Household Products  Scott Klee/div_Choose Cottonelle bath tis'),1, FailureHandling.CONTINUE_ON_FAILURE)




WebUI.closeBrowser()

