package me.dollarmc.spigottutorial;

import org.bukkit.plugin.java.JavaPlugin;

public final class SpigotTutorial extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Plugin Started");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Plugin Stopped");
    }
}
