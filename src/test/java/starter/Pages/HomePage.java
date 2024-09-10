package starter.Pages;

import net.serenitybdd.annotations.Step;

public class HomePage {



    ZTNAHomePage homepage;

    @Step
    public void OpenApplication()
    {
      homepage.open();
    }


    @Step
    public void enterUsername()
    {
    homepage.enterUname();
    }

    @Step
    public void enterPassword()
    {
      homepage.enterPassword();
    }

    @Step
    public void clickOnLoginButton()
    {
     homepage.clickLogin();
    }

    @Step
    public void SwitchToZTNAPage()
    {
        homepage.switchtoztna();

    }


}
