package com.niccholaspage.Basic;

import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerListener;

public class BasicPlayerListener extends PlayerListener{
	 public static Basic plugin;
	  public BasicPlayerListener(Basic instance) {
	        plugin = instance;
	    }
	  public void onPlayerCommandPreprocess(PlayerChatEvent event) {
		  //Code and thats it
	  }
}
