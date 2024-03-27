package me.dollarmc.spigottutorial.listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerShearEntityEvent;

public class ShearSheepListener implements Listener {

    @EventHandler
    public void onShearSheep(PlayerShearEntityEvent event) {
        //Called when a shear event happens

        Player player = event.getPlayer();
        Entity entity = event.getEntity();
        if (entity.getType() == EntityType.SHEEP) {
            player.sendMessage("You are not allowed to shear sheep");
            event.setCancelled(true);
        }
        else {
            player.sendMessage("This is not a sheep you can shear it");
        }
    }
}
