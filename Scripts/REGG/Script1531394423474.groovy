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

WebUI.navigateToUrl('https://staging-walmart.triadretail.net/packed-with-love/')

WebUI.maximizeWindow()

//WebUI.click(findTestObject('Packed_With_Love/h2_Stock Up for School'))
//WebUI.verifyElementPresent(null, 20)
//WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Packed_With_Love/a_Tile-linkOverlay js-tile-lin'), 20)

if (WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Packed_With_Love/img'), 0, FailureHandling.CONTINUE_ON_FAILURE)) {
} else if (WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Packed_With_Love/img'), 0, FailureHandling.CONTINUE_ON_FAILURE)) {
} else {
WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Packed_With_Love/img'), 0, FailureHandling.CONTINUE_ON_FAILURE)
}

WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Packed_With_Love/img (1)'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('testing')

WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Packed_With_Love/img'), 5, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Packed_With_Love/img (2)'), 5, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Packed_With_Love/img (1)'), 5, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Packed_With_Love/h2_Stock Up for School'), 5, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Packed_With_Love/div_Pretzels'), 5, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Packed_With_Love/div_Nuts'), 5, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Packed_With_Love/div_Lunch Box Love    Share a'), 5, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Packed_With_Love/div_Crackers'), 5, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Packed_With_Love/a_Tile-linkOverlay js-tile-lin'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

