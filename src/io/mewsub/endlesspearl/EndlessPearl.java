package io.mewsub.endlesspearl;

import org.bukkit.plugin.Plugin;

import org.bukkit.plugin.java.JavaPlugin;

import org.bukkit.Server;

import io.mewsub.boating.listeners.PlayerInteract;
import io.mewsub.boating.listeners.PlayerMove;
import io.mewsub.boating.listeners.PlayerTeleport;

public class EndlessPearl extends JavaPlugin {

    public static Plugin plugin;
    public static Server server;

    @Override
    public void onEnable() {
        this.plugin = ( Plugin ) this;
        this.server = this.getServer();
        this.server.getPluginManager().registerEvents( new PlayerInteract(), this );
        this.server.getPluginManager().registerEvents( new PlayerMove(), this );
        this.server.getPluginManager().registerEvents( new PlayerTeleport(), this );
    }

    @Override
    public void onDisable() {

    }

}
