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

WebUI.navigateToUrl('http://staging.cvs.triadretail.net/shop-assets/04_OFA_V3182_Innovia/')

WebUI.click(findTestObject('04_OFA_V3182_Page_InnoviaProbiotics/span_Innovia Probiotics'))


WebUI.verifyElementVisible(findTestObject('Object Repository/04_OFA_V3182_Page_InnoviaProbiotics/span_Innovia Probiotics'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_OFA_V3182_Page_InnoviaProbiotics/section_Liquid Fiber probiotic'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_OFA_V3182_Page_InnoviaProbiotics/section_Digestion probiotic mi'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_OFA_V3182_Page_InnoviaProbiotics/p_Innovias exclusive technolog'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_OFA_V3182_Page_InnoviaProbiotics/img_Special savings_img-rw trm'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_OFA_V3182_Page_InnoviaProbiotics/img_Our patented cap_img-rw tr'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_OFA_V3182_Page_InnoviaProbiotics/img_Liquid advantage_img-rw tr'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_OFA_V3182_Page_InnoviaProbiotics/img_Innovia Probiotics_img-rw'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_OFA_V3182_Page_InnoviaProbiotics/h5_Restore microflora balance'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_OFA_V3182_Page_InnoviaProbiotics/h2_The difference begins at de'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_OFA_V3182_Page_InnoviaProbiotics/h1_Special savings'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_OFA_V3182_Page_InnoviaProbiotics/div_The difference begins at d'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_OFA_V3182_Page_InnoviaProbiotics/div_Our patented cap'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_OFA_V3182_Page_InnoviaProbiotics/div_Italys renowned probiotic'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_OFA_V3182_Page_InnoviaProbiotics/div_Innovia Probiotics'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_OFA_V3182_Page_InnoviaProbiotics/div_Home Brand Directory  Inno'),1, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('Object Repository/04_OFA_V3182_Page_InnoviaProbiotics/div_3 off NEW Innovia probioti'),1, FailureHandling.CONTINUE_ON_FAILURE)


//WebUI.verifyElementVisible(null,1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()
