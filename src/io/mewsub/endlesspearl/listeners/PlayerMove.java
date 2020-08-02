package io.mewsub.boating.listeners;

import java.lang.Math;

import org.bukkit.entity.Entity;
import org.bukkit.entity.ItemFrame;
import org.bukkit.entity.Player;

import org.bukkit.Location;

import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;

import org.bukkit.event.player.PlayerMoveEvent;

public class PlayerMove implements Listener {
    
	private boolean doubleEqual( double d1, double d2 ) {
		return Math.abs( d1 - d2 ) <= 0.000001;
	}

    @EventHandler
    public void onPlayerMove( PlayerMoveEvent evt ) {
        Location to = evt.getTo().clone();
        Location from = evt.getFrom();
        if( doubleEqual( to.getX(), from.getX() ) ) {
    		if( doubleEqual( to.getZ(), from.getZ() ) ) {
    			return;
    		}
        }
        to.setX( from.getX() );
        to.setZ( from.getZ() );
        evt.setTo( to );
    }

}
