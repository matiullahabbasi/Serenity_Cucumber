package starter.Pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


@DefaultUrl("https://ztna1.sso.xcloudiq.com/")
public class ZTNAHomePage extends PageObject {


    public void enterUname()
    {
        $(By.name("username")).type("zta.1@automation.com");
    }

    public  void enterPassword()
    {
        $(By.name("password")).type("Aerohive123");
    }

    public void clickLogin()
    {
        $(By.cssSelector("#loginForm > div:nth-child(3) > form > button")).click();
    }

    public void switchtoztna()
    {

        getDriver().get("https://feature-1.qa.xcloudiq.com/zta");

    }

}
