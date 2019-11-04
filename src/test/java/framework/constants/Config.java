package framework.constants;

import org.openqa.selenium.remote.DesiredCapabilities;

public class Config {
    public static final String VM_PARAM_BASE_URL        = "baseUrl";
    public static final String DEFAULT_BASE_URL = "http://automationpractice.com";

    public static final DesiredCapabilities IE_CAPABILITY = DesiredCapabilities.internetExplorer();
    public static final DesiredCapabilities CHROME_CAPABILITY = DesiredCapabilities.chrome();
    public static final DesiredCapabilities WEB_DRIVER_CAPABILITIES = Boolean.getBoolean(System.getProperty("ie"))?IE_CAPABILITY:CHROME_CAPABILITY;
}
