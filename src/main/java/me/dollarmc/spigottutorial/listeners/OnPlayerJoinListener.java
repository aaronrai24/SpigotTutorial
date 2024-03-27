package me.dollarmc.spigottutorial.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class OnPlayerJoinListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        // Event handler when a player joined
        String playerName = event.getPlayer().getName();
        event.setJoinMessage("Bitchass " + playerName + " joined the server");
    }

}
