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

WebUI.navigateToUrl('http://staging.cvs.triadretail.net/shop-assets/04_AGC_L4951_AGC2018Anni/')

WebUI.click(findTestObject('Object Repository/Page_American Greetings  CVS.com/span_American Greetings'))

//WebUI.verifyElementVisible(null,1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/04_AGC_L4951_Page_American Greetings  CVS.com/span_American Greetings'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_AGC_L4951_Page_American Greetings  CVS.com/p_Ring in the New Year with ce'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_AGC_L4951_Page_American Greetings  CVS.com/p_Lift the holiday spirit of e'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_AGC_L4951_Page_American Greetings  CVS.com/p_Create holiday moments for t'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_AGC_L4951_Page_American Greetings  CVS.com/p_Celebrate the Festival of Li'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_AGC_L4951_Page_American Greetings  CVS.com/p_A heartfelt wish from the ca'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_AGC_L4951_Page_American Greetings  CVS.com/p_A bright and bold holiday ca'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_AGC_L4951_Page_American Greetings  CVS.com/img_trm-tr trm-responsive-img'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_AGC_L4951_Page_American Greetings  CVS.com/img_trm-tr trm-responsive-img (9)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_AGC_L4951_Page_American Greetings  CVS.com/img_trm-tr trm-responsive-img (8)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_AGC_L4951_Page_American Greetings  CVS.com/img_trm-tr trm-responsive-img (7)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_AGC_L4951_Page_American Greetings  CVS.com/img_trm-tr trm-responsive-img (6)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_AGC_L4951_Page_American Greetings  CVS.com/img_trm-tr trm-responsive-img (5)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_AGC_L4951_Page_American Greetings  CVS.com/img_trm-tr trm-responsive-img (4)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_AGC_L4951_Page_American Greetings  CVS.com/img_trm-tr trm-responsive-img (3)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_AGC_L4951_Page_American Greetings  CVS.com/img_trm-tr trm-responsive-img (23)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_AGC_L4951_Page_American Greetings  CVS.com/img_trm-tr trm-responsive-img (22)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_AGC_L4951_Page_American Greetings  CVS.com/img_trm-tr trm-responsive-img (21)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_AGC_L4951_Page_American Greetings  CVS.com/img_trm-tr trm-responsive-img (20)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_AGC_L4951_Page_American Greetings  CVS.com/img_trm-tr trm-responsive-img (2)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_AGC_L4951_Page_American Greetings  CVS.com/img_trm-tr trm-responsive-img (19)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_AGC_L4951_Page_American Greetings  CVS.com/img_trm-tr trm-responsive-img (18)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_AGC_L4951_Page_American Greetings  CVS.com/img_trm-tr trm-responsive-img (17)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_AGC_L4951_Page_American Greetings  CVS.com/img_trm-tr trm-responsive-img (16)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_AGC_L4951_Page_American Greetings  CVS.com/img_trm-tr trm-responsive-img (15)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_AGC_L4951_Page_American Greetings  CVS.com/img_trm-tr trm-responsive-img (14)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_AGC_L4951_Page_American Greetings  CVS.com/img_trm-tr trm-responsive-img (13)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_AGC_L4951_Page_American Greetings  CVS.com/img_trm-tr trm-responsive-img (12)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_AGC_L4951_Page_American Greetings  CVS.com/img_trm-tr trm-responsive-img (11)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_AGC_L4951_Page_American Greetings  CVS.com/img_trm-tr trm-responsive-img (10)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_AGC_L4951_Page_American Greetings  CVS.com/img_trm-tr trm-responsive-img (1)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_AGC_L4951_Page_American Greetings  CVS.com/img_img-rw trm-responsive-img'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_AGC_L4951_Page_American Greetings  CVS.com/img_img-rw trm-responsive-img (1)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_AGC_L4951_Page_American Greetings  CVS.com/img_img-rw trm-hero-fam'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_AGC_L4951_Page_American Greetings  CVS.com/h4_Explore even more designs a'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_AGC_L4951_Page_American Greetings  CVS.com/h3_Happy New Year'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_AGC_L4951_Page_American Greetings  CVS.com/h3_Happiness for the holidays'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_AGC_L4951_Page_American Greetings  CVS.com/h3_Hanukkah wishes'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_AGC_L4951_Page_American Greetings  CVS.com/h3_Christmas spiritual'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_AGC_L4951_Page_American Greetings  CVS.com/h3_Christmas fun'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_AGC_L4951_Page_American Greetings  CVS.com/h3_Christmas family'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_AGC_L4951_Page_American Greetings  CVS.com/div_American Greetings'),1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

