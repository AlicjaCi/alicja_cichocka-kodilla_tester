package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class StoreSearchPom extends AbstractPom{
    @FindBy(css = "input#searchField")
    WebElement searchField;

    @FindBy(css = "#elements-wrapper")
    List<WebElement> searchResults;

    public StoreSearchPom(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void search(String query) {
        searchField.clear();
        searchField.sendKeys(query);
    }

    public List<WebElement> getSearchResults() {
        return searchResults;
    }
    public boolean containsAllTextsInResults(List<String> expectedTexts) {
        List<String> resultTexts = searchResults.stream()
                .map(WebElement::getText)
                .toList();

        for (String expectedText : expectedTexts) {
            if (resultTexts.stream().noneMatch(result -> result.contains(expectedText))) {
                return false;
            }
        }
        return true;
    }
}
