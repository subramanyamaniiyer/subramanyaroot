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

WebUI.navigateToUrl('https://www.cvs.com/shop/content/rebate')

WebUI.click(findTestObject('Object Repository/Page_Rebate Center  CVS.com/span_Rebate center'))

WebUI.verifyElementVisible(findTestObject('Object Repository/04_LOR_V9779_Page_Rebate Center  CVS.com/span_Rebate center'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_LOR_V9779_Page_Rebate Center  CVS.com/span_Rebate center (1)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_LOR_V9779_Page_Rebate Center  CVS.com/img'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_LOR_V9779_Page_Rebate Center  CVS.com/h3_Get great rebates on in-sto'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_LOR_V9779_Page_Rebate Center  CVS.com/div_See all the deals availabl'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_LOR_V9779_Page_Rebate Center  CVS.com/div_Save even more with coupon'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_LOR_V9779_Page_Rebate Center  CVS.com/div_Buy 50 worth of select PG'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_LOR_V9779_Page_Rebate Center  CVS.com/div_Advertisement  googletag.c'),1, FailureHandling.CONTINUE_ON_FAILURE)

//WebUI.verifyElementVisible(null,1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()