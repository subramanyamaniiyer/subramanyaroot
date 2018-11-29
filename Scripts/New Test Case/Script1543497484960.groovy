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

WebUI.navigateToUrl('https://staging-samsclub.triadretail.net/Featured-Brand/Sams-Club/Recipe-Hub/Kelloggs/#/')

WebUI.click(findTestObject('Object Repository/Page_SamsClub.com - Recipe Hub - Ke/img_concat(Kellogg  s)_categor'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_SamsClub.com - Recipe Hub - Ke/li_Waffles with Strawberry Whi'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_SamsClub.com - Recipe Hub - Ke/li_Toasteds Spinach DipPrep Ti'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_SamsClub.com - Recipe Hub - Ke/li_Spicy Chicken WafflePrep Ti'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_SamsClub.com - Recipe Hub - Ke/li_Maple Bacon Donut BowlPrep'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_SamsClub.com - Recipe Hub - Ke/li_Honey Hot Cocoa Kelloggs Sp'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_SamsClub.com - Recipe Hub - Ke/li_Crispy Peanut SquaresPrep T'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_SamsClub.com - Recipe Hub - Ke/li_Club Cracker Cheddar Bacon'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_SamsClub.com - Recipe Hub - Ke/li_Chocolate Pretzel Rice Kris'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_SamsClub.com - Recipe Hub - Ke/li_Alouette Spinach Artichoke'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_SamsClub.com - Recipe Hub - Ke/img_concat(Kellogg  s)_tags__p'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_SamsClub.com - Recipe Hub - Ke/img_concat(Kellogg  s)_recipe_'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_SamsClub.com - Recipe Hub - Ke/img_concat(Kellogg  s)_povlg'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_SamsClub.com - Recipe Hub - Ke/img_concat(Kellogg  s)_categor'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_SamsClub.com - Recipe Hub - Ke/img_concat(Kellogg  s)_categor (1)'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_SamsClub.com - Recipe Hub - Ke/img'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_SamsClub.com - Recipe Hub - Ke/div_Recipe Essentials'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_SamsClub.com - Recipe Hub - Ke/div_Recipe Essentials (1)'),1, FailureHandling.CONTINUE_ON_FAILURE)

//WebUI.verifyElementVisible(null,1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()
