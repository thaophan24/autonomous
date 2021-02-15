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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

String a = WebUI.getText(findTestObject('Amazon/Cart/span_Price'))

String price = a.replace('$', '')

float priceInt = price.toFloat()

println(priceInt)

float total = priceInt * 3

total = CustomKeywords.'common.CommonUtils.roundDecimals'(total, 2)

//println total
String b = WebUI.getText(findTestObject('Amazon/Cart/span_SubTotal'))

//println b
String subTotal = b.replace('$', '')

float subTotalInt = subTotal.toFloat()

//println subTotalInt
if (total == subTotalInt) {
    KeywordUtil.markPassed('The subtotal price is correctly')

    WebUI.click(findTestObject('Amazon/Cart/span_Delete'))
} else {
    KeywordUtil.markFailed('The subtotal price is incorrectly')
}