import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.io.File;

public class SauceDemoTest {

    @Test
    public void SauceDemo() throws InterruptedException {

        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("drivers/chromedriver.exe").getFile());
        String absPath = file.getAbsolutePath();
        System.setProperty("webdriver.chrome.driver", absPath);

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        //id
        WebElement loginInput = driver.findElement(By.id("user-name"));
        loginInput.sendKeys("standard_user");
        Thread.sleep(1000);

        //name
        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.sendKeys("secret_sauce");
        Thread.sleep(1000);

        //classname
        WebElement loginClick = driver.findElement(By.className("submit-button"));
        loginClick.click();
        Thread.sleep(1000);

        //tagname
        WebElement sortButton = driver.findElement(By.tagName("select"));
        Select sortItems = new Select(sortButton);
        sortItems.selectByValue("lohi");
        Thread.sleep(1000);

        //xpath attribute - add to the cart
        WebElement sauceLabsOnesieAdd = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']"));
        sauceLabsOnesieAdd.click();
        Thread.sleep(2000);

        //xpath text - see the whole item
        WebElement sauceLabsBoltWatch = driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
        sauceLabsBoltWatch.click();
        Thread.sleep(2000);

        //xpath partial attribute
        WebElement backToItemsButton = driver.findElement(By.xpath("//img[contains(@class,'back')]"));
        backToItemsButton.click();
        Thread.sleep(2000);

        //xpath partial text
        WebElement allTheThingsWatch = driver.findElement(By.xpath("//a/div[contains(text(),'allTheThings')]"));
        allTheThingsWatch.click();
        Thread.sleep(2000);

        // and condition
        WebElement andBackButton = driver.findElement(By.xpath("//*[@class ='back-image' and @alt ='Go back']"));
        andBackButton.click();
        Thread.sleep(2000);

        //cssSelector - tag
        WebElement selectList = driver.findElement(By.cssSelector("select"));
        selectList.click();
        Thread.sleep(2000);

        //ancestor
        WebElement ancestorListElement = driver.findElement(By.xpath("//*[.='Name (A to Z)']/ancestor::span/select/option[@value='za']"));
        ancestorListElement.click();
        Thread.sleep(2000);

        //parent
        WebElement parentListElement = driver.findElement(By.xpath("//*[.='Price (high to low)']/../option[@value='lohi']"));
        parentListElement.click();
        Thread.sleep(2000);

        //descendant
        WebElement addBackpack = driver.findElement(By.xpath("//*[@class='inventory_container']/descendant::button[@name ='add-to-cart-sauce-labs-backpack']"));
        addBackpack.click();
        Thread.sleep(2000);

        //following
        WebElement shoppingCart = driver.findElement(By.xpath("//*[@class='header_label']/following::div[@class ='shopping_cart_container']"));
        shoppingCart.click();
        Thread.sleep(2000);

        //preceding
        WebElement checkoutButton = driver.findElement(By.xpath("//*[@class='footer']/preceding::div/button[@id='checkout']"));
        checkoutButton.click();
        Thread.sleep(2000);

        //cssSelector - .class
        WebElement cancelCheckoutButton = driver.findElement(By.cssSelector(".cart_cancel_link"));
        cancelCheckoutButton.click();
        Thread.sleep(2000);

        //cssSelector - #id
        WebElement continueShoppingButton = driver.findElement(By.cssSelector("#continue-shopping"));
        continueShoppingButton.click();
        Thread.sleep(2000);

        //cssSelector -.class1 .class2
        WebElement selectMenu = driver.findElement(By.cssSelector(".primary_header .bm-burger-button"));
        selectMenu.click();
        Thread.sleep(2000);

        //cssSelector [attribute*=value]
        WebElement allItems = driver.findElement(By.cssSelector("[id*='inventory_sidebar']"));
        allItems.click();
        Thread.sleep(2000);

        //cssSelector [attribute$ = value]
        WebElement closeCross = driver.findElement((By.cssSelector("[id$=cross-btn]")));
        closeCross.click();
        Thread.sleep(2000);

        //cssSelector [attribute^=value]
        WebElement fleeceJacketWatch = driver.findElement((By.cssSelector("[id^='item_5_img']")));
        fleeceJacketWatch.click();
        Thread.sleep(2000);

        //cssSelector [attribute|=value]
        WebElement fleeceJacketWatchAdd = driver.findElement((By.cssSelector("[id|='add']")));
        fleeceJacketWatchAdd.click();
        Thread.sleep(2000);

        //cssSelector [attribute~=value]
        WebElement backToProducts = driver.findElement((By.cssSelector("[class ~='back']")));
        backToProducts.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        //cssSelector [attribute=value]
        WebElement shopCartButton = driver.findElement((By.cssSelector("[class ='shopping_cart_link']")));
        shopCartButton.click();
        Thread.sleep(2000);

        //cssSelector tagname.class
        WebElement checkout_button = driver.findElement((By.cssSelector("button.checkout_button")));
        checkout_button.click();
        Thread.sleep(2000);

        //cssSelector .class1.class1
        WebElement firstNameInput = driver.findElement((By.cssSelector(".input_error.form_input[id='first-name']")));
        firstNameInput.sendKeys("Anna");
        Thread.sleep(2000);

        //cssSelector .class1 .class2
        WebElement lastNameInput = driver.findElement((By.cssSelector(".form_group .form_input[id='last-name']")));
        lastNameInput.sendKeys("Grabovskaya");
        Thread.sleep(2000);

        //cssSelector .class1.class1
        WebElement postalCodeInput = driver.findElement((By.cssSelector(".input_error.form_input[id='postal-code']")));
        postalCodeInput.sendKeys("00000");
        Thread.sleep(2000);

        //by id
        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        WebElement finishButton = driver.findElement(By.id("finish"));
        finishButton.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        //by link text - linkedin
        WebElement linkedInReference = driver.findElement(By.linkText("LinkedIn"));
        linkedInReference.click();
        Thread.sleep(2000);

        //by partial link text - twitter
        WebElement twitterReference = driver.findElement(By.partialLinkText("Twit"));
        twitterReference.click();
        Thread.sleep(2000);

        driver.quit();
    }
}
