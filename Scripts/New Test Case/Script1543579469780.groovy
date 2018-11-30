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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://staging-walmart.triadretail.net/GeorgeForemanGrills')

WebUI.click(findTestObject('Object Repository/Page_George Foreman Grills/h2_No charcoal. No propane. No'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_George Foreman Grills/img_Next_trm-desk'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_George Foreman Grills/img_Everyday grilling_trm-desk'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_George Foreman Grills/img'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_George Foreman Grills/h2_No charcoal. No propane. No'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_George Foreman Grills/h2_No charcoal. No propane. No (1)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_George Foreman Grills/h2_Find the right grill for yo'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_George Foreman Grills/div_The ultimate tailgate'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_George Foreman Grills/div_Everyday grilling'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_George Foreman Grills/div_Beyond grilling from break'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_George Foreman Grills/div_15-serving Indoor  Outdoor'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_George Foreman Grills/div_12-serving Indoor  Outdoor'),1, FailureHandling.CONTINUE_ON_FAILURE)

//WebUI.verifyElementVisible(null,1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()
