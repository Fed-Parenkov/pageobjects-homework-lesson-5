package parenkov.tests;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import parenkov.pages.RegFormPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static parenkov.tests.TestData.*;

public class RegFormTestPageObjects extends TestBase{

    RegFormPage regFormPage = new RegFormPage();

//    Faker faker = new Faker ();
//    String firstName = faker.name().firstName(),
//            userEmail = faker.internet().emailAddress(),

    @Test
    void FillRegFormTest() {

        regFormPage.openPage();

        regFormPage.typeFirstName(firstName)
                .typeLastName(lastName)
                        .typeEmail(email)
                .selectGender();



//        $("#genterWrapper").$(byText("Male")).click();
//        $("#userNumber").setValue("9995554433");

//        regFormPage.calendar.setDateOfBirth("12", "May", "2006");
//
//
//        $("#subjectsInput").setValue("Chemistry").pressEnter();
//        $("#hobbiesWrapper").$(byText("Music")).click();
//        $("#uploadPicture").uploadFromClasspath("img/222.jpg");
//
//        // На экранах с разрешением 1600*900 и ниже проверки, идущие после заполнения поля Current Address,
//        // фейлятся из-за того, что не все элементы формы помещаются на экране + мешает рекламный блок.
//        // Поэтому сделал скролл вниз, чтобы скрытые элементы были в зоне видимости
//        $(byXpath("//*[@id='submit']")).scrollIntoView(true);
//
//        $("#currentAddress").setValue("London, Baker street, 221b");
//        $("#stateCity-wrapper").$(byText("Select State")).click();
//        $("#stateCity-wrapper").$(byText("NCR")).click();
//        $("#stateCity-wrapper").$(byText("Select City")).click();
//        $("#stateCity-wrapper").$(byText("Delhi")).click();
//        $("#submit").click();
//
//        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
//        $(".modal-body").shouldHave(text("Sherlock Holmes"));
//        $(".modal-body").shouldHave(text("holmes@gmail.com"));
//        $(".modal-body").shouldHave(text("Male"));
//        $(".modal-body").shouldHave(text("9995554433"));
//        $(".modal-body").shouldHave(text("01 May,1906"));
//        $(".modal-body").shouldHave(text("Chemistry"));
//        $(".modal-body").shouldHave(text("Music"));
//        $(".modal-body").shouldHave(text("222.jpg"));
//        $(".modal-body").shouldHave(text("London, Baker street, 221b"));
//        $(".modal-body").shouldHave(text("NCR Delhi"));
    }
}
