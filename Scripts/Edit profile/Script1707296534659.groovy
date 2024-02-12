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

WebUI.click(findTestObject('Incorect pasword/Page_Advantage Shopping/button_SIGN IN'))

WebUI.setText(findTestObject('Incorect pasword/Page_Advantage Shopping/input_OR_username'), 'namu')

WebUI.click(findTestObject('Object Repository/Edit profile/Page_Advantage Shopping/label_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Edit profile/Page_Advantage Shopping/input_Username_password'), 
    'c5s7CZtvJJc=')

WebUI.setText(findTestObject('Object Repository/Edit profile/Page_Advantage Shopping/input_Laptops_category_headphones'), 
    'namuu')

WebUI.click(findTestObject('Object Repository/Edit profile/Page_Advantage Shopping/button_SIGN IN'))

WebUI.click(findTestObject('Object Repository/Edit profile/Page_Advantage Shopping/path_CHECKOUT  (0.00)_menuUserSVGPath'))

WebUI.click(findTestObject('Object Repository/Edit profile/Page_Advantage Shopping/label_My account'))

WebUI.click(findTestObject('Object Repository/Edit profile/Page_Advantage Shopping/input_Laptops_category_headphones'))

WebUI.click(findTestObject('Object Repository/Edit profile/Page_Advantage Shopping/input_Laptops_category_headphones'))

WebUI.click(findTestObject('Object Repository/Edit profile/Page_Advantage Shopping/input_Laptops_category_headphones'))

