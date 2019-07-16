import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import util.Config;

import java.lang.invoke.MethodHandles;

public class App {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String[] argu) {
        LOGGER.info("START");
        Config.authInit(Config.SYSTEM_ROOT + "/config.properties");
    }
}
