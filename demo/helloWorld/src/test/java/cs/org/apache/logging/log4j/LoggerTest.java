package cs.org.apache.logging.log4j;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import sun.rmi.runtime.Log;

import static junit.framework.Assert.assertEquals;

public class LoggerTest {
    @Test
    public void test() {
        //Logger getLogger(param)，当param相同时候，获取的Logger是同一个
        assertEquals(rootLogger, rootLogger2);
    }
    @Test
    public void infoTest() {
        helloWorldLogger.info("hello ,lucia");
        helloWorldLogger.info("hello ,lifu");
    }

    /**
     * 与formatterLogger.logger()等效
     */
    @Test
    public void printfTest() {
        defaultLogger.printf(Level.INFO,"hello %s,age is %s","lucia",20);
    }

    //-------------for test----------------------------
    private static final Logger rootLogger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
    private static final Logger rootLogger2 = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
    private static final Logger defaultLogger = LogManager.getLogger();
    private static final Logger helloWorldLogger = LogManager.getLogger("helloWorld");

}
