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

WebUI.navigateToUrl('http://staging.cvs.triadretail.net/shop-assets/04_PFZ_O0626_AdvilPain18/')

WebUI.click(findTestObject('Object Repository/Page_Advil  CVS.com/span_Advil'))


//WebUI.verifyElementVisible(null,1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_O0626_Page_Advil  CVS.com/span_Advil'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_O0626_Page_Advil  CVS.com/span_Advil (1)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_O0626_Page_Advil  CVS.com/p_Why Because Advil provides r'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_O0626_Page_Advil  CVS.com/p_Whether you have occasional'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_O0626_Page_Advil  CVS.com/p_When you have a headache eve'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_O0626_Page_Advil  CVS.com/p_Trust Advil Migraine for fas'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_O0626_Page_Advil  CVS.com/p_Take the pain out of pain re'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_O0626_Page_Advil  CVS.com/p_Fast powerful pain relief in'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_O0626_Page_Advil  CVS.com/p_Advil Tablets and Advil Film'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_O0626_Page_Advil  CVS.com/img_img-rw trm-responsive-img'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_O0626_Page_Advil  CVS.com/img_img-rw trm-responsive-img (7)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_O0626_Page_Advil  CVS.com/img_img-rw trm-responsive-img (6)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_O0626_Page_Advil  CVS.com/img_img-rw trm-responsive-img (5)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_O0626_Page_Advil  CVS.com/img_img-rw trm-responsive-img (4)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_O0626_Page_Advil  CVS.com/img_img-rw trm-responsive-img (3)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_O0626_Page_Advil  CVS.com/img_img-rw trm-responsive-img (2)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_O0626_Page_Advil  CVS.com/img_img-rw trm-responsive-img (1)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_O0626_Page_Advil  CVS.com/img_img-rw trm-hero-fam'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_O0626_Page_Advil  CVS.com/img_img-rw trm-hero-fam (6)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_O0626_Page_Advil  CVS.com/img_img-rw trm-hero-fam (5)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_O0626_Page_Advil  CVS.com/img_img-rw trm-hero-fam (4)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_O0626_Page_Advil  CVS.com/img_img-rw trm-hero-fam (3)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_O0626_Page_Advil  CVS.com/img_img-rw trm-hero-fam (2)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_O0626_Page_Advil  CVS.com/img_img-rw trm-hero-fam (1)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_O0626_Page_Advil  CVS.com/h1_Relief thats fast strength'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_O0626_Page_Advil  CVS.com/h1_Minor arthritis and joint p'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_O0626_Page_Advil  CVS.com/h1_Get clinically proven migra'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_O0626_Page_Advil  CVS.com/h1_Fight tough menstrual cramp'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_O0626_Page_Advil  CVS.com/h1_Fast  strong headache relie'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_O0626_Page_Advil  CVS.com/h1_Advil LIQUI-GELS minis'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_O0626_Page_Advil  CVS.com/h1_1 choice for tough pain day'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_O0626_Page_Advil  CVS.com/div_Relief thats fast strength'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_O0626_Page_Advil  CVS.com/div_Minor arthritis and joint'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_O0626_Page_Advil  CVS.com/div_LIQUI-GELS is a trademark'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_O0626_Page_Advil  CVS.com/div_Get clinically proven migr'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_O0626_Page_Advil  CVS.com/div_Fight tough menstrual cram'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_O0626_Page_Advil  CVS.com/div_Fast  strong headache reli'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_O0626_Page_Advil  CVS.com/div_1 choice for tough pain da'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_O0626_Page_Advil  CVS.com/a_Shop Advil'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_O0626_Page_Advil  CVS.com/a_Shop Advil Migraine'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_O0626_Page_Advil  CVS.com/a_Shop Advil LIQUI-GELS minis'),1, FailureHandling.CONTINUE_ON_FAILURE)




WebUI.closeBrowser()

