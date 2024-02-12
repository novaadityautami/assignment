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

WebUI.click(findTestObject('Object Repository/pembelian barang/Page_Advantage Shopping/a_OUR PRODUCTS'))

WebUI.click(findTestObject('Object Repository/pembelian barang/Page_Advantage Shopping/a_OUR PRODUCTS'))

WebUI.click(findTestObject('Object Repository/pembelian barang/Page_Advantage Shopping/label_View Details'))

WebUI.click(findTestObject('Object Repository/pembelian barang/Page_Advantage Shopping/button_ADD TO CART (1)'))

WebUI.click(findTestObject('Object Repository/pembelian barang/Page_Advantage Shopping/button_CHECKOUT  (1,261.99)'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/pembelian barang/Page_Advantage Shopping/input_Already have an account_usernameInOrd_818284 (1)'), 
    'testinglagi')

WebUI.setEncryptedText(findTestObject('Object Repository/pembelian barang/Page_Advantage Shopping/input_Username_passwordInOrderPayment (1)'), 
    'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/pembelian barang/Page_Advantage Shopping/button_LOGIN (1)'))

WebUI.click(findTestObject('Object Repository/pembelian barang/Page_Advantage Shopping/button_NEXT (1)'))

WebUI.click(findTestObject('Object Repository/pembelian barang/Page_Advantage Shopping/button_PAY NOW (1)'))

