package com.example.testing1;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.chrome.ChromeOptions;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MainPageTest {
    // 1) Atsidaryti tinklapį https://demowebshop.tricentis.com/
    // 2) Spausti 'Gift Cards' kairiajame meniu
    // 3) Pasirinkti prekę, kurios kaina didesnė nei 99. (reikia neįhardkodinti pasirenkamos prekės)
    // 4) Supildyti laukus 'Recipient's Name:' ir 'Your Name:' savo nuožiūra
    // 5) Į testinį lauką 'Qty' įvesti '5000'
    // 6) Spausti 'Add to cart' mygtuką
    //  Laukite, kol prekė pridedama į krepšelį
    // 7) Spausti 'Add to wish list' mygtuką
    //  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    // 8) Spausti 'Jewelry' kairiajame meniu
    // 9) Spausti 'Create Your Own Jewelry' nuorodą
    // 10) Pasirinkti reikšmes: 'Material' - 'Silver 1mm', 'Length in cm'- '80', 'Pendant'- 'Star'
    // 11) Į testinį lauką 'Qty' įvesti '26'
    // 12) Spausti 'Add to cart' mygtuką
    // šito reikėjo, nes kažkaip kitaip nespėja į wishlist pridėt, gal dėstytojas kitaip padarys
    // Laukite, kol prekė pridedama į krepšelį
    // 13) Spausti 'Add to wish list' mygtuką
    // 14) Spausti nuorodą 'Wishlist' puslapio viršuje
    // 15) Abejom prek4m paspausti Add to cart'varneles
    // 16) Spausti Ádd to cart'mygtuką
    // 17) Atsiradus Shopping cart puslapyje patvirtinti, kad 'Sub-Total'reišmė yra '1002600.00'
//    MainPage mainPage = new MainPage();
//
//    @BeforeAll
//    public static void setUpAll() {
//        Configuration.browserSize = "1280x800";
//        SelenideLogger.addListener("allure", new AllureSelenide());
//    }
//
//    @BeforeEach
//    public void setUp() {
//        // Fix the issue https://github.com/SeleniumHQ/selenium/issues/11750
//        Configuration.browserCapabilities = new ChromeOptions().addArguments("--remote-allow-origins=*");
//        open("https://www.google.com/");
//    }
//
//    @Test
//    public void search() {
//        mainPage.searchButton.click();
//
//        $("[data-test='search-input']").sendKeys("Selenium");
//        $("button[data-test='full-search-button']").click();
//
//        $("input[data-test='search-input']").shouldHave(attribute("value", "Selenium"));
//    }
//
//    @Test
//    public void toolsMenu() {
//        mainPage.toolsMenu.click();
//
//        $("div[data-test='main-submenu']").shouldBe(visible);
//    }
//
//    @Test
//    public void navigationToAllTools() {
//        mainPage.seeDeveloperToolsButton.click();
//        mainPage.findYourToolsButton.click();
//
//        $("#products-page").shouldBe(visible);
//
//        assertEquals("All Developer Tools and Products by JetBrains", Selenide.title());
//    }
}
