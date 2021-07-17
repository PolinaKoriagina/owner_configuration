package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${env}.properties"
})
public interface Web extends Config {

    @Key("browser")
    String browser();

    @Key("version")
    String version();

    @Key("remoteWebDriver")
    boolean remoteWebDriver();

    @DefaultValue("https://user1:1234@selenoid.autotests.cloud/wd/hub/")
    @Key("remoteUrl")
    String remoteUrl();
}