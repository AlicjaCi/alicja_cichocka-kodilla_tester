package com.kodilla.selenium.pom.homework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StoreSearchPomTest {

    private StoreSearchPom storeSearchPom;
    private WebDriver driver;


    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://kodilla.com/pl/test/store");
        storeSearchPom = new StoreSearchPom(driver);
    }

    @Test
    public void testSearchResultsContainMultipleElements() {
        String query = "NoteBook";
        List<String> expectedTexts = List.of("NoteBook 4 Everyone", "NoteBook Plus");

        storeSearchPom.search(query);

        boolean allElementsPresent = storeSearchPom.containsAllTextsInResults(expectedTexts);
        assertTrue(allElementsPresent);
    }

    @Test
    public void testSearchResultsNotSuchElements() {
        String query = "element";
        List<String> expectedTexts = List.of();

        storeSearchPom.search(query);

        boolean allElementsPresent = storeSearchPom.containsAllTextsInResults(expectedTexts);
        assertTrue(allElementsPresent);
    }

    @AfterEach
    public void testDown() {
        driver.close();
    }
}
