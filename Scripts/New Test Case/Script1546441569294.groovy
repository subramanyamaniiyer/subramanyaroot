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

WebUI.navigateToUrl('https://staging-walmart.triadretail.net/boxtops')

WebUI.click(findTestObject('Object Repository/Page_Box Tops/h3_Shop family favorites'))


WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Box Tops/p_To redeem offer download the'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Box Tops/p_Important Walmart Disclaimer'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Box Tops/h3_Shop Go-GURT flavors'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Box Tops/h3_Shop family favorites'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Box Tops/h3_Shop family favorites (1)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Box Tops/div_Shop family favorites'),1, FailureHandling.CONTINUE_ON_FAILURE)


//WebUI.verifyElementVisible(null,1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()
