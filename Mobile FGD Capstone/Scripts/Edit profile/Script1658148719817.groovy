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

WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Edit profile/android.view.View'), 0)

Mobile.tap(findTestObject('Object Repository/Edit profile/android.widget.Button'), 0)

Mobile.tap(findTestObject('Edit profile/android.widget.EditText - Nama AwalMasukan Nama Awal (1)'), 0)

Mobile.setText(findTestObject('Object Repository/Edit profile/android.widget.EditText - Nama AwalMasukan Nama Awal (1)'), 
    'Elfrida', 0)

Mobile.tap(findTestObject('Object Repository/Edit profile/android.widget.EditText - Nama AkhirMasukan Nomor Handphone'), 
    0)

Mobile.setText(findTestObject('Object Repository/Edit profile/android.widget.EditText - Nama AkhirMasukan Nomor Handphone (1)'), 
    'Tampubolon', 0)

Mobile.tap(findTestObject('Object Repository/Edit profile/android.widget.EditText - Tampubolon, Masukan Nama Akhir'), 0)

Mobile.setText(findTestObject('Edit profile/android.widget.EditText - Tampubolon, Masukan Nama Akhir (1)'), '081370362057', 
    0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Edit profile/android.widget.EditText - Masukan Email'), 0)

Mobile.setText(findTestObject('Object Repository/Edit profile/android.widget.EditText - Masukan Email (1)'), 'elfrida@gmail.com', 
    0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Edit profile/android.widget.Button (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Edit profile/android.view.View (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Edit profile/android.widget.EditText - Masukan Kota'), 0)

Mobile.setText(findTestObject('Object Repository/Edit profile/android.widget.EditText - Masukan Kota (1)'), 'Medan', 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Edit profile/android.widget.EditText - Masukan Negara'), 0)

Mobile.setText(findTestObject('Object Repository/Edit profile/android.widget.EditText - Masukan Negara (1)'), 'Indonesia', 
    0)

Mobile.tap(findTestObject('Object Repository/Edit profile/android.widget.Button (2)'), 0)

