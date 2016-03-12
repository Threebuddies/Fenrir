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
			if (player.isOp()) {
				if(evt.getPlayer().getInventory().getItemInMainHand().getType() == Material.BLAZE_ROD){
					evt.getPlayer().getWorld().createExplosion(evt.getPlayer().getTargetBlock((Set<Material>)null, 20).getLocation(), 7, true);
				}
				if(evt.getPlayer().getInventory().getItemInMainHand().getType() == Material.NETHER_STAR){
					evt.getPlayer().getWorld().strikeLightning(evt.getPlayer().getTargetBlock((Set<Material>)null, 50).getLocation());
				}
				if(evt.getPlayer().getInventory().getItemInMainHand().getType() == Material.STICK){
					evt.getPlayer().getWorld().spawnEntity(evt.getPlayer().getTargetBlock((Set<Material>)null, 15).getLocation(), EntityType.ZOMBIE);
				}
				if(evt.getPlayer().getInventory().getItemInMainHand().getType() == Material.GHAST_TEAR){
					evt.getPlayer().getWorld().spawnEntity(evt.getPlayer().getTargetBlock((Set<Material>)null, 15).getLocation(), EntityType.GHAST);
				}
			}
		}
	}
}