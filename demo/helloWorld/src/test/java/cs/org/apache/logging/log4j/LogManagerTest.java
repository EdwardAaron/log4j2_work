package cs.org.apache.logging.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class LogManagerTest {
    @Test
    public void getFormatterLoggerTest(){
        Logger formatterLogger = LogManager.getFormatterLogger();
        formatterLogger.debug("hello %s","lucia");//hello lucia
    }

}
