package Config;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public interface ConfigProvider {
    Config config = readConfig();

    static Config readConfig() {
        return ConfigFactory.systemProperties().hasPath("testProfile")
                ? ConfigFactory.load(ConfigFactory.systemProperties().getString("testProfile"))
                : ConfigFactory.load("config.properties");
    }

    String URL = readConfig().getString("url");
    String PASSWORD = readConfig().getString("password");
    String LOGIN = readConfig().getString("login");

}
