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

Mobile.startApplication('D:\\Documents\\Downloads\\app-release.apk', true)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.Button'), 0)

Mobile.tap(findTestObject('Register/android.widget.EditText - Masukan Nama'), 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - Masukan Nama'), 'Elfrida Tampubolon', 
    0)

Mobile.tap(findTestObject('Register/android.widget.EditText - Masukkan Email'), 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - Masukkan Email'), 'elfridatampubolon@gmail.com', 
    0)

Mobile.pressBack()

Mobile.tap(findTestObject('Register/android.widget.EditText - Masukan Password'), 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - Masukan Password'), 'akucantik', 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Register/android.widget.Button (1)'), 0)

