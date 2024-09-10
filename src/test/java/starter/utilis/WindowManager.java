package starter.utilis;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class WindowManager  {


    WebDriver driver;
    private WebDriver.Navigation navigate;

    public WindowManager (WebDriver driver)
    {
        this.driver=driver;
        navigate = driver.navigate();
    }

    public void goBack()
    {
        navigate.back();
    }

    public void goForward()
    {
        navigate.forward();
    }
    public void refreshPage()
    {
        navigate.refresh();
    }
    public void goTo(String url)
    {
        navigate.to(url);
    }

    public void switchToTab(String tabTitle) {
        // Get the current window handle
        String currentWindow = driver.getWindowHandle();

        // Open a new tab using JavaScript
        ((JavascriptExecutor) driver).executeScript("window.open();");

        // Get all window handles
        java.util.Set<String> windows = driver.getWindowHandles();
        System.out.println("Number of tabs: " + windows.size());

        for (String window : windows) {
            if (!window.equals(currentWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }
        // Navigate to Google in the new tab
        driver.get("https://www.google.com");

    }




}
