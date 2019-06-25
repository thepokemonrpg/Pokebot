package Classes;

import javax.security.auth.login.LoginException;

import Events.InfoEvent;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Main 
{
    public static void main( String[] args ) throws Exception {
        JDA jda = new JDABuilder("NTkyODA5ODIxNTI3MzQzMTE0.XREvNA.vkPpxL_wBgcu3rUFWsIPHKIHQbE").build();
        
        jda.addEventListener(new InfoEvent());
    }
}
