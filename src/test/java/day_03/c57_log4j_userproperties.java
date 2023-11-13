package day_03;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class c57_log4j_userproperties {
    public static void main(String[] args) {
        PropertyConfigurator.configure("log4j.properties");

        Logger logger=Logger.getLogger(c57_log4j_userproperties.class);
        logger.trace("bu bir trace mesajidir");//trace
        logger.debug("bu bir debug mesajidir");//debug
        logger.info("bu bir info mesajidir");//info
        logger.warn("bu bir warn mesajidir");//warn
        logger.error("bu bir error mesajidir");//error
        logger.fatal("bu bir fatal mesajidir");//fatal

    }
}
