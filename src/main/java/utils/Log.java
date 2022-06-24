package utils;

import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.testng.Reporter;
import utils.reportconfig.ExtentTestManager;

public class Log {

    // Initialize Log4j instance
    private static Logger Log = Logger.getLogger(Log.class.getName());

    // Info Level Logs but doesn't log to cucumber report
    public static void info(String message) {
        Reporter.log(message + "<p>");
        Log.info(message);
    }

    // Warn Level Logs
    public static void warn(String message) {
        Log.warn(message);
    }

    // Error Level Logs
    public static void error(String message) {
        Log.error(message);
    }

    // Fatal Level Logs
    public static void fatal(String message) {
        Log.fatal(message);
    }

    // Debug Level Logs
    public static void debug(String message) {
        Log.debug(message);
    }

    public static void reportLog(String message) {
        ExtentTestManager.getTest().log(LogStatus.INFO, message);//For extentTest HTML report
        Log.info("Message: " + message);
        Reporter.log(message);
    }
}

