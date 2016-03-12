package com.gmail.gregrockss;

import java.util.Set;

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
				if(evt.getPlayer().getInventory().getItemInMainHand().getType() == Material.BLAZE_ROD){
				//maximal distance between player and explosion is 20 blocks
					evt.getPlayer().getWorld().createExplosion(evt.getPlayer().getTargetBlock((Set<Material>)null, 20).getLocation(), 7, true);
        }
				if(evt.getPlayer().getInventory().getItemInMainHand().getType() == Material.NETHER_STAR){
						//maximal distance between player and thunder is 50
					evt.getPlayer().getWorld().strikeLightning(evt.getPlayer().getTargetBlock((Set<Material>)null, 50).getLocation());
        }
				//checks if the player has a stick in his hand
				if(evt.getPlayer().getInventory().getItemInMainHand().getType() == Material.STICK){
					//spawns a zombie where the player clicked with the stick
					evt.getPlayer().getWorld().spawnEntity(evt.getPlayer().getTargetBlock((Set<Material>)null, 15).getLocation(), EntityType.ZOMBIE);
		}
				//checks if the player has a Ghast Tear in his hand
				if(evt.getPlayer().getInventory().getItemInMainHand().getType() == Material.GHAST_TEAR){
					//spawns a ghast where the player clicked with the Ghast Tear
					evt.getPlayer().getWorld().spawnEntity(evt.getPlayer().getTargetBlock((Set<Material>)null, 15).getLocation(), EntityType.GHAST);
				}
				
			}
	}
}
}