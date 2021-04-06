package ml.etska.discordbot.tutorial;

import javax.security.auth.login.LoginException;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.utils.Compression;
import net.dv8tion.jda.api.utils.cache.CacheFlag;

/**
 *
 * @author etska
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static String prefix = "!";
    
    public static String token = ""; //Insert your token here!

    public static void main(String[] args) throws LoginException {
        JDABuilder builder = JDABuilder.createDefault(token);

        // Enable the bulk delete event
        builder.setBulkDeleteSplittingEnabled(false);
        // Disable compression (not recommended)
        builder.setCompression(Compression.NONE);
        // Set activity (like "playing Something")
        builder.setActivity(Activity.watching("Discord bot tutorial by EtskaCoding"));
        
        builder.addEventListeners(new CommandListener());

        builder.build();
    }

}
