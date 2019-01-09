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

WebUI.navigateToUrl('http://staging.cvs.triadretail.net/shop-assets/04_LOR_U2833_MakeAnEntrance/banners/bz-beautyclub/')

WebUI.click(findTestObject('04_LOR_U2833_Page_Responsive Hero Zone/h2_Make an entrance'))

WebUI.verifyElementVisible(findTestObject('Object Repository/04_LOR_U2833_Page_Responsive Hero Zone/p_NEW LOral Paris products.'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_LOR_U2833_Page_Responsive Hero Zone/html_Responsive Hero Zone.trm-'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_LOR_U2833_Page_Responsive Hero Zone/h2_Make an entrance'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_LOR_U2833_Page_Responsive Hero Zone/div_Shop now'),1, FailureHandling.CONTINUE_ON_FAILURE)


//WebUI.verifyElementVisible(null,1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

