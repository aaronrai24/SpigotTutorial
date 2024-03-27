package me.dollarmc.spigottutorial.listeners;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class OnPlayerJoinLeaveListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        // Event handler when a player joined
        Player player = event.getPlayer();
        if (player.hasPlayedBefore()) {
            event.setJoinMessage("Welcome back bitch " + ChatColor.GREEN + "" +
                    ChatColor.BOLD + player.getDisplayName());
        }
        else {
            event.setJoinMessage("Wow first time bitch joined: " + ChatColor.BLUE + "" +
                    player.getDisplayName());
        }
    }

    @EventHandler
    public void onPlayerLeave(PlayerQuitEvent event) {
        // Event handler when a player leaves
        Player player = event.getPlayer();
        event.setQuitMessage("This bitchass: " + ChatColor.RED + player.getDisplayName() +
                ChatColor.RESET + "left the damn server");
    }
}
