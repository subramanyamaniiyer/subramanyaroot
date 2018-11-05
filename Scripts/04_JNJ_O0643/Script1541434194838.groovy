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

WebUI.navigateToUrl('http://staging.cvs.triadretail.net/shop-assets//04_JNJ_C1121_Tylenol/?testing=1&date=11/4/2018')

WebUI.click(findTestObject('04_JNJ_O0643_Page_Tylenol  Tylenol Pain Relief P/span_TYLENOL Brand Shop'))

//WebUI.verifyElementVisible(null,1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/04_JNJ_O0643_Page_Tylenol  Tylenol Pain Relief P/span_TYLENOL Brand Shop'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_JNJ_O0643_Page_Tylenol  Tylenol Pain Relief P/img_img-rw trm-responsive-img'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_JNJ_O0643_Page_Tylenol  Tylenol Pain Relief P/img_img-rw trm-responsive-img (3)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_JNJ_O0643_Page_Tylenol  Tylenol Pain Relief P/img_img-rw trm-responsive-img (2)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_JNJ_O0643_Page_Tylenol  Tylenol Pain Relief P/img_img-rw trm-responsive-img (1)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_JNJ_O0643_Page_Tylenol  Tylenol Pain Relief P/img_img-rw trm-hero-fam'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_JNJ_O0643_Page_Tylenol  Tylenol Pain Relief P/div_Pain relief you can count'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_JNJ_O0643_Page_Tylenol  Tylenol Pain Relief P/div_Home  Brand Directory  TYL'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_JNJ_O0643_Page_Tylenol  Tylenol Pain Relief P/div_Get smart about your pain'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_JNJ_O0643_Page_Tylenol  Tylenol Pain Relief P/div_Get a 10 Holiday Cash Card'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_JNJ_O0643_Page_Tylenol  Tylenol Pain Relief P/div_col-1-2'),1, FailureHandling.CONTINUE_ON_FAILURE)



WebUI.closeBrowser()


