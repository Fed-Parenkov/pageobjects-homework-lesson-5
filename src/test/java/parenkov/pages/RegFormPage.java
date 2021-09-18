package parenkov.pages;

import com.codeborne.selenide.SelenideElement;
import parenkov.pages.components.Calendar;
import parenkov.pages.components.FileUploader;
import parenkov.pages.components.ModalWindow;
import parenkov.pages.components.StateAndCity;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static parenkov.tests.TestData.*;

public class RegFormPage {

    private SelenideElement firstNameField = $("#firstName"),
            lastNameField = $("#lastName"),
            EmailField = $("#userEmail"),
            genderRadioButton = $("#genterWrapper"),
            mobileNumberField = $("#userNumber"),
            subjectsField = $("#subjectsInput"),
            hobbiesRadioButton = $("#hobbiesWrapper"),
            currentAddressField = $("#currentAddress"),
            submitButton = $("#submit");


    public Calendar calendar = new Calendar();
    public ModalWindow modalWindow = new ModalWindow();
    public StateAndCity stateAndCity = new StateAndCity();
    public FileUploader picture = new FileUploader();


    public void scrollPage() {
        $("#submit").scrollIntoView(true);
    }
    public void openPage() {
        open("https://demoqa.com/" + url);
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

    public RegFormPage selectGender(String value) {
        genderRadioButton.$(byText(value)).click();
        return this;
    }

    public RegFormPage typeMobileNumber(String value) {
        mobileNumberField.setValue(value);
        return this;
    }

    public RegFormPage typeSubject(String value) {
        subjectsField.setValue(value).pressEnter();
        return this;
    }

    public RegFormPage selectHobbies(String value) {
        hobbiesRadioButton.$(byText(value)).click();
        return this;
    }

    public RegFormPage typeCurrentAddress(String value) {
        currentAddressField.setValue(value);
        return this;
    }

    public RegFormPage clickSubmit() {
        submitButton.click();
        return this;
    }
}