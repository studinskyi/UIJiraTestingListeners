package utils;

import org.openqa.selenium.WebDriver;

public class RemoteDriverManager {
    private static final ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();

    public static WebDriver getDriver() {
        return webDriver.get();
    }

    static void setWebDriver(WebDriver driver) {
        webDriver.set(driver);
    }

    static void closeDriver() {
        webDriver.get().quit();
    }
}