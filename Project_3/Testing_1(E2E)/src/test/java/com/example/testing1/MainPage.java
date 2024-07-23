package com.example.testing1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;


// page_url = https://www.google.com/
public class MainPage {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver(); // čia greičiausiai atidaro puslapį
        //driver.manage().window().maximize(); //padidinti langą ant viso dydžio

        // 1) Atsidaryti tinklapį https://demowebshop.tricentis.com/ --------------------------------------
        driver.get("https://demowebshop.tricentis.com/");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //jei dauiau nei 5 s laukia jis nuluš

        // 2) Spausti 'Gift Cards' kairiajame meniu (bus viena ta kur už 100) --------------------------------------
        driver.findElement(By.xpath("//a[@href='/gift-cards']")).click(); //bBy.xpath - galima ieškoti su xpath mygtuko

        // 3) Pasirinkti prekę, kurios kaina didesnė nei 99. (reikia neįhardkodinti pasirenkamos prekės) --------------------------------------
//        List<WebElement> giftItems = driver.findElements(By.xpath("//h2[@class='product-title']/a"));
//        for(WebElement item : giftItems) {
//            String linkText = item.getText();
//            String priceText = linkText.replaceAll("[^0-9.]", ""); //extractinam price iš link text
//            double price = Double.parseDouble(priceText);
//            if (price > 99) {
//                item.click();
//                break;
//            }
//        }

        //driver.findElement(By.xpath("(//*[@class=\"price actual-price\"])[. > 99.0][1]/presceding::div[@class='picture")[1]).click();
        driver.findElement(By.xpath("//span[text()>99]/following::input")).click();


        // 4) Supildyti laukus 'Recipient's Name:' ir 'Your Name:' savo nuožiūra--------------------------------------

        //Vardas gavėjo
        driver.findElement(By.id("giftcard_4_RecipientName")).sendKeys("Recipient Name");
        //Vardas siuntėjo
        driver.findElement(By.id("giftcard_4_SenderName")).sendKeys("Sender Name");

        // 5) Į testinį lauką 'Qty' įvesti '5000'
        driver.findElement(By.id("addtocart_4_EnteredQuantity")).clear(); //padelytinam, nes kitaip lieka 1 priekyje :DD
        driver.findElement(By.id("addtocart_4_EnteredQuantity")).sendKeys("5000");

        // 6) Spausti 'Add to cart' mygtuką
        driver.findElement(By.id("add-to-cart-button-4")).click();

        //  Padarom palaukmą, nes neveikia kitaip:
        Thread.sleep(1000);


        // 7) Spausti 'Add to wish list' mygtuką
        driver.findElement(By.id("add-to-wishlist-button-4")).click(); //Nepaspaudžia.....


        // 8) Spausti 'Jewelry' kairiajame meniu
        WebElement jewelryLink = driver.findElement(By.linkText("Jewelry")); //mum reikia linką pakeisti
        jewelryLink.click();

        // 9) Spausti 'Create Your Own Jewelry' nuorodą
        WebElement createJewelryLink = driver.findElement(By.linkText("Create Your Own Jewelry"));
        createJewelryLink.click();

        // 10) Pasirinkti reikšmes: 'Material' - 'Silver 1mm', 'Length in cm'- '80', 'Pendant'- 'Star'

            //Material - silver 1mm
        WebElement material = driver.findElement(By.id("product_attribute_71_9_15"));
        material.sendKeys("Silver 1mm");
            //Lenth - 80
        driver.findElement((By.id("product_attribute_71_10_16"))).sendKeys("80");
            //Pendant - star
        driver.findElement(By.id("product_attribute_71_11_17_50")).click();

        // 11) Į testinį lauką 'Qty' įvesti '26'
        driver.findElement(By.id("addtocart_71_EnteredQuantity")).clear();
        driver.findElement(By.id("addtocart_71_EnteredQuantity")).sendKeys("26");

        // 12) Spausti 'Add to cart' mygtuką
        driver.findElement(By.id("add-to-cart-button-71")).click();

        Thread.sleep(1000);
        // 13) Spausti 'Add to wish list' mygtuką
        driver.findElement(By.id("add-to-wishlist-button-71")).click();

        // 14) Spausti nuorodą 'Wishlist' puslapio viršuje
        driver.findElement(By.linkText("Wishlist")).click();

        // 15) Abejom prekėm paspausti Add to cart'varneles
        //driver.findElement(("")).click(); // galvojau with values
        List<WebElement> addToCartElements = driver.findElements(By.xpath("//td[@class='add-to-cart']/input[@name='addtocart']"));

        for (WebElement element : addToCartElements) {
            element.click();
        }

        // 16) Spausti Ádd to cart'mygtuką
        driver.findElement(By.xpath("//input[@name='addtocartbutton' and @value='Add to cart']")).click();

        // 17) Atsiradus Shopping cart puslapyje patvirtinti, kad 'Sub-Total'reišmė yra '1002600.00'
        //driver.findElement(By.xpath("//span[@class='product-price']"));

        WebElement subtotalElement = driver.findElement(By.xpath("//span[contains(@class, 'order-total')]/strong"));
        String subtotalText = subtotalElement.getText();
        String expectedSubtotal = "1002600.00";

        // paimu tik skaiciukus
        String subtotalNumeric = subtotalText.replaceAll("[^0-9.]", "");

        if (expectedSubtotal.equals(subtotalNumeric)) {
            System.out.println("Subtotal is correct: " + subtotalNumeric);
        } else {
            System.out.println("Subtotal is not correct. Expected: " + expectedSubtotal + ", but got: " + subtotalNumeric);
        }
    }
}
