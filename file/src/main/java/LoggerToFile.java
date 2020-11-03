import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerToFile {
    private static final Logger logger
            =  LoggerFactory.getLogger(LoggerToFile.class);

    public static void main(String[] args) {
        logger.info("Example log from {}", LoggerToFile.class.getSimpleName());

        Integer dividend = 100;
        Integer divisor = 0;

        logger.warn("The divisor must be a nonzero number.");

        try {
            logger.debug("Going to divide {} by {}", dividend, divisor);
            int quotient = dividend/divisor;
        } catch (Exception e) {
            logger.error("Error dividing {} by {} ", dividend, divisor, e);
        }

    }
}
