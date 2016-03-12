package com.gmail.gregrockss;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	public void onEnable(){
		getServer().getPluginManager().registerEvents(new FenrirListener(), this);
	}
}