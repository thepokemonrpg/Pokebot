package me.discordp.discordProject;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws LoginException {
        JDA jda = new JDABuilder("NTkyODA5ODIxNTI3MzQzMTE0.XREvNA.vkPpxL_wBgcu3rUFWsIPHKIHQbE").build();
    }
}
