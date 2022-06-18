package method;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;



public class browsersMethods {
    private basePage basePage;


    public browsersMethods(basePage basePage){
        this.basePage = basePage;
    }

    @Given("^Iam using \"([^\"]*)\" for my browser")
    public void iam_using_for_my_browser(String browser) throws Throwable {
        switch (browser) {
            case "Firefox":
                basePage.driver = new FirefoxDriver();
                //init = new initiateDriver(driver);
                break;
            case "Chrome":
                basePage.driver = new ChromeDriver();
                break;
            case "Safari":
                basePage.driver = new SafariDriver();
                break;
            case "Internet Explorer":
                basePage.driver = new InternetExplorerDriver();
                break;
            case "Opera":
                basePage.driver = new OperaDriver();
                break;
            default:
                System.out.println("Browser " + browser
                        + " is not found");
        }
    }


    @Given("^Iam on \"([^\"]*)\" Page$")
    public void iam_on_Page(String url) throws Throwable {
        //  supportController.chromeBrowser(driver, url);
        //basePage.driver.manage().window().maximize();
        basePage.driver.navigate().to(url);
    }


    @Then("^I quit the browser$")
    public void i_quit_the_browser() throws Throwable {
        // basePage.driver.close();
        basePage.driver.quit();
    }
}
