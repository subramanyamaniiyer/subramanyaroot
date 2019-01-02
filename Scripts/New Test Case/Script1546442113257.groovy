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

WebUI.navigateToUrl('https://staging-discoverofficedepot.triadretail.net/hr-block/')

WebUI.click(findTestObject('Object Repository/Page_HR Block/img_Please enter a quantity_lo'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_HR Block/p_With HR Block software you c'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_HR Block/p_Exclusively from HR Block'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_HR Block/nav_Basic            Deluxe'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_HR Block/img_Premium_img-fluid'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_HR Block/img_Please enter a quantity_lo'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_HR Block/h2_What makes Block Tax Softwa'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_HR Block/h2_Find the right software for'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_HR Block/h1_The best value in tax softw'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_HR Block/div_We Take Security Seriously'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_HR Block/div_Unlimited Expert Advice1'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_HR Block/div_Spend less but get more wi'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_HR Block/div_Please enter a quantity_ro'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_HR Block/div_Need help filing Get the H'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_HR Block/div_In-Person Audit Representa'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_HR Block/div_HR Block Basic Tax Softwar'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_HR Block/div_HR Block 18 Basic (Mac) Do'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_HR Block/div_Drag Drop and Go        Sa'),1, FailureHandling.CONTINUE_ON_FAILURE)

//WebUI.verifyElementVisible(null,1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

