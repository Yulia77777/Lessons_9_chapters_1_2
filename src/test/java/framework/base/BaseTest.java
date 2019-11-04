package framework.base;

import framework.constants.Config;
import framework.constants.Constants;
import org.apache.commons.lang.StringUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.lang.reflect.Method;

public abstract class BaseTest {

    protected WebDriver driver;

    protected String getRelativePath() {
        return "/";
    }

    @BeforeMethod
    public void getAnyMethodCredentials1(Method method) {
        Constants.methodName = method.getName();
    }

    @BeforeSuite
    public void beforeSuite() {
        initDriver();
        driver.manage().window().maximize();
    }

    @BeforeClass
    public void beforeClass() {
        initDriver();
    }

    private void initDriver() {
        driver = Driver.getInstance();
        driver.get(getBaseURI());
    }

    @AfterSuite
    public void afterSuite() {
        driver.quit();
    }

    protected String getBaseURI() {
        String baseUrl = System.getProperty(Config.VM_PARAM_BASE_URL);
        if(StringUtils.isEmpty(baseUrl)) {
            baseUrl = Config.DEFAULT_BASE_URL;
        }
        return baseUrl + getRelativePath();
    }
}
