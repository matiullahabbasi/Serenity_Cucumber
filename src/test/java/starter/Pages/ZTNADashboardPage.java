package starter.Pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class ZTNADashboardPage extends PageObject {

    private  By loadingIndicator ;

   public  void loginVerified()
   {
        System.out.println(getDriver().getTitle());

       //wait condition for page loading.
        loadingIndicator =   By.xpath("//*[@id=\"en-ztna-NavCollapseItem-IAM\"]");
       waitingTime();

   }



   public void clickOnIAMButton()
   {

       WebElement shadowhost = getDriver().findElement(By.xpath("//*[@id=\"en-ztna-NavCollapseItem-IAM\"]"));
       System.out.println(shadowhost);
       SearchContext shadowRoot=shadowhost.getShadowRoot();
       System.out.println(shadowRoot);

       WebElement shadowhost1 = shadowRoot.findElement(By.cssSelector("li > button > span > en-icon-chevron-down-0-1-23 "));
       SearchContext shadowRoot1=shadowhost1.getShadowRoot();
       System.out.println(shadowRoot1);

       WebElement shadowContent=shadowRoot1.findElement(By.cssSelector("span"));
       System.out.println(shadowContent);
       shadowContent.click();
   }

   public void clickonUsergroupButton()
   {
    WebElement UsergroupButton= getDriver().findElement(By.xpath("//*[@id=\"en-ztna-NavItem-User-Groups-iam--user-groups\"]/div/en-text-passage-0-1-23 / span"));
       System.out.println(UsergroupButton);
       UsergroupButton.click();
   }


   public void clickOnCreateGroup()
   {

       loadingIndicator=By.xpath("//*[@id=\"en-ztna-UserGroups-createUserGroupButton\"]");
       waitingTime();

       WebElement shadowhost = getDriver().findElement(By.xpath("//*[@id=\"en-ztna-UserGroups-createUserGroupButton\"]"));
       System.out.println(shadowhost);
       SearchContext shadowRoot=shadowhost.getShadowRoot();
       System.out.println(shadowRoot);
       WebElement shadowcontent=shadowRoot.findElement(By.cssSelector("button"));
       System.out.println(shadowcontent);
       shadowcontent.click();
   }

   public void addgroupdetail()
   {
       WebElement shadowhost = getDriver().findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/main/div/div[2]/en-dialog-0-1-23/div/div[1]/en-text-field-0-1-23"));
       SearchContext shadowRoot=shadowhost.getShadowRoot();
       System.out.println("love"+shadowRoot);
       WebElement shadowContent=shadowRoot.findElement(By.cssSelector("div > div > input "));
//       WebElement shad=shadowRoot.findElement(By.class(" ./en-c-text-field__input "));
       System.out.println(shadowContent);
       shadowContent.sendKeys("Pakistan is our HomeLand");

   }

   public void clickCreate()
   {
       WebElement shadowhost=getDriver().findElement(By.xpath("//*[@id=\"en-ztna-modal-saveButton\"]"));
       SearchContext shadowRoot=shadowhost.getShadowRoot();
       System.out.println(shadowRoot);
       WebElement shadowContex=shadowRoot.findElement(By.cssSelector("button"));
       shadowContex.click();
   }

   private void waitingTime()
   {
       System.out.println(loadingIndicator);
       FluentWait wait = new FluentWait(getDriver()).withTimeout(Duration.ofSeconds(3000)).pollingEvery(Duration.ofSeconds(1000)).ignoring(NoSuchElementException.class);
       wait.until(ExpectedConditions.visibilityOf(getDriver().findElement(loadingIndicator)));
       System.out.println("Wait is over");
   }

}


