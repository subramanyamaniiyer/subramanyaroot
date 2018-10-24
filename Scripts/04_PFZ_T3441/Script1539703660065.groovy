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

WebUI.navigateToUrl('http://staging.cvs.triadretail.net/shop-assets/04_PFZ_T3341_PFZCCFSpon18/')

WebUI.click(findTestObject('04_PFZ_T3441_Page_The Best Cold Flu/span_Cough Cold  Flu'))

WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_T3441_Page_The Best Cold Flu/span_Cough Cold  Flu'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_T3441_Page_The Best Cold Flu/img_trm-mc-logo img-rw trm-res'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_T3441_Page_The Best Cold Flu/img_img-rw'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_T3441_Page_The Best Cold Flu/img_img-rw (3)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_T3441_Page_The Best Cold Flu/img_img-rw (2)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_T3441_Page_The Best Cold Flu/img_img-rw (1)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_T3441_Page_The Best Cold Flu/iframe_twc-iframe'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_T3441_Page_The Best Cold Flu/header_Cold and Flu Tracker'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_T3441_Page_The Best Cold Flu/h3_Shop by symptom'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_T3441_Page_The Best Cold Flu/h3_Shop by category'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_T3441_Page_The Best Cold Flu/h3_Shop by brand'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_T3441_Page_The Best Cold Flu/h2_Treat a cough today without'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_T3441_Page_The Best Cold Flu/div_Treat a cough today withou'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_T3441_Page_The Best Cold Flu/div_Stuffy Nose'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_T3441_Page_The Best Cold Flu/div_Sore Throat Relief'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_T3441_Page_The Best Cold Flu/div_Plan for more fun and fewe'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_T3441_Page_The Best Cold Flu/div_Nighttime Relief'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_T3441_Page_The Best Cold Flu/div_Nasal Care'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_T3441_Page_The Best Cold Flu/div_Low'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_T3441_Page_The Best Cold Flu/div_Lip  Cold Sore Treatment'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_T3441_Page_The Best Cold Flu/div_Immune Support'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_T3441_Page_The Best Cold Flu/div_Home Brand Directory  Coug'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_T3441_Page_The Best Cold Flu/div_Flu Remedies'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_T3441_Page_The Best Cold Flu/div_Flu Activity'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_T3441_Page_The Best Cold Flu/div_Daytime Relief'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_T3441_Page_The Best Cold Flu/div_Cough Relief'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_T3441_Page_The Best Cold Flu/div_Cough Drops  Sore Throat R'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_T3441_Page_The Best Cold Flu/div_Cough Cold  Flu'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_T3441_Page_The Best Cold Flu/div_Cold Activity'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_T3441_Page_The Best Cold Flu/div_Childrens Cough Cold  Flu'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_PFZ_T3441_Page_The Best Cold Flu/div_Buy 1 get 1'),1, FailureHandling.CONTINUE_ON_FAILURE)

//WebUI.verifyElementVisible(null,1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()