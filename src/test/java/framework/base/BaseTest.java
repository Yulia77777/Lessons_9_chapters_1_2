package framework.base;

import framework.constants.Config;
import org.apache.commons.lang.StringUtils;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    private static WebDriver driver;

    private static String getRelativePath() {
        return "/";
    }

    @BeforeClass
    public static void beforeClass() {
        initDriver();
    }

    private static void initDriver() {
        driver = Driver.getInstance();
        driver.get(getBaseURI());
    }

    @AfterClass
    public static void closeBrowser() {
        driver.quit();
        Driver.setToNull();
    }

    private static String getBaseURI() {
        String baseUrl = System.getProperty(Config.VM_PARAM_BASE_URL);
        if(StringUtils.isEmpty(baseUrl)) {
            baseUrl = Config.DEFAULT_BASE_URL;
        }
        return baseUrl + getRelativePath();
    }

    @Before
    public void openBrowser() {
        initDriver();
        driver.manage().window().maximize();
    }
}
