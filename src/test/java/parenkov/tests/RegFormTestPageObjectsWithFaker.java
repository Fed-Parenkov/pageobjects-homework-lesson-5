package parenkov.tests;

import org.junit.jupiter.api.Test;
import parenkov.pages.RegFormPageWithFaker;

import static parenkov.tests.TestData.*;


public class RegFormTestPageObjectsWithFaker extends TestBase{

    RegFormPageWithFaker regFormPage = new RegFormPageWithFaker();

    @Test
    void FillRegFormTest() {

        regFormPage.openPage();

        regFormPage.typeFirstName()
                    .typeLastName()
                    .typeEmail()
                    .selectGender(gender)
                    .typeMobileNumber()
                    .typeSubject(subject)
                    .selectHobbies(hobbies);
        regFormPage.picture.uploadPicture(picturePath);
        regFormPage.calendar.setDateOfBirth(day, month, year);

        regFormPage.scrollPage();

        regFormPage.typeCurrentAddress()
                    .stateAndCity.selectStateAndCity(state, city);
        regFormPage.clickSubmit();

        regFormPage.checkModalWindow();
    }
}
