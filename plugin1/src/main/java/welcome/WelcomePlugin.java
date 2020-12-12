package welcome;

import com.example.pf4j.IPf4jGreeting;
import org.apache.commons.lang.StringUtils;
import org.pf4j.Extension;
import org.pf4j.Plugin;
import org.pf4j.PluginWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WelcomePlugin extends Plugin {

    private static final Logger logger = LoggerFactory.getLogger(WelcomePlugin.class);

    public WelcomePlugin(PluginWrapper wrapper) {
        super(wrapper);
    }

    @Override
    public void start() {
        logger.info("WelcomePlugin.start()");
        logger.info(StringUtils.upperCase("WelcomePlugin"));
    }

    @Override
    public void stop() {
        logger.info("WelcomePlugin.stop()");
    }

    @Extension(ordinal = 3)
    public static class WelcomeGreeting implements IPf4jGreeting {
        @Override
        public void sayHello() {
            System.out.println("welcome.");
        }
    }
}
