package com.ocarlsen.test.example.log4j2;

import com.ocarlsen.test.example.source.LoggingClass;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * A class that uses a private <b>static</b> final {@link Logger}.
 */
public class MyStaticLoggingClass implements LoggingClass {

    public static void main(String[] args) {
        new MyStaticLoggingClass().loggingMethod();
        new MyStaticLoggingClass().loggingMethodWithException(new RuntimeException("yay"));
    }

    private static final Logger LOGGER = LogManager.getLogger(MyStaticLoggingClass.class);

    /**
     * <p>This method tests a few {@link Logger} methods.</p>
     */
    public void loggingMethod() {
        LOGGER.trace("this is a trace message");
        LOGGER.debug("this is a debug message");
        LOGGER.info("this is an info message");
        LOGGER.warn("this is a warn message");
        LOGGER.error("this is an error message");
    }

    /**
     * <p>This method tests a few {@link Logger} methods with an Exception argument.</p>
     */
    public void loggingMethodWithException(Exception ex) {
        LOGGER.trace("this is a trace message", ex);
        LOGGER.debug("this is a debug message", ex);
        LOGGER.info("this is an info message", ex);
        LOGGER.warn("this is a warn message", ex);
        LOGGER.error("this is an error message", ex);
    }
}
