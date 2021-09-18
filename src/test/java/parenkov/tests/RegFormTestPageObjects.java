package parenkov.tests;

import org.junit.jupiter.api.Test;
import parenkov.pages.RegFormPage;
import static parenkov.tests.TestData.*;


public class RegFormTestPageObjects extends TestBase{

    RegFormPage regFormPage = new RegFormPage();

    @Test
    void FillRegFormTest() {

        regFormPage.openPage();

        regFormPage.typeFirstName(firstName)
                    .typeLastName(lastName)
                    .typeEmail(email)
                    .selectGender(gender)
                    .typeMobileNumber(mobileNumber)
                    .typeSubject(subject)
                    .selectHobbies(hobbies);
        regFormPage.picture.uploadPicture(picturePath);
        regFormPage.calendar.setDateOfBirth(day, month, year);

        regFormPage.scrollPage();

        regFormPage.typeCurrentAddress(address)
                    .stateAndCity.selectStateAndCity(state, city);
        regFormPage.clickSubmit();

        regFormPage.modalWindow.checkModalWindow(modalTitle, studentName, email, gender, mobileNumber,
                dateOfBirth, subject, hobbies, picture, address, stateCity);
    }
}
