import com.codeborne.selenide.Configuration;
import config.Web;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;


public class TestGithub {
    @Test
    void openGithubTest() {
        Web config = ConfigFactory.create(Web.class, System.getProperties());
        Configuration.browser = config.browser();
        Configuration.browserVersion = config.version();
        if (config.remoteWebDriver()) {
            Configuration.remote = config.remoteUrl();
        }

        open("https://github.com/");

    }
}
