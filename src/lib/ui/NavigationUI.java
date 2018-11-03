package lib.ui;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
public class NavigationUI extends MainPageObject {
    private static final String
            //MY_LISTS_LINK = "//android.widget.ImageButton[@content-desc='Navigate up']";
            MY_LISTS_LINK = "//android.widget.FrameLayout[@content-desc='My lists']";
    public NavigationUI(AppiumDriver driver)
    {
        super(driver);
    }
    public void clickMyLists()
    {
        this.waitForElementPresent(
                By.id("org.wikipedia:id/fragment_main_nav_tab_layout"),
                "Cannot load tab with my lists",
                60
        );
        this.waitForElementAndClick(
                By.xpath(MY_LISTS_LINK),
                "Cannot find my lists link",
                60
        );
    }
}
