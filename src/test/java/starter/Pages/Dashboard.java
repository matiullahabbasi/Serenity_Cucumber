package starter.Pages;

import net.serenitybdd.annotations.Step;

public class Dashboard {

    ZTNADashboardPage dashboard;

    @Step
    public void verifyAdmin()
    {
        dashboard.loginVerified();
    }

    @Step
    public void clickonIAM()
    {
        dashboard.clickOnIAMButton();

    }
    @Step
    public void clickonUsergroup()
    {
        dashboard.clickonUsergroupButton();
    }

    @Step
    public void CreateUserGroup()
    {
        dashboard.clickOnCreateGroup();
    }

    @Step
    public void InsertGroupDetail()
    {
        dashboard.addgroupdetail();
    }

    @Step
    public void create()
    {
        dashboard.clickCreate();
    }
}
