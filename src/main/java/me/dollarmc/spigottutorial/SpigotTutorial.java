package me.dollarmc.spigottutorial;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class SpigotTutorial extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Plugin Started");
        // Register events
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        // Event handler when a player joined
        String playerName = event.getPlayer().getName();
        event.setJoinMessage("Bitchass " + playerName + " joined the server");
    }

    @EventHandler
    public void onLeaveBed(PlayerBedLeaveEvent event) {
        Player player = event.getPlayer();
        player.setHealth(0);
        player.sendMessage("You left a bed, die fool");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Plugin Stopped");
    }
}
