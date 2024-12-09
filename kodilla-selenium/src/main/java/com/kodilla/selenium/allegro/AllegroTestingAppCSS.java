package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AllegroTestingAppCSS {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement categoryChange = driver.findElement(By.cssSelector("select[aria-label='Kategoria']"));
        Select categorySelect = new Select(categoryChange);
        categorySelect.selectByVisibleText("Elektronika");

        WebElement searchField = driver.findElement(By.cssSelector("input[placeholder='czego szukasz?']"));
        searchField.sendKeys("Mavic mini");

        WebElement searchButton = driver.findElement(By.xpath("button[data-role='search-button']"));
        searchButton.submit();

        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("section>article")));

        List<WebElement> productCards = driver.findElements(By.cssSelector("section>article"));

        System.out.println("Znalezione produkty:");
        for (WebElement productCard : productCards) {
            System.out.println(productCard.getText());

        }
    }
}
