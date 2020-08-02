package io.mewsub.boating.listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.ItemFrame;
import org.bukkit.entity.Player;

import org.bukkit.Material;

import org.bukkit.inventory.ItemStack;

import org.bukkit.inventory.meta.ItemMeta;

import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;

import org.bukkit.event.player.PlayerTeleportEvent;

public class PlayerTeleport implements Listener {
    
    @EventHandler
    public void onPlayerTeleport( PlayerTeleportEvent evt ) {
        switch( evt.getCause() ) {
            case ENDER_PEARL:
                evt.setCancelled( true );
                evt.getPlayer().teleport( evt.getTo() );
                break;
        }
    }

}