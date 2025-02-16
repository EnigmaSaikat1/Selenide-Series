package io.github.enigmasaikat1;



import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.Test;
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
}
//practice.automationbro.com