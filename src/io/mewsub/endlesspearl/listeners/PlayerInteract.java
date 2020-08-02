package io.mewsub.boating.listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.ItemFrame;
import org.bukkit.entity.Player;

import org.bukkit.Material;

import org.bukkit.inventory.ItemStack;

import org.bukkit.inventory.meta.ItemMeta;

import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;

import org.bukkit.event.player.PlayerInteractEvent;

public class PlayerInteract implements Listener {
    
    @EventHandler
    public void onPlayerInteract( PlayerInteractEvent evt ) {
        if( evt.hasItem() ) {
        	switch( evt.getAction() ) {
        		case RIGHT_CLICK_AIR:
        		case RIGHT_CLICK_BLOCK:
        			ItemStack item = evt.getItem();
        			if( item.getType() == Material.ENDER_PEARL ) {
        				if( item.getAmount() <= 16 ) {
        					item.setAmount( 16 );
        				}
        			}
        			break;
        	}
        }
    }

}