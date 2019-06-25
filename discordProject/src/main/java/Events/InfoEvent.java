package Events;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

//that's pretty much how command work with JDA.
public class InfoEvent extends ListenerAdapter{
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		String[] message = event.getMessage().getContentRaw().split(" ");
			
		if(message[0].equalsIgnoreCase("!hey")) {
				event.getChannel().sendMessage("Hey there! I am the PokeBot").queue();
		}
	}
}

