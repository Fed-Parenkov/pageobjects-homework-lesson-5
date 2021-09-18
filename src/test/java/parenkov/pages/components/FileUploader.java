package parenkov.pages.components;

import static com.codeborne.selenide.Selenide.$;

public class FileUploader {
    public void uploadPicture(String value) {
        $("#uploadPicture").uploadFromClasspath(value);
    }
}
