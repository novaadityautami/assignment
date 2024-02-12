import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://advantageonlineshopping.com/#/')

WebUI.maximizeWindow()

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/add to chart/Page_Advantage Shopping/img_View Details_popular_item_21_img'))

WebUI.click(findTestObject('Object Repository/add to chart/Page_Advantage Shopping/label_View Details'))

WebUI.click(findTestObject('Object Repository/add to chart/Page_Advantage Shopping/div_Quantity_plus'))

WebUI.click(findTestObject('Object Repository/add to chart/Page_Advantage Shopping/span_Color_bunny'))

WebUI.click(findTestObject('Object Repository/add to chart/Page_Advantage Shopping/button_ADD TO CART'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/add to chart/Page_Advantage Shopping/svg_Management Console_menuCart'))

WebUI.click(findTestObject('Object Repository/add to chart/Page_Advantage Shopping/div_Advantage Inc, 2024. Release 3.2_virtualFooter'))

