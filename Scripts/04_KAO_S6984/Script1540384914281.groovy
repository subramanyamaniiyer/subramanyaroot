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

WebUI.navigateToUrl('http://staging.cvs.triadretail.net/shop-assets/04_KAO_S6984_BioreBCSupp/')

WebUI.click(findTestObject('04_KAO_S6984_Page_Bior Skincare/span_Bior Skincare'))
//WebUI.verifyElementVisible(null,1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/04_KAO_S6984_Page_Bior Skincare/span_Bior Skincare'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_KAO_S6984_Page_Bior Skincare/span_Bior Skincare (1)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_KAO_S6984_Page_Bior Skincare/section_Breakup with blackhead'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_KAO_S6984_Page_Bior Skincare/p_Bior Skincare targets the ro'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_KAO_S6984_Page_Bior Skincare/p_Bior Cleansing Micellar Wate'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_KAO_S6984_Page_Bior Skincare/img_img-rw trm-responsive-img'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_KAO_S6984_Page_Bior Skincare/img_img-rw trm-desk-only trm-r'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_KAO_S6984_Page_Bior Skincare/h2_Makeups not meant for all-n'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_KAO_S6984_Page_Bior Skincare/h1_Dirty pores prepare to be p'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_KAO_S6984_Page_Bior Skincare/div_Just take it all off'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_KAO_S6984_Page_Bior Skincare/div_Dont be dirty'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_KAO_S6984_Page_Bior Skincare/div_Dirty pores prepare to be'),1, FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.verifyElementVisible(findTestObject('Object Repository/04_KAO_S6984_Page_Bior Skincare/div_Breakup with blackheads'),1, FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.verifyElementVisible(findTestObject('Object Repository/04_KAO_S6984_Page_Bior Skincare/div_Acnes outta here'),1, FailureHandling.CONTINUE_ON_FAILURE)


WebUI.closeBrowser()

