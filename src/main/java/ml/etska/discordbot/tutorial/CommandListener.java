package ml.etska.discordbot.tutorial;

import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

/**
 *
 * @author etska
 */
public class CommandListener extends ListenerAdapter{

    @Override
    public void onMessageReceived(MessageReceivedEvent e) {
        String[] args = e.getMessage().getContentRaw().split(" ");
        if(args[0].equalsIgnoreCase(Main.prefix + "ping")) { //Change this to your command
            TextChannel channel = e.getTextChannel();//Get text channel
            channel.sendMessage("Pong!").queue();//Send message to channel
        }
        
    }
    
}
