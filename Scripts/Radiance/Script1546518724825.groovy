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

WebUI.navigateToUrl('https://www.cvs.com/shop/brand-shop/r/radiance')

WebUI.click(findTestObject('Object Repository/Page_Radiance and Radiance Platinum/span_Radiance'))

findTestObject('Object Repository/Page_Radiance and Radiance Platinum/span_Radiance')
findTestObject('Object Repository/Page_Radiance and Radiance Platinum/span_Radiance (1)')
findTestObject('Object Repository/Page_Radiance and Radiance Platinum/img_Vitamins A-Z_img-rw')
findTestObject('Object Repository/Page_Radiance and Radiance Platinum/img_Supplements_img-rw')
findTestObject('Object Repository/Page_Radiance and Radiance Platinum/img_Shop now_img-rw trm-respon')
findTestObject('Object Repository/Page_Radiance and Radiance Platinum/img_Shop now_img-rw trm-hero-f')
findTestObject('Object Repository/Page_Radiance and Radiance Platinum/img_Radiance_img-rw')
findTestObject('Object Repository/Page_Radiance and Radiance Platinum/img_Radiance_img-rw trm-respon')
findTestObject('Object Repository/Page_Radiance and Radiance Platinum/img_Herbals_img-rw')
findTestObject('Object Repository/Page_Radiance and Radiance Platinum/img_Fermented_img-rw')
findTestObject('Object Repository/Page_Radiance and Radiance Platinum/img_Featured categories_img-rw')
findTestObject('Object Repository/Page_Radiance and Radiance Platinum/div_Radiate health from within')
findTestObject('Object Repository/Page_Radiance and Radiance Platinum/div_radiance')
findTestObject('Object Repository/Page_Radiance and Radiance Platinum/div_Pure. Simple. Radiant.Shop')
findTestObject('Object Repository/Page_Radiance and Radiance Platinum/div_Featured categories')
findTestObject('Object Repository/Page_Radiance and Radiance Platinum/div_Absorb more vital nutrient')

//WebUI.verifyElementVisible(null,1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

