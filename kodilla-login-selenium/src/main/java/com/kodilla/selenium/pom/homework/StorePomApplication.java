package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class StorePomApplication {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://kodilla.com/pl/test/store");
        StoreSearchPom storeSearchPom = new StoreSearchPom(driver);
        storeSearchPom.search("NoteBook");
        List<String> expectedResults = List.of("NoteBook 4 Everyone", "NoteBook Plus");
        boolean allElementsPresent = storeSearchPom.containsAllTextsInResults(expectedResults);
        System.out.println(allElementsPresent);
        storeSearchPom.getSearchResults().forEach(result -> System.out.println(result.getText()));
        driver.close();
    }
}
