package com.gmail.gregrockss;

import org.bukkit.Bukkit;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class FenrirListener implements Listener {
	
	@EventHandler
	public void onPlayerInteractBlock(PlayerInteractEvent evt){
		for (Player player : Bukkit.getServer().getOnlinePlayers()){
			//checks if the player is an Op
			if (player.isOp()) {
				if(evt.getPlayer().getItemInHand().getTypeId() == Material.NETHER_STAR.getId()){
					//maximal distance between player and explosion is 20 blocks
					evt.getPlayer().getWorld().createExplosion(evt.getPlayer().getTargetBlock(null, 20).getLocation(), 7, true);
        }
				if(evt.getPlayer().getItemInHand().getTypeId() == Material.NETHER_STAR.getId()){
					//maximal distance between player and thunder is 50
					evt.getPlayer().getWorld().strikeLightning(evt.getPlayer().getTargetBlock(null, 50).getLocation());
        }
				//checks if the player has a stick in his hand
				if(evt.getPlayer().getItemInHand().getTypeId() == Material.STICK.getId()){
					//spawns a zombie where the player clicked with the stick
					evt.getPlayer().getWorld().spawnEntity(evt.getPlayer().getTargetBlock(null, 15).getLocation(), EntityType.ZOMBIE);
		}
				//checks if the player has a Ghast Tear in his hand
				if(evt.getPlayer().getItemInHand().getTypeId() == Material.GHAST_TEAR.getId()){
					//spawns a ghast where the player clicked with the Ghast Tear
					evt.getPlayer().getWorld().spawnEntity(evt.getPlayer().getTargetBlock(null, 30).getLocation(), EntityType.GHAST);
				}
				
			}
	}
}
}