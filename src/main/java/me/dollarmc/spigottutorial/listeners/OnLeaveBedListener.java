package me.dollarmc.spigottutorial.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;

public class OnLeaveBedListener implements Listener {

    @EventHandler
    public void onLeaveBed(PlayerBedLeaveEvent event) {
        Player player = event.getPlayer();
        player.setHealth(0);
        player.sendMessage("You left a bed, die fool");
    }

}
