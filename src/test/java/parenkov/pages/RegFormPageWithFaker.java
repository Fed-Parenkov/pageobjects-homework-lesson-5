package parenkov.pages;

import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;
import parenkov.pages.components.Calendar;
import parenkov.pages.components.FileUploader;
import parenkov.pages.components.StateAndCity;
import parenkov.tests.TestData;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static parenkov.tests.TestData.url;

public class RegFormPageWithFaker {

    private SelenideElement firstNameField = $("#firstName"),
            lastNameField = $("#lastName"),
            EmailField = $("#userEmail"),
            genderRadioButton = $("#genterWrapper"),
            mobileNumberField = $("#userNumber"),
            subjectField = $("#subjectsInput"),
            hobbiesRadioButton = $("#hobbiesWrapper"),
            currentAddressField = $("#currentAddress"),
            submitButton = $("#submit");


    public Calendar calendar = new Calendar();
    public StateAndCity stateAndCity = new StateAndCity();
    public FileUploader picture = new FileUploader();

    Faker faker = new Faker();
    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String email = faker.internet().emailAddress();
    String mobileNumber = faker.number().digits(10);
    String address = faker.address().streetAddress();


    public void scrollPage() {
        $("#submit").scrollIntoView(true);
    }
    public void openPage() {
        open("https://demoqa.com/" + url);
    }


    public RegFormPageWithFaker typeFirstName() {
        firstNameField.setValue(firstName);
        return this;
    }

    public RegFormPageWithFaker typeLastName() {
        lastNameField.setValue(lastName);
        return this;
    }

    public RegFormPageWithFaker typeEmail() {
        EmailField.setValue(email);
        return this;
    }

    public RegFormPageWithFaker selectGender(String value) {
        genderRadioButton.$(byText(value)).click();
        return this;
    }

    public RegFormPageWithFaker typeMobileNumber() {
        mobileNumberField.setValue(mobileNumber);
        return this;
    }

    public RegFormPageWithFaker typeSubject(String value) {
        subjectField.setValue(value).pressEnter();
        return this;
    }

    public RegFormPageWithFaker selectHobbies(String value) {
        hobbiesRadioButton.$(byText(value)).click();
        return this;
    }

    public RegFormPageWithFaker typeCurrentAddress() {
        currentAddressField.setValue(address);
        return this;
    }

    public RegFormPageWithFaker clickSubmit() {
        submitButton.click();
        return this;
    }

    public RegFormPageWithFaker checkModalWindow() {
        $("#example-modal-sizes-title-lg").shouldHave(text(TestData.modalTitle));
        $(".modal-body").shouldHave(text(firstName + " " + lastName), text(email), text(TestData.gender),
                text(mobileNumber), text(TestData.dateOfBirth), text(TestData.subject), text(TestData.hobbies),
                text(TestData.picture), text(address), text(TestData.state + " " + TestData.city));
        return this;
    }
}