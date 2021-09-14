package parenkov.pages;

import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;
import parenkov.pages.components.Calendar;

import java.util.Random;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static parenkov.tests.TestData.firstName;
import static parenkov.tests.TestData.gender;

public class RegFormPage {

    private SelenideElement firstNameField = $("#firstName"),
            lastNameField = $("#lastName"),
            EmailField = $("#userEmail"),
            genderRadioButton = $("#genterWrapper").$(byText(gender)),
            mobileNumberField = $("#userNumber");



    public Calendar calendar = new Calendar();

    public void openPage() {
        open("https://demoqa.com/automation-practice-form");
    }

    public RegFormPage typeFirstName(String value) {
        firstNameField.setValue(value);
        return this;
    }

    public RegFormPage typeLastName(String value) {
        lastNameField.setValue(value);
        return this;
    }

    public RegFormPage typeEmail(String value) {
        EmailField.setValue(value);
        return this;
    }

    public RegFormPage selectGender() {
        genderRadioButton.click();
        return this;
    }

//    public RegFormPage typeMobileNumber() {
//        mobileNumberField.setValue(value);
//        return this;
//    }
}