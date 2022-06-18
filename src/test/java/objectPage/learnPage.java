package objectPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class learnPage {

    private static WebElement element = null;


    private static By searchInputForm = By.className("elementor-search-form__input");
    private static By searchButton       = By.className("elementor-search-form__submit");
    private static By postTitle       = By.className("elementor-post__title");
    private static By postContainer       = By.xpath("/html/body/div[1]/div/section[3]/div/div/div/div/div/div/div/div[1]");
    private static By postArticle       = By.xpath("/html/body/div[1]/div/section[3]/div/div/div/div/div/div/div/div[1]/article[1]");
    private static By learnPageTitle       = By.xpath("/html/body/div[1]/div/div/section[2]/div/div/div/div/div/div/div/div/div/div/section/div/div/div[1]/div/div/div[2]/div/h1");
    
    public static WebElement searchInputForm(WebDriver driver) {

        element = driver.findElement(searchInputForm);
        return element;
    }


    public static WebElement searchButton(WebDriver driver) {

        element = driver.findElement(searchButton);
        return element;
    }

    public static WebElement postTitle(WebDriver driver) {

        element = driver.findElement(postTitle);
        return element;
    }

    public static WebElement postContainer(WebDriver driver) {

        element = driver.findElement(postContainer);
        return element;
    }

    public static WebElement postArticle(WebDriver driver) {

        element = driver.findElement(postArticle);
        return element;
    }

    public static WebElement learnPageTitle(WebDriver driver) {

        element = driver.findElement(learnPageTitle);
        return element;
    }

}
