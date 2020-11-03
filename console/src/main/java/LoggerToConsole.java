import ch.qos.logback.classic.Level;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LoggerToConsole {

    private static final Logger logger
            = LoggerFactory.getLogger(LoggerToConsole.class);

    public static void main(String[] args) {
        logger.info("Example log from {}", LoggerToConsole.class.getSimpleName());

        ((ch.qos.logback.classic.Logger) logger).setLevel(Level.WARN);
        System.out.println("Set WARN level.");

        logger.error("This message is logged because ERROR > WARN.");
        logger.warn("This message is logged because WARN == WARN.");
        logger.info("This message is not logged because INFO < WARN.");
        logger.debug("This message is not logged because DEBUG < WARN.");

    }
}
