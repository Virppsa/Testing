package com.example.testing2;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.support.ui.ExpectedConditions;




// page_url = https://www.jetbrains.com/
public class MainPage {
    public static void main(String[] args) throws InterruptedException {
        //Pirma užduotis -----------------------------------------------------------------------------------------------------------------------------------------------------------
//        ChromeDriver driver = new ChromeDriver();
//
//        //1. Atsidaryti https://demoqa.com/
//        driver.get("https://demoqa.com/");
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //jei dauiau nei 5 s laukia jis nuluš
//
//        //1. Sutikti su policy
//        driver.findElement(By.className("fc-cta-consent")).click();
//        //2. Pasirinkti "Widgets" kortele
//        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[4]")).click();
//
//        //3. Pasirinkti meniu punkta" "Progress Bar"
//        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[4]/div/ul/li[5]")).click();
//
//        //4. Spausti mystuka "Start"
//        driver.findElement(By.id("startStopButton")).click();
//
//        //5. Sulaukti kol bus 100% ir paspausti "Reset"
//        Thread.sleep(20000);
//        driver.findElement(By.id("resetButton")).click();

        //6. Isitikinti, kad progreso eiluté tuščia (0%).
//        WebElement resetBarVal = driver.findElement(By.id("progressBar"));
//
//
//        WebElement subtotalElement = driver.findElement(By.xpath("//span[contains(@class, 'order-total')]/strong"));
//        String subtotalText = subtotalElement.getText();
//        String expectedSubtotal = "1002600.00";
//
//        String subtotalNumeric = subtotalText.replaceAll("[^0-9.]", "");
//
//        if (expectedSubtotal.equals(subtotalNumeric)) {
//            System.out.println("Subtotal is correct: " + subtotalNumeric);
//        } else {
//            System.out.println("Subtotal is not correct. Expected: " + expectedSubtotal + ", but got: " + subtotalNumeric);
//        }


        //System.setProperty("webdriver.chrome.driver","C:\\3_kursas\\6_semestras\\PS_Testavimas\\chromedriver.exe");
////--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//        ChromeDriver driver = new ChromeDriver();
//
////        Užduotis 1:
////
////        1. Atsidaryti https://demoqa.com/
//        driver.get("https://demoqa.com/");
//        driver.manage().window().maximize();
//
////        2. Uždaryti Cookies sutikimo langą.
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
////        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='fc-button-label' and text()='Consent']"))).click(); //dabar nebėra kažkodėl
//
////        3. Pasirinkti "Widgets" kortelę
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[./div/h5[(text()='Widgets')]]"))).click();
//
////        4. Pasirinkti meniu punktą "Progress Bar"
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Progress Bar']"))).click();
//
////        5. Spausti mygtuką "Start"
//        driver.findElement(By.id("startStopButton")).click();
//
////        6. Sulaukti kol bus 100% ir paspausti "Reset"
//        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@role='progressbar']"), "100%"));
//        driver.findElement(By.id("resetButton")).click();
//
////        7. Įsitikinti, kad progreso eilutė tuščia (0%).
//        WebElement progressBar = driver.findElement(By.xpath("//div[@role='progressbar']"));
//        String progressBarValue = progressBar.getText();
//        Assertions.assertEquals("0%", progressBarValue);
//        Thread.sleep(1000);
//        driver.quit();


////        Užduotis 2: ------------------------------------------------------------------------------------------------------------------------------------
//        //1. Atsidaryti https: //demoqa.com/
//        ChromeDriver driver = new ChromeDriver();
//        driver.get("https://demoqa.com/");
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
////        driver.findElement(By.className("fc-cta-consent")).click();
        ////        WebElement consentButton2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='fc-button-label' and text()='Consent']"))).click();
//     //   consentButton2.click();
//
//        //2. Pasirinkti "Elements" kortele
//        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]")).click();
//
//        //3. Pasirinkti meniu punkta "Web Tables"
//        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[1]/div/ul/li[4]")).click();
//
//        //4. Pridéti pakankamai elementų, kad atsirastų antras puslapis puslapiavime

        // Use JavascriptExecutor to scroll to the element
        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", buttonNext);
        // Adding a wait to ensure the page has been scrolled to the element
//
//        int i = 0; // Initialize counter outside the loop
//        do {
//            i++; // Increment the counter inside the loop
//            driver.findElement(By.id("addNewRecordButton")).click();
//
//            driver.findElement(By.id("firstName")).sendKeys("SMTH");
//            driver.findElement(By.id("lastName")).sendKeys("SMTH");
//            driver.findElement(By.id("userEmail")).sendKeys("SMTH@gmail.com");
//            driver.findElement(By.id("age")).sendKeys("20");
//            driver.findElement(By.id("salary")).sendKeys("1000");
//            driver.findElement(By.id("department")).sendKeys("HR");
//
//            driver.findElement(By.id("submit")).click();
//            // Wait for the form submission to be processed
//            Thread.sleep(900); // This is just an example. It's better to use explicit waits.
//        } while(i < 10);
//
//        //5. Pasirinkti antra puslapi paspaudus "Next"
//        driver.executeScript("window.scrollBy(0,250)", "");
//
//        Thread.sleep(900);
//        driver.findElement(By.className("next")).click();
//
//        //6. Istrinti elementa antrajame puslapyje
//        //7. Isitikinti, automatiskai puslapiavimas atsirastu antras puslapis pus Lapiavime perkelamas 4 pirmadi puslapt in kad puslapiu skaicius
//
//
//        //driver.quit(); //reik pasidaryti, kad pakečintu irf smth is shit

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////2 UŽDUOTĖLĖ 3 UŽDUOTIES
        //1. Atsidaryti https://demoqa.com/
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();

//        2. Uždaryti Cookies sutikimo langą.
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        //driver.findElement(By.className("fc-cta-consent")).click();

//        3. Pasirinkti "Elements" kortelę,
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[./div/h5[(text()='Elements')]]"))).click();

//        4. Pasirinkti meniu punktą "Web Tables"
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Web Tables']"))).click();

//        5. Pridėti pakankamai elementų, kad atsirastų antras puslapis puslapiavime
        while (!checkForSecondPage(driver)) {
            addEntry(driver, wait); //pridedame mūsų entry prie kol bus second page
        }

//        6. Pasirinkti antrą puslapį paspaudus "Next"
        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", By.xpath("//button[text()='Next']"));
        driver.findElement(By.xpath("//button[text()='Next']")).click();
        Thread.sleep(1000);

//        7. Ištrinti elementą antrajame puslapyje
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@title='Delete']"))).click();

//        8. Įsitikinti, kad automatiškai puslapiavimas perkeliamas į pirmąjį puslapį ir kad puslapių skačius sumažėjo ligi vieno.
        WebElement pageNumber = driver.findElement(By.xpath("//input[@aria-label='jump to page']"));
        Assertions.assertEquals("Pagination did not update to one page.", "1", pageNumber.getAttribute("value").toString());
        Thread.sleep(1000);
        driver.quit();
    }
    private static boolean checkForSecondPage(ChromeDriver driver) {
        By nextPageLocator = By.xpath("//button[text()='Next']");
        List<WebElement> nextPageElements = driver.findElements(nextPageLocator); // Prašome, kad grąžintų visus elementus lokatorius, jei nėra, tai empty listą

        // Ar displayed ir enabled elementas - kas yra, kad jis paspaudžiamas
        if (!nextPageElements.isEmpty()) {
            WebElement nextPageButton = nextPageElements.get(0);
            return nextPageButton.isDisplayed() && nextPageButton.isEnabled();
        }
        return false;
    }

    private static void addEntry(ChromeDriver driver, WebDriverWait wait) {
        driver.findElement(By.id("addNewRecordButton")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstName"))).sendKeys("Vardenis");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("lastName"))).sendKeys("Pavardenis");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userEmail"))).sendKeys("vardenis.pavardenise@gmail.com");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("age"))).sendKeys("44");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("salary"))).sendKeys("2000");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("department"))).sendKeys("Darbuojas");

        driver.findElement(By.id("submit")).click();
    }

        //driver.quit();
    }

