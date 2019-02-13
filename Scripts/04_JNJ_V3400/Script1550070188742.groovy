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

WebUI.navigateToUrl('http://staging.cvs.triadretail.net/shop-assets/04_JNJ_C1125_LifeScan2017/')

WebUI.click(findTestObject('04_JNJ_V3400_Page_One Touch/span_OneTouch'))

WebUI.click(findTestObject('04_JNJ_V3400_Page_One Touch/span_OneTouch'))

WebUI.verifyElementVisible(findTestObject('Object Repository/04_JNJ_V3400_Page_One Touch/span_OneTouch'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_JNJ_V3400_Page_One Touch/span_OneTouch (1)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_JNJ_V3400_Page_One Touch/img_Watch video_img-rw trm-her'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_JNJ_V3400_Page_One Touch/img_Test strips_img-rw'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_JNJ_V3400_Page_One Touch/img_Shop the 1 recommended bra'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_JNJ_V3400_Page_One Touch/img_Shop now_img-rw trm-respon'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_JNJ_V3400_Page_One Touch/img_Shop now_img-rw trm-hero-f'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_JNJ_V3400_Page_One Touch/img_OneTouch_img-rw trm-respon'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_JNJ_V3400_Page_One Touch/img_Download voucher PDF_img-r'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_JNJ_V3400_Page_One Touch/img_Blood glucose meters_img-r'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_JNJ_V3400_Page_One Touch/h2_Shop the 1 recommended bran'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_JNJ_V3400_Page_One Touch/h1_OneTouch Verio meter'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_JNJ_V3400_Page_One Touch/h1_OneTouch Verio Flex meter'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_JNJ_V3400_Page_One Touch/div_OneTouch Verio Flex meterT'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_JNJ_V3400_Page_One Touch/div_OneTouch UltraMini meterSm'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_JNJ_V3400_Page_One Touch/div_Get a OneTouch Verio Flex'),1, FailureHandling.CONTINUE_ON_FAILURE)

//WebUI.verifyElementVisible(null,1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()