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

import org.eclipse.persistence.internal.oxm.record.json.JSONParser.value_return
import org.openqa.selenium.Keys as Keys


Boolean value1 = false, value2 = true;

WebUI.openBrowser('')




WebUI.navigateToUrl('https://wm6.walmart.com/MadeforSummer')

WebUI.click(findTestObject('Made_for_Summer_Mars_Candy/img'))

//WebUI.verifyElementPresent(null, 0, FailureHandling.CONTINUE_ON_FAILURE)

if(WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Made_for_Summer/a_Tile-linkOverlay js-tile-lin (1)'))){
	value1 = true;
	if(value1 == true){
		WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Made_for_Summer/img'), 0, FailureHandling.CONTINUE_ON_FAILURE)
	}
	
}

if (value2 == WebUI.verifyElementVisible(findTestObject('Object Repository/spy_Made_for_Summer/a_Tile-linkOverlay js-tile-lin'), FailureHandling.CONTINUE_ON_FAILURE)) {
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Made_for_Summer/a_Tile-linkOverlay js-tile-lin'), 0, FailureHandling.CONTINUE_ON_FAILURE)
}



WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Made_for_Summer/img'), 0, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Made_for_Summer/img (3)'), 0, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Made_for_Summer/img (2)'), 0, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Made_for_Summer/img (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Made_for_Summer/h4_MMs Treat Pops'), 0, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Made_for_Summer/h1_Make Summer Mmmemorable'), 0, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Made_for_Summer/h1_How Sweet It Is'), 0, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Made_for_Summer/div_Skittles All American Cand'), 0, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Made_for_Summer/div_RecipeMMs Treat PopsRecipe'), 0, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Made_for_Summer/button_Next'), 0, FailureHandling.CONTINUE_ON_FAILURE)
//WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Made_for_Summer/a_Tile-linkOverlay js-tile-lin'), 0, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Made_for_Summer/a_Tile-linkOverlay js-tile-lin (3)'), 0, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Made_for_Summer/a_Tile-linkOverlay js-tile-lin (2)'), 0, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/spy_Made_for_Summer/a_Tile-linkOverlay js-tile-lin (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

