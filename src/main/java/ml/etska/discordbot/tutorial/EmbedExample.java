package ml.etska.discordbot.tutorial;

import java.awt.Color;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

/**
 *
 * @author etska
 */
public class EmbedExample extends ListenerAdapter{

    @Override
    public void onMessageReceived(MessageReceivedEvent e) {
        String[] args = e.getMessage().getContentRaw().split(" ");
        if(args[0].equalsIgnoreCase(Main.prefix + "embed")) { //Change this to your command
            TextChannel channel = e.getTextChannel();//Get text channel
            EmbedBuilder embed = new EmbedBuilder();//Get embedbuilder
            
            embed.setTitle("This is title!");//This is your title
            embed.setColor(Color.yellow);//This is your embed sidebar color!
            embed.setDescription("This is description" 
            + "\nIf you want new line you can add it!"
            + "\n\n**Or if you want bold text**");//And that is description!
            
            channel.sendMessage(embed.build()).queue();//And finally send/build the embed!
        }
        
    }
    
}
