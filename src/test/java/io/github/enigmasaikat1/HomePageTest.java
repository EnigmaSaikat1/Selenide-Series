package io.github.enigmasaikat1;


import com.codeborne.selenide.*;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static org.testng.Assert.*;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
public class HomePageTest {

    @Test
    public void userCanLoginByUsername() {

        open("https://practice.expandtesting.com/");
        String url = WebDriverRunner.url();
        assertEquals(url, "https://practice.expandtesting.com/");
        String title = title();
        assertEquals(title, "Practice Test Automation WebSite");
    }

    @Test
    public void testIntarectingWithWebPageEleent() {

        open("https://practice.expandtesting.com/");
        //by ID
        assertTrue($(By.id("main-title")).isDisplayed());
        assertEquals($(By.id("main-title")).getText(), "Practice Test Automation Website for Web UI & API");
    }

    @Test
    public void testMultipleElements() {
        open("https://practice.expandtesting.com/");
        List<String> expectedList = Arrays.asList("Demos", "Tools", "Tips", "Test Cases", "API Testing", "About");
        ElementsCollection elements = $$(By.cssSelector(".nav-item"));
        elements.shouldHave(CollectionCondition.texts(expectedList));
    }

    @Test
    public void testInputDropdownAndDateField() {
        Configuration.browserSize = "1920x1080";
        open("https://practice.expandtesting.com/form-validation");
        //fill the input field of Contact Name
        //$(By.name("ContactName"));
        if($(By.name("ContactName")).isDisplayed() && !Objects.requireNonNull($(By.name("ContactName")).getDomProperty("value")).isEmpty()){
            $(By.name("ContactName")).clear();
        }
        $(By.name("ContactName")).val("Saikat Das");
        if($(By.name("contactnumber")).isDisplayed() && !Objects.requireNonNull($(By.name("contactnumber")).getDomProperty("value")).isEmpty()){
            $(By.name("ContactName")).clear();
        }
        $(By.name("contactnumber")).val("9851617612");
        $(".form-select").selectOption("cash on delivery");
        $(By.name("pickupdate")).click();
    }
}
