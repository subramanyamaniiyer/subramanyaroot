import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join

WebUI.openBrowser('https://www.katalon.com/')
def driver = DriverFactory.getWebDriver()
String baseUrl = "https://www.katalon.com/"
selenium = new WebDriverBackedSelenium(driver, baseUrl)
selenium.open("https://uat-walmart.triadretail.net/the-laughing-cow/")
//verifyEquals("Save $1 Now", selenium.getText("//div[@id='ContentPlaceHolder1_C001_divContent']/div/div/div/div/div/div/div/div/div[2]/span"));
verifyEquals("The Laughing Cow®\n Cheese Cups", selenium.getText("//div[@id='ContentPlaceHolder1_C001_divContent']/div/div/div/div/div/div/div/div/div[2]/h2"));
verifyEquals("Discover the newest way to snack your way.", selenium.getText("//div[@id='ContentPlaceHolder1_C001_divContent']/div/div/div/div/div/div/div/div/div[2]/p"));
//verifyTrue(selenium.getText("//div[@id='ContentPlaceHolder1_C001_divContent']/div/div/div/div/div/div/div/div/div[2]/label").matches("^[\\s\\S]*Coupon printing is supported only on desktop browsers\\.$"));
selenium.click("//img[@alt='Nav Arrow']")
selenium.selectWindow("win_ser_1")
selenium.close()
selenium.selectWindow("win_ser_local")
selenium.click("link=Video")
selenium.selectWindow("win_ser_2")
selenium.close()
selenium.selectWindow("win_ser_local")
verifyEquals("Cowever, Wherever, Whenever", selenium.getText("//div[@id='ContentPlaceHolder1_C001_divContent']/div/div/div/div[2]/div/div[2]/p"));
verifyEquals("The Laughing Cow® has you covered!", selenium.getText("//div[@id='ContentPlaceHolder1_C001_divContent']/div/div/div/div[2]/div/div[2]/span"));
verifyEquals("Uncover All the Delicious\n Ways to Snack Like You", selenium.getText("//div[@id='ContentPlaceHolder1_C001_divContent']/div/div/div/div[2]/div[2]/div[2]/p"));
verifyEquals("Uncover All the Delicious\n Ways to Snack Like You", selenium.getText("//div[@id='ContentPlaceHolder1_C001_divContent']/div/div/div/div[2]/div[2]/div[2]/p"));
verifyEquals("Learn More", selenium.getText("link=Learn More"));
selenium.click("link=Learn More")
verifyEquals("Important Walmart Disclaimer: Product information is provided by the supplier or manufacturer of the product and should not be construed as advice. Walmart does not sponsor, recommend or endorse any third party, product, service or information provided on this site.", selenium.getText("//div[@id='LegalInfo']/p"));


WebUI.closeBrowser()