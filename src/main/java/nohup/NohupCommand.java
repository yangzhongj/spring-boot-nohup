package nohup;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by mibaye on 17/08/2016.
 */
public class NohupCommand {

    private static Logger logger = Logger.getLogger(NohupCommand.class.getName());

    public NohupResponse execute(NohupRequest request) {

        NohupResponse response = null;

        try {
            response = new NohupResponse();
            response.setStatus("OK");
            logger.log(Level.INFO, response.toString());
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Failed to execute nohup command !", e);
            response.setStatus("KO");
        }

        return response;
    }
}
