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

WebUI.navigateToUrl('http://staging.cvs.triadretail.net/shop-assets/04_JNJ_N1073_Allergy2018/')

WebUI.click(findTestObject('04_JNJ_N1073_Page_JohnsonJohnson_Allergy/span_Johnson  Johnson Allergy'))

//WebUI.verifyElementVisible(null,1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/04_JNJ_N1073_spy_Page_Johnson_Johnson_Allergy/img_img-rw'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_JNJ_N1073_spy_Page_Johnson_Johnson_Allergy/img_img-rw trm-responsive-img'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_JNJ_N1073_spy_Page_Johnson_Johnson_Allergy/img_img-rw trm-responsive-img (5)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_JNJ_N1073_spy_Page_Johnson_Johnson_Allergy/img_img-rw trm-responsive-img (4)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_JNJ_N1073_spy_Page_Johnson_Johnson_Allergy/img_img-rw trm-responsive-img (3)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_JNJ_N1073_spy_Page_Johnson_Johnson_Allergy/img_img-rw trm-responsive-img (2)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_JNJ_N1073_spy_Page_Johnson_Johnson_Allergy/img_img-rw trm-responsive-img (1)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_JNJ_N1073_spy_Page_Johnson_Johnson_Allergy/img_img-rw trm-hero-fam'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_JNJ_N1073_spy_Page_Johnson_Johnson_Allergy/img_img-rw trm-hero-fam (3)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_JNJ_N1073_spy_Page_Johnson_Johnson_Allergy/img_img-rw trm-hero-fam (2)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_JNJ_N1073_spy_Page_Johnson_Johnson_Allergy/img_img-rw trm-hero-fam (1)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_JNJ_N1073_spy_Page_Johnson_Johnson_Allergy/img_img-rw (4)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_JNJ_N1073_spy_Page_Johnson_Johnson_Allergy/img_img-rw (3)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_JNJ_N1073_spy_Page_Johnson_Johnson_Allergy/img_img-rw (2)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_JNJ_N1073_spy_Page_Johnson_Johnson_Allergy/img_img-rw (1)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_JNJ_N1073_spy_Page_Johnson_Johnson_Allergy/h1_RHINOCORT works all day and'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_JNJ_N1073_spy_Page_Johnson_Johnson_Allergy/h1_Clinically proven effective'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_JNJ_N1073_spy_Page_Johnson_Johnson_Allergy/div_ZYRTEC works fast and stay'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_JNJ_N1073_spy_Page_Johnson_Johnson_Allergy/div_Use only as directed.'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_JNJ_N1073_spy_Page_Johnson_Johnson_Allergy/div_Put your allergies to rest'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_JNJ_N1073_spy_Page_Johnson_Johnson_Allergy/div_Home  Brand Directory  Joh'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_JNJ_N1073_spy_Page_Johnson_Johnson_Allergy/div_Conquer allergiesBuild you'),1, FailureHandling.CONTINUE_ON_FAILURE)



WebUI.closeBrowser()

