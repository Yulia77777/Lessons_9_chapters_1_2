package framework.base;

import framework.constants.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.service.DriverCommandExecutor;
import org.openqa.selenium.remote.service.DriverService;

public class Driver {

    private static final String CHROME_BROWSER_NAME = "chrome";
    private static final String IE_BROWSER_NAME = "internet explorer";

    private static WebDriver driver = null;

    public static WebDriver getInstance() {
        if (driver != null) {
            return driver;
        }
        driver = create();
        return driver;
    }

    private static WebDriver create() {
        WebDriver result = new RemoteWebDriver(getCommandExecutorForBrowser(Config.WEB_DRIVER_CAPABILITIES), Config.WEB_DRIVER_CAPABILITIES);
        return result;
    }

    private static CommandExecutor getCommandExecutorForBrowser(DesiredCapabilities capabilities) throws IllegalArgumentException{
        DriverService service;
        if(capabilities==null)
            throw new IllegalArgumentException("The provided capability is null.");
        if(capabilities.getBrowserName().equals(CHROME_BROWSER_NAME)){
            service = ChromeDriverService.createDefaultService();
        } else if(capabilities.getBrowserName().equals(IE_BROWSER_NAME)){
            service = InternetExplorerDriverService.createDefaultService();
        } else {
            throw new IllegalArgumentException("The browser capability is invalid: " + capabilities.getBrowserName());
        }
        return new DriverCommandExecutor(service);
    }
}
