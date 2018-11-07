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

WebUI.navigateToUrl('https://staging-discoverofficedepot.triadretail.net/brother/')

WebUI.click(findTestObject('Object Repository/Page_Brother/img'))

//WebUI.verifyElementVisible(null,1, FailureHandling.CONTINUE_ON_FAILURE)


WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Brother/img_cm-image'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Brother/img'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Brother/img (1)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Brother/div_Office SuppliesPaperInk  T'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Brother/div_iframe srchttpswww.googlet'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Brother/div_Give them a gift card.Neve'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Brother/div_Everyday financing availab'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Brother/div_2 back in rewards on your'),1, FailureHandling.CONTINUE_ON_FAILURE)


WebUI.closeBrowser()

